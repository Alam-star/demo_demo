package com.test.pageLocator_Demo.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.testUtil_demo.com.testBase;

public class homePageLocator extends testBase{
	
		
	
	public homePageLocator() {
		
		PageFactory.initElements(driver, this);
		
				
	}
	@FindBy(how=How.XPATH, using="//span[text()='Sign In']")
	public WebElement SinginLink;
	@FindBy(how=How.XPATH, using="//a[text()='Sign In']")
	public WebElement SinginButton;
	@FindBy(how=How.ID, using="EmailAddress")
	public WebElement username;
	@FindBy(how=How.NAME, using="Password")
	public WebElement password;
	@FindBy(how=How.XPATH, using="//button[text()='Sign In']")
	public WebElement SignIn;
	@FindBy(how=How.XPATH, using="//*[@id=\"dell-masthead\"]/div[1]/div[2]/div[2]/div/button/span[2]/span")
	public WebElement VerifyLogin;
	
	@FindBy(how=How.XPATH, using="//button[@id='l1']")
	public WebElement mouseover;
	@FindBy(how=How.XPATH, using="//span[text()=' Laptops']")
	public WebElement clickonlaptop;
	@FindBy(how=How.XPATH, using="//img[@alt='View all Laptops for Business']")
	public WebElement clickonforbusiness;
	@FindBy(how=How.XPATH, using="//*[text()='Shop the best laptops & notebooks from Dell. See top laptop deals today.']")
	public WebElement verifyusercanbuylaptops;
	
	@FindBy(how=How.XPATH, using="//*[@class='mh-search-input']")
	public WebElement typeXPS;
	@FindBy(how=How.XPATH, using="//*[@class='mh-search-button-label']")
	public WebElement clicksinginButton;
	@FindBy(how=How.XPATH, using="//*[@for='bsd']")
	public WebElement clickforwork;
	@FindBy(how=How.XPATH, using="//*[text()='Shopping']")
	public WebElement verifyuserinforworkpage;




	

}
