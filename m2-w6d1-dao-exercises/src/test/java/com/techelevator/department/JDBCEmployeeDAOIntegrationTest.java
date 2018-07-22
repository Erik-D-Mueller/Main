package com.techelevator.department;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
import com.techelevator.projects.model.jdbc.JDBCDepartmentDAO;
import com.techelevator.projects.model.jdbc.JDBCEmployeeDAO;

public class JDBCEmployeeDAOIntegrationTest {

	private JdbcTemplate jdbcTemplate;

	/*
	 * Using this particular implementation of DataSource so that every database
	 * interaction is part of the same database session and hence the same database
	 * transaction
	 */
	private static SingleConnectionDataSource dataSource;
	private JDBCEmployeeDAO dao;

	/*
	 * Before any tests are run, this method initializes the datasource for testing.
	 */
	@BeforeClass
	public static void setupDataSource() {
		dataSource = new SingleConnectionDataSource();
		dataSource.setUrl("jdbc:postgresql://localhost:5432/daoPractice");
		dataSource.setUsername("postgres");
		dataSource.setPassword("postgres1");
		/*
		 * The following line disables autocommit for connections returned by this
		 * DataSource. This allows us to rollback any changes after each test
		 */
		dataSource.setAutoCommit(false);
	}

	/*
	 * After all tests have finished running, this method will close the DataSource
	 */
	@AfterClass
	public static void closeDataSource() throws SQLException {
		dataSource.destroy();
	}

	@Before
	public void setup() {
		dao = new JDBCEmployeeDAO(dataSource);
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	/*
	 * After each test, we rollback any changes that were made to the database so
	 * that everything is clean for the next test
	 */

	@After
	public void rollback() throws SQLException {
		dataSource.getConnection().rollback();
	}

	@Test
	public void testGetAllEmployees() {

				// create a fake test dept and get its id number
				String sqlDeleteTempDeptIfExists = "delete from department where name = 'testDept'";
				jdbcTemplate.update(sqlDeleteTempDeptIfExists);
				String sqlCreateTestDept = "INSERT INTO department (name) values ('testDept')";	
				jdbcTemplate.update(sqlCreateTestDept);
				String sqlGetDeptIdOfTestDept = "select department_id from department where name = 'testDept'";
				SqlRowSet results = jdbcTemplate.queryForRowSet(sqlGetDeptIdOfTestDept);
				int deptId=0;
				while(results.next()) {
					deptId = results.getInt("department_id");
				}
		
				// Create a two fake test employees
				jdbcTemplate.update("delete from employee where first_name = 'testFirstName' and last_name = 'testLastName'");
				jdbcTemplate.update("delete from employee where first_name = 'testFirstName2' and last_name = 'testLastName2'");
				String sqlInsertTestEmployee = "INSERT INTO EMPLOYEE (department_id, first_name, last_name, birth_date, gender, hire_date) values (?, 'testFirstName', 'testLastName', '1972-03-03','M', '1992-03-03')";
				jdbcTemplate.update(sqlInsertTestEmployee, deptId);
				sqlInsertTestEmployee = "INSERT INTO EMPLOYEE (department_id, first_name, last_name, birth_date, gender, hire_date) values (?, 'testFirstName2', 'testLastName2', '1972-03-03','M', '1992-03-03')";
				jdbcTemplate.update(sqlInsertTestEmployee, deptId);
				
				// confirm a list of employees of atleqst length 2 is returned
				assertTrue( dao.getAllEmployees().size()>=2 );

	}

	@Test
	public void testSearchEmployeesByName() {

		List<Employee> totalEmployeeList = new ArrayList<Employee>();

		List<Employee> resultantList = new ArrayList<Employee>();

		// We're assuming that they have atleast one employee

		Employee resultantEmployee = new Employee();

		totalEmployeeList = dao.getAllEmployees(); // get a list of all employees

		resultantEmployee = totalEmployeeList.get(0); // Not sure if this works on a reference object

		resultantList = dao.searchEmployeesByName(totalEmployeeList.get(0).getFirstName(),
				totalEmployeeList.get(0).getLastName());

		// Assert that the search returns atleast one result and that it does not return
		// more results than there exist employees
		Assert.assertTrue(resultantList.size() >= 1 && resultantList.size() <= totalEmployeeList.size());

	}

	@Test
	public void testGetEmployeesByDepartmentId() {

		// Create a fake test dept and get its id number
		String sqlDeleteTempDeptIfExists = "delete from department where name = 'testDept'";
		jdbcTemplate.update(sqlDeleteTempDeptIfExists);
		String sqlCreateTestDept = "INSERT INTO department (name) values ('testDept')";
		jdbcTemplate.update(sqlCreateTestDept);
		String sqlGetDeptIdOfTestDept = "select department_id from department where name = 'testDept'";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlGetDeptIdOfTestDept);
		int deptId = 0;
		while (results.next()) {
			deptId = results.getInt("department_id");
		}

		// Create a fake test employee (applying the above fake dept id number) and get
		// the employee id number
		jdbcTemplate.update("delete from employee where first_name = 'testFirstName' and last_name = 'testLastName'");
		String sqlInsertTestEmployee = "INSERT INTO EMPLOYEE (department_id, first_name, last_name, birth_date, gender, hire_date) values (?, 'testFirstName', 'testLastName', '1972-03-03','M', '1992-03-03')";
		jdbcTemplate.update(sqlInsertTestEmployee, deptId);
		results = jdbcTemplate.queryForRowSet(
				"select employee_id from employee where first_name = 'testFirstName' and last_name = 'testLastName'");

		// Assert that we get a list of exactly 1, when using the
		// getEmployeesByDepartmentId function
		assertTrue(dao.getEmployeesByDepartmentId((long) deptId).size() == 1);

	}
		
	
	private Employee createEmployeeObject(long employee_id, long department_id, String first_name, String last_name,
			LocalDate birthday, char gender, LocalDate hireDate) {

		Employee employeeObject = new Employee();

		employeeObject.setId(employee_id);
		employeeObject.setDepartmentId(department_id);
		employeeObject.setFirstName(first_name);
		;
		employeeObject.setLastName(last_name);
		employeeObject.setBirthDay(birthday);
		employeeObject.setGender(gender);
		employeeObject.setHireDate(hireDate);

		return employeeObject;

	}

	// I don't know how exactly the assert statement works, apparently it doesn't
	// need a return but still somehow works.
	private void assertEmployeesAreEqual(Employee expected, Employee actual) {

		// Do I have to manuall test every property? I can't just do a big equals sign
		// and test the entire object at once somehow?
		assertEquals(expected.getId(), actual.getId());
		assertEquals(expected.getDepartmentId(), actual.getDepartmentId());
		assertEquals(expected.getFirstName(), actual.getFirstName());
		assertEquals(expected.getLastName(), actual.getLastName());
		assertEquals(expected.getBirthDay(), actual.getBirthDay());
		assertEquals(expected.getGender(), actual.getGender());
		assertEquals(expected.getHireDate(), actual.getHireDate());

	}

}