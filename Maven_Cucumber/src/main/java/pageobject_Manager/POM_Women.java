package pageobject_Manager;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

import org.openqa.selenium.WebDriver;



import pom_Women.Addto_cart;
import pom_Women.Casual_Dresses;
import pom_Women.Evening_Dresses;
import pom_Women.Home_Page;
import pom_Women.Img_select;
import pom_Women.Log_out;
import pom_Women.Login_Page;
import pom_Women.Order;
import pom_Women.PTC_1;
import pom_Women.PTC_2;
import pom_Women.PTC_3;
import pom_Women.Payment;
import pom_Women.Shipping;
import pom_Women.T_shirt;


public class POM_Women {
	private WebDriver driver;
	private Home_Page hp;
	private Casual_Dresses cd;
	private Img_select img;
	private Order order;
	private PTC_1 ptc1;
	private PTC_2 ptc2;
	private PTC_3 ptc3;
	private Addto_cart add;
	private Shipping ship;
	private Payment pay;
	private Login_Page login;
	private Log_out logout;
	private Evening_Dresses ed;
	private T_shirt tshirt;
	
	
	public POM_Women(WebDriver driver2) {
		this.driver=driver2;
	}

	public Home_Page getInstant_hp() {
		if(hp==null) {
			hp=new Home_Page(driver);
		}
		return hp;
	}
	
	public T_shirt getT_shirt() {
		if(tshirt==null) {
			tshirt=new T_shirt(driver);
		}
		return tshirt;
	}
	public Casual_Dresses getCasual_Dresses() {
		if (cd==null) {
			cd= new Casual_Dresses(driver);
		}
		return cd;
	}
	
	public Evening_Dresses getEvening_Dresses() {
		if (ed==null) {
			ed= new Evening_Dresses(driver);
		}
		return ed;
	}
	
	
	

	public Img_select getImage() {
		if(img==null) {
			img= new Img_select(driver);
		}
		return img;
	}
	
	public Order getOrder() {
		if(order== null) {
			order = new Order(driver);
		}
		return order;
	}
	
	public PTC_1 getptc1() {
		if(ptc1==null) {
			ptc1= new PTC_1(driver);
		}
		return ptc1;
	}
	public PTC_2 getptc2() {
		if(ptc2==null) {
			ptc2= new PTC_2(driver);
		}
		return ptc2;
	}
	public PTC_3 getptc3() {
		if(ptc3==null) {
			ptc3= new PTC_3(driver);
		}
		return ptc3;
	}
	
	public Addto_cart getAddto_cart() {
		if(add==null) {
			add= new Addto_cart(driver);
		}
		return add;
	}
	public Shipping getShipping() {
		if(ship==null) {
			ship=new Shipping(driver);
		}
		return ship;
	}
	
	public Payment getPayment() {
		if(pay==null) {
			pay= new Payment(driver);
		}
		return pay;
	}
	
	public Login_Page getLogin_Page() {
		if(login==null) {
			login= new Login_Page(driver);
		}
		return login;
	}
	
	public Log_out getLog_out() {
		if(logout==null) {
			logout= new Log_out(driver);
		}
		return logout;
	}
	
}
