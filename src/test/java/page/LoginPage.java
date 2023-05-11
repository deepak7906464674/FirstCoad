package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.Base;

public class LoginPage extends Base {

	 
	public void user_enter_correct_username_and_correct_password() {
	 WebElement username= driver.findElement(By.xpath("//input[@id='user-name']"));
	 
		username.sendKeys("standard_user");
	WebElement password=	driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret_sauce");
		getScreenshot();
		
	}
 
	  
	  


 
	private void getScreenshot() {
		// TODO Auto-generated method stub
		
	}






	public void user_click_on_button() {
	WebElement loginbtn= driver.findElement(By.xpath("//input[@id='login-button']"));
	loginbtn.click();
	
	}
	
	
	
	
	
	
	
	
	

}
