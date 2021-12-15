package com.sdppom;

import org.openqa.selenium.WebDriver;

import com.pom.Confirm_Order;
import com.pom.Home_Page;
import com.pom.Payment;
import com.pom.Proceed_Check;
import com.pom.Product_Checkout;
import com.pom.Product_Page;
import com.pom.Sign_In;

public class Page_Object_Manager {
	private Home_Page hp;
	private Confirm_Order co;
	private Payment pmt;
	private Proceed_Check pc;
	private Product_Checkout pckout;
	private Product_Page pp;
	private Sign_In si;
	
	public WebDriver driver;
	public Page_Object_Manager(WebDriver driver2) {
		this.driver=driver2;
	}
	public Home_Page setInstanceHp() {
		if (hp==null) {
			hp=new Home_Page(driver);
		}
		return hp;
	}
	public Confirm_Order setInstanceCo() {
		if (co==null) {
			co=new Confirm_Order(driver);
		}
		return co;
	}
	public Payment SetInstancePmt() {
		if(pmt==null) {
			pmt=new Payment(driver);
		}
		return pmt;
	}
	public Proceed_Check setInstancePc() {
		if(pc==null) {
			pc=new Proceed_Check(driver);
			
		}
		return pc;
	}
	public Product_Checkout setInstancePck() {
		if(pckout==null) {
			pckout=new Product_Checkout(driver);
		}
		return pckout;		
	}
	public Product_Page setInstancePp() {
		if(pp==null) {
			pp=new Product_Page(driver);
		}
		return pp;		
	}
	public Sign_In setInstanceSi() {
		if(si==null) {
			si=new Sign_In(driver);
		}
		return si;
		}
}
