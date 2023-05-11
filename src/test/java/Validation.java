import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Validation {
	public static void main(String[] args) {

	
	WebDriverManager.chromedriver().setup();
	
	ChromeOptions option =new ChromeOptions();
	option.addArguments("--incognito");
	option.addArguments("--remote-allow-origins=*");
	
	WebDriver driver =new ChromeDriver(option);
	driver.manage().window().maximize();
	
	 driver.get("https://www.saucedemo.com/");
	
	
     WebElement uname=driver.findElement(By.xpath("//input[@id='user-name']"));
	 
	 uname.sendKeys("standard_user");
	 
	     WebElement pass =driver.findElement(By.xpath("//input[@id='password']"));
	 
	 
	 pass.sendKeys("ecret_sauce");
	 
	 
	   WebElement loginbtn= driver.findElement(By.xpath("//input[@id='login-button']"));
	 
	 loginbtn.click();
	 
	 
	      WebElement productHeading=  driver.findElement(By.xpath("//span[@class='title']"));
	 
	 
	 assertTrue(productHeading.isDisplayed());
	 
	 
	 
	 
	 
	 
	 
	 
}

	 
		
	}
	

