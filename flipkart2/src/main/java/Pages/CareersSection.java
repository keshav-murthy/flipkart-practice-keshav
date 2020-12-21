package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commons.BasePage;

public class CareersSection extends BasePage {

	@FindBy(xpath = "//input[@class='form-control tags search-div-home-page ng-pristine ng-valid']")
	WebElement searchField;

	@FindBy(xpath = "//button[contains(text(),'Search')]")
	WebElement searchButton;
	
	@FindBy(xpath = "//button[@class='_2KpZ6l _1seccl _3AWRsL']")
	WebElement continueAhead;
	
	@FindBy(xpath = "//div[contains(text(),'Remove Basket')]")
	WebElement removeBasket;
	
	@FindBy(xpath = "//div[@class='_3dsJAO _24d-qY FhkMJZ']")
	WebElement removeBasketAgain;
	
	public CareersSection(WebDriver driver) {
		super(driver);
	}

	public void searchForjob(String job) {
		try {
			wait.forElementToBeVisible(searchField);
			sendKeys(searchField, job);
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			wait.forElementToBeVisible(searchField);
			sendKeys(searchField, job);
		}
	}
	
	public void clickOnSearchButton() {
		wait.forElementToBeVisible(searchButton);
		click(searchButton);
	}
	
	public void continueWithYourOrder() {
		wait.forElementToBeVisible(continueAhead);
		click(continueAhead);
	}
	
	public void clickOnRemoveBasket() {
		wait.forElementToBeVisible(removeBasket);
		click(removeBasket);
	}
	
	public void clickOnAreYouSure() {
		wait.forElementToBeVisible(removeBasketAgain);
		click(removeBasketAgain);
	}
}