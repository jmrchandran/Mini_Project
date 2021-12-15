package com.Adactin_Hotel_App;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
public static WebDriver driver;
public static String value;
public static WebDriver getBrowser(String type) {
	if(type.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	else if (type.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
	}
	driver.manage().window().maximize();
	return driver;
	
}
public static void clickOnElement(WebElement  element) {
	element.click();
	}
public static void inputValueElement(WebElement element, String value) {
	element.sendKeys(value);

}
public static void url(String url) {
driver.get(url);
}

public static void dropdown(String type,WebElement element,String value) {
Select s = new Select(element);
if(type.equalsIgnoreCase("index")) {
	int index = Integer.parseInt(value);
	s.selectByIndex(index);
}
else if (type.equalsIgnoreCase("value")) {
	s.selectByValue(value);
	
}
else if (type.equalsIgnoreCase("text")) {
	s.selectByVisibleText(value);
	
}

}
public static void actions(String type, WebElement element) {
	Actions act=new Actions(driver);
	if(type.equalsIgnoreCase("click")) {
	act.click(element).build().perform();
	}
	else if (type.equalsIgnoreCase("contextclick")) {
		act.contextClick(element).build().perform();
		
	}

}
public static void implicitwait(int sec,TimeUnit type) {
driver.manage().timeouts().implicitlyWait(sec, type);

}
public static void takesscreenshot(String imageLocation) throws IOException {
	TakesScreenshot snaps=(TakesScreenshot) driver;
	File source=snaps.getScreenshotAs(OutputType.FILE);
	File destination=new File(imageLocation);
	FileHandler.copy(source, destination);
	

}
public static void scroll(String type, String value, WebElement element) {
	JavascriptExecutor js=(JavascriptExecutor) driver;
	if(type.equalsIgnoreCase("scrollby")) {
		js.executeScript(value);
	}
	else if (type.equalsIgnoreCase("scrollinto")) {
		js.executeScript("arguments[0].scrollIntoView()",element);
		}

}
public static String particular_Data(String path,int row_Index,int cell_Index) throws Throwable {
	File f = new File(path);
	FileInputStream fis=new FileInputStream(f);
	Workbook wb=new XSSFWorkbook(fis);
	Sheet sheetAt = wb.getSheetAt(1);
	Row row = sheetAt.getRow(row_Index);
	Cell cell = row.getCell(cell_Index);
	CellType cellType = cell.getCellType();
	if (cellType.equals(CellType.STRING)) {
		value = cell.getStringCellValue();
	}
	else if (cellType.equals(CellType.NUMERIC)) {
		double numericvalue = cell.getNumericCellValue();
		int val = (int) numericvalue;
	 value = String.valueOf(val);
	 wb.close();
					
	}
		return value;
		
	}

public static void clear(WebElement element) {
	element.clear();

}
public static void close() {
driver.close();
}
public static void quit() {
driver.quit();
}
}
