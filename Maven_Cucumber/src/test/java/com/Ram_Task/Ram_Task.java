package com.Ram_Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ram_Task {
	
	
	
 public static void main(String[] args) throws InterruptedException {
	 
	
		
		//System.setProperty("WebDriver.Chrome.Driver", "C:\\Users\\Guru\\eclipse-workspace\\Maven_Cucumber\\Driver");
	    WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.zoho.com/creator/signup.html");
		driver.manage().window().maximize();
		
		WebElement name = driver.findElement(By.id("namefield"));
		name.sendKeys("vetriselvan");
		
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("talentvetri123@gmail.com");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Vetri@123");
		
		WebElement mobile_Number = driver.findElement(By.id("mobile"));
		mobile_Number.sendKeys("9876543210");
		
		WebElement business_Name = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		business_Name.sendKeys("mithun's kitchen");
		
		Thread.sleep(25000);
		
		WebElement checkbox = driver.findElement(By.id("signup-termservice"));
		checkbox.click();
		
		//WebElement sign_In = driver.findElement(By.id("signupbtn"));
		//sign_In.click();
				
				
		
		
		
	}
}
