package poc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import base.Base;

public class Admin extends Base{

	public Admin(WebDriver driver) {
		super(driver);
	}
	
	/*
	 * Objects
	 */
	
	private By lnkAdminHeader = By.xpath("//a[@id='menu_admin_viewAdminModule']");
	private By txtUsername = By.id("searchSystemUser_userName");
	private By btnSearch = By.id("searchBtn");
	private By tblUsername = By.xpath("//tbody/tr[1]/td[2]");
	
	/*
	 * Customize methods
	 */
	public void searchUser(String username) {
		reporterLog("Searching username..."+username);
		click(lnkAdminHeader);
		type(txtUsername, username);
		click(btnSearch);
		implicitWait();	
	}
	
	public void validateUsernameTable(String expectedUser) {
		reporterLog("Validate username "+expectedUser);
		String actualUsername = getText(tblUsername);
		Assert.assertEquals(actualUsername, expectedUser);
	}

}
