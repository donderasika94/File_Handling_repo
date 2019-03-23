package com.capgemini.file_handling.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LineCount {
	public int count() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("C:\\RasikaD\\Core java\\basic_assignments\\src\\basic_assignments\\HelloWorld.java"));
		int lines = 0;
		while (reader.readLine() != null) lines++;
		return lines;
	}

}
