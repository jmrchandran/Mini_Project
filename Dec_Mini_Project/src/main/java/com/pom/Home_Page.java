package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	public WebDriver driver;
	

		@FindBy(xpath="(//a[@class='sf-with-ul'])[1]")
		private WebElement women;


		public WebElement getWomen() {
			return women;
		}
		
		@FindBy(xpath="/html/body/div/div/div/div/div/div/div/ul[1]/li[2]/a")
		private WebElement dresses;


		
		public WebElement getDresses() {
			return dresses;
		}
		
		@FindBy(xpath="(//a[contains(text(),'Casual')])[3]")
		private WebElement casual_Dresses;


		public WebElement getCasual_Dresses() {
			return casual_Dresses;
		}
		public Home_Page(WebDriver driver2) {
			this.driver=driver2;
			PageFactory.initElements(driver, this);
		
		}

	
	}

