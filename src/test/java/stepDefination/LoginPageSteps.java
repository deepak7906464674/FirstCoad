package stepDefination;

import helper.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.LoginPage;

public class LoginPageSteps extends Base{
	
	 LoginPage login= new LoginPage();
	

	@Given("user launch site url")
	public void user_launch_site_url() {
        setup();
		}
    
	
	     
	@When("user enter correct username and correct password")
	public void user_enter_correct_username_and_correct_password() {
	  login.user_enter_correct_username_and_correct_password();
	}
  
	  
	  


	@When("user click on button")
	public void user_click_on_button() {
	 login.user_click_on_button();
	
	}

	@Then("Validate user navigates to home")
	public void validate_user_navigates_to_home() {
		
	}
	

	
	
	
	
	
	
	
	
}
