package com.maven.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CartAndCheckoutPage {
	public static WebDriver driver;

	@FindBy(xpath="//input[contains(@id,'add-to-cart-button')]")
	public WebElement addCart;
	
	@FindBy(id="quantity")
	WebElement addQuantity;
	
	@FindBy(xpath="//*[@id='nav-cart']")
	WebElement cartIcon;
	
	@FindBy(xpath="(//input[@value='Delete'])[2]")
	WebElement deleteHeadphone;
	
	@FindBy(xpath="//select[@class='a-native-dropdown a-button-span8']")
	WebElement removeQuantity;
	
	@FindBy(name="proceedToCheckout")
	WebElement checkout;
	

	public CartAndCheckoutPage(WebDriver driver) {
		CartAndCheckoutPage.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
public void AddCart() throws InterruptedException {
     addCart.click();
     Thread.sleep(20000);
}

public void AddQuantity() throws InterruptedException {
	Select s = new Select(addQuantity);
	s.selectByValue("2");
    Thread.sleep(20000);
}

public void CartIcon() throws InterruptedException {
	cartIcon.click();
    Thread.sleep(20000);
}

public void DeleteHeadphone() throws InterruptedException {
	deleteHeadphone.click();
    Thread.sleep(20000);
}

public void ReduceMacBook() throws InterruptedException {
	Select s = new Select(removeQuantity);
	s.selectByValue("1");
    Thread.sleep(20000);
}

public void Checkout(){
	checkout.click();
}

}
