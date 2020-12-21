package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commons.BasePage;

public class MyOrders extends BasePage {

	@FindBy(xpath = "//span[contains(text(),'Wrangler')]")
	WebElement productToReview;
	
	@FindBy(xpath = "//span[contains(text(),'Rate & Review Product')]")
	WebElement review;

	@FindBy(xpath = "//span[@id='star-0-add-rating']")
	WebElement veryBad;
	
	@FindBy(xpath = "//span[@id='star-1-add-rating']")
	WebElement bad;
	
	@FindBy(xpath = "//span[@id='star-2-add-rating']")
	WebElement good;
	
	@FindBy(xpath = "//span[@id='star-3-add-rating']")
	WebElement veryGood;
	
	@FindBy(xpath = "//span[@id='star-4-add-rating']")
	WebElement excellent;
	
	@FindBy(xpath = "//textarea[@placeholder='Description...']")
	WebElement description;
	
	@FindBy(xpath = "//input[@type='file']")
	WebElement addFiles;

	public MyOrders(WebDriver driver) {
		super(driver);
	}

	public void clickOnRateAndReviewProduct() {
	
		/*JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true);",productToReview);
		jse.executeScript("scroll(0, 1750);");
		wait.forElementToBeClickable(productToReview);
		click(productToReview);*/
		scrollToPixel(1750);
		//wait.forElementToBeClickable(review);
		//click(review);
		review.click();
	}
	
	public void select3Stars()
	{
		wait.forElementToBeVisible(good);
		click(good);
	}
	
	public void addDescription(String comments)
	{
		wait.forElementToBeVisible(description);
		sendKeys(description,comments);
	}
	
	public void addFiles(String file)
	{
		scrollToPixel(300);
		wait.forElementToBeVisible(addFiles);
		sendKeys(addFiles,file);
	}
}