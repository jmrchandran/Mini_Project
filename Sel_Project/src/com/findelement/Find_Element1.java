package com.findelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_Element1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ramachandran\\eclipse-workspace\\Sel_Project\\chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver element = new ChromeDriver();
		element.get("https://www.facebook.com/");
		element.manage().window().maximize();
		Thread.sleep(3000);
		WebElement email = element.findElement(By.id("email"));
		email.sendKeys("example@gmail.com");
		WebElement password = element.findElement(By.name("pass"));
		password.sendKeys("test@123");
		WebElement login = element.findElement(By.name("login"));
		login.click();
	}
}
