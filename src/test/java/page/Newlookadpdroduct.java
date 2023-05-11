package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.Base;

public class Newlookadpdroduct extends Base {

	public void lunch_the_site_url() {
		setup();


	}

	public void search_shirt() {
		WebElement  search=	driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		search.sendKeys("tshirt");
		pressEnter();
	

	}

	public void proced_to_checknout() {
		WebElement shirt = driver.findElement(By.xpath("(//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal'])[3]"));
		shirt.click();
		
		switchWindow();
		WebElement addto = driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));
		addto.click();
		

	}

	public void validate_the_checkout() {

	}

}
