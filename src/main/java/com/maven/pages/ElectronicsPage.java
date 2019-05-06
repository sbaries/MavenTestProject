package com.maven.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectronicsPage {
	public static WebDriver driver;

	@FindBy(xpath="//span[contains(@class,'nav-text')]  [contains(text(),'Electronics')]")
	public WebElement electronics;
	
	@FindBy(xpath="//span[contains(@class,'a-size-small a-color-base')]  [contains(text(),'Headphones')]")
	public WebElement headphones;
	
	@FindBy(xpath="(//h2[contains(@class,'a-size-mini a-spacing-none a-color-base s-line-clamp-2')])[1]")
	public WebElement selectheadphone;
	
	@FindBy(xpath="(//div[contains(@class,'result-list')]//a[@class='a-link-normal a-text-normal'])[3]")
	public WebElement selectmacbookpro;
	
	
	public ElectronicsPage(WebDriver driver) {
		ElectronicsPage.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
public void ClickElectronics() {
     electronics.click();
}

public void ClickHeadphones() {
	headphones.click();
}

public void SelectHeadphone() {
	selectheadphone.click();
}

public void SelectMacbookPro() {
	selectmacbookpro.click();
}
}