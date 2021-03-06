package com.Dec_Mini_Project;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Runner_Class_MiniProject2 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();

//	WebElement new_Resgistration = driver.findElement(By.linkText("New User Register Here"));
//	new_Resgistration.click();
		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Thread.sleep(2000);
//	WebElement userName = driver.findElement(By.id("username"));
//	userName.sendKeys("jmramachandran");
//	WebElement pass = driver.findElement(By.id("password"));
//	pass.sendKeys("Welcome@123");
////	WebElement retypePass = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
//	retypePass.sendKeys("Welcom"e@123");
//	WebElement fullName = driver.findElement(By.id("full_name"));
//	fullName.sendKeys("Ramachandran Jayakodirajan");
//	WebElement email = driver.findElement(By.id("email_add"));
//	email.sendKeys("jmramachandran.dgl@gmail.com");
//	

//	String imageElement = driver.findElement(By.id("captcha")).getText().trim();
//	String removeSpace=imageElement.replaceAll("\\s+", "");
//	String[] parts = removeSpace.split("\\+");
//	String part1=parts[0];
////	String part2=parts[1];
//	String[] parts1=part1.split("\\=");
//	String part11=parts1[0];
//	
//	//int summation= Integer.parseInt(part1)+Integer.parseInt(part11);
//	String final_Value=String.valueOf(part11);
//	driver.findElement(By.id("captcha-form")).sendKeys(final_Value);
//	
//	System.out.println("The Captcha Image is: "+final_Value);
//	
//	Thread.sleep(10000);
//	driver.findElement(By.id("tnc_box")).click();
//	driver.findElement(By.id("Submit")).click();
//	//WebElement captcha = driver.findElement(By.id("captcha"));
//	TakesScreenshot captcha=(TakesScreenshot) driver.findElement(By.id("captcha"));
//	
//	File captcha1 = captcha.getScreenshotAs(OutputType.FILE);
//	File path=new File("C:\\Users\\Ramachandran\\eclipse-workspace\\Sel_Project\\screenshot\\capcha.png");
//	FileUtils.copyFile(captcha1, path);
		// String str = captcha.getText();
		// System.out.println(str);
		// WebElement entercaptcha = driver.findElement(By.id("captcha-form"));
		// entercaptcha.sendKeys(str);
		driver.findElement(By.id("username")).sendKeys("jmramachandran");
		driver.findElement(By.id("password")).sendKeys("Welcome@123");

		driver.findElement(By.id("login")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement location = driver.findElement(By.id("location"));

		Select l = new Select(location);
		l.selectByIndex(5);
		WebElement hotels = driver.findElement(By.id("hotels"));
		Select h = new Select(hotels);
		h.selectByVisibleText("Hotel Sunshine");
		WebElement room = driver.findElement(By.id("room_type"));
		Select r = new Select(room);
		r.selectByValue("Double");
		WebElement noof = driver.findElement(By.id("room_nos"));
		Select n = new Select(noof);
		n.selectByIndex(2);
		WebElement inDate = driver.findElement(By.id("datepick_in"));
		inDate.clear();
		inDate.sendKeys("01/12/2021");
		WebElement outDate = driver.findElement(By.id("datepick_out"));
		outDate.clear();
		outDate.sendKeys("04/12/2021");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement adult = driver.findElement(By.xpath("//select[@name='adult_room']"));
		Select a = new Select(adult);
		a.selectByIndex(2);
		WebElement child = driver.findElement(By.xpath("//select[@name='child_room']"));
		Select c = new Select(child);
		c.selectByIndex(2);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("first_name")).sendKeys("Ramachandran J");
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Jayakodirajan");
		driver.findElement(By.id("address")).sendKeys("Shanthome Street, Suite 239,Brisbane,UK-34567.");
		driver.findElement(By.xpath("//input[@name='cc_num']")).sendKeys("1234567832145678");
		WebElement cctype = driver.findElement(By.id("cc_type"));
		Select t = new Select(cctype);
		t.selectByIndex(3);
		WebElement expMonth = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		Select em = new Select(expMonth);
		em.selectByIndex(2);
		WebElement expYear = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		Select ey = new Select(expYear);
		ey.selectByIndex(12);
		driver.findElement(By.xpath("//input[@name='cc_cvv']")).sendKeys("123");
		WebElement bookNow = driver.findElement(By.id("book_now"));
		bookNow.click();
		
		

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(
				"C:\\Users\\Ramachandran\\eclipse-workspace\\Sel_Project\\screenshot\\BookingConfirmation.png");
		FileUtils.copyFile(source, dest);

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500);","");

		driver.findElement(By.id("logout")).click();

	}



}
