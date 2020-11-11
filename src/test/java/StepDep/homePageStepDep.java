package StepDep;

import com.test.pageAction_Demo.com.homePageAction;
import com.testUtil_demo.com.testBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class homePageStepDep extends testBase{
	
	homePageAction HomePageAction = new homePageAction();
	
	@Given("^Launc \"([^\"]*)\"$")
	public void launc(String URL) throws Throwable {
	  getURL(URL);
		
	}

	@Then("^click on singin link$")
	public void click_on_singin_link() throws Throwable {
		HomePageAction.clickonsinginlink();
		
	}

	@Then("^click on singin Button$")
	public void click_on_singin_Button() throws Throwable {
		HomePageAction.clickonsinginButton();
		
	}

	@Then("^enter username and password$")
	public void enter_username_and_password() throws Throwable {
		HomePageAction.UserCredential(pro.getProperty("username"), pro.getProperty("password"));
		
	}

@Then("^click on SignIn$")
public void click_on_SignIn() throws Throwable {
   
	HomePageAction.clicksignIn();
	
}


	@Then("^verify user login successfully$")
	public void verify_user_login_successfully() throws Throwable {
		HomePageAction.verifyuserloginsuccessfully();
		
	}
	
	
@Then("^mouseover on products$")
public void mouseover_on_products() throws Throwable {
	
	HomePageAction.mouseoveronproducts();
}

@Then("^click on laptops$")
public void click_on_laptops() throws Throwable {
   
	HomePageAction.clickonlaptops();
}

@Then("^click on for business$")
public void click_on_for_business() throws Throwable {
	HomePageAction.clickonforbusiness();
	
}

@Then("^Verify user can buy laptops for Business$")
public void verify_user_can_buy_laptops_for_Business() throws Throwable {
    
	HomePageAction.VerifyusercanbuylaptopsforBusiness();
}
@Then("^Enter XPS in search fild$")
public void enter_XPS_in_search_fild() throws Throwable {
 
	HomePageAction.EnterXPSinsearchfild();
}

@Then("^click on search button$")
public void click_on_search_button() throws Throwable {
	HomePageAction.clickonsearchbutton();
	
}

@Then("^click on for work radio button$")
public void click_on_for_work_radio_button() throws Throwable {
 
	HomePageAction.clickonforworkradiobutton();
	
}

@Then("^verify user in for work page$")
public void verify_user_in_for_work_page() throws Throwable {

	HomePageAction.verifyuserinforworkpage();
	
}


}


