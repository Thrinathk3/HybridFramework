package com.ktn.pages;

import org.openqa.selenium.By;

import com.ktn.enums.WaitStrategy;

public class NopCommereceShoesProdcutPage extends BasePage {
	
	
	public NopCommereceShoesProdcutPage() {}
	
	private static final By adidasShoes 
	= By.xpath("//div[@class='products-wrapper']//a[text()='adidas Consortium Campus 80s Running Shoes']");
	
	
	
	public NopCommereceShoesProdcutPage scrollToProduct() {
		scrollToELement(adidasShoes,WaitStrategy.PRESENCE, "adidas Shoes");
		return this;
	}
	
	public NopCommereceProdcutPage clickOnAdidasShoes() {
		click(adidasShoes,WaitStrategy.CLICKABLE, "adidas Shoes");
		return new NopCommereceProdcutPage();
	}
	
	

}
