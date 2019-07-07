package qAcademyPackageTestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import qAcademyPackageRepositories.BaseDriverScript;
import qAcademyPackageRepositories.QAcademyHomePage;
public class QAcademySigninPageNavigation extends BaseDriverScript{
	WebDriver driver;
	
	@BeforeTest
	public void initDriv() throws IOException {
		driver = initializeDriver();
	}
	
	@Test
	public void navigateToHomePage() throws IOException, InterruptedException{
		driver.get("http://www.qaclickacademy.com/");
		Thread.sleep(30000);
		QAcademyHomePage obj1 = new QAcademyHomePage(driver);
		obj1.retSigninLinkProp().click();
	}
	
	/*@Test
	public void clckOnSignIn() throws IOException {
		QAcademyHomePage obj1 = new QAcademyHomePage(driver);
		obj1.retSigninLinkProp().click();
		//obj1.retHomeSearchProp().sendKeys("Amazon");
	}*/
	
	
}