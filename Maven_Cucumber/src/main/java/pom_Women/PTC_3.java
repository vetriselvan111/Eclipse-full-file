package pom_Women;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PTC_3 {
	public WebDriver driver;
	   
	   @FindBy(xpath="//button[@name='processAddress']")
	   private WebElement proceed2;

	public PTC_3(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getPtc3() {
		return proceed2;
	}
}
