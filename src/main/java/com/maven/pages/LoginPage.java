package com.maven.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.interactions.Actions;

public class LoginPage {
	public WebDriver driver;
	@FindBy(id="nav-link-accountList")
	WebElement loginLink;
	
	@FindBy(name="email")
	WebElement emailTextBox;
	
	@FindBy(id="ap_password")
	WebElement passwordTextBox;
	
	@FindBy(id="signInSubmit")
	WebElement loginButton;
	
	@FindBy(xpath="//a[@id = 'nav-link-accountList']//span[@class = 'nav-icon nav-arrow']")
    WebElement navigation;
	
	@FindBy(xpath="//span[contains(text(),'Sign Out')]")
	WebElement logoutButton;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void loginToApp() throws InterruptedException {
		Thread.sleep(2000);
		loginLink.click();
		Thread.sleep(1000);
		emailTextBox.click();
		emailTextBox.sendKeys("sbaries14@gmail.com");
		Thread.sleep(1000);
		passwordTextBox.click();
		passwordTextBox.sendKeys("GOJEK1");
		loginButton.click();
		//Actions action = new Actions(driver);
		//action.moveToElement(navigation).perform();
		//Thread.sleep(1000);
		//logoutButton.click();
	}
}
