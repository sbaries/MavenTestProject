package com.maven.tests;

import org.testng.annotations.Test;

import com.maven.base.BasePage;
import com.maven.pages.AlertsPage;
import com.maven.pages.CartAndCheckoutPage;
import com.maven.pages.ElectronicsPage;
import com.maven.pages.HomePage;
import com.maven.pages.LogoutPage;

public class AmazonTest extends BasePage {
	
	@Test( priority = 1 )
	public void HeadphoneTest () throws InterruptedException {
		
		HomePage homePage = new HomePage(driver);
		ElectronicsPage electronicPage = new ElectronicsPage(driver);
		CartAndCheckoutPage cartandcheckoutPage = new CartAndCheckoutPage(driver);
		AlertsPage alertPage = new AlertsPage(driver);
		homePage.Clickdepartment();
		electronicPage.ClickElectronics();
		electronicPage.ClickHeadphones();
		electronicPage.SelectHeadphone();
		cartandcheckoutPage.AddCart();
		alertPage.CloseAlert();
	}
	@Test( priority = 2 )
	public void MacBookProTest () throws InterruptedException {
		
		HomePage homePage = new HomePage(driver);
		ElectronicsPage electronicPage = new ElectronicsPage(driver);
		CartAndCheckoutPage cartandcheckoutPage = new CartAndCheckoutPage(driver);
		AlertsPage alertPage = new AlertsPage(driver);
		homePage.sendsearchBarKeys("Macbook pro");
		homePage.Clicksearchicon();
		electronicPage.SelectMacbookPro();
		cartandcheckoutPage.AddQuantity();
		cartandcheckoutPage.AddCart();
		alertPage.CloseMacbookAlert();
	}
	
	@Test( priority = 3 )
	public void DeleteItemsFromCart () throws InterruptedException {
		
		CartAndCheckoutPage cartandcheckoutPage = new CartAndCheckoutPage(driver);
		cartandcheckoutPage.CartIcon();
		cartandcheckoutPage.DeleteHeadphone();
		cartandcheckoutPage.ReduceMacBook();
		cartandcheckoutPage.Checkout();
		
	}
	@Test( priority = 4 )
	public void logoutToApp () throws InterruptedException {
		
		LogoutPage logoutPage = new LogoutPage(driver);
		logoutPage.logoutToApp();
		
	}
	
}
