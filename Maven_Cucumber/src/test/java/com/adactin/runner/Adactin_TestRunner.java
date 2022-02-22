package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import base_Class.Base_class;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature\\Adactin_Feat.feature",

     glue ="com.adactin.stepdefinition",
     
     monochrome = true , dryRun = false , strict = true, 
   
     
     plugin = {
    		 
    		 "html:Report/html_Report",
    	    // "pretty" ,
    	     "json:Report_Json/Json_Report.json",
    	     "com.cucumber.listener.ExtentCucumberFormatter:ExtentReport/exreport.html",
},
    	     tags=("~@Ad6")
    		 
 

)
public class Adactin_TestRunner {

	public static WebDriver driver;
	
	@BeforeClass
	public static void set_Up() {
		 driver = Base_class.getBrowser("chrome");
	}
	
	@AfterClass
	public static void tear_Down() {
		
		driver.close();
	}
}
