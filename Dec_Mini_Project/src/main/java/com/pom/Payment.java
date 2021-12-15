package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment {
public WebDriver driver;
public Payment(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//a[@title='Pay by bank wire']")
private WebElement pmtotion;
public WebElement getPmtotion() {
	return pmtotion;
}
}
