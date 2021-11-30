package com.jsexcute;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Test {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ramachandran\\eclipse-workspace\\Sel_Project\\chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		// jse.executeScript("window.scrollBy(0,100);","");
		// Thread.sleep(3000);

		jse.executeScript("document.getElementById('email').value='jmramachandran@gmail.com';");
		jse.executeScript("document.getElementById('pass').value='test@123';");
		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		jse.executeScript("arguments[0].click()", login);
		// jse.executeScript("arguments[0].scrollIntoView(true);", login);
		Thread.sleep(2000);

	}
}
