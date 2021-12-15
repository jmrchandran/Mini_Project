package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Confirmation {
public WebDriver driver;
public Booking_Confirmation(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="(//input[@type='button'])[3]")
private WebElement logOut;
public WebElement getLogOut() {
	return logOut;
}

}
