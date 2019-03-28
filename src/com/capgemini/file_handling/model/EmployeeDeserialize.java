package com.capgemini.file_handling.model;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EmployeeDeserialize {
	public boolean desrialization() {
	
	
		try {
		FileInputStream fileInputStream = new FileInputStream("employee.ser");
		ObjectInputStream inputstream = new ObjectInputStream(fileInputStream);
		
		Employee employee1 = (Employee) inputstream.readObject();
		inputstream.close();
		
		}catch(IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return true;
	
	}
	

}
