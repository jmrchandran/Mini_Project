package com.absxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_Xpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramachandran\\eclipse-workspace\\Sel_Project\\chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.javatpoint.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement java = driver.findElement(By.xpath("/html/body/div/div/div[3]/div/ul/li[3]/a"));
		java.click();
		
		WebElement jt = driver.findElement(By.xpath("/html/body/div/div/div[6]/div[2]/div[1]/table/tbody/tr/td/h1"));
		System.out.println("The javatpoint tutorial is: "+jt.getText());
		
		Thread.sleep(3000);
		WebElement java_mcq = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[5]/div[19]/a[22]"));
		System.out.println("This is java MCQ link: "+java_mcq.getText());
		java_mcq.click();
		
		WebElement mcq = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[6]/div[2]/div[1]/table/tbody/tr/td/h1"));
		System.out.println("Java MCQ Means: "+mcq.getText());
		
	}

}
