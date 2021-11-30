package com.miniproject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project1 {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ramachandran\\eclipse-workspace\\Sel_Project\\chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();

		WebElement women = driver.findElement(By.xpath("(//a[@class='sf-with-ul'])[1]"));
		women.click();
		Thread.sleep(3000);

		WebElement dresses = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/ul[1]/li[2]/a"));
		dresses.click();

		Thread.sleep(3000);

		WebElement casual_Dresses = driver.findElement(By.xpath("(//a[contains(text(),'Casual')])[3]"));
		Actions cd = new Actions(driver);
		cd.contextClick(casual_Dresses).build().perform();

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyRelease(KeyEvent.VK_RIGHT);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement instock = driver.findElement(By.xpath("//span[@class='available-now']"));
		instock.click();
		Thread.sleep(3000);
		WebElement add = driver.findElement(By.linkText("Add to cart"));
		add.click();

		Thread.sleep(3000);

		WebElement pckout = driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']"));
		pckout.click();

		Thread.sleep(3000);

		WebElement qty = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		qty.clear();
		qty.sendKeys("16");

		WebElement confirm_Pckout = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		confirm_Pckout.click();

		Thread.sleep(3000);
		WebElement email = driver.findElement(By.name("email_create"));
		email.sendKeys("jmm@gmail.com");
		Thread.sleep(3000);

		WebElement create_Acct = driver.findElement(By.id("SubmitCreate"));
		create_Acct.click();
		Thread.sleep(3000);
		WebElement respect = driver.findElement(By.id("id_gender2"));
		respect.click();

		WebElement fName = driver.findElement(By.name("customer_firstname"));
		fName.sendKeys("KaviyaRM");

		WebElement lName = driver.findElement(By.name("customer_lastname"));
		lName.sendKeys("Ramachand");

		WebElement password = driver.findElement(By.id("passwd"));
		password.sendKeys("test@123");

		WebElement day = driver.findElement(By.xpath("(//select[@class='form-control'])[1]"));
		day.sendKeys("14");
//	Select d=new Select(day);
//	d.selectByIndex(13);
		// Thread.sleep(2000);
		WebElement month = driver.findElement(By.xpath("(//select[@class='form-control'])[2]"));
		month.sendKeys("September");
//	Select m= new Select(month);
//	m.selectByVisibleText("September");
//	Thread.sleep(2000);
		WebElement year = driver.findElement(By.xpath("(//select[@class='form-control'])[3]"));
		year.sendKeys("1987");
//	Select y=new Select(year);
//	y.selectByValue("1987");

		WebElement newsLetter1 = driver.findElement(By.name("newsletter"));
		newsLetter1.click();

		WebElement option = driver.findElement(By.id("optin"));
		option.click();

		WebElement company = driver.findElement(By.id("company"));
		company.sendKeys("TCS E-serve");

		WebElement address = driver.findElement(By.id("address1"));
		address.sendKeys("Nattal Garden Second Street");

		WebElement address1 = driver.findElement(By.id("address2"));
		address1.sendKeys("Perambur");

		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("Chennai");

		WebElement state = driver.findElement(By.id("id_state"));
		Select s = new Select(state);
		s.selectByVisibleText("Texas");

		WebElement zipCode = driver.findElement(By.id("postcode"));
		zipCode.sendKeys("60001");

		WebElement country = driver.findElement(By.id("id_country"));
		Select c = new Select(country);
		c.selectByIndex(1);

		WebElement otherinfo = driver.findElement(By.xpath("//textarea[@class='form-control']"));
		otherinfo.sendKeys("Hard Work Never Fails");

		WebElement homeph = driver.findElement(By.xpath("(//input[@class='form-control'])[7]"));
		homeph.sendKeys(("044123465"));

		WebElement mobileph = driver.findElement(By.xpath("(//input[@class='form-control'])[8]"));
		mobileph.sendKeys("1234567809");

		WebElement aliasadd = driver.findElement(By.xpath("(//input[@class='form-control'])[9]"));
		aliasadd.clear();
		aliasadd.sendKeys("Madurai");

		WebElement register = driver.findElement(By.xpath("//button[@class='btn btn-default button button-medium']"));
		register.click();

		Thread.sleep(3000);
		WebElement confirmorder = driver
				.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
		confirmorder.click();

		Thread.sleep(3000);
		WebElement aggreement = driver.findElement(By.id("cgv"));
		aggreement.click();

		WebElement ckout = driver
				.findElement(By.xpath("//button[@class='button btn btn-default standard-checkout button-medium']"));
		ckout.click();

		Thread.sleep(3000);
		WebElement pmtotion = driver.findElement(By.xpath("//a[@title='Pay by bank wire']"));
		pmtotion.click();

		Thread.sleep(3000);

		WebElement confirmOrder = driver
				.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
		confirmOrder.click();

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(
				"C:\\Users\\Ramachandran\\eclipse-workspace\\Sel_Project\\screenshot\\miniproject1.png");
		FileUtils.copyFile(source, destination);

	}
}
