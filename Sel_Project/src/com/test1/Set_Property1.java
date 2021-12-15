package com.test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set_Property1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ramachandran\\eclipse-workspace\\Sel_Project\\chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		//driver.get("https://www.amazon.in/");
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(3000);
		driver.navigate().to("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		 driver.close();
	String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	String pageSource = driver.getPageSource();
	System.out.println(pageSource);

	}
}
