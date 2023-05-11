package stepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helper.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.Vuse_Login;
import page.Vuse_addToCart;
import page.Vuse_signIn;

public class Vuse_functionality extends Base {
	Vuse_addToCart addcart = new Vuse_addToCart();
	Vuse_Login login = new Vuse_Login();
	Vuse_signIn signin = new Vuse_signIn();

	@Given("launch url")
	public void launch_url() {
		setup();
	}
	@And("click accept cookie and age allow popup")
	public void click_accept_cookie_and_age_allow_popup() {

		WebElement accept;
		accept = driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]"));
		accept.click();
		//age popup
		accept = driver.findElement(By.xpath("(//button[@class='button-root_highPriority-3u6 button-root-16x clickable-root-2gB'])[17]"));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	wait.until(ExpectedConditions.elementToBeClickable(accept)).click();
	
		
		
		
	}
	

	@When("search epod")
	public void search_epod() {
		addcart.search_epod();
	}

	@And("add to cart")
	public void add_to_cart() {
		addcart.add_to_cart();
	}

	@Then("proceed to checkout and verify")
	public void proceed_to_checkout_and_verify() {
		addcart.proceed_to_checkout_and_verify();
	}

	@When("click sign in icon")
	public void click_sign_in_icon() {
		signin.click_sign_in_icon();
	}

	@And("click with email to fill sign in form")
	public void click_with_email_to_fill_sign_in_form() {
		signin.click_with_email_to_fill_sign_in_form();
	}

	@Then("verify sign in")
	public void verify_sign_in() {
		signin.verify_sign_in();
	}

	@When("enter email and password")
	public void enter_email_and_password() {
		login.enter_email_and_password();
	}

	@And("click login button")
	public void click_login_button() {
		login.click_login_button();
	}

	@Then("verify display massage")
	public void verify_display_massage() {
		login.verify_display_massage();
	}

}
