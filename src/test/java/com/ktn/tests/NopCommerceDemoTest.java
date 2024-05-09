package com.ktn.tests;

import java.util.Map;

import org.testng.annotations.Test;

import com.ktn.annotations.FrameworkAnnotation;
import com.ktn.enums.CategoryType;
import com.ktn.pages.NopCommerceHomePage;
import com.ktn.pages.NopCommerceLoginPage;

public class NopCommerceDemoTest extends BaseTest {
	
	public NopCommerceDemoTest() {}
	
	@Test
	@FrameworkAnnotation(author= {"Thrinath","Tingu"}, 
	category = {CategoryType.REGRESSION,CategoryType.MINIREGRESSION})
	public void nopSigninTest(Map<String,String> data) {
		NopCommerceHomePage nopHomePage = new NopCommerceHomePage();
		NopCommerceLoginPage nopsiginPage = new NopCommerceLoginPage();
		
		
		nopHomePage.clickonLogin();
		
		nopsiginPage.enterEmail(data.get("username")).
		enterPassword(data.get("password")).clickOnLoginButton();
						
		
		nopHomePage.waitSomeTime();
		
		
		
	}


}
