package com.wait;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class Wait_Types {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramachandran\\eclipse-workspace\\Sel_Project\\chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	//	driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1000);","");
//		WebElement bestSellers = driver.findElement(By.xpath("(//a[@data-csa-c-type='link'])[3]"));
//		jse.executeScript("arguments[0].click();", bestSellers);
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		
		WebElement signIn = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		signIn.click();
		Thread.sleep(3000);
//		WebElement firstName = driver.findElement(By.name("firstname"));
//		firstName.sendKeys("Litheshwar");
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.name("firstname"))).sendKeys("Litheshwar");
	
		Wait<WebDriver> wait1=new FluentWait<WebDriver> (driver).withTimeout(10, TimeUnit.SECONDS).pollingEvery(15, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		
		WebElement surName=wait1.until(new Function<WebDriver,WebElement>(){
		public WebElement apply(WebDriver driver) {
		return driver.findElement(By.name("lastname"));
		}
		});
		surName.sendKeys("Ramachandran");
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\Ramachandran\\eclipse-workspace\\Sel_Project\\screenshot\\fluentwait.png");
		FileUtils.copyFile(source, destination);
	}

}
