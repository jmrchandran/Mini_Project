package com.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen_Shot {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ramachandran\\eclipse-workspace\\Sel_Project\\chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		WebElement create_NewAcct = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		create_NewAcct.click();

		Thread.sleep(3000);
		WebElement firstname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		firstname.sendKeys("Kaviya");
		WebElement lastname = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		lastname.sendKeys("Ramachandran");
		WebElement email = driver.findElement(By.name("reg_email__"));
		email.sendKeys("kapskaviya@gmail.com");
		WebElement remail = driver.findElement(By.name("reg_email_confirmation__"));
		remail.sendKeys("kapskaviya@gmail.com");
		WebElement password = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		password.sendKeys("lithes@2017");
		WebElement day = driver.findElement(By.xpath("//select[@aria-label='Day']"));
		day.sendKeys("14");
		WebElement month = driver.findElement(By.xpath("//select[@aria-label='Month']"));
		month.sendKeys("Sep");
		WebElement year = driver.findElement(By.xpath("//select[@aria-label='Year']"));
		year.sendKeys("2017");
		WebElement gender = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		gender.click();
		WebElement signup = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		signup.click();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Ramachandran\\eclipse-workspace\\Sel_Project\\screenshot\\image3.png");
		FileUtils.copyFile(source, destination);

	}
}
