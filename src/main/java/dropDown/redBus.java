package dropDown;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class redBus {

	public static void main(String[] args) throws IOException,AWTException, InterruptedException, Throwable {
		
	ChromeOptions red = new ChromeOptions();
	red.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(red);
		
		driver.navigate().to("https://www.redbus.in/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
	
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("mumbai");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.out.println("A");
		Thread.sleep(1300);
		List<WebElement> fromcities = driver.findElements(By.xpath("//input[@id='src']/following-sibling::ul/li"));
		for(int i =0;i<fromcities.size();i++){
			System.out.println(fromcities.get(i).getText());
		}
	
		

	}

}
