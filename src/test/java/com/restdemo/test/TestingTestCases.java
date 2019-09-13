package com.restdemo.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestingTestCases {

	@Test
	public void test() {
		String str= "I am done with Junit setup";
	      assertEquals("I am done with Junit setup",str);
	}

}
