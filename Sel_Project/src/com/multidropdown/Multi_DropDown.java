package com.multidropdown;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FileUtilsCopyToFileTestCase;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_DropDown {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramachandran\\eclipse-workspace\\Sel_Project\\chrome\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://leafground.com/pages/Dropdown.html");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	WebElement multiDrop = driver.findElement(By.xpath("(//select)[6]"));
	Select S=new Select(multiDrop);
	S.selectByIndex(2);
	S.selectByValue("1");
	S.selectByVisibleText("Loadrunner");
	System.out.println("***************************************************************");
	boolean multiple = S.isMultiple();
	System.out.println("The drop down list having multiple selection options: "+multiple);
	System.out.println("***************************************************************");
	
	
	System.out.println("\n"+"***************************************************************");
	System.out.println("Please find the all the details in the lists as below: ");
	System.out.println("***************************************************************"+"\n");
	List<WebElement> options = S.getOptions();
	for (WebElement webElement : options) {
		System.out.println(webElement.getText());
		}
	System.out.println("\n"+"***************************************************************");
	System.out.println("Please find the all the selected details from the lists as below: ");
	System.out.println("***************************************************************"+"\n");
	
	List<WebElement> allSelectedOptions = S.getAllSelectedOptions();
	for (WebElement webElement1 : allSelectedOptions) {
		System.out.println(webElement1.getText());
		}
	System.out.println("\n"+"***************************************************************");
	System.out.println("Please find the first selected list  as below: ");
	System.out.println("***************************************************************"+"\n");
	WebElement firstSelectedOption = S.getFirstSelectedOption();
	System.out.println(firstSelectedOption.getText());
	
	System.out.println("\n"+"***************************************************************");
	System.out.println("Please see the image in folder for your reference ");
	System.out.println("***************************************************************"+"\n");
	
	TakesScreenshot ts=(TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File destination=new File("C:\\Users\\Ramachandran\\eclipse-workspace\\Sel_Project\\screenshot\\image6.png");	
	FileUtils.copyFile(source, destination);
	driver.close();
	
	}
}
