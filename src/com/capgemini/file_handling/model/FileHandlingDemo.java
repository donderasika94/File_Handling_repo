package com.capgemini.file_handling.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileHandlingDemo {
	public static void main(String[] args) throws IOException {
//		File file = new File("C:\\Users\\rdonde\\Downloads\\Exception Handling Team.txt");
//		System.out.println(file.exists());
		
//		File file = new File("test.txt");
//		if(!file.exists()) {
//			file.createNewFile();
//		      System.out.println("File is created successfully.....");		
//		      
//		}	  
//		
//		//FileWriter writer = new FileWriter(file, true);
//		//BufferedWriter writer = new BufferedWriter(new FileWriter(file));
//		PrintWriter writer = new PrintWriter(new FileWriter(file,true));
//		writer.println("Hello..\n");
//		//writer.newLine();
//		writer.println("Hi..\n");
//		//writer.newLine();
//		writer.println("How are you?..\n");
//		writer.println("I hope your fine. \n");
//		writer.println("bye..\n");
//		
//		
//		
//		writer.close();
//		System.out.println("content has been written successfully....");
//		FileReader reader = new FileReader("C:\\RasikaD\\Core java\\samplebankapp\\src\\com\\capgemini\\bankapp\\model\\BankAccount.java");
//		BufferedReader bReader = new BufferedReader(reader);
//		PrintWriter writer = new PrintWriter("BankAccount.java");
//	    String content;
//	    
//	    while((content = bReader.readLine())!=null) {
//	    	//System.out.println(content);
//	    	writer.println(content);
//	    }
//	    System.out.println("--SUCCESS--");
//	    writer.close();
//	    bReader.close();
//	    reader.close();
		
//		File windowsDirectory = new File("c:\\windows");
//		System.out.println(windowsDirectory.isDirectory());
//		String content[] = windowsDirectory.list();
//		
//		for(String s:content) {
//			System.out.println(s);
//		}
		
		File newDir = new File("myDir");
		if(! newDir.exists()) {
			newDir.mkdir();
			System.out.println("Folder is Successfully created");
		}
		File file = new File(newDir, "myfile.txt");
		if(! file.exists()) {
			file.createNewFile();
			System.out.println("File Created..........");
		}
		
		
	}
	
}
