package helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static WebDriver driver;
	public static Properties prop;
	static {

		try {
			FileInputStream file = new FileInputStream("TestData/UserData.properties");
			prop = new Properties();
			prop.load(file);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void setup() {
		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();

			ChromeOptions option = new ChromeOptions();
			option.addArguments("--incognito");
			option.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(option);

		} else if (browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions option = new FirefoxOptions();
			option.addArguments("--incognito");
			driver = new FirefoxDriver(option);

		} else if (browserName.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			EdgeOptions option = new EdgeOptions();
			option.addArguments("--remote-allow-origins=*");
			option.addArguments("--incognito");
			driver = new EdgeDriver(option);
		}

		driver.manage().window().maximize();

		driver.get(prop.getProperty("Url"));

	}

	public void mouseHower(WebElement ele) {
		Actions a = new Actions(driver);
		a.moveToElement(ele).build().perform();
	}

	public void selectByVisibleText(WebElement ele, int value) {

		Select s = new Select(ele);
		s.selectByIndex(value);

	}

	public void doubleClick(WebElement ele) {
		Actions a = new Actions(driver);
		a.doubleClick(ele).build().perform();
	}
	public void takeSS() {
		TakesScreenshot src = (TakesScreenshot) driver;
		File srcFile = src.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File("Screenshots/test.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void wait(WebElement ele) {
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.elementToBeClickable(ele));
	}
	public void pressEnter() {
		Actions a = new Actions(driver);
		a.sendKeys(Keys.ENTER).build().perform();	
		
	}
	public void switchWindow() {
		String parentid = driver.getWindowHandle();
		System.out.println(parentid);
		
		Set<String> childId = driver.getWindowHandles();
		System.out.println(childId);
		for(String s : childId) {
			if(!parentid.equals(s)) {
				driver.switchTo().window(s);
			}
		}
		
	}
	
}
