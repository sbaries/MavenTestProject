package com.maven.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertsPage {
	public static WebDriver driver;

	@FindBy(xpath="//a[@id='attach-close_sideSheet-link']")
	public WebElement closealert;
	
	@FindBy(xpath="//i[@class='a-icon a-icon-close']")
	public WebElement closeMacBookalert;
	

	public AlertsPage(WebDriver driver) {
		AlertsPage.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
public void CloseAlert() throws InterruptedException {
	closealert.click();
	Thread.sleep(20000);
}

public void CloseMacbookAlert() throws InterruptedException {
	closeMacBookalert.click();
	Thread.sleep(20000);
}
}

