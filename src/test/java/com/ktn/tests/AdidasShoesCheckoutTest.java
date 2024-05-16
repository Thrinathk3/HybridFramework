package com.ktn.tests;

import java.util.Map;

import org.testng.annotations.*;

import com.ktn.annotations.FrameworkAnnotation;
import com.ktn.enums.CategoryType;
import com.ktn.pages.NopCommerceHomePage;
import com.ktn.pages.NopCommerceLoginPage;
import com.ktn.pages.NopCommerceShoesProdcutPage;
import com.ktn.pages.NopCommerceProdcutPage;

public class AdidasShoesCheckoutTest extends BaseTest{
	public AdidasShoesCheckoutTest() {}
	
	@Test
	@FrameworkAnnotation(author= {"Thrinath","Tingu"}, 
	category = {CategoryType.REGRESSION,CategoryType.MINIREGRESSION})
	public void adidasShoesCheckoutTest(Map<String,String> data) {
		
		NopCommerceHomePage nopHomePage = new NopCommerceHomePage();
		NopCommerceLoginPage nopsiginPage = new NopCommerceLoginPage();
		NopCommerceShoesProdcutPage nopShoesPage = new NopCommerceShoesProdcutPage();
		NopCommerceProdcutPage nopProductPage = new NopCommerceProdcutPage();
		
		nopHomePage.clickonLogin();
		
		nopsiginPage.enterEmail(data.get("username")).
		enterPassword(data.get("password")).clickOnLoginButton();
		nopHomePage.moveToApparelFlyout().clickonShoes();		
		
		nopShoesPage.scrollToProduct().clickOnAdidasShoes();
		
		String msg = nopProductPage.selectShoeSize("9").clickAddToCart().getSuccessMessage();
		System.out.println("success message---> "+msg);
		
		nopProductPage.clickOnShoppingCartUrl();
	}

}
