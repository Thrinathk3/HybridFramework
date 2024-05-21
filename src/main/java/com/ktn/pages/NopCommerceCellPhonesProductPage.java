package com.ktn.pages;

import org.openqa.selenium.By;

import com.ktn.enums.WaitStrategy;

public class NopCommerceCellPhonesProductPage extends BasePage{
	public NopCommerceCellPhonesProductPage() {}
	private static final By NokiaPhone 
	= By.xpath("//div[@class='product-item']//a[text()='Nokia Lumia 1020']");
	public NopCommerceCellPhonesProductPage scrollToProduct() {
		scrollToELement(NokiaPhone,WaitStrategy.PRESENCE, "Nokia Phone");
		return this;
	}
	
	public NopCommerceProdcutPage clickOnNokiaPhone() {
		click(NokiaPhone,WaitStrategy.CLICKABLE, "Nokia Phone");
		return new NopCommerceProdcutPage();
	}
	
	

}
