package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceed_Check {
public WebDriver driver;
public Proceed_Check(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
	
}
@FindBy(xpath="//button[@class='button btn btn-default button-medium']")
private WebElement confirmorder;
public WebElement getConfirmorder() {
	return confirmorder;
		
}
@FindBy(id="cgv")
private WebElement aggreement;
public WebElement getAggreement() {
	return aggreement;
}
@FindBy(xpath="//button[@class='button btn btn-default standard-checkout button-medium']")
private WebElement ckout;
public WebElement getCkout() {
	return ckout;
}

}
