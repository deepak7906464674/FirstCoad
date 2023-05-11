package hdmi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test1 {
	
	public static void main(String[] args) {
		
	
	 
	WebDriverManager.chromedriver().setup();
	
		
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		
		
		
		driver.get("https://www.saucedemo.com/");
		
		
		WebElement uname = driver.findElement(By.xpath("//input[@id='user-name']"));
		uname.sendKeys("deepak");
		
		
		 WebElement password =driver.findElement(By.xpath("//input[@id='password']"));
                 password.sendKeys("password");
                 
               
                 
                 
                 
                 WebElement cookiePop= driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handle']"));
         		
             	cookiePop.click();
             		
             	 WebElement ageGatePopup= driver.findElement(By.xpath("//button[@id='btn-entry-age-allow']"));
             	 
             		ageGatePopup.click();
             		
             		
             		
		
		
	}
		
		
		
		
	}


