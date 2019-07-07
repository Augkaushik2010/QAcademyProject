package qAcademyPackageRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class QAcademyHomePage {
 public WebDriver driver;
 
 By Signin = By.xpath("//a[contains(@href,'sign_in')]");
 By Register = By.xpath("//a[contains(@href,'sign_up')]/span");
 By Homelnk = By.xpath("//a[text()='Home']");
 By Courseslnk = By.xpath("//a[text()='Courses']");
 By Videoslnk = By.xpath("//a[text()='Videos']");
 By IntGuidelnk = By.xpath("//a[text()='Interview Guide']");
 By Practicelnk = By.xpath("//a[text()='Practice']");
 By Bloglnk = By.xpath("//a[text()='Blog']");
 By Aboutlnk = By.xpath(("//a[text()='About'])[1]"));
 By Contactlnk = By.xpath("//a[text()='Contact']");
 
 
 public QAcademyHomePage(WebDriver driver) {
	 this.driver=driver;
 }
 
 public WebElement retSigninLinkProp() {
	 return driver.findElement(Signin);
 }
 
 public WebElement retRegisterLinkProp() {
	 return driver.findElement(Register);
 }
 
 public WebElement retHomeLinkProp() {
	 return driver.findElement(Homelnk);
	 //return driver.findElement(By.)
 }
 
 public WebElement retCoursesLinkProp() {
	 return driver.findElement(Courseslnk);
 } 

 public WebElement retVideosLinkProp() {
	 return driver.findElement(Videoslnk);
 }
 
 public WebElement retIntGuideLinkProp() {
	 return driver.findElement(IntGuidelnk);
 }
 
 public WebElement retPracticeLinkProp() {
	 return driver.findElement(Practicelnk);
 }
 
 public WebElement retBlogLinkProp() {
	 return driver.findElement(Bloglnk);
 }

 public WebElement retAboutLinkProp() {
	 return driver.findElement(Aboutlnk);
 }
 
 public WebElement retContactLinkProp() {
	 return driver.findElement(Contactlnk);
 }
 
 
}
