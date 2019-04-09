package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogIn {

	private static WebElement element = null;
	
	public static WebElement Email_or_Phone_no(WebDriver driver){
		element = driver.findElement(By.name("email"));
		return element;
	}
	
	public static WebElement Continue(WebDriver driver){
		element = driver.findElement(By.id("continue"));
		return element;
	}
	
	public static WebElement Password(WebDriver driver){
		element = driver.findElement(By.name("password"));
		return element;
	}
	
	public static WebElement Login_button(WebDriver driver){
		element = driver.findElement(By.id("signInSubmit"));
		return element;
	}
	
	public static WebElement CheckBox_sign_in(WebDriver driver){
		element = driver.findElement(By.name("rememberMe"));
		return element;
	}
	
	public static WebElement Change(WebDriver driver){
		element = driver.findElement(By.tagName("Change"));
		return element;
	}
}
