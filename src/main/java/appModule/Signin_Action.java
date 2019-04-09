package appModule;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.internal.runners.statements.Fail;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;
import pageObject.LogIn;
import pageObject.HomePage_After_Login;
import pageObject.HomePage_Without_LogIn;

public class Signin_Action {

	@SuppressWarnings("deprecation")
	public static void Execute_LogIn(WebDriver driver, String username, String password) throws IOException{
		try{
		LogIn.Email_or_Phone_no(driver).sendKeys(username);
		LogIn.Continue(driver).click();
		LogIn.Password(driver).sendKeys(password);}catch(Exception e)
		{System.out.println(HomePage_Without_LogIn.Error_Message(driver).getText());
		driver.quit();
		Assert.fail();}
		
		
		
		LogIn.CheckBox_sign_in(driver).click();
		LogIn.Login_button(driver).click();
			
	}
	
	@SuppressWarnings("deprecation")
	public static void UserValidation(WebDriver driver, String user)
	{
		try{
		String Actual = HomePage_After_Login.WelcomeMessage(driver).getText();
		Assert.assertEquals(user, Actual);
		System.out.println(user+" Logged in successfully");
		}
		catch(Exception e)
		{System.out.println(HomePage_Without_LogIn.Error_Message(driver).getText());
		driver.quit();
		Assert.fail();}
		
		
		
	}
}
