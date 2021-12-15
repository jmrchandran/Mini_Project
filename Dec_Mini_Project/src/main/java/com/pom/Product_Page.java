package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product_Page {
	public WebDriver driver;
	
	@FindBy(xpath="//span[@class='available-now']")
	private WebElement instock;

	public WebElement getInstock() {
		return instock;
	}
	@FindBy(linkText="Add to cart")
	private WebElement add;

	public WebElement getAdd() {
		return add;
	}
	public Product_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	

}
