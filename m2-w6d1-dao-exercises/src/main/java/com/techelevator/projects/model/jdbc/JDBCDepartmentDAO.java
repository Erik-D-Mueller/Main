package com.techelevator.projects.model.jdbc;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

//import com.techelevator.City.city;
import com.techelevator.projects.model.Department;
import com.techelevator.projects.model.DepartmentDAO;

public class JDBCDepartmentDAO implements DepartmentDAO {
	
	private JdbcTemplate jdbcTemplate;

	public JDBCDepartmentDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	/**
	 * Get all departments from the datastore.
	 * 
	 * @return all departments as Department objects in a List
	 */
	
	@Override
	public List<Department> getAllDepartments() {
		
		ArrayList<Department> depts = new ArrayList<Department>();   //Sometimes we don't populate the second set of Chevrons, why not?
		
		String sqlGetAllDepartments = "SELECT department_id, name FROM department";
		
		// results, as far as I can tell, is the table in the form of an array
		
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlGetAllDepartments);
			
		while(results.next()) {
			
			Department theDept = makeDeptObject(results);
			
			depts.add(theDept);
		}
		
		return depts;
	}


	/**
	 * Get all the departments whose name contains the search string. Remember
	 * to use LIKE or ILIKE to do a fuzzy match on the search.
	 * 
	 * @param nameSearch the search string to look for in the department name
	 * @return all matching departments as Department objects in a List
	 */

	@Override
	public List<Department> searchDepartmentsByName(String nameSearch) {

		ArrayList<Department> depts = new ArrayList<Department>();

		
		// This is my workaround, I tried putting the percent signs in the sql string directly and it kept crashing the program
		nameSearch = "%" + nameSearch + "%";
		
		String sqlGetDepartmentsWithThisString = "SELECT * FROM department WHERE name ILIKE (?)";
		
		// I assume it knows to replace the question mark with whatever it is passed with, based on order
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlGetDepartmentsWithThisString, nameSearch);

while(results.next()) {
			Department theDept = makeDeptObject(results);
			depts.add(theDept);
		}	
		return depts;
	}

	/**
	 * Update a department to the datastore. Only called on departments that
	 * are already in the datastore.
	 * 
	 * @param updatedDepartment the department object to update
	 */

	@Override
	public void saveDepartment(Department updatedDepartment) {

		String sqlSaveDepartment = "UPDATE DEPARTMENT SET name = ? WHERE department_id = ? ";
		
		jdbcTemplate.update(sqlSaveDepartment, updatedDepartment.getName(), updatedDepartment.getId());
	
	}

	/**
	 * Inserts a new department into the datastore.
	 * 
	 * @param newDepartment the department object to insert
	 * @return the department object with its new id filled in
	 */
	
	@Override
	public Department createDepartment(Department newDepartment) {
		
		String sqlCreateDepartment = "insert into department (name) values (?)";
		
		//We select all the columns, even though we don't need them all, because less than all the columns would crash the makeDeptObject() method.
		String sqlGetDepartmentID = "select * from department where name like (?)";
		
		// First insert the new row
		jdbcTemplate.update(sqlCreateDepartment, newDepartment.getName());

		// Now read in that row we so that we can see the id_number
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlGetDepartmentID, newDepartment.getName());
		while(results.next()) {
			Department theDept = makeDeptObject(results);
		newDepartment.setId( theDept.getId() );
		}	
		return newDepartment;		
	}

	/**
	 * Get a department from the datastore that belongs to the given id.
	 * 
	 * @param id the department id to get from the datastore
	 * @return a filled out department object
	 */
	
	@Override
	public Department getDepartmentById(Long id) {
	
	String sqlGetDepartmentById = "select * from department where department_id = ?";
	SqlRowSet results = jdbcTemplate.queryForRowSet(sqlGetDepartmentById, id);
		
	// It should only get one result, therefore I should be able to return the dept object directly
	Department theDept = null;
	
	while(results.next()) {
		theDept = makeDeptObject(results);
	return theDept;
	}	
	
	// This code keeps the method happy, even though it shouldn't be able to get here
   return theDept;
	
	}
	
	private Department makeDeptObject(SqlRowSet results) {
		

		Department theDept = new Department();

		theDept.setId((long) results.getInt("department_id"));
		
		theDept.setName(results.getString("name"));

		
		return theDept;
	}

	
}