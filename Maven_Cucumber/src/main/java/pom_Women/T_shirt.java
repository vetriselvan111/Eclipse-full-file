package pom_Women;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class T_shirt {
    public WebDriver driver;
    
    @FindBy (xpath="(//a[@title='T-shirts'])[2]")
    private WebElement tshirt;
    
    public T_shirt(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getT_Shirt() {
    	return tshirt;
    }
}
