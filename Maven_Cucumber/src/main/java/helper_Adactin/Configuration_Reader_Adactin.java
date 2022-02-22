package helper_Adactin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Configuration_Reader_Adactin {
	
	public static Properties p ;
	

	public Configuration_Reader_Adactin() throws Throwable {
		
		File f = new File("C:\\Users\\Guru\\eclipse-workspace\\com.Mini_Project\\src\\main\\java\\property_file\\configuration_adactin.properties");
		
		FileInputStream fis = new FileInputStream(f);
		
		p = new Properties();
		
		p.load(fis);
		
	}
	
    public String getUrl() {
	  String url = p.getProperty("url");
	  return url;
}

    public String getUsername() {
    	String username = p.getProperty("username");
    	return username;
    }
    
    public String getPassword() {
    	String pswd = p.getProperty("password");
    	return pswd;
    }
    
    public String getCheckinDate() {
    	String checkin = p.getProperty("checkindate");
    	return checkin;
    }
    
    public String getCheckoutdate() {
    	String checkout = p.getProperty("checkoutdate");
    	return checkout;
    }
    
    public String getFirstName() {
    	String Fname = p.getProperty("firstname");
    	return Fname;
    }
    
    public String getLastName() {
    	String Lname = p.getProperty("lastname");
    	return Lname;
    }
    	
    public String getAddress()	{
    	String address = p.getProperty("address");
    	return address;
    }
    
    public String getCvv() {
    	String cvv = p.getProperty("cvv");
    	return cvv;
    }
    	
    	public String getCardnumber() {
    		String cardnumber = p.getProperty("cardnumber");
    		return cardnumber;
    	}
    	
    	
    	
    	
    	
    	
    	
    	
    }
    
    
    

    
    
    
    
    

