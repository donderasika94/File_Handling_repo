package com.capgemini.file_handling.tests;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.capgemini.file_handling.model.FileExists;

public class FileExistsTest {
	FileExists fileExists;

	@Test
	public void testFileExistsClass() {
		fileExists = new FileExists();
		assertEquals(true,fileExists.isFileExsits());
	}

}
