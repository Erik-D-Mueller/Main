package com.techelevator.department;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
import com.techelevator.projects.model.jdbc.JDBCDepartmentDAO;


public class JDBCDepartmentDAOIntegrationTest {

	/* Using this particular implementation of DataSource so that
	 * every database interaction is part of the same database
	 * session and hence the same database transaction */
	private static SingleConnectionDataSource dataSource;
	private JDBCDepartmentDAO dao;
	
	/* Before any tests are run, this method initializes the datasource for testing. */
	@BeforeClass
	public static void setupDataSource() {
		dataSource = new SingleConnectionDataSource();
		dataSource.setUrl("jdbc:postgresql://localhost:5432/daoPractice");
		dataSource.setUsername("postgres");
		dataSource.setPassword("postgres1");
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
			dao = new JDBCDepartmentDAO(dataSource);  // This instantiates JDBCDepartmentDAO and sends it dataSource
		}

		/* After each test, we rollback any changes that were made to the database so that
		 * everything is clean for the next test */
		
		@After
		public void rollback() throws SQLException {
			dataSource.getConnection().rollback();
		}

		
	// This tests createDepartment() and getDepartmentById()	
	@Test
	public void testingCreateDepartmentMethod() {
	
		long longVar = 0;
		
		// When I create an object, what is its scope/visibility?  Anywhere?
		
		Department deptObject1 = createDepartmentObject("Test Department 100",longVar);  // This creates a Department Object
		
		dao.createDepartment(deptObject1);   // This (should) create the new department, it also somehow returns deptObject1 back, with it's auto_generated id_number.
		
		Department resultantDept = dao.getDepartmentById(deptObject1.getId());
		
		assertDepartmentsAreEqual(resultantDept, deptObject1);
	
	}
	
	
	// this tests the saveDepartment() method which simply updates the name of a department
	@Test
	public void testSaveDepartment() {
		
		long longVar = 0;
		
		Department deptObject1 = createDepartmentObject("Test Dept 200", longVar);
		
		dao.createDepartment(deptObject1);   // Create a new department, to get their id, then change their name and test it
		
		deptObject1.setName("Not Test Dept 200");  // Switch the name of deptObject1
		
		dao.saveDepartment(deptObject1);  // Resave it.  The Id gets created returned and set when the dept object is saved in the database
		
		Department resultantDept = dao.getDepartmentById(deptObject1.getId());   // Make a copy of the dept that we just "updated the name"
		
		assertDepartmentsAreEqual(resultantDept, deptObject1);
	
	}
		
		
	@Test   // this tests getAllDepartments()
	public void testGetAllDepartments() {
		// Going to create a new dept, then getAllDepts() and make sure it's in the list, but not the only one in the list
		
		 // Department deptObject1 = new Department();
		
		long longVar = 0;
		int counter = 0;
		
		Department deptObject1 = createDepartmentObject("Test Department 300", longVar);
		
		dao.createDepartment(deptObject1);
		
		// List vs ArrayList
		
		List<Department> listOfDepartments= dao.getAllDepartments();
		
		for(Department dept : listOfDepartments) {
			
			if(dept.getName().contains( deptObject1.getName()) ) {  // If the name matches
				
				if( dept.getId() == deptObject1.getId() )  // If the id number matches as well
				{
					counter++;  // We found it!
					
				}
			}		
		}		
		assertEquals(1, counter);   // Make sure the department was found once and only once		
	}
		
		
	
	@Test  // This tests getDepartmentByName()
	public void testGetDepartmentsByName() {
		
		long longVar = 0;
		
		int counter = 0;
		
		Department deptObject1 = createDepartmentObject("Test Dept 400", longVar);
		
		dao.createDepartment(deptObject1);
		
		List<Department> listOfDepartments = new ArrayList<Department>();
		
		listOfDepartments = dao.searchDepartmentsByName("400");
		
		for(Department dept: listOfDepartments) {
			
			if( dept.getName().contains(deptObject1.getName())) {  // if the name matches
				
				if( dept.getId() == deptObject1.getId() ){   // if the id number matches. The id number should only match once, even if there are multiple matches on the name
					
					counter++;	
					
				}					
						
			}

		}

		Assert.assertEquals(1, counter);  // Make sure the dept was found once and only once in the returned list		

	}
	

private Department createDepartmentObject(String name, long id) {
	
	Department tempDepartmentObject = new Department();
	
		tempDepartmentObject.setId(id);
	
	tempDepartmentObject.setName(name);
	
	return tempDepartmentObject;
}

// I don't know how exactly the assert statement works, apparently it doesn't need a return but still somehow works.

private void assertDepartmentsAreEqual(Department expected, Department actual) {
	
	assertEquals(expected.getId(), actual.getId());
	assertEquals(expected.getName(), actual.getName());
	
}

}
