package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class Base {
	
	//Instances
	private WebDriver driver;
	
	/*
	 * Constructor description
	 * @param: String 
	 * @return: 
	 * @throws:
	 * @author: ricardo.avalos
	 * @date: 5/Mar/2021
	 */
	public Base(WebDriver driver) {
		this.driver=driver;
	}
	
	/*
	 * Reporter log
	 */
	public void reporterLog(String log) {
		Reporter.log(log);
	}
	
	/*
	 * chrome driver set up
	 */
	public WebDriver chromeDriverSetup() {
		System.setProperty(GlobalVariables.NAME_CHROME_DRIVER, GlobalVariables.PATH_CHROME_DRIVER);
		driver = new ChromeDriver();
		return driver;
	}
	
	/*
	 * Launch browser
	 */
	public void launchBrowser(String url) {
		try {
			reporterLog("Launching browser..."+url);
			driver.get(url);
			driver.manage().window().maximize();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * Type
	 */
	public void type(By locator, String inputText) {
		if(inputText.equals("")) {
			return;
		}
		driver.findElement(locator).sendKeys(inputText);
	}
	
	/*
	 * Click
	 */
	public void click(By locator) {
		try {
			driver.findElement(locator).click();
		}catch(NoSuchElementException e) {
			e.printStackTrace();
		}
		
	}
	
	/*
	 * Wait for element present
	 */
	public void waitForElementPresent(By locator) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, GlobalVariables.STANDARD_TIME_OUT);
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		}catch(TimeoutException e) {
			e.printStackTrace();
		}
		
	}
	
	/*
	 * Wait for element present(Overloading)
	 */
	public void waitForElementPresent(By locator, int specificTimeout) {
		WebDriverWait wait = new WebDriverWait(driver, specificTimeout);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	/*
	 * Implicit wait
	 */
	public void implicitWait() {
		driver.manage().timeouts().implicitlyWait(GlobalVariables.STANDARD_TIME_OUT, TimeUnit.SECONDS);
	}
	
	/*
	 * Get Text
	 */
	public String getText(By locator) {
		return driver.findElement(locator).getText();
	}
	
	/*
	 * Close browser
	 */
	public void closeBrowser() {
		driver.close();
	}
}
