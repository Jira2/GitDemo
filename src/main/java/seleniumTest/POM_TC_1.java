package seleniumTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import pageObject.OpenBrowser;
import pageObject.HomePage_Without_LogIn;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import appModule.Signin_Action;


public class POM_TC_1{
	static WebDriver driver;
	public  void main(String args[]) throws IOException, InterruptedException{
	OpenBrowser open = new OpenBrowser();
	open.initalize();
	this.driver =  open.driver;
	Thread.sleep(5000);
	HomePage_Without_LogIn.SignIn(driver).click();
	Signin_Action.Execute_LogIn(driver, username, password);
	System.out.println("Logged in successfully");
	
	}
}
