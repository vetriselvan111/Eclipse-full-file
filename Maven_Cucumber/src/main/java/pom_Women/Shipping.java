package pom_Women;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping {
       
	public WebDriver driver;
	   
	   @FindBy(xpath="//input[@name='cgv']")
	   private WebElement checkBox;
	   
	   @FindBy (xpath = "//button[@name='processCarrier']")
	   private WebElement ptc4;

	public Shipping(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getcheckbox() {
		return checkBox;
	}
	
	public WebElement getptc4() {
		return ptc4;
	}

}
