package com.minimize;

import org.openqa.selenium.Dimension;

//import java.awt.Dimension;
//import java.awt.Point;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Minimize {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ramachandran\\eclipse-workspace\\Sel_Project\\chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		// setSize
		Dimension size = new Dimension(450, 500);
		driver.manage().window().setSize(size);
		Thread.sleep(2000);
		// setPosistion
		Point p = new Point(250, 250);
		driver.manage().window().setPosition(p);

	}
}
