package com.singledropdown;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_DropDown {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ramachandran\\eclipse-workspace\\Sel_Project\\chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		WebElement create_Acct = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		create_Acct.click();
		Thread.sleep(3000);
		WebElement first_Name = driver.findElement(By.name("firstname"));
		first_Name.sendKeys("Litheshwar");
		WebElement last_Name = driver.findElement(By.name("lastname"));
		last_Name.sendKeys("Ramachandran");
		WebElement mobile_Num = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		mobile_Num.sendKeys("978969622");
		WebElement password = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		password.sendKeys("test@123");
		WebElement day = driver.findElement(By.id("day"));
		Select d = new Select(day);
		d.selectByValue("14");
		WebElement month = driver.findElement(By.id("month"));
		Select m = new Select(month);
		m.selectByIndex(8);
		WebElement year = driver.findElement(By.id("year"));
		Select y = new Select(year);
		y.selectByVisibleText("1987");
		WebElement gender = driver.findElement(By.xpath("(//label[@class='_58mt'])[2]"));
		gender.click();
		WebElement signUp = driver.findElement(By.name("websubmit"));
		signUp.click();
		Thread.sleep(2000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Ramachandran\\eclipse-workspace\\Sel_Project\\screenshot\\image5.png");
		FileUtils.copyFile(source, destination);
		driver.quit();
		
	}
}
