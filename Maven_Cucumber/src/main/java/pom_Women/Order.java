package pom_Women;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order {
     
	  
		public WebDriver driver;
		   
		   @FindBy(xpath="(//button[@type='submit'])[2]")
		   private WebElement orderConfirm;
		   
		public Order(WebDriver driver2) {
			this.driver=driver2;
			PageFactory.initElements(driver, this);
		}

		public WebElement getOrderConfirm() {
			return orderConfirm;
		}
}
