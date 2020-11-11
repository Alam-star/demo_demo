package com.TestRunner_Demo.com;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.testUtil_demo.com.testBase;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"./src/test/resources/features/home.feature"} , 
format = {"html:targer/site/cucumber-pretty"},
glue = "StepDep",tags = {"@Senity"})


public class Testrunner extends AbstractTestNGCucumberTests{
	testBase test = new testBase();
	
	@BeforeTest
	public void setup() {
		
		test.initil();
	}
	
	@AfterTest
	public void tearDown() {
		
		test.driver.quit();
		
	}

   

}
