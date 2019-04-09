package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage_After_Login {

private static WebElement element = null;
	
	public static WebElement WelcomeMessage(WebDriver driver){
		element = driver.findElement(By.xpath("//a[@id='nav-link-accountList']//span"));
		return element;
	}
	
	
	public static WebElement SearchBox(WebDriver driver){
		element = driver.findElement(By.xpath("//form/div[3]//input[@name='field-keywords']"));
		return element;
	}
}
