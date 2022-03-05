package com.opensource.qa;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
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

		// Test Data
		username = base.getJSONData(jsonCredentials, "username");
		password = base.getJSONData(jsonCredentials, "password");
		userNotExist = base.getJSONData(jsonAdminTestData, "userNotExist");
		msgNoRecords = base.getJSONData(jsonAdminTestData, "msgNoRecords");
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

	@AfterTest
	public void afterTest() {
	}

}
