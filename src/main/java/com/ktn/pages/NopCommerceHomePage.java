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
	
	public NopCommereceShoesProdcutPage clickonShoes() {
		click(Shoesctgry, WaitStrategy.CLICKABLE,"Shoes category");
		return new NopCommereceShoesProdcutPage();
	}
	
	
}
