package pom_Women;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Img_select {
public WebDriver driver;
	
	@FindBy (xpath = "//img[@title='Printed Dress']")
	private WebElement image;
	
	@FindBy (xpath="//img[@title='Faded Short Sleeve T-shirts']")
	private WebElement tshirt;
	
	@FindBy(xpath="//iframe[@vspace='0']")
	 private WebElement Frame;
	
	@FindBy(xpath = "//i[@class='icon-plus']")
	private WebElement qty;
	
	@FindBy (xpath="//select[@name='group_1']")
	private WebElement size;
	
	public Img_select(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getImage() {
	return image;
	}
	
	public WebElement getFrame() {
		return Frame;
	}
	
	public WebElement getQty() {
		return qty;
	}
	public WebElement getsize() {
		return size;
	}
	
	public WebElement gettshirt() {
		return tshirt;
	}
}
