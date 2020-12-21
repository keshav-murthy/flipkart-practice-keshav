package Pages;

import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import commons.BasePage;

public class ProductPage extends BasePage {

	@FindBy(xpath = "//*[@id='swatch-2-size']/a")
	WebElement size;

	@FindBy(xpath = "//*[text()='ADD TO CART']/..")
	WebElement addToCart;

	@FindBy(xpath = "//a[contains(text(),'Court Royale AC Sneakers For Men')]")
	WebElement desiredProduct;

	@FindBy(xpath = "//input[@id='pincodeInputId']")
	WebElement pincode;

	public ProductPage(WebDriver driver) {
		super(driver);
	}

	public void switchToNewWindow() {
		Set<String> handles = driver.getWindowHandles();
		for (String i : handles) {
			driver.switchTo().window(i);
		}
		selectPincode();
		clickOnAddToCart();
	}

	public void selectSize() {
		// scrollToElementView(size);
		click(size);
	}

	public void selectPincode() {
		// scrollToPixel(250);
		wait.forElementToBeClickable(pincode);
		click(pincode);
		pincode.sendKeys(Keys.ENTER);
	}

	public void clickOnAddToCart() {
		scrollToPixel(4300);
		wait.forElementToBeClickable(addToCart);
		click(addToCart);
	}
}