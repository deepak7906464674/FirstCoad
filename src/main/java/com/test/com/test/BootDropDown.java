package com.test.com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootDropDown {
	
	
	public static void main(String[] args) {
		
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--incognito");
		option.addArguments("--remote-allow-origins=*");
		
		WebDriver driver =new ChromeDriver(option);
		driver.manage().window().maximize();
		
		WebDriverManager.chromedriver().setup();
		
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		
	WebElement Dropdown=driver.findElement(By.xpath("//button[@id='menu1']"));
		
		Dropdown.click();
		
	
		
		
	 
		
		
		
		
		
		
		
			
			
		}
	
	
	
	
	
	
	
		
		
		
		
		
	}

