package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Basepage{

	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(css="#searchDropdownBox")
	WebElement search_drpdown;
	
	
	public void drpdown() {
		search_drpdown.click();
		
	}


	public void click_register() {
		// TODO Auto-generated method stub
		
	}


	public void click_myAccount() {
		// TODO Auto-generated method stub
		
	}
}
	
	