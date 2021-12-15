package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Verify_Booking {
public WebDriver driver;
public Verify_Booking(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
}
	@FindBy(id="radiobutton_0")
	private WebElement selectHotel;
	public WebElement getSelectHotel() {
		return selectHotel;
	}
	@FindBy(id="continue")
	private WebElement cont;
	public WebElement getCont() {
		return cont;
	}
	

}
