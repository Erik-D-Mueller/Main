package com.techelevator.department;

import java.sql.ResultSet;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Department;
import com.techelevator.projects.model.Employee;
import com.techelevator.projects.model.Project;
import com.techelevator.projects.model.ProjectDAO;
import com.techelevator.projects.model.jdbc.JDBCDepartmentDAO;
import com.techelevator.projects.model.jdbc.JDBCProjectDAO;


import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.jdbc.support.rowset.SqlRowSet;

public class JDBCProjectDAOIntegrationTest implements ProjectDAO{

	private JdbcTemplate jdbcTemplate;
	
	/* Using this particular implementation of DataSource so that
	 * every database interaction is part of the same database
	 * session and hence the same database transaction */
	private static SingleConnectionDataSource dataSource;
	private JDBCProjectDAO dao;
	
	/* Before any tests are run, this method initializes the datasource for testing. */
	@BeforeClass
	public static void setupDataSource() {
		dataSource = new SingleConnectionDataSource();
		dataSource.setUrl("jdbc:postgresql://localhost:5432/daoPractice");
		dataSource.setUsername("postgres");

		/* The following line disables autocommit for connections 
		 * returned by this DataSource. This allows us to rollback
		 * any changes after each test */
		dataSource.setAutoCommit(false);
	}

		/* After all tests have finished running, this method will close the DataSource */
		@AfterClass
		public static void closeDataSource() throws SQLException {
			dataSource.destroy();
		}

		@Before
		public void setup() {
			dao = new JDBCProjectDAO(dataSource);
			jdbcTemplate = new JdbcTemplate(dataSource);
		
		}

		/* After each test, we rollback any changes that were made to the database so that
		 * everything is clean for the next test */
		
		@After
		public void rollback() throws SQLException {
			dataSource.getConnection().rollback();
		}

		
	
		
	@Test
	public void testingGetAllActiveProjects() {
	
// Insert an active project
		
		long longVar = 0;
		String projectName = "Test Project";
		
		LocalDate startDate = LocalDate.of(2010,04,05);
		LocalDate endDate = LocalDate.of(2030, 02, 03);
		
		String name1 = "Test Project Object1";
		String name2 = "Test Project Object2";
		String name3 = "Test Project Object3";
		String name4 = "Test Project Object4";
				
		
		// Create four project objects, three of which are current
		Project projectObject1 = createProjectObject(longVar, name1, startDate, endDate);		
		Project projectObject2 = createProjectObject(longVar, name2, startDate, null);
		Project projectObject3 = createProjectObject(longVar, name3, LocalDate.of(2030, 02, 03), endDate);
		Project projectObject4 = createProjectObject(longVar, name4, startDate, null);
		
		List<Project> initialActiveProjectsList = new ArrayList<Project>();
		List<Project> finalActiveProjectsList = new ArrayList<Project>();
		
		// Delete if it already exists.  Doesn't hurt if it doesn't.
		String sqlRemoveProjects = "DELETE FROM project WHERE NAME LIKE ? or name like ? or name like ? or name like ?";
		
		// INSERT INTO project (name, from_date, to_date) VALUES ('Royal Shakespeare 1', '2015-10-15', '2016-03-14');
		
		// Remove projects with the test-names of what we are about to create, if they happen to exist
		jdbcTemplate.update(sqlRemoveProjects, projectObject1.getName(), projectObject2.getName(), projectObject3.getName(), projectObject4.getName());
		
		// measure number of active projects before
		initialActiveProjectsList = dao.getAllActiveProjects();
		
		// insert three active projects, one inactive
		String sqlInsertProject = "insert into project (name, from_date, to_date) values (?, ?, ?)";		
		jdbcTemplate.update(sqlInsertProject, projectObject1.getName(), projectObject1.getStartDate(), projectObject1.getEndDate());
		jdbcTemplate.update(sqlInsertProject, projectObject2.getName(), projectObject2.getStartDate(), projectObject2.getEndDate());
		jdbcTemplate.update(sqlInsertProject, projectObject3.getName(), projectObject3.getStartDate(), projectObject3.getEndDate());
		jdbcTemplate.update(sqlInsertProject, projectObject4.getName(), projectObject4.getStartDate(), projectObject4.getEndDate());

		// Measure afterward
		finalActiveProjectsList = dao.getAllActiveProjects();
		
		// confirm that there are three more active projects than before
		assertTrue(finalActiveProjectsList.size() - initialActiveProjectsList.size() == 3);
		
	}
	
	
	
	
	
	@Test
	public void testRemoveEmployeeFromProject() {
		
		Employee testEmployee = new Employee();
		
		LocalDate startDate = LocalDate.of(2010,04,05);
		LocalDate endDate = LocalDate.of(2030, 02, 03);
		long longVar = 0;
		
		String name1 = "Test Project 1";
		Project projectObject1 = createProjectObject(longVar, name1, startDate, endDate);
				
		jdbcTemplate.update("INSERT INTO EMPLOYEE (department_id, first_name, last_name, birth_date, gender, hire_date) values (1, 'testFirstName', 'testLastName', '1972-03-03','M', '1992-03-03')");
				
		String sqlGetTestEmployeeID = "select employee_id from employee where first_name = 'testFirstName' and last_name = 'testLastName'";
		
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlGetTestEmployeeID);
		
		// for some reason it needs this command in order to work
		
		int employeeId = results.getInt("employee_id");
		
		
		
	
		
	//	String sqlAddEmployeeToProject = "INSERT INTO project_employee ( project_id, employee_id) values (?, ?)";
		
	//	jdbcTemplate.update(sqlAddEmployeeToProject, projectObject1.getId(), testEmployee.getId());
		
		
	}
	
	
	@Test
	public void testAddEmployeeToProject() {
		
		
		
		
		
	}




// I don't know how exactly the assert statement works, apparently it doesn't need a return but still somehow works.
private void assertProjectsAreEqual(Department expected, Department actual) {
	
	assertEquals(expected.getId(), actual.getId());
	assertEquals(expected.getName(), actual.getName());
	
}


private Project createProjectObject(Long Id, String name, LocalDate startDate, LocalDate endDate){
	
	Project projectObject1 = new Project();
	
	projectObject1.setId(Id);
	projectObject1.setName(name);
	projectObject1.setStartDate(startDate);
	projectObject1.setEndDate(endDate);

	return projectObject1;
}

@Override
public List<Project> getAllActiveProjects() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void removeEmployeeFromProject(Long projectId, Long employeeId) {
	// TODO Auto-generated method stub
	
}

@Override
public void addEmployeeToProject(Long projectId, Long employeeId) {
	// TODO Auto-generated method stub
	
}

}