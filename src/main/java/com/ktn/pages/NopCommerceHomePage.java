package com.ktn.pages;

import org.openqa.selenium.By;

import com.ktn.enums.WaitStrategy;

public class NopCommerceHomePage extends BasePage{
	public NopCommerceHomePage() {}
	
	private static final By loginBtn = By.xpath("//a[text()='Log in']");
	private static final By ApparelFlyout
	=By.xpath("//ul[@class='top-menu notmobile']//a[text()='Apparel ']");
	
	private static final By Shoesctgry
	=By.xpath("//ul[@class='top-menu notmobile']//a[text()='Shoes ']");
	
	private static final By registerLink
	=By.linkText("Register");
	
	private static final By ElectronicsFlyout
	=By.xpath("//ul[@class='top-menu notmobile']//a[text()='Electronics ']");
	private static final By Cellphonesctgry
	=By.xpath("//ul[@class='top-menu notmobile']//a[text()='Cell phones ']");
	
	
	public NopCommerceLoginPage clickonLogin() {
		click(loginBtn, WaitStrategy.CLICKABLE,"LoginButton");
		return new NopCommerceLoginPage();
	}

	public NopCommerceHomePage waitSomeTime() {
		sleep(5000);
		return this;
		
	}
	
	public NopCommerceHomePage moveToApparelFlyout() {
		moveToWebElementElement(ApparelFlyout, "ApparelFlyout");
		return this;
	}
	
	public NopCommerceShoesProdcutPage clickonShoes() {
		click(Shoesctgry, WaitStrategy.CLICKABLE,"Shoes category");
		return new NopCommerceShoesProdcutPage();
	}
	
	public NopCommerceRegisterPage clickonRegisterLink() {
		click(registerLink, WaitStrategy.CLICKABLE,"Register Link");
		return new NopCommerceRegisterPage();
	}
	public NopCommerceHomePage moveToCellPhonesFlyout() {
		moveToWebElementElement(ElectronicsFlyout, "Electronics Flyout");
		return this;
	}
	public NopCommerceCellPhonesProductPage clickonCellphones() {
		click(Cellphonesctgry, WaitStrategy.CLICKABLE,"CellPhones category");
		return new NopCommerceCellPhonesProductPage();
	}
	
	
}
