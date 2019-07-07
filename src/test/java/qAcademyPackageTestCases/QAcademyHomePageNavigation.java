package qAcademyPackageTestCases;

import org.testng.annotations.Test;
import java.io.IOException;

//import org.testng.annotations.Test;

import qAcademyPackageRepositories.BaseDriverScript;
public class QAcademyHomePageNavigation extends BaseDriverScript{

	@Test
	public void navigateToHomePage() throws IOException {
		driver = initializeDriver();
		driver.get("http://www.qaclickacademy.com/");
		driver.close();
		//driver.quit();
	}
}
