package com.capgemini.file_handling.tests;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.file_handling.model.Employee;
import com.capgemini.file_handling.model.EmployeeDeserialize;
import com.capgemini.file_handling.model.EmployeeSerialize;

public class EmployeeTest {
	
	private static Employee employee;
	@Before
	public void setUp() {
		Employee employee = new Employee(101,"John Doe",20000);
		
	}
	@Test
	public void testObjectSucceffullySeralizing() {
		EmployeeSerialize employeeSerialize = new EmployeeSerialize();
		assertTrue(employeeSerialize.Serialization(employee));
	}
	
	@Test
	public void testObjectSuccessfullyDeserialize()throws IOException, ClassNotFoundException {
		EmployeeDeserialize employeeDeserialize = new EmployeeDeserialize();
		assertTrue(employeeDeserialize.desrialization());
	}

	

}
