package stepDefinitions;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import appModule.Signin_Action;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.LogIn;
import pageObject.OpenBrowser;
import pageObject.HomePage_After_Login;
import pageObject.HomePage_Without_LogIn;
import seleniumTest.POM_TC_1;

public class Glue_LogIn {

WebDriver driver;

@Given("^user is on home page$")
public void user_is_on_home_page() throws Throwable {
	OpenBrowser open = new OpenBrowser();
	open.initalize();
	this.driver = open.driver;
	
	//FluentWait
//	Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(5, TimeUnit.SECONDS).pollingEvery(2, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
//	WebElement press = 	wait.until(new Function<WebDriver, WebElement>()){
//	public WebElement apply(WebDriver driver){
//		WebElement element = HomePage_Without_LogIn.SignIn(driver);
//		return element
//	}
//	}
	
	
	//Explicit wait
	WebDriverWait wait = new WebDriverWait(driver,5);
	wait.until(ExpectedConditions.visibilityOf(HomePage_Without_LogIn.SignIn(driver))).click();

	//Thread.sleep(5000);
	//HomePage_Without_LogIn.SignIn(driver).click();
}

@When("^user enters \"([^\"]*)\" And \"([^\"]*)\"$")
public void user_enters_And(String username, String password) throws Throwable {
	Signin_Action.Execute_LogIn(driver, username, password);
   
}

//@And("^user is able to login$")
//public void user_is_able_to_login() throws Throwable {
//	System.out.println("Logged in successfully");
//}


//@Then("^validate the \"([^\"]*)\"$")
//public void validate_the(String user) throws Throwable {
//	Signin_Action.UserValidation(driver,user);
//	driver.quit();
//}

@Given("^search box is editable$")
public void search_box_is_editable() throws Throwable {
	//this.driver
    HomePage_After_Login.SearchBox(driver).sendKeys("t shirt");
//    WebDriverWait wait = new WebDriverWait(driver,5);
//    wait.until(ExpectedConditions.visibilityOf(HomePage_After_Login.SearchBox(driver)));
}

@When("^user enters \"([^\"]*)\" and enters Enter$")
public void user_enters_and_enters_Enter(String arg1,String product) throws Throwable {
	HomePage_After_Login.SearchBox(driver).sendKeys(product);
}

@When("^Selects product and applies filter for brand \"([^\"]*)\"$")
public void selects_product_and_applies_filter_for_brand(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^gets the product attribute as size and color$")
public void gets_the_product_attribute_as_size_and_color() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}


	
	
}
