package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product_Checkout {
public WebDriver driver;
public Product_Checkout(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//a[@class='btn btn-default button button-medium']")
private WebElement pckout;
public WebElement getPckout() {
	return pckout;
}
@FindBy(xpath="(//input[@type='text'])[2]")
private WebElement qty;

public WebElement getQty() {
	return qty;
}
@FindBy(xpath="(//a[@title='Proceed to checkout'])[2]")
private WebElement confirm_Pckout;

public WebElement getConfirm_Pckout() {
	return confirm_Pckout;
}




}
