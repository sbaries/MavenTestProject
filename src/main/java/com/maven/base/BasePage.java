package com.maven.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

import com.maven.pages.LoginPage;

public class BasePage {
	public static WebDriver driver;

	public BasePage() {
		ChromeOptions options = new ChromeOptions();
		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.navigate().to("https://www.amazon.com");
	    Actions action = new Actions(driver);
	}
	
	@BeforeClass
	public void LoginToTheApplication() throws InterruptedException {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginToApp();
		}
	
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
	
	

}
