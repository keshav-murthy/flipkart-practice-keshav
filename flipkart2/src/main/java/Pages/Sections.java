package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commons.BasePage;

public class Sections extends BasePage {

	@FindBy(xpath = "//a[text()='Grocery']")
	WebElement grocery;

	@FindBy(xpath = "//button[@class='_2KpZ6l RLM7ES _3AWRsL']")
	WebElement deliverHere;
	
	@FindBy(xpath = "//button[@class='_2KpZ6l _1seccl _3AWRsL']")
	WebElement continueAhead;
	
	@FindBy(xpath = "//div[@class='KK-o3G']")
	WebElement cart;
	
	public Sections(WebDriver driver) {
		super(driver);
	}

	public void clickOnGrocerySection() {
		wait.forElementToBeVisible(grocery);
		click(grocery);
	}
	
	public void deliveryAddress() {
		wait.forElementToBeVisible(deliverHere);
		click(deliverHere);
	}
	
	public void continueWithYourOrder() {
		wait.forElementToBeVisible(continueAhead);
		click(continueAhead);
	}
	
	public void clickOnCart() {
		wait.forElementToBeVisible(cart);
		click(cart);
	}
}