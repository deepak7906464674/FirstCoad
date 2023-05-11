package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage5 {
	WebDriver driver;
	public void user_launch_site_url() {
        WebDriverManager.chromedriver().setup();
		
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--incognito");
		option.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		
		
		
		 driver.get("https://www.saucedemo.com/");
	}
	
	public void user_enter_correct_username_and_correct_password() {
		 WebElement username= driver.findElement(By.xpath("//input[@id='user-name']"));
			username.sendKeys("standard_user");
		WebElement password=	driver.findElement(By.xpath("//input[@id='password']"));
			password.sendKeys("secret_sauce");
		}
		
		
		
	}

