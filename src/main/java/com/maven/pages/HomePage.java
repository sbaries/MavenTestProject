package com.maven.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public static WebDriver driver;
	@FindBy(id="twotabsearchtextbox")
	WebElement searchBar;
	
	@FindBy(xpath="//a[contains(@id, 'nav-link-shopall')]")
	public WebElement department;
	
	@FindBy(xpath="//span[contains(@class,'nav-text')]  [contains(text(),'Electronics')]")
	public WebElement electronics;
	
	@FindBy(xpath="//input[@value='Go']")
	public WebElement searchicon;
	
	
	public HomePage(WebDriver driver) {
		HomePage.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
public WebElement searchBar() {
    return searchBar;
}

public void sendsearchBarKeys(String key) {
	searchBar.sendKeys(key);
}

public void Clickdepartment() throws InterruptedException {
	Actions action = new Actions(driver);
	action.moveToElement(department).perform();
	Thread.sleep(3000);
}

public void ClickElectronics() {
     electronics.click();
}

public void Clicksearchicon() throws InterruptedException {
	searchicon.click();
	Thread.sleep(3000);
}
}
