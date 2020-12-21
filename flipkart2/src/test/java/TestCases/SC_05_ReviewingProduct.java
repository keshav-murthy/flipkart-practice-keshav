package TestCases;

import Pages.*;
import commons.InitializePropertyFile;
import commons.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import static commons.Configuration.url;

public class SC_05_ReviewingProduct extends TestBase {

	@BeforeMethod
	public void openPage() {
		driver.get(url.asString());
	}

	@Test(priority = 1)
	public void productReview() throws InterruptedException  {
		LoginPage login = new LoginPage(driver);
		login.getUsername(InitializePropertyFile.property.getProperty("username"));
		login.getPassword(InitializePropertyFile.property.getProperty("password"));
		login.onClick();
		
		Sections section=new Sections(driver);
		section.selectMyOrders();
		
		MyOrders orders=new MyOrders(driver);
		orders.clickOnRateAndReviewProduct();
		orders.addDescription(InitializePropertyFile.property.getProperty("comments"));
		orders.addFiles(InitializePropertyFile.property.getProperty("filePath"));
	}
}