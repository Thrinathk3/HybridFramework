package com.ktn.pages;

import org.openqa.selenium.By;

import com.ktn.enums.WaitStrategy;

public class NopCommerceShoesProdcutPage extends BasePage {
	
	
	public NopCommerceShoesProdcutPage() {}
	
	private static final By adidasShoes 
	= By.xpath("//div[@class='products-wrapper']//a[text()='adidas Consortium Campus 80s Running Shoes']");
	
	
	
	public NopCommerceShoesProdcutPage scrollToProduct() {
		scrollToELement(adidasShoes,WaitStrategy.PRESENCE, "adidas Shoes");
		return this;
	}
	
	public NopCommerceProdcutPage clickOnAdidasShoes() {
		click(adidasShoes,WaitStrategy.CLICKABLE, "adidas Shoes");
		return new NopCommerceProdcutPage();
	}
	
	
	

}
