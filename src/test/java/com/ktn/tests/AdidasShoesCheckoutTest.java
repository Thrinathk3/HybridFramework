package com.ktn.tests;

import java.util.Map;

import org.testng.annotations.Test;

import com.ktn.annotations.FrameworkAnnotation;
import com.ktn.enums.CategoryType;
import com.ktn.pages.NopCommerceHomePage;
import com.ktn.pages.NopCommerceLoginPage;
import com.ktn.pages.NopCommereceShoesProdcutPage;
import com.ktn.pages.NopCommereceProdcutPage;

public class AdidasShoesCheckoutTest extends BaseTest{
	public AdidasShoesCheckoutTest() {}
	
	@Test
	@FrameworkAnnotation(author= {"Thrinath","Tingu"}, 
	category = {CategoryType.REGRESSION,CategoryType.MINIREGRESSION})
	public void adidasShoesCheckoutTest(Map<String,String> data) {
		
		NopCommerceHomePage nopHomePage = new NopCommerceHomePage();
		NopCommerceLoginPage nopsiginPage = new NopCommerceLoginPage();
		NopCommereceShoesProdcutPage nopShoesPage = new NopCommereceShoesProdcutPage();
		
		NopCommereceProdcutPage nopProductPage = new NopCommereceProdcutPage();
		
		nopHomePage.clickonLogin();
		
		nopsiginPage.enterEmail(data.get("username")).
		enterPassword(data.get("password")).clickOnLoginButton();
		nopHomePage.moveToApparelFlyout().clickonShoes();		
		
		nopShoesPage.scrollToProduct().clickOnAdidasShoes();
		nopProductPage.selectShoeSize("9").sleep(5000);;
		
	}

}
