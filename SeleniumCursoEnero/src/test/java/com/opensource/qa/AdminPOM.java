package com.opensource.qa;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import poc.Admin;
import base.Base;
import poc.Login;

public class AdminPOM {
	/*
	 * Objects instances
	 */

	WebDriver driver;
	Base base;
	Login login;
	Admin admin;
	String username, password, msgNoRecords, userNotExist, newEmployee, newUser, newpassword;
	String jsonCredentials = "Credentials";
	String jsonAdminTestData = "AdminTestData";

	@BeforeTest
	public void beforeTest() throws FileNotFoundException {
		base = new Base(driver);
		driver = base.chromeDriverSetup();
		login = new Login(driver);
		admin = new Admin(driver);

		// Test Data JSON
//		username = base.getJSONData(jsonCredentials, "username");
//		password = base.getJSONData(jsonCredentials, "password");
//		userNotExist = base.getJSONData(jsonAdminTestData, "userNotExist");
//		msgNoRecords = base.getJSONData(jsonAdminTestData, "msgNoRecords");
		
		// Test Data Excel
		username = base.getCellData("Credentials", 1, 0);
		password = base.getCellData("Credentials", 1, 1);
		userNotExist = base.getCellData("AdminTestData", 1, 0);
		msgNoRecords = base.getCellData("AdminTestData", 1, 1);
		
//		newEmployee = "";
//		newUser = "";
//		newpassword = "";
	}

	@Test
	public void tc001AdminSearchEmployeePOM() {

		// STEP 1, 2, 3
		login.loginOrange(username, password);

		// STEP 4, 5, 6
		admin.searchUser(username);

		// STEP 7
		admin.validateUsernameTable(username);

		// STEP 8, 9
		login.logOut();
	}
	
	@AfterMethod
	public void test() {
		
	}
	
	@BeforeMethod
	public void test2() {
		
	}

	@AfterTest
	public void afterTest() {
	}

}
