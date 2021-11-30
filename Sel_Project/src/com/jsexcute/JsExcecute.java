package com.jsexcute;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExcecute {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramachandran\\eclipse-workspace\\Sel_Project\\chrome\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	JavascriptExecutor js=(JavascriptExecutor) driver;
	
	WebElement mobiles = driver.findElement(By.xpath("(//a[@data-csa-c-type='link'])[3]"));
//	js.executeScript("window.scrollBy(0,1000);","");
	Thread.sleep(3000);
//	js.executeScript("window.scrollBy(0,-500);","");
//	Thread.sleep(3000);
//	js.executeScript("window.scroll(0,0);","");
	Thread.sleep(3000);
	
	js.executeScript("arguments[0].scrollIntoView(true);", mobiles);
	

}
}
