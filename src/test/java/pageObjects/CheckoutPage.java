package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage{
	
	public CheckoutPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='input-payment-firstname']")
	WebElement txtfirstName;
	
	@FindBy(xpath="//input[@id='input-payment-lastname']")
	WebElement txtlastName;

}
