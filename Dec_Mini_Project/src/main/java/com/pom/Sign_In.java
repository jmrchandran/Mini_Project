package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign_In {
public WebDriver driver;
public Sign_In(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
}
@FindBy(name="email_create")
private WebElement email;
public WebElement getEmail() {
	return email;
}
@FindBy(id="SubmitCreate")
private WebElement create_Acct;

@FindBy(id="id_gender2")
private WebElement respect;

@FindBy(name="customer_firstname")
private WebElement fName;

@FindBy(name="customer_lastname")
private WebElement lName;

@FindBy(id="passwd")
private WebElement password;


@FindBy(xpath="(//select[@class='form-control'])[1]")
private WebElement day;

@FindBy(xpath="(//select[@class='form-control'])[2]")
private WebElement month;

@FindBy(xpath="(//select[@class='form-control'])[3]")
private WebElement year;

@FindBy(name="newsletter")
private WebElement newsLetter1;

public WebElement getCreate_Acct() {
	return create_Acct;
}
public WebElement getRespect() {
	return respect;
}
public WebElement getfName() {
	return fName;
}
public WebElement getlName() {
	return lName;
}
public WebElement getPassword() {
	return password;
}
public WebElement getDay() {
	return day;
}
public WebElement getMonth() {
	return month;
}
public WebElement getYear() {
	return year;
}
public WebElement getNewsLetter1() {
	return newsLetter1;
}
public WebElement getOption() {
	return option;
}
public WebElement getCompany() {
	return company;
}
public WebElement getAddress() {
	return address;
}
public WebElement getAddress1() {
	return address1;
}
public WebElement getCity() {
	return city;
}
public WebElement getState() {
	return state;
}
public WebElement getZipCode() {
	return zipCode;
}
public WebElement getCountry() {
	return country;
}
public WebElement getOtherinfo() {
	return otherinfo;
}
public WebElement getHomeph() {
	return homeph;
}
public WebElement getMobileph() {
	return mobileph;
}
public WebElement getAliasadd() {
	return aliasadd;
}
public WebElement getRegister() {
	return register;
}
@FindBy(id="optin")
private WebElement option;
@FindBy(id="company")
private WebElement company;
@FindBy(id="address1")
private WebElement address;
@FindBy(id="address2")
private WebElement address1;
@FindBy(id="city")
private WebElement city;
@FindBy(id="id_state")
private WebElement state;


@FindBy(id="postcode")
private WebElement zipCode;
@FindBy(id="id_country")
private WebElement country;
@FindBy(xpath="//textarea[@class='form-control']")
private WebElement otherinfo;
@FindBy(xpath="(//input[@class='form-control'])[7]")
private WebElement homeph;
@FindBy(xpath="(//input[@class='form-control'])[8]")
private WebElement mobileph;
@FindBy(xpath="(//input[@class='form-control'])[9]")
private WebElement aliasadd;
@FindBy(xpath="//button[@class='btn btn-default button button-medium']")
private WebElement register;


}
