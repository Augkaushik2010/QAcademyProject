package qAcademyPackageRepositories;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.testng.annotations.Test;

public class BaseDriverScript {
	public WebDriver driver;
  //@Test
  public WebDriver initializeDriver() throws IOException {
	  Properties sFile = new Properties();
	  FileInputStream fis = new FileInputStream("C:\\Selenium_Projects\\QAcademyProject\\src\\main\\java\\qAcademyPackageRepositories\\data.properties");
	  sFile.load(fis);
	  String browserName = sFile.getProperty("browser");
	  
	  if(browserName.equals("chrome")){
		  System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Projects\\chromedrvrlat\\chromedriver.exe");
		  driver = new ChromeDriver();  
	  }
	  else if(browserName.equals("firefox")) {
		  System.setProperty("webdriver.firefox.driver", "C:\\Selenium_Projects\\FirefoxDriver.exe");
		  driver = new FirefoxDriver();  

	  }
	  else if(browserName.equals("IE")) {
		  System.setProperty("webdriver.IE.driver", "C:\\Selenium_Projects\\InternetExplorerdriver.exe");
		  driver = new InternetExplorerDriver();
	  }
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  return driver;
	  
  }
}
