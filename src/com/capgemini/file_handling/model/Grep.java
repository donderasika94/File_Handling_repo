package com.capgemini.file_handling.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Grep {
	public boolean isFileExsits() {
		File file = new File("C:\\RasikaD\\Core java\\basic_assignments\\src\\basic_assignments\\HelloWorld.java");
		System.out.println(file.exists());
		return true;
	}
	
	public boolean isFileNotExist() throws FileNotFoundException {
		File file = new File("abc.txt");
		System.out.println(file.exists());
		return false;
		
		
	}
	public int findWord() throws IOException {
		String wordSearch = "Exception";
		BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\RasikaD\\Core java\\exceptionhandling_assignments\\Exception Handlng Team.txt"));
		
		int linecount = 0;
		String line;
		System.out.println("Seraching word " + wordSearch +" In file");
		int a =0;
		while((line = bufferedReader.readLine()) != null){
			int indexfound = line.indexOf(wordSearch);
			
			if(indexfound > -1) {
				linecount++;
				System.out.println("Word is at position "+ indexfound +" on line " + linecount);
				System.out.println(line);
			}else {
				a++;
			}
		}
		if(a > 0 && linecount == 0) {
			System.out.println("Not Found");
		}
		bufferedReader.close();
		return a;
	}

}
