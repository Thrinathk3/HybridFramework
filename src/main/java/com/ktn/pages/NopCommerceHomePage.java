package com.ktn.pages;

import org.openqa.selenium.By;

import com.ktn.enums.WaitStrategy;

public class NopCommerceHomePage extends BasePage{
	public NopCommerceHomePage() {}
	
	private static final By loginBtn = By.xpath("//a[text()='Log in']");
	
	public NopCommerceLoginPage clickonLogin() {
		click(loginBtn, WaitStrategy.CLICKABLE,"LoginButton");
		return new NopCommerceLoginPage();
	}

	public NopCommerceHomePage waitSomeTime() {
		sleep(5000);
		return this;
		
	}

}
