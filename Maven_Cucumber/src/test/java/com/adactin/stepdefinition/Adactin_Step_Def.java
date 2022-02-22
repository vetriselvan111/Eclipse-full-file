package com.adactin.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.adactin.runner.Adactin_TestRunner;

import base_Class.Base_class;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper_Adactin.File_Reader_Manager;
import pageobject_Manager.Pom_Adactin;

public class Adactin_Step_Def extends Base_class {
	 
    public static WebDriver driver = Adactin_TestRunner.driver;
	
	public static Pom_Adactin pom1= new Pom_Adactin(driver);
	
	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
	    String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl();
	    
	    URL(url);
	}
	
	@When("^user Enter the \"([^\"]*)\" In Username Field$")
	public void user_Enter_the_In_Username_Field(String Username) throws Throwable {
		//String username = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUsername();
	    sendKeysElement(pom1.getInstantlp().getUsername(), Username);
	}

	@When("^user Enter the \"([^\"]*)\" In Password Field$")
	public void user_Enter_the_In_Password_Field(String Password) throws Throwable {
		//String password = File_Reader_Manager.getInstanceFRM().getInstanceCR().getPassword();
		   sendKeysElement(pom1.getInstantlp().getPassword(), Password);
	}

	

	@Then("^user Click On The Login Button And It Navigates To The Search Hotel Page$")
	public void user_Click_On_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page() throws Throwable {
		clickOnElement(pom1.getInstantlp().getLogin());
	}

	@When("^user Select The \"([^\"]*)\"$")
	public void user_Select_The(String location) throws Throwable {
		dropDown("value", pom1.getSearch().getLocation(), location);
	}  
	
	@When("^user Select \"([^\"]*)\"$")
	public void user_Select(String Hotel) throws Throwable {
		dropDown("value", pom1.getSearch().getHotels(), Hotel);
		
	}
	    
	@When("^user Select Room \"([^\"]*)\"$")
	public void user_Select_Room(String Room_Type) throws Throwable {
		dropDown("value", pom1.getSearch().getRoom_type(), Room_Type);
	}

	@When("^user Select the Number of Rooms$")
	public void user_Select_the_Number_of_Rooms() throws Throwable {
		dropDown("index", pom1.getSearch().getNoOfRooms(), "3");
	    clear(pom1.getSearch().getCheckInDate());
	}

	@When("^user Enter Check In Date$")
	public void user_Enter_Check_In_Date() throws Throwable {
		implicityWait(10, TimeUnit.SECONDS);
	    sendKeysElement(pom1.getSearch().getCheckInDate(), "05/01/2022");
	    clear(pom1.getSearch().getCheckOutDate());
	}

	@When("^user Enter Check Out Date$")
	public void user_Enter_Check_Out_Date() throws Throwable {
		implicityWait(10, TimeUnit.SECONDS);
	    sendKeysElement(pom1.getSearch().getCheckOutDate(), "06/01/2022");
	}

	@When("^user Select The Adults per Room$")
	public void user_Select_The_Adults_per_Room() throws Throwable {
		dropDown("index", pom1.getSearch().getAdult_room(), "2");
	}

	@When("^user Select The Children per Room$")
	public void user_Select_The_Children_per_Room() throws Throwable {
		dropDown("index", pom1.getSearch().getChild_room(), "1");
	}

	@Then("^user Click On The Search Button And It Navigates To The Select Hotel Page$")
	public void user_Click_On_The_Search_Button_And_It_Navigates_To_The_Select_Hotel_Page() throws Throwable {
		clickOnElement(pom1.getSearch().getSearch());
		   implicityWait(10, TimeUnit.SECONDS);
	}

	@When("^user Select The CheckBox Button$")
	public void user_Select_The_CheckBox_Button() throws Throwable {
		clickOnElement(pom1.getSelect().getCheck_Button());
	}

	@Then("^user Click On The Continue Button And It Navigates To The Book Hotel Page$")
	public void user_Click_On_The_Continue_Button_And_It_Navigates_To_The_Book_Hotel_Page() throws Throwable {
		clickOnElement(pom1.getSelect().getContinue1());
		   implicityWait(10, TimeUnit.SECONDS);
	}

	@When("^user Enter The First Name$")
	public void user_Enter_The_First_Name() throws Throwable {
		//String firstName = File_Reader_Manager.getInstanceFRM().getInstanceCR().getFirstName();
	    sendKeysElement(pom1.getBook().getFirstName(), "Vetriselvan");
	}

	@When("^user Enter The Last Name$")
	public void user_Enter_The_Last_Name() throws Throwable {
		//String lastName = File_Reader_Manager.getInstanceFRM().getInstanceCR().getLastName();
		
		sendKeysElement(pom1.getBook().getLastName(),"govindhan");
	}

	@When("^user Enter The Address$")
	public void user_Enter_The_Address() throws Throwable {
		//String address = File_Reader_Manager.getInstanceFRM().getInstanceCR().getAddress();
		sendKeysElement(pom1.getBook().getAddress(),"George street");
	}

	@When("^user Enter The Credit Card No$")
	public void user_Enter_The_Credit_Card_No() throws Throwable {
		//String cardnumber = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCardnumber();
		
		sendKeysElement(pom1.getBook().getCreditCard(),"1234567890123456");
	}

	@When("^user Select The Credit Card Type$")
	public void user_Select_The_Credit_Card_Type() throws Throwable {
		dropDown("index", pom1.getBook().getCardType(), "2");
	}

	@When("^user Select The Expiry Date$")
	public void user_Select_The_Expiry_Date() throws Throwable {
		dropDown("index", pom1.getBook().getExp_Month(), "7");
		dropDown("index", pom1.getBook().getExp_Year(), "12");
	}

	@When("^user Enter The CVV Number$")
	public void user_Enter_The_CVV_Number() throws Throwable {
		String cvv = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCvv();
	    sendKeysElement(pom1.getBook().getCvvNo(), "4567");
	}

	@Then("^user Click On The Book Now Button And It Navigates To The Booking Confirmation Page$")
	public void user_Click_On_The_Book_Now_Button_And_It_Navigates_To_The_Booking_Confirmation_Page() throws Throwable {
		clickOnElement(pom1.getBook().getBookNow());
	    implicityWait(20, TimeUnit.SECONDS);	
	}

	@Then("^user click My Itinerary Button And It Navigates To The Booking Cancellation Page$")
	public void user_click_My_Itinerary_Button_And_It_Navigates_To_The_Booking_Cancellation_Page() throws Throwable {
		clickOnElement(pom1.getBconfirm().getMy_itinerary());
	    implicityWait(20, TimeUnit.SECONDS);
	}

	@When("^user Select CheckBox Button$")
	public void user_Select_CheckBox_Button() throws Throwable {
		clickOnElement(pom1.getBook1().getCheckbox());
	    implicityWait(15, TimeUnit.SECONDS);
	}

	@When("^user Click On The Cancel Selected Button$")
	public void user_Click_On_The_Cancel_Selected_Button() throws Throwable {
		clickOnElement(pom1.getBook1().getCancel());
	    implicityWait(15, TimeUnit.SECONDS);
	}

	@When("^user Accept The Alert Message$")
	public void user_Accept_The_Alert_Message() throws Throwable {
		alert("alert", null);
		explicityWait("visibilityOfElement", 20, pom1.getBook1().getLogout());
	}

	@Then("^user click Logout Button And It Navigates To The Home Page$")
	public void user_click_Logout_Button_And_It_Navigates_To_The_Home_Page() throws Throwable {
		clickOnElement(pom1.getBook1().getLogout());
	}
}