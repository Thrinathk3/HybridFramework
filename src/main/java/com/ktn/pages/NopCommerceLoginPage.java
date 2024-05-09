package com.ktn.pages;

import org.openqa.selenium.By;

import com.ktn.enums.WaitStrategy;
import com.ktn.utils.DecodeUtils;

public class NopCommerceLoginPage extends BasePage{
	
	public NopCommerceLoginPage() {}
	
	private static final By emailfield = By.id("Email");
	
	private static final By passwordfield = By.id("Password");
	
	private static final By loginButton = By.xpath("//button[text()='Log in']");
	
	
	public NopCommerceLoginPage enterEmail(String value) {
		sendKeys(emailfield, value, WaitStrategy.PRESENCE, "eamil" );
		return this;
	}
	
	public NopCommerceLoginPage enterPassword(String value) {
		sendKeys(passwordfield,  DecodeUtils.getDecodedString(value), WaitStrategy.PRESENCE, "password" );
		return this;
	}
	
	public NopCommerceHomePage clickOnLoginButton() {
		click(loginButton, WaitStrategy.PRESENCE, "loginButton" );
		return new NopCommerceHomePage();
	}
	

}
