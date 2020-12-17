package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import commons.BasePage;

public class Grocery extends BasePage {

	@FindBy(xpath = "//div[contains(text(),'Snacks')]")
	WebElement snacksAndBeverages;

	@FindBy(xpath = "//a[text()='Soft Drinks']")
	WebElement softDrinks;

	@FindBy(xpath = "//a[text()='Cold Drinks']")
	WebElement coldDrinks;

	public Grocery(WebDriver driver) {
		super(driver);
	}

	public void selectColdDrink() {
		Actions action = new Actions(driver);
		action.moveToElement(snacksAndBeverages).build().perform();
		action.moveToElement(softDrinks).build().perform();
		action.moveToElement(coldDrinks).click().build().perform();
	}

	public void particularColdDrinks(String value)
	{	
		String startingXpath="//div[@class='_1MbXnE _1kHdUD' and contains(text(),";
		String endingXpath=")]//ancestor::div[@class='_3BhXPZ']//child::button[@class='_2KpZ6l GX4Kov']";
		List<WebElement> list=driver.findElements(By.xpath("//div[@class='M_P-O7' and contains(text(),"+"'"+value+"'"+")]"));
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
			driver.findElement(By.xpath(startingXpath +"'"+value+"'" +endingXpath)).click();
		}
	}	
}