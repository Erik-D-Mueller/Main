package com.techelevator.projects.model.jdbc;

import java.time.LocalDate;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.time.LocalDateTime;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Employee;
import com.techelevator.projects.model.Project;
import com.techelevator.projects.model.ProjectDAO;

public class JDBCProjectDAO implements ProjectDAO {

	private JdbcTemplate jdbcTemplate;

	public JDBCProjectDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	/**
	 * Get a list of all active projects. A project is active if we are past its
	 * from_date but before its to_date. If its to_date is null, then we consider it
	 * ongoing. If its from_date is null, then we consider it not started yet.
	 * 
	 * @return all active projects as Project objects in a List
	 */

	@Override
	public List<Project> getAllActiveProjects() {

		ArrayList<Project> projectList = new ArrayList<Project>();

		Project tempProjectObject = new Project();

		String sqlGetAllRowsFromProjectTable = "Select * FROM project";

		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlGetAllRowsFromProjectTable);

		LocalDate currentDate = LocalDate.now();

		while (results.next()) {

			tempProjectObject = createProjectObject(results);

			LocalDate startDate = tempProjectObject.getStartDate();
			LocalDate endDate = tempProjectObject.getEndDate();

			// I seperated this into two if statements to make it easier to read.
			if (tempProjectObject.getStartDate() != null
					&& tempProjectObject.getStartDate().compareTo(currentDate) < 0) {

				if (tempProjectObject.getEndDate() == null
						|| tempProjectObject.getEndDate().compareTo(currentDate) > 0) {

					projectList.add(tempProjectObject);

				}
			}

		}

		return projectList;

	}

	/**
	 * Unassign the employee from a project.
	 * 
	 * @param projectId
	 *            the project to remove the employee from
	 * @param employeeId
	 *            the employee to remove
	 */

	@Override
	public void removeEmployeeFromProject(Long projectId, Long employeeId) {

		String sqlRemoveEmployeeFromProject = "DELETE from project_employee WHERE project_id = ? and employee_id = ?";

		jdbcTemplate.update(sqlRemoveEmployeeFromProject, projectId, employeeId);

	}

	@Override
	public void addEmployeeToProject(Long projectId, Long employeeId) {

		String sqlAddEmployeeToProject = "INSERT INTO project_employee (project_id, employee_id) values(?,?)";

		jdbcTemplate.update(sqlAddEmployeeToProject, projectId, employeeId);

	}

	private Project createProjectObject(SqlRowSet results) {

		Project tempProject = new Project();

		tempProject.setName(results.getString("name"));
		tempProject.setId(results.getLong("project_id"));

		// If we try to call .toLocalDate() on a null value, it ultimately causes a
		// nullPointerException and crashes the program
		if (results.getDate("from_date") != null) {
			tempProject.setStartDate(results.getDate("from_date").toLocalDate());
		}
		if (results.getDate("to_date") != null) {
			tempProject.setEndDate(results.getDate("to_date").toLocalDate());
		}

		return tempProject;

	}

}