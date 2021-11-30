package com.dynamicxpath;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynami_Xpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ramachandran\\eclipse-workspace\\Sel_Project\\chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/men-casual-shirts");
		driver.manage().window().maximize();
		
		List<WebElement> list = driver
				.findElements(By.xpath("//span[@class='product-strike']//preceding-sibling::span"));
		ArrayList<Integer> a = new ArrayList<Integer>();
		for (int i = 0; i < list.size(); i++) {
			String count = list.get(i).getText().replaceAll("Rs. ", "");
			int parseInt = Integer.parseInt(count);
			a.add(parseInt);
		}
		int size = a.size();
		System.out.println("Total Number of productions in this categories: " + size);
		System.out.println("Lowest Price is: " + Collections.min(a));
		System.out.println("Highest Price is :" + Collections.max(a));

	}

}
