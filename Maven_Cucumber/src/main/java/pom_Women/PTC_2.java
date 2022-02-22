package pom_Women;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PTC_2 {

	 public WebDriver driver;
	   
	   @FindBy(xpath="(//a[@title='Proceed to checkout'])[2]")
	   private WebElement proceed1;

	public PTC_2(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getPtc2() {
		return proceed1;
	}
}
