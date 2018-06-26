package com.techelevator.projects.model.jdbc;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Employee;
import com.techelevator.projects.model.EmployeeDAO;

public class JDBCEmployeeDAO implements EmployeeDAO {

	private JdbcTemplate jdbcTemplate;

	public JDBCEmployeeDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	/**
	 * Gets all employees from the datastore and returns them in a List
	 * 
	 * @return all the employees as Employee objects in a List
	 */	
	
	@Override
	public List<Employee> getAllEmployees() {
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		
		String sqlGetAllEmployees = "SELECT * FROM EMPLOYEE";
		
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlGetAllEmployees);
		
		Employee tempEmployee = new Employee();
		while(results.next()) {
			
			tempEmployee = createEmployeeObject(results);
			employeeList.add(tempEmployee);
			
		}
		
		return employeeList;
	}
	/**
	 * Find all employees whose names match the search strings. Names should
	 * contain both first and last name searches. If a search string is blank,
	 * ignore it. Be sure to use LIKE or ILIKE for proper search matching!
	 * 
	 * @param firstNameSearch the string to search for in the first_name, ignore if blank
	 * @param lastNameSearch the string to search for in the last_name, ignore if blank
	 * @return all employees whose name matches as Employee objects in a List
	 */

	@Override
	public List<Employee> searchEmployeesByName(String firstNameSearch, String lastNameSearch) {
		
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		Employee tempEmployee = null;
		
		
	if(firstNameSearch.length()==0 && lastNameSearch.length()!=0) {
		
		String sqlLastNameOnly = "SELECT * FROM EMPLOYEE WHERE last_name ILIKE (?)";
		
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlLastNameOnly, lastNameSearch);
		
	
		while(results.next()) {
			
			tempEmployee = createEmployeeObject(results);
			employeeList.add(tempEmployee);	
			
		}
		return employeeList;
	}
		
		if(lastNameSearch.length() == 0 && firstNameSearch.length()!=0) {
			
			String sqlFirstNameSearch = "SELECT * FROM EMPLOYEE WHERE first_name ILIKE (?)";
			
			SqlRowSet results = jdbcTemplate.queryForRowSet(sqlFirstNameSearch, firstNameSearch);
			
			
			while(results.next()) {
				
				tempEmployee = createEmployeeObject(results);
				
				employeeList.add(tempEmployee);
				
			}
			return employeeList;
			
	
		}

		if(lastNameSearch.length() !=0 && firstNameSearch.length() !=0) {
			
			String sqlSearchBothName = "SELECT * FROM EMPLOYEE WHERE first_name ILIKE (?) and last_name ILIKE (?)";
			
			SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSearchBothName, firstNameSearch, lastNameSearch);
			
			while(results.next()) {
				
				tempEmployee = createEmployeeObject(results);
			
				employeeList.add(tempEmployee);
				
			}
			
			return employeeList;
	
		}
		
		{  // If they believe both fields blank, then it returns everyone
			
		String sqlSearchBothNameBlank = "SELECT * FROM EMPLOYEE";
		
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSearchBothNameBlank);
		
		while(results.next()) {
			
			tempEmployee = createEmployeeObject(results);
		
			employeeList.add(tempEmployee);
			
		}
		
		return employeeList;
		}
		
	}
	
	/**
	 * Get all the employees that are in the department with the {@code id}.
	 * 
	 * @param id the id of the department
	 * @return all the employees from that department as Employee objects in a List
	 */

	@Override
	public List<Employee> getEmployeesByDepartmentId(long id) {
		
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		
		Employee tempEmployeeObject = new Employee();
		
		String sqlGetEmployeesByDepartment = "SELECT * from employee where department_id = ?";
		
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlGetEmployeesByDepartment, id);
		
		while(results.next()) {
			
			tempEmployeeObject = createEmployeeObject(results);
					
					employeeList.add(tempEmployeeObject);
		}
		
		return employeeList;
	}

	/**
	 * Get all of the employees that aren't assigned to a project.
	 * 
	 * @return all the employees not on a project as Employee objects in a List
	 */
	
	@Override
	public List<Employee> getEmployeesWithoutProjects() {
		
	Employee tempEmployeeObject = new Employee();
		
	ArrayList<Employee> employeeList = new ArrayList<Employee>();
	
	String sqlGetEmployeesWithoutProjects= "SELECT * FROM employee left join project_employee on project_employee.employee_id = employee.employee_id where project_id is null --means it does not exist";
	
	SqlRowSet results = jdbcTemplate.queryForRowSet(sqlGetEmployeesWithoutProjects);
	
	while(results.next()) {
		
		tempEmployeeObject = createEmployeeObject(results);
		
	employeeList.add(tempEmployeeObject);
		
	}

	return employeeList;
	
	}
	
	/**
	 * Get all of the employees that are on the project with the given {@code id}.
	 * 
	 * @param id the project id to get the employees from
	 * @return all the employees assigned to that project as Employee objects in a List
	 */

	@Override
	public List<Employee> getEmployeesByProjectId(Long projectId) {
	
	Employee tempEmployeeObject = new Employee();
		
	ArrayList<Employee> employeeList = new ArrayList<Employee>();
	
	String sqlGetEmployeeByProjectId = "SELECT * from employee join project_employee on project_employee.employee_id = employee.employee_id WHERE project_employee.project_id = ?";
	
	SqlRowSet results = jdbcTemplate.queryForRowSet(sqlGetEmployeeByProjectId, projectId);
	
	while(results.next()) {
		
		tempEmployeeObject = createEmployeeObject(results);
		
		employeeList.add(tempEmployeeObject);
		
	}
	
	return employeeList;
	
	}

	/**
	 * Change the given employee to the new department.
	 * 
	 * @param employeeId the employee's id that we want to move
	 * @param departmentId the employee's new department
	 */
	
	@Override
	public void changeEmployeeDepartment(Long employeeId, Long departmentId) {
		
	String sqlChangeEmployeeDepartment = "update employee set department_id = ? WHERE employee_id = ?";
	
	System.out.println("employeeId is " + employeeId + "departmentId is "  + departmentId);
	
	jdbcTemplate.update(sqlChangeEmployeeDepartment, departmentId, employeeId);
	
	}

	private Employee createEmployeeObject(SqlRowSet results) {
		Employee tempEmployee = new Employee();
		
		tempEmployee.setBirthDay(results.getDate("birth_date").toLocalDate());
		tempEmployee.setDepartmentId((long)results.getInt("department_id"));
		tempEmployee.setId((long)results.getInt("employee_id"));
		tempEmployee.setFirstName(results.getString("first_Name"));
		tempEmployee.setLastName(results.getString("last_name"));
		tempEmployee.setHireDate(results.getDate("hire_date").toLocalDate());
		tempEmployee.setGender(results.getString("gender").charAt(0));
		// the .charAt(0) at the end converts it from a one letter string to a character
			
		return tempEmployee;
	}

}
