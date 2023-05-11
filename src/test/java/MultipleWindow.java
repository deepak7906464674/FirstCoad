import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

           public class MultipleWindow {
             public static void main(String[] args) {
		
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--incognito");
		option.addArguments("--remote-allow-origins=*");
		
		WebDriver driver =new ChromeDriver(option);
		driver.manage().window().maximize();
		
		WebDriverManager.chromedriver().setup();
		
      
         driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
         
         String parentid=driver.getWindowHandle();
         
           System.out.println(parentid);
           
            
		
	
		     WebElement Btn=driver.findElement(By.xpath("//button[@id='newWindowBtn']"));		
	
		     
		     Btn.click();
		     
		 
		
	Set<String> childIds=driver.getWindowHandles(); 
	
	for(String s:childIds) {
		
		
		if(parentid.equals(s)) {
			
			driver.switchTo().window(s);
			
		}
	
	}
             }
           }
