package com.capgemini.file_handling.model;

import java.io.File;

public class FileExists {
	
	public boolean isFileExsits() {
		File file = new File("C:\\RasikaD\\Core java\\basic_assignments\\src\\basic_assignments\\HelloWorld.java");
		System.out.println(file.exists());
		return true;
	}
	
}
