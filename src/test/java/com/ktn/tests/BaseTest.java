package com.ktn.tests;

import java.util.Map;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.ktn.driver.Driver;
/**
 * Acts as a parent class for all the test classes in this framework.
 * All the test classes needs to extend this class. This class is responsible for invoking and terminating
 * browser under test.
 * 
 * <pre>
 * <b>
 * </b>
 * </pre>
 * 
 * Jan 22, 2023 
 * @author Thrinath K
 * @version 1.0
 * @since 1.0
 */
public class BaseTest {
	
	protected BaseTest() {}
	
	/**
	 * Invokes a new browser instance and loads the respective URL.
	 * 
	 * @author Thrinath K
	 * Jan 22, 2023
	 * @param data Have all the data feeded to the corresponding test method from data provider.In our case,it is
	 * a hashmap containing all the values from the excel sheet.
	 */
	@SuppressWarnings("unchecked")
	@BeforeMethod
	protected void setUp(Object[] data) { //Map<String,String>
		Map<String,String> map = (Map<String,String>)data[0];
		Driver.initDriver(map.get("browser"),map.get("version"));
	}

	/**
	 * Terminates the browser instance
	 * @author Thrinath K
	 * Jan 22, 2023
	 */
	@AfterMethod
	protected void tearDown() {
		Driver.quitDriver();
	}



}
