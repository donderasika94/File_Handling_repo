package com.capgemini.file_handling.tests;

import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

import com.capgemini.file_handling.model.Grep;

public class GrepTest {
	Grep grep;
	@Test
	public void testFileExistsClass() {
		grep= new Grep();
		assertEquals(true,grep.isFileExsits());
	}
	@Test
	public void testFileNotExists() throws FileNotFoundException {
		grep = new Grep();
		assertEquals(false,grep.isFileNotExist());
	}
	
	
	@Test
	public void testGrepMethod() throws IOException {
		grep = new Grep();
		assertEquals(65,grep.findWord());		
	}
	

	

}
