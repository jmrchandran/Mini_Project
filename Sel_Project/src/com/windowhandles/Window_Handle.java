package com.windowhandles;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window_Handle {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramachandran\\eclipse-workspace\\Sel_Project\\chrome\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	Actions action=new Actions(driver);
	WebElement closeLogin = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	closeLogin.click();
	
	WebElement topOffer = driver.findElement(By.xpath("(//div[@class='xtXmba'])[1]"));
	action.contextClick(topOffer).build().perform();
	
	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_DOWN);
//	robot.keyPress(KeyEvent.VK_DOWN);
	robot.keyRelease(KeyEvent.VK_DOWN);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
	WebElement grocery = driver.findElement(By.xpath("(//div[@class='xtXmba'])[2]"));
	action.contextClick(grocery).build().perform();

	robot.keyPress(KeyEvent.VK_DOWN);
	//robot.keyPress(KeyEvent.VK_DOWN);
	robot.keyRelease(KeyEvent.VK_DOWN);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);

	WebElement mobile = driver.findElement(By.xpath("(//div[@class='xtXmba'])[3]"));
	action.contextClick(mobile).build().perform();

	robot.keyPress(KeyEvent.VK_DOWN);
	//robot.keyPress(KeyEvent.VK_DOWN);
	robot.keyRelease(KeyEvent.VK_DOWN);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
	Set<String> windowHandles = driver.getWindowHandles();
	
	for (String str_Title : windowHandles) {
		System.out.println(driver.switchTo().window(str_Title).getTitle());
		
	}
	
	String grocery_Tab="Flipkart Grocery Store - Buy Groceries Online & Get Rs.1 Deals at Flipkart.com";
	for (String str_Title : windowHandles) {
		if(driver.switchTo().window(str_Title).getTitle().equalsIgnoreCase(grocery_Tab)) {
			break;
		
		}
	}

}
}
