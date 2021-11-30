package com.dropdrag;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Robot_Actions {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ramachandran\\eclipse-workspace\\Sel_Project\\chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Actions m = new Actions(driver);
		WebElement closeLogin = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		closeLogin.click();

		WebElement mobile = driver.findElement(By.xpath("(//div[@class='xtXmba'])[3]"));
		m.contextClick(mobile).build().perform();

		Robot k = new Robot();
		k.keyPress(KeyEvent.VK_DOWN);// mobiles in new tab
		k.keyRelease(KeyEvent.VK_DOWN);
		k.keyPress(KeyEvent.VK_ENTER);
		k.keyRelease(KeyEvent.VK_ENTER);

		WebElement fashion = driver.findElement(By.xpath("(//div[@class='xtXmba'])[4]"));
		m.moveToElement(fashion).build().perform();
		WebElement mens = driver.findElement(By.linkText("Men's Top Wear"));
		m.contextClick(mens).build().perform();

		k.keyPress(KeyEvent.VK_DOWN);
		k.keyPress(KeyEvent.VK_DOWN);
		k.keyRelease(KeyEvent.VK_DOWN);
		k.keyPress(KeyEvent.VK_ENTER);
		k.keyRelease(KeyEvent.VK_ENTER);

		WebElement home = driver.findElement(By.xpath("(//div[@class='xtXmba'])[6]"));
		m.moveToElement(home).build().perform();
		WebElement living = driver.findElement(By.linkText("Living Room"));
		m.contextClick(living).build().perform();
		k.keyPress(KeyEvent.VK_DOWN);
		k.keyPress(KeyEvent.VK_DOWN);
		k.keyPress(KeyEvent.VK_DOWN);
		k.keyRelease(KeyEvent.VK_DOWN);
		k.keyPress(KeyEvent.VK_ENTER);
		k.keyRelease(KeyEvent.VK_ENTER);

	}

}
