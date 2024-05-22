package com.ktn.tests;

import java.util.Map;

import org.testng.annotations.*;

import com.ktn.annotations.FrameworkAnnotation;
import com.ktn.enums.CategoryType;
import com.ktn.pages.NopCommerceHomePage;
import com.ktn.pages.NopCommerceLoginPage;
import com.ktn.pages.NopCommerceProdcutPage;
import com.ktn.pages.NopCommerceCellPhonesProductPage;
import com.ktn.pages.NopCommerceCheckoutPage;
import com.ktn.pages.NopCommerceShoppingCartPage;


public class NokiaCellPhoneCheckoutTest extends BaseTest {
	public NokiaCellPhoneCheckoutTest() {}
	
	@Test
	@FrameworkAnnotation(author= {"Thrinath","Tingu"}, 
	category = {CategoryType.REGRESSION,CategoryType.MINIREGRESSION})
	public void nokiaCellPhoneCheckoutTest(Map<String,String> data)  {
		NopCommerceHomePage nopHomePage = new NopCommerceHomePage();
		NopCommerceLoginPage nopsiginPage = new NopCommerceLoginPage();
		NopCommerceCellPhonesProductPage nopCellPhonesPage = new NopCommerceCellPhonesProductPage();
		NopCommerceProdcutPage nopProductPage = new NopCommerceProdcutPage();
		NopCommerceShoppingCartPage nopCartPAge = new NopCommerceShoppingCartPage();
		NopCommerceCheckoutPage nopCheckOutPage = new NopCommerceCheckoutPage();
		
		nopHomePage.clickonLogin();
		nopsiginPage.enterEmail(data.get("username")).
		enterPassword(data.get("password")).clickOnLoginButton();
		nopHomePage.moveToCellPhonesFlyout().clickonCellphones();
		nopCellPhonesPage.scrollToProduct().clickOnNokiaPhone();
		nopProductPage.clickAddToCartonNokiaPdp();
		String msg=nopProductPage.getSuccessMessage();
		System.out.println("Succes message after adding itesm to cart"+msg);
		nopProductPage.clickOnShoppingCartUrl();
		nopCartPAge.clickonTCCheckBox().clickonCheckOutBtn();
		nopCheckOutPage.selectCountry("India")
		.enterCity("Bangalore")
		.enterAddressField("Marathalli")
		.enterPinCode("560068")
		.enterPhNumber("8076356655")
		.clickOnContinueBillAddressBtn()
		.clickOnShippingMethodContinueBtn()
		.clickOnPaymentMethodContinueBtn()
		.clickOnPaymentinfoContinueBtn()
		.clickOnConfirmOrderContinueBtn();
		String text=nopCheckOutPage.getOrderCompletedMsg();
		System.out.println(" Sucess mesage "+text);
		nopCheckOutPage.clickOnOrderCompletedContinueBtn();
		
		
	}


}
