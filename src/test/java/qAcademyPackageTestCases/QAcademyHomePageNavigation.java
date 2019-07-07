package qAcademyPackageTestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import qAcademyPackageRepositories.BaseDriverScript;
public class QAcademyHomePageNavigation extends BaseDriverScript{

	@Test
	public void navigateToHomePage() throws IOException {
		driver = initializeDriver();
		driver.get("http://www.rediff.com");
		driver.close();
		driver.quit();
	}
}
