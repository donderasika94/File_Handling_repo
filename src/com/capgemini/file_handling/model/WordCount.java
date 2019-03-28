package com.capgemini.file_handling.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {
	public int count() throws IOException {
		FileReader fileReader = new FileReader ("C:\\RasikaD\\Core java\\basic_assignments\\src\\basic_assignments\\HelloWorld.java");        
	       BufferedReader bufferedReader = new BufferedReader (fileReader);     
	       String line ;
	       int count = 0;
	       while ((line= bufferedReader.readLine ()) != null) {
	          String[] words = line.split("\\s+");
	          count = count+words.length;
	       }   
	       fileReader.close();
	       return count;
	}

}
