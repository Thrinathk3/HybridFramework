package com.ktn.pages;

import org.openqa.selenium.By;

import com.ktn.enums.WaitStrategy;

public class NopCommerceRegisterPage extends BasePage {
	
	public NopCommerceRegisterPage(){}
	
	//id-> FirstName, LastName, Email, Password, ConfirmPassword, register-button
	
	private static final By firstNameField
	=By.id("FirstName");
	
	private static final By lastNameField
	=By.id("LastName");
	
	private static final By emailField
	=By.id("Email");
	
	private static final By passwordField
	=By.id("Password");
	
	private static final By confirmPswdField
	=By.id("ConfirmPassword");
	
	private static final By registerBtn
	=By.id("register-button");
	
	public NopCommerceRegisterPage enterFirstName(String value) {
		sendKeys(firstNameField,value, WaitStrategy.PRESENCE, " First Name Field");
		return this;
	}
	
	public NopCommerceRegisterPage enterLastName(String value) {
		sendKeys(lastNameField,value, WaitStrategy.PRESENCE, " Last Name Field");
		return this;
	}
	
	public NopCommerceRegisterPage enterEmail(String value) {
		sendKeys(emailField,value, WaitStrategy.PRESENCE, " Email Field");
		return this;
	}
	
	
	public NopCommerceRegisterPage enterPassword(String value) {
		sendKeys(passwordField,value, WaitStrategy.PRESENCE, "password");
		return this;
	}
	
	public NopCommerceRegisterPage enterConfirmPassword(String value) {
		sendKeys(confirmPswdField,value, WaitStrategy.PRESENCE, "password");
		return this;
	}
	
	public NopCommerceHomePage clickOnRegisterBtn() {
		click(registerBtn, WaitStrategy.CLICKABLE, "Register Button");
		return new NopCommerceHomePage();
	}
	
	
	
	
	
	
	
	

}
