package com.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Types {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ramachandran\\eclipse-workspace\\Sel_Project\\chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
//		WebElement singleFrame = driver.findElement(By.xpath("(//a[@class='analystic'])[1]"));
//		singleFrame.click();
		WebElement single = driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(single);
		WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
		text.sendKeys("WELCOME TO INDIA");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		WebElement multipleFrame = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		multipleFrame.click();
		WebElement mframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));

		driver.switchTo().frame(mframe);

		WebElement mframe1 = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(mframe1);

		WebElement text1 = driver.findElement(By.xpath("//input[@type='text']"));
		text1.sendKeys("WELCOME TO TAMILNADU");
		driver.switchTo().defaultContent();

	}
}
