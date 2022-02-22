package com.automation.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.adactin.runner.Automation_TestRunner;

import base_Class.Base_class;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper_AP.File_Reader_Manager;
import pageobject_Manager.POM_Women;

public class Automation_StepDef extends Base_class {
  
	 public static WebDriver driver = Automation_TestRunner.driver;
		
		public static POM_Women pom2= new POM_Women(driver);
		
		
		@Given("^user Launch The Application$")
		public void user_Launch_The_Application() throws Throwable {
		    String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl();
		    
		    URL(url);
		}

		@When("^user Enter The Email id In Email id Field$")
		public void user_Enter_The_Email_id_In_Email_id_Field() throws Throwable {
		   // String username = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUsername();
		    sendKeysElement(pom2.getLogin_Page().getEmail(), "talentedvetri@gmail.com");
		}

		@When("^user Enter The Password In Password Field$")
		public void user_Enter_The_Password_In_Password_Field() throws Throwable {
		   // String password = File_Reader_Manager.getInstanceFRM().getInstanceCR().getPassword();
		    sendKeysElement(pom2.getLogin_Page().getPassword(), "Mithun@123");
		}

		@Then("^user Click On The Sign in Button And It Navigates To The Home Page$")
		public void user_Click_On_The_Sign_in_Button_And_It_Navigates_To_The_Home_Page() throws Throwable {
		   clickOnElement(pom2.getLogin_Page().getSubmit_login());
		}

		@When("^user Click The Women Button And It Navigates To Women Page$")
		public void user_Click_The_Women_Button_And_It_Navigates_To_Women_Page() throws Throwable {
		   clickOnElement(pom2.getCasual_Dresses().getWomen());
		}

		@When("^user Click The Dresses Button And It Navigates To Casualdresses Page$")
		public void user_Click_The_Dresses_Button_And_It_Navigates_To_Casualdresses_Page() throws Throwable {
			 clickOnElement(pom2.getCasual_Dresses().getdresses());
		}

		@When("^user Click The Casualdresses Button And It Navigates To Image Page$")
		public void user_Click_The_Casualdresses_Button_And_It_Navigates_To_Image_Page() throws Throwable {
			clickOnElement(pom2.getCasual_Dresses().getCasualDresses());
		}

		@When("^user Click The Image And It Navigates To Quantity Page$")
		public void user_Click_The_Image_And_It_Navigates_To_Quantity_Page() throws Throwable {
			explicityWait("visibilityOfElement", 20, pom2.getImage().getImage());
		    clickOnElement(pom2.getImage().getImage());
		    frames("element",null, pom2.getImage().getFrame());
		}

		@When("^user Click The Quantity And Size$")
		public void user_Click_The_Quantity_And_Size() throws Throwable {
			clickOnElement(pom2.getImage().getQty());
		    clickOnElement(pom2.getImage().getQty());
		    dropDown("index", pom2.getImage().getsize(), "2");
		}

		@When("^user Click The Add To Cart Button And It Navigates To Shopping Cart Page$")
		public void user_Click_The_Add_To_Cart_Button_And_It_Navigates_To_Shopping_Cart_Page() throws Throwable {
			clickOnElement(pom2.getAddto_cart().getAddToCart());
		    frames("defaultcontent", null, null);
		}

		@When("^user Click The Proceed To Checkout Button And It Navigates To Order Page$")
		public void user_Click_The_Proceed_To_Checkout_Button_And_It_Navigates_To_Order_Page() throws Throwable {
			explicityWait("visibilityOfElement", 20,pom2.getptc1().getPtc1());
	        actionsPerform("moveToElement",pom2.getptc1().getPtc1());
	        actionsPerform("click", pom2.getptc1().getPtc1());
		}

		@When("^user Click The Proceed To Checkout Button And It Navigates To Address Page$")
		public void user_Click_The_Proceed_To_Checkout_Button_And_It_Navigates_To_Address_Page() throws Throwable {
			implicityWait(15, TimeUnit.SECONDS);
		    clickOnElement(pom2.getptc2().getPtc2());
		}

		@When("^user Click The Proceed To Checkout Button And It Navigates To Shipping Page$")
		public void user_Click_The_Proceed_To_Checkout_Button_And_It_Navigates_To_Shipping_Page() throws Throwable {
			implicityWait(15, TimeUnit.SECONDS);
		    clickOnElement(pom2.getptc3().getPtc3());
		}

		@When("^user Click The Checkbox And Proceed To Checkout Button And It Navigates To Payment Page$")
		public void user_Click_The_Checkbox_And_Proceed_To_Checkout_Button_And_It_Navigates_To_Payment_Page() throws Throwable {
			implicityWait(15, TimeUnit.SECONDS);
			clickOnElement(pom2.getShipping().getcheckbox());
			clickOnElement(pom2.getShipping().getptc4());
		}

		@When("^user Click The Pay Bybank Button And It Navigates To Confirmation Page$")
		public void user_Click_The_Pay_Bybank_Button_And_It_Navigates_To_Confirmation_Page() throws Throwable {
			implicityWait(15, TimeUnit.SECONDS);
			clickOnElement(pom2.getPayment().getpayment());
		}

		@When("^user Click Confirm Order Button And It Navigates Order Confirmation Page$")
		public void user_Click_Confirm_Order_Button_And_It_Navigates_Order_Confirmation_Page() throws Throwable {
			implicityWait(15, TimeUnit.SECONDS);
			clickOnElement(pom2.getOrder().getOrderConfirm());
		}

		@Then("^user Click The Sign Out Button And It Navigates To Login Page$")
		public void user_Click_The_Sign_Out_Button_And_It_Navigates_To_Login_Page() throws Throwable {
			clickOnElement(pom2.getLog_out().getLogout());
		}
	}


