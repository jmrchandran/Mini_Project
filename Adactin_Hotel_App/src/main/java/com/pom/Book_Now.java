package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Now {
public WebDriver driver;
public Book_Now(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
}
@FindBy(id="first_name")
private WebElement fName;
public WebElement getfName() {
	return fName;
}
@FindBy(xpath="//input[@name='last_name']")
private WebElement lName;
public WebElement getlName() {
	return lName;
}
@FindBy(id="address")
private WebElement address;
public WebElement getAddress() {
	return address;
}
@FindBy(xpath="//input[@name='cc_num']")
private WebElement ccNo;
public WebElement getCcNo() {
	return ccNo;
}
@FindBy(id="cc_type")
private WebElement ccType;
public WebElement getCcType() {
	return ccType;
}
@FindBy(xpath="//select[@name='cc_exp_month']")
private WebElement expMonth;
public WebElement getExpMonth() {
	return expMonth;
}
@FindBy(xpath="//select[@name='cc_exp_year']")
private WebElement ccExpYear;
public WebElement getCcExpYear() {
	return ccExpYear;
}
@FindBy(xpath="//input[@name='cc_cvv']")
private WebElement cvv;
public WebElement getCvv() {
	return cvv;
}

@FindBy(id="book_now")
private WebElement bookNow;
public WebElement getBookNow() {
	return bookNow;
}

}
