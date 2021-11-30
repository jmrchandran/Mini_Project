package com.findelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_Element {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ramachandran\\eclipse-workspace\\Sel_Project\\chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver element = new ChromeDriver();
		element.get("https://www.facebook.com/");
		element.manage().window().maximize();
		Thread.sleep(3000);
		WebElement newacct = element.findElement(By.xpath("(//a[@role='button'])[2]"));
		newacct.click();
		Thread.sleep(2000);
		WebElement fName = element.findElement(By.name("firstname"));
		fName.sendKeys("Litheshwar");
		WebElement lName = element.findElement(By.name("lastname"));
		lName.sendKeys("Ramachandran");
		WebElement moboremail = element.findElement(By.name("reg_email__"));
		moboremail.sendKeys("lithesh@gmail.com");
		WebElement reenter = element.findElement(By.name("reg_email_confirmation__"));
		reenter.sendKeys("lithesh@gmail.com");
		WebElement newpass = element.findElement(By.name("reg_passwd__"));
		newpass.sendKeys("test@123");
		WebElement day = element.findElement(By.id("day"));
		day.sendKeys("1");

		WebElement month = element.findElement(By.id("month"));
		month.sendKeys("Dec");

		WebElement year = element.findElement(By.id("year"));
		year.sendKeys("2017");

		//WebElement gender = element.findElement(By.xpath("//input[@type='radio' and @value='2']"));
		WebElement gender = element.findElement(By.xpath("(//input[@type='radio'])[2]"));
		gender.click();

		WebElement signup = element.findElement(By.name("websubmit"));
		signup.click();

	}
}
