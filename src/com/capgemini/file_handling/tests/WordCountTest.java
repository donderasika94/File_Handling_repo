package com.capgemini.file_handling.tests;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import com.capgemini.file_handling.model.WordCount;

public class WordCountTest {
	WordCount wordCount;
	@Test
	public void testWordCountFromFile() throws IOException {
		wordCount = new WordCount();
		assertEquals(18,wordCount.count());
	}

	

}
