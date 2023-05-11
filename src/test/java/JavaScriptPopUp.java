import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptPopUp {
	private static final char[] Value = null;

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();

		ChromeOptions option = new ChromeOptions();

		option.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(option);

		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		// WebElement
		// jstn=driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));

		// jstn.click();
		WebElement jstn2 = driver.findElement(By.xpath(" //button[@onclick='jsPrompt()']"));

		jstn2.click();

		Thread.sleep(2000);

	}

}
