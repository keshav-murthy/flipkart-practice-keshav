package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commons.BasePage;

public class OrderPlacement extends BasePage {

	@FindBy(xpath = "//button[@class='_2KpZ6l _2ObVJD _3AWRsL']")
	WebElement placeOrder;

	@FindBy(xpath = "//button[@class='_2KpZ6l RLM7ES _3AWRsL']")
	WebElement deliverHere;
	
	@FindBy(xpath = "//button[@class='_2KpZ6l _1seccl _3AWRsL']")
	WebElement continueAhead;
	
	public OrderPlacement(WebDriver driver) {
		super(driver);
	}

	public void orderBooking() {
		wait.forElementToBeVisible(placeOrder);
		click(placeOrder);
	}
	
	public void deliveryAddress() {
		wait.forElementToBeVisible(deliverHere);
		click(deliverHere);
	}
	
	public void continueWithYourOrder() {
		wait.forElementToBeVisible(continueAhead);
		click(continueAhead);
	}
}