package TestCases;

import Pages.*;
import commons.InitializePropertyFile;
import commons.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import static commons.Configuration.url;

public class SC_04_ApplyingForJob extends TestBase {

	@BeforeMethod
	public void openPage() {
		driver.get(url.asString());
	}

	@Test(priority = 1)
	public void careers()  {
		LoginPage login = new LoginPage(driver);
		login.getUsername(InitializePropertyFile.property.getProperty("username"));
		login.getPassword(InitializePropertyFile.property.getProperty("password"));
		login.onClick();
		
		Sections section=new Sections(driver);
		section.clickOnCareers();
		
		CareersSection career=new CareersSection(driver);
		career.searchForjob(InitializePropertyFile.property.getProperty("jobDesignation"));
		career.clickOnSearchButton();
	}
}