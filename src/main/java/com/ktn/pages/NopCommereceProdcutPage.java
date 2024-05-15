package com.ktn.pages;

import org.openqa.selenium.By;

import com.ktn.enums.WaitStrategy;

public class NopCommereceProdcutPage extends BasePage{
	
	public NopCommereceProdcutPage() {}
	
	private static final By shoeSizeDD 
	= By.id("product_attribute_9");
	
	public NopCommereceProdcutPage selectShoeSize(Object value) {
		selectFromDropDown(shoeSizeDD, "visibleText",WaitStrategy.PRESENCE, value);
		return this;
	}
	
	
}
