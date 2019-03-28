package com.capgemini.file_handling.model;

import java.io.Serializable;
import java.util.Objects;

public class MyClass implements Serializable {

	private int studentRollNo;
	private String studentName;
	private String studentDepartment;
	public MyClass() {
		super();
		
	}
	public MyClass(int studentRollNo, String studentName, String studentDepartment) {
		super();
		this.studentRollNo = studentRollNo;
		this.studentName = studentName;
		this.studentDepartment = studentDepartment;
	}
	public int getStudentRollNo() {
		return studentRollNo;
	}
	public void setStudentRollNo(int studentRollNo) {
		this.studentRollNo = studentRollNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentDepartment() {
		return studentDepartment;
	}
	public void setStudentDepartment(String studentDepartment) {
		this.studentDepartment = studentDepartment;
	}
	@Override
	public int hashCode() {
		return Objects.hash(studentRollNo,studentName,studentDepartment);
	}

	@Override
	public boolean equals(Object obj) {
		
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if(!(obj instanceof MyClass))
			return false;
		
		MyClass myClass=(MyClass) obj;
		
		if(this.studentRollNo==myClass.studentRollNo && this.studentName.equals(myClass.studentName) && this.studentDepartment.equals(myClass.studentDepartment))
			return true;
		return false;
	}
	
	
}
