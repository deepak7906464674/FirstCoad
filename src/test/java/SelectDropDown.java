import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDown {
public static void main(String[] args) {
	
	
	ChromeOptions option =new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	
	WebDriver driver =new ChromeDriver(option);
	driver.manage().window().maximize();
	
	WebDriverManager.chromedriver().setup();
	
	
	driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
	
	 WebElement dropdown=driver.findElement(By.xpath("//select[@id='course')"));
	 
	 Select s=new Select(dropdown);
     
     s.selectByIndex(1);
	
     
     
	
	
}
}
