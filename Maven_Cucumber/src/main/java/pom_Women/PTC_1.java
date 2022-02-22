package pom_Women;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PTC_1 {
  
	 public WebDriver driver;
	   
	   @FindBy( xpath="//a[@title='Proceed to checkout']")
	   private WebElement proceed;

	public PTC_1(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getPtc1() {
		return proceed;
	}
}
