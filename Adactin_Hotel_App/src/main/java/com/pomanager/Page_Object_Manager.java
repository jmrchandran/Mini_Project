package com.pomanager;

import org.openqa.selenium.WebDriver;

import com.pom.Book_Now;
import com.pom.Booking_Confirmation;
import com.pom.Login_Page;
import com.pom.Search_Hotel;
import com.pom.Verify_Booking;

public class Page_Object_Manager {
private Login_Page lp;
private Search_Hotel sh;
private Verify_Booking vb;
private Book_Now bn;
private Booking_Confirmation bc;
public WebDriver driver;
public Page_Object_Manager(WebDriver driver2) {
	this.driver=driver2;
}
public Login_Page setInstanceLp() {
	if (lp==null) {
		lp=new Login_Page(driver);
	}
	return lp;
}
public Search_Hotel setInstanceSh() {
	if (sh==null) {
		sh=new Search_Hotel(driver);
	}
	return sh;
}
public Verify_Booking setInstanceVb() {
	if (vb==null) {
		vb=new Verify_Booking(driver);
	}
	return vb;
}
public Book_Now setInstanceBn() {
if (bn==null) {
	bn=new Book_Now(driver);
}
return bn;
}
public Booking_Confirmation setInstanceBc() {
	if (bc==null) {
		bc=new Booking_Confirmation(driver);
		}
	return bc;
}
}