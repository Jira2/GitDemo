package dropDown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook_dropdown {

	public WebDriver driver;
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		WebElement month = driver.findElement(By.xpath("//*[@id='month']"));
		Select option = new Select(month);
		//List<WebElement> monthStore = new LinkedList<WebElement>();
		List<WebElement> monthStore = option.getOptions(); //stores all the option tags
		
		
		Set<String> sort = new TreeSet<String>();
		
		for(WebElement obj : monthStore)
		{
			sort.add(obj.getText());
		}
	
		System.out.println(sort);
		
		//Iteration of months
//		for(int i = 0; i<monthStore.size();i++){
//		System.out.println(monthStore.get(i).getText());}
		
		
		
		//System.out.println(sort);
//		
//		for(String obj:sort)
//			System.out.println(obj);
//		
//		Collections.sort(sort);
//		
//		//System.out.println(sort);
//		
//		for(String obj:sort)
//			System.out.println(obj);
//		//System.out.println(monthStore);
//		
		driver.quit();
	}
}
