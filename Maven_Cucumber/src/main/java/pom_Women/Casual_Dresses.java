package pom_Women;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Casual_Dresses {
   
	public WebDriver driver;
	
	@FindBy (xpath = "(//a[contains(@title,'You are looking')])[1]")
	private WebElement casualDresses;
	
	@FindBy (xpath = "(//a[contains(@title,'Find your')])[1]")
	private WebElement dresses;
	
	@FindBy (xpath = "//a[@title='Women']")
	private WebElement Women;
	

	public Casual_Dresses(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getCasualDresses() {
		return casualDresses;
	}
	
	public WebElement getWomen() {
		return Women;
	}
	public WebElement getdresses() {
		return dresses;
	}
}

