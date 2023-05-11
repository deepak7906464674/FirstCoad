import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse1 {

public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
		
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--incognito");
		option.addArguments("--remote-allow-origins=*");
		
		WebDriver driver =new ChromeDriver(option);
		driver.manage().window().maximize();
		
		 driver.get("https://www.vuse.com/gb/en/");
		
	WebElement cookiePop=driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
		
	cookiePop.click();
		
	 WebElement ageGatePopup= driver.findElement(By.xpath("//button[@id='btn-entry-age-allow']"));
	 
		ageGatePopup.click();
WebElement searchfield=		driver.findElement(By.xpath("//input[@id='search']"));

		
        WebElement personIcon=driver.findElement(By.xpath("//span[@class='icon-account']"));
		
		
		Actions act =new Actions(driver);
		act.sendKeys(searchfield,"Test" +Keys.ENTER);
	
		act.moveToElement(personIcon).build().perform();
		
			
			
		
		
		}
	
	
	
	
	
	
	
	
	
	
	
}
