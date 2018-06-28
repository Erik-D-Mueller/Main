package com.techelevator.department;

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
import com.techelevator.projects.model.Project;
import com.techelevator.projects.model.ProjectDAO;
import com.techelevator.projects.model.jdbc.JDBCDepartmentDAO;
import com.techelevator.projects.model.jdbc.JDBCProjectDAO;


import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.jdbc.support.rowset.SqlRowSet;

public class JDBCProjectDAOIntegrationTest implements ProjectDAO{

	private JdbcTemplate jdbcTemplate;
	
	public void JDBCProjectDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
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
			dao = new JDBCProjectDAO(dataSource);
		
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
		String name = "Test Project";
		LocalDate startDate = LocalDate.of(2010,04,05);
		LocalDate endDate = LocalDate.of(2030, 02, 03);
			
		System.out.println("Test");
		
		Project projectObject1 = new Project();
		
		projectObject1 = createProjectObject(longVar, name, startDate, endDate);
		
		//String sqlRemoveProject = "DELETE FROM project WHERE NAME LIKE (?)";
		String sqlInsertProject = "insert into project (name) values (?)";
		
		System.out.println("Test2");
		
		// Remove any project with that name if it exists
		
		
		//jdbcTemplate.update(sqlRemoveProject, "yellow");
		
		
		
		System.out.println("Test3");
		
		// Insert that project
		
		jdbcTemplate.update(sqlInsertProject);
		
		System.out.println( "test4" );
		
		List<Project> projectsList = new ArrayList<Project>();
		
		projectsList = dao.getAllActiveProjects();
		
		System.out.println( "test4" + projectsList.size() );
		
		assertTrue(projectsList.size()>0);   // Confirm that atleast one result was returned
		
	}
	
	
	
	
	
	@Test
	public void testRemoveEmployeeFromProject() {
	
		
		
		
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