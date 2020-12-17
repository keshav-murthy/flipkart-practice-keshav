package TestCases;

import Pages.*;
import commons.InitializePropertyFile;
import commons.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import static commons.Configuration.url;

public class SC_03_GrocerySection extends TestBase {

	@BeforeMethod
	public void openPage() {
		driver.get(url.asString());
	}

	@Test(priority = 1)
	public void buyingCoolDrinks()  {
		LoginPage login = new LoginPage(driver);
		login.getUsername(InitializePropertyFile.property.getProperty("username"));
		login.getPassword(InitializePropertyFile.property.getProperty("password"));
		login.onClick();
		
		Sections section=new Sections(driver);
		section.clickOnGrocerySection();
		
		Grocery grocery=new Grocery(driver);
		grocery.selectColdDrink();
		grocery.particularColdDrinks(InitializePropertyFile.property.getProperty("capacity"));
	}
	
	@Test(priority = 2)
	public void removingFromCart()
	{
		LoginPage login = new LoginPage(driver);
		login.getUsername(InitializePropertyFile.property.getProperty("username"));
		login.getPassword(InitializePropertyFile.property.getProperty("password"));
		login.onClick();
		
		Sections section=new Sections(driver);
		section.clickOnCart();
		
		OrderPlacement orders=new OrderPlacement(driver);
		orders.clickOnRemoveBasket();
		orders.clickOnAreYouSure();
	}
}