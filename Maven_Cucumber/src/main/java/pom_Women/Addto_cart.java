package pom_Women;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addto_cart {
   public WebDriver driver;
   
   @FindBy(xpath="//button[@class='exclusive']")
   private WebElement addToCart;

public Addto_cart(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
}

public WebElement getAddToCart() {
	return addToCart;
}
}
