package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.Newlookadpdroduct;

public class NewlookSerach {
	
	Newlookadpdroduct addcart=new Newlookadpdroduct();
	
	
	@Given("lunch the site url")
	public void lunch_the_site_url() {
	    addcart.lunch_the_site_url();
	}

	@When("search shirt")
	public void search_shirt() {
	     addcart.search_shirt();
	}

	@And("proced to checknout")
	public void proced_to_checknout() {
	   addcart.proced_to_checknout(); 
	}

	@Then("validate the checkout")
	public void validate_the_checkout() {
	    addcart.validate_the_checkout();
	}

}
