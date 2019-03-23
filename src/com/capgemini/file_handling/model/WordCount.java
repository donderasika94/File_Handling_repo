package com.capgemini.file_handling.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {
	public int count() throws IOException {
		FileReader fileReader = new FileReader ("C:\\RasikaD\\Core java\\basic_assignments\\src\\basic_assignments\\HelloWorld.java");        
	       BufferedReader bufferedReader = new BufferedReader (fileReader);     
	       String line = bufferedReader.readLine ();
	       int count = 0;
	       while (line != null) {
	          String []parts = line.split(" ");
	          for( String word : parts)
	          {
	            count++;        
	          }
	          line = bufferedReader.readLine();
	       }    
	       return count;
	}

}
