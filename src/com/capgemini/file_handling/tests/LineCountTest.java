package com.capgemini.file_handling.tests;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import com.capgemini.file_handling.model.LineCount;

public class LineCountTest {
	LineCount lineCount;
	
	@Test
	public void testLineCountFiles() throws IOException {
		lineCount = new LineCount();
		assertEquals(8,lineCount.count());	
	}

	

}
