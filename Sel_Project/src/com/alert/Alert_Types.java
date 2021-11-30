package com.alert;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Types {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramachandran\\eclipse-workspace\\Sel_Project\\chrome\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Alerts.html");
	driver.manage().window().maximize();
	WebElement simple = driver.findElement(By.xpath("(//a[@class='analystic'])[1]"));
	simple.click();
	
	WebElement simple1 = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	simple1.click();
	
	driver.switchTo().alert().accept();
	WebElement confirmButt = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
	confirmButt.click();
	WebElement confirmButt1 = driver.findElement(By.xpath("(//button)[3]"));
	confirmButt1.click();
	driver.switchTo().alert().dismiss();
	
	WebElement alertText = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
	alertText.click();
	WebElement prompt = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
	prompt.click();
	
	driver.switchTo().alert().sendKeys("LITHESHWAR");
	
	String promptLine=driver.switchTo().alert().getText();
	
	System.out.println("The prompted input text is: "+promptLine);
	driver.switchTo().alert().accept();
	WebElement texts = driver.findElement(By.xpath("//p[@id='demo1']"));
	System.out.println("The prompted lines are: "+texts.getText());
//	TakesScreenshot ts=(TakesScreenshot) driver;
//	File source=ts.getScreenshotAs(OutputType.FILE);
//	File destinationFile=new File("C:\\Users\\Ramachandran\\eclipse-workspace\\Sel_Project\\screenshot\\promptaler.png");
//	FileUtils.copyFile(source, destinationFile);
//	driver.close();
//	
	//driver.switchTo().defaultContent();
	
}
}
