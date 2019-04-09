package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage_Without_LogIn {

	private static WebElement element = null;
	
	public static WebElement SignIn(WebDriver driver){
		element = driver.findElement(By.xpath("//span[text()='Hello, Sign in']/parent::a"));
		return element;
	}
	
	public static WebElement Error_Message(WebDriver driver){
		element = driver.findElement(By.xpath("//div[@id='auth-error-message-box']//span"));
		return element;
	}
}
