package pom_Women;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Evening_Dresses {
public WebDriver driver;
	
	@FindBy (xpath = "(//a[contains(@title,'Browse our')])[1]")
	private WebElement EveningDresses;
	
	@FindBy (xpath = "(//a[@title='Dresses'])[2]")
	private WebElement Dresses;
	
	
	public Evening_Dresses(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	

	public WebElement getEveningDresses() {
		return EveningDresses;
	}
	
	
	public WebElement getdresses() {
		return Dresses;
	}
}
