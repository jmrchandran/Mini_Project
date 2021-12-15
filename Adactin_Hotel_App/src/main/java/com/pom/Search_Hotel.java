package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
public WebDriver driver;
public Search_Hotel(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
}
@FindBy(id="location")
private WebElement location;
public WebElement getLocation() {
	return location;
}
@FindBy(id="hotels")
private WebElement hotels;
public WebElement getHotels() {
	return hotels;
}
@FindBy(id="room_type")
private WebElement rType;
public WebElement getrType() {
	return rType;
}
@FindBy(id="room_nos")
private WebElement rnos;
public WebElement getRnos() {
	return rnos;
}
@FindBy(id="datepick_in")
private WebElement inDate;
public WebElement getInDate() {
	return inDate;
}
@FindBy(id="datepick_out")
private WebElement outDate;
public WebElement getOutDate() {
	return outDate;
}
@FindBy(xpath="//select[@name='adult_room']")
private WebElement adultRoom;
public WebElement getAdultRoom() {
	return adultRoom;
}
@FindBy(xpath="//select[@name='child_room']")
private WebElement childRoom;
public WebElement getChildRoom() {
	return childRoom;
}
@FindBy(xpath="//input[@type='submit']")
private WebElement submt;
public WebElement getSubmt() {
	return submt;
}


}
