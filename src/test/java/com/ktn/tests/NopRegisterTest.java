package com.ktn.tests;

import java.util.Map;

import org.testng.annotations.Test;

import com.ktn.annotations.FrameworkAnnotation;
import com.ktn.enums.CategoryType;
import com.ktn.pages.NopCommerceHomePage;
import com.ktn.pages.NopCommerceRegisterPage;

public class NopRegisterTest extends BaseTest{
	
	public NopRegisterTest(){}
	
	@Test
	@FrameworkAnnotation(author= {"Thrinath","Tingu"}, 
	category = {CategoryType.REGRESSION,CategoryType.MINIREGRESSION})
	public void nopRegisterTest(Map<String,String> data) {
		NopCommerceHomePage nopHomePage = new NopCommerceHomePage();
		NopCommerceRegisterPage nopRegisterPage = new NopCommerceRegisterPage();
		
		
		nopHomePage.clickonRegisterLink();
		nopRegisterPage.enterFirstName("P")
					   .enterLastName("Kavya")
					   .enterEmail("pkavya1235@gmail.com")
					   .enterPassword("Kavya@123")
					   .enterConfirmPassword("Kavya@123")
					   .clickOnRegisterBtn();
		
		
						
		
	
	}
		

}
