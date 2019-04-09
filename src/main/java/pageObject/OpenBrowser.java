package pageObject;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
	public WebDriver driver;
	public void initalize() throws IOException{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		FileReader file = new FileReader(new File("D:\\MavenProject\\AmazonOrder\\src\\test\\resources\\config.properties"));
		Properties prop = new Properties();
		prop.load(file);
		System.out.println(prop.getProperty("URL"));
		driver.get(prop.getProperty("URL"));

	}
}
