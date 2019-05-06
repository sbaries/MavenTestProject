package com.maven.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	public WebDriver driver;
	
	@FindBy(xpath="//span[contains(text(),'Sign Out')]")
	WebElement logoutButton;

	public LogoutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void logoutToApp() throws InterruptedException {
		Actions action = new Actions(driver);
		WebElement accountsbutton = driver.findElement(By.xpath("//a[contains(@id, 'nav-link-accountList')]"));
		action.moveToElement(accountsbutton).perform();
		Thread.sleep(2000);
		logoutButton.click();
	}
}