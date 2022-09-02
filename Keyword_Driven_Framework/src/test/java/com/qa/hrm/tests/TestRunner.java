package com.qa.hrm.tests;

import org.testng.annotations.Test;

import com.qa.hrm.engine.ExecEngine;

public class TestRunner {

	public ExecEngine engine = new ExecEngine();
	
	@Test
	public void chromeTest() {	
		engine.startExecution("chrometest");
	}
	
	@Test
	public void firefoxTest() {
		engine.startExecution("firefoxtest");
	}
	
}
