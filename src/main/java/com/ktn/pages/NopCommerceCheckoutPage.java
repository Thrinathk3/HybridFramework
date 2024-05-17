package com.ktn.pages;

import org.openqa.selenium.By;

import com.ktn.enums.WaitStrategy;

public class NopCommerceCheckoutPage extends BasePage{
	public NopCommerceCheckoutPage(){}
	
	private static final By countryDD
	=By.id("BillingNewAddress_CountryId"); 
	
	private static final By cityField
	=By.id("BillingNewAddress_City"); 
	
	private static final By addressField
	=By.id("BillingNewAddress_Address1"); 
	
	private static final By pinCodeField
	=By.id("BillingNewAddress_ZipPostalCode"); 
	
	private static final By phNumnberField
	=By.id("BillingNewAddress_PhoneNumber");
	
	private static final By continueBillAddressBtn
	=By.xpath("//div[@id='billing-buttons-container']/button[2]");
	
	private static final By shippingMethodContinueBtn
	=By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
	
	private static final By paymentMethodContinueBtn
	=By.xpath("//button[@class='button-1 payment-method-next-step-button']");
	
	private static final By paymentinfoContinueBtn
	=By.xpath("//button[@class='button-1 payment-info-next-step-button']");
	
	private static final By confirmOrderContinueBtn
	=By.xpath("//button[@class='button-1 confirm-order-next-step-button']");
	
	private static final By orderCompletedMsg
	=By.xpath("//div[@class='section order-completed']/div/strong");
	
	private static final By orderCompletedContinueBtn
	=By.xpath("//button[@class='button-1 order-completed-continue-button']");
	
	
	public NopCommerceCheckoutPage selectCountry(String value) {
		sleep(3000);
		selectFromDropDown(countryDD,"visibleText",WaitStrategy.PRESENCE,value);
		return this;
	}
	
	public NopCommerceCheckoutPage enterCity(String value) {
		sendKeys(cityField, value, WaitStrategy.PRESENCE,"city field");
		return this;
	}
	
	public NopCommerceCheckoutPage enterAddressField(String value) {
		sendKeys(addressField, value, WaitStrategy.PRESENCE,"address field");
		return this;
	}
	
	
	public NopCommerceCheckoutPage enterPinCode(String value) {
		sendKeys(pinCodeField, value, WaitStrategy.PRESENCE,"pin/zip code field");
		return this;
	}
	
	public NopCommerceCheckoutPage enterPhNumber(String value) {
		sendKeys(phNumnberField, value, WaitStrategy.PRESENCE,"city field");
		return this;
	}
	
	public NopCommerceCheckoutPage clickOnContinueBillAddressBtn() {
		click(continueBillAddressBtn,WaitStrategy.CLICKABLE, "continue Billing Address Button");
		return this;
	}
	
	public NopCommerceCheckoutPage clickOnShippingMethodContinueBtn() {
		click(shippingMethodContinueBtn,WaitStrategy.CLICKABLE, "continue Shipping Method Button");
		return this;
	}
	
	public NopCommerceCheckoutPage clickOnPaymentMethodContinueBtn() {
		click(paymentMethodContinueBtn,WaitStrategy.CLICKABLE, "continue Payment Method Button");
		return this;
	}
	
	
	public NopCommerceCheckoutPage clickOnPaymentinfoContinueBtn() {
		click(paymentinfoContinueBtn,WaitStrategy.CLICKABLE, "continue Payment Info Button");
		return this;
	}
	
	public NopCommerceCheckoutPage clickOnConfirmOrderContinueBtn() {
		click(confirmOrderContinueBtn,WaitStrategy.CLICKABLE, "continue Confirm Order Button");
		return this;
	}
	
	public String getOrderCompletedMsg() {
		String msg = getElementText(orderCompletedMsg,WaitStrategy.PRESENCE, "order Completed Message");
		return msg;
	}
	
	
	public NopCommerceCheckoutPage clickOnOrderCompletedContinueBtn() {
		click(orderCompletedContinueBtn,WaitStrategy.CLICKABLE, "continue Order completed Button");
		return this;
	}
}
