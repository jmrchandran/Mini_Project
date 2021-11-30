package com.deselect;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeSelect {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramachandran\\eclipse-workspace\\Sel_Project\\chrome\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://leafground.com/pages/Dropdown.html");
driver.manage().window().maximize();
Thread.sleep(3000);
WebElement multi = driver.findElement(By.xpath("(//select)[6]"));
Select s=new Select(multi);
s.selectByIndex(1);
s.selectByValue("2");
s.selectByVisibleText("UFT/QTP");
boolean multiple = s.isMultiple();
s.deselectByIndex(1);
s.deselectByValue("2");
s.deselectByVisibleText("UFT/QTP");
System.out.println("Is multiple dropdown list or not: "+multiple);
List<WebElement> getoptions = s.getOptions();
for (WebElement webElement : getoptions) {
	System.out.println(webElement.getText());
	
}
List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
for (WebElement webElement1 : allSelectedOptions) {
	System.out.println(webElement1.getText());
}

WebElement firstSelectedOption = s.getFirstSelectedOption();
System.out.println(firstSelectedOption.getText());
s.deselectAll();

driver.close();
}
}
