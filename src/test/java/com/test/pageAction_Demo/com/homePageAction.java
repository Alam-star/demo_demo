package com.test.pageAction_Demo.com;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.test.pageLocator_Demo.com.homePageLocator;
import com.testUtil_demo.com.Utiliti;
import com.testUtil_demo.com.testBase;

public class homePageAction extends testBase{
	
	homePageLocator HomePageLocator = new homePageLocator();
	
	public void clickonsinginlink() {
		HomePageLocator.SinginLink.click();
		
	}
	public void clickonsinginButton() {
		HomePageLocator.SinginButton.click();
		
	}
	public void UserCredential (String u, String p) {
		HomePageLocator.username.sendKeys(u);
		HomePageLocator.password.sendKeys(p);
		//HomePageLocator.LoginButton.click();
	}
	public void clicksignIn() {
		HomePageLocator.SignIn.click();
		
		
	}
		public void verifyuserloginsuccessfully() {
		boolean verifyresult = HomePageLocator.VerifyLogin.isDisplayed();
		Assert.assertTrue(verifyresult);
				
		
	}
		public void mouseoveronproducts() {
			
			Actions ac = new Actions(driver);
			ac.build().perform();
			HomePageLocator.mouseover.click();
			
		}
		public void clickonlaptops() {
			HomePageLocator.clickonlaptop.click();
						
			
		}
		public void clickonforbusiness() {
			HomePageLocator.clickonforbusiness.click();
			
			
		}
		public void VerifyusercanbuylaptopsforBusiness() {
			
			boolean verify = HomePageLocator.verifyusercanbuylaptops.isDisplayed();
			Assert.assertTrue(verify);
			
			Utiliti.takescreenshot(driver, "profilepage");
		}
		public void EnterXPSinsearchfild() {
			HomePageLocator.typeXPS.sendKeys("XPS");
			
		}
		public void clickonsearchbutton() {
			HomePageLocator.clicksinginButton.click();
			
			Utiliti.takescreenshot(driver, "searchbutton");
		}
		public void clickonforworkradiobutton() {
			HomePageLocator.clickforwork.click();
			
		}
		public void verifyuserinforworkpage() {
			boolean findiind = HomePageLocator.verifyuserinforworkpage.isDisplayed();
			Assert.assertTrue(findiind);
			
		}

}
