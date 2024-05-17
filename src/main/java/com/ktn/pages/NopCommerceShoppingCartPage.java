package com.ktn.pages;

import org.openqa.selenium.By;

import com.ktn.enums.WaitStrategy;

public class NopCommerceShoppingCartPage extends BasePage {
	public NopCommerceShoppingCartPage() {}
	
	private static final By tcCheckBox 
	= By.id("termsofservice"); 
	
	private static final By checkOutBtn 
	= By.id("checkout");
	
	public NopCommerceShoppingCartPage clickonTCCheckBox() {
		click(tcCheckBox, WaitStrategy.CLICKABLE, "T&C Check Box");
		return this;
	}
	
	public NopCommerceCheckoutPage clickonCheckOutBtn() {
		click(checkOutBtn, WaitStrategy.CLICKABLE, "Checkout button");
		return new NopCommerceCheckoutPage();
	}
	
}
