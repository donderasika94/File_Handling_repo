package com.capgemini.file_handling.model;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeSerialize {
	public boolean Serialization(Employee employee) {
		try {
		FileOutputStream fileOutputStream = new FileOutputStream("employee.ser");
		ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
		outputStream.writeObject(employee);
		outputStream.close();
		return true;
		}catch(IOException e) {
			e.printStackTrace();
		}
		return false;
	}

}
