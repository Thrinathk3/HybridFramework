package com.ktn.pages;

import org.openqa.selenium.By;

import com.ktn.enums.WaitStrategy;

public class NopCommerceProdcutPage extends BasePage{
	
	public NopCommerceProdcutPage() {}
	
	private static final By shoeSizeDD 
	= By.id("product_attribute_9");
	
	private static final By addCartBtn 
	=By.id("add-to-cart-button-25"); 
	
	private static final By successMessage 
	=By.xpath("//div[@class='bar-notification success']/p");
	
	private static final By shoppingCartUrl
	=By.linkText("shopping cart");
	
	private static final By PhoneaddCartBtn 
    =By.id("add-to-cart-button-20");
	
	public NopCommerceProdcutPage selectShoeSize(Object value) {
		selectFromDropDown(shoeSizeDD, "visibleText",WaitStrategy.PRESENCE, value);
		return this;
	}
	
	public NopCommerceProdcutPage clickAddToCart() {
		click(addCartBtn,WaitStrategy.CLICKABLE, "add to cart button");
		return this;
	}
	
	public String getSuccessMessage() {
		String msg =getElementText(successMessage,WaitStrategy.VISIBLE, "successMessage");
		return msg;
	}
	
	public NopCommerceShoppingCartPage clickOnShoppingCartUrl() {
		click(shoppingCartUrl,WaitStrategy.CLICKABLE, "Shopping cart URL");
		return new NopCommerceShoppingCartPage();
	}
	 public NopCommerceProdcutPage clickAddToCartonNokiaPdp() {
			click(PhoneaddCartBtn,WaitStrategy.CLICKABLE, "add to cart button");
			return this;
		}
		
}
