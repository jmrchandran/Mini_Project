package com.Dec_Mini_Project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.BaseClass.Base_Class;
import com.sdppom.Page_Object_Manager;
public class Runner_Class extends Base_Class {
	public static WebDriver driver = getBrowser("Chrome");
	public static Page_Object_Manager pom=new Page_Object_Manager(driver);
	public static Logger log=Logger.getLogger(Runner_Class.class);
	public static void main(String[] args) throws Throwable {
		
		PropertyConfigurator.configure("log4j.properties");
		url("http://automationpractice.com/index.php");
		log.info("Browser Launched");
		ClickOnElement(pom.setInstanceHp().getWomen());
		implicitwait(5, TimeUnit.SECONDS);
		ClickOnElement(pom.setInstanceHp().getDresses());
		implicitwait(5, TimeUnit.SECONDS);
		ClickOnElement(pom.setInstanceHp().getCasual_Dresses());
		ClickOnElement(pom.setInstancePp().getInstock());
		log.info("Casual Dress Selected");
		Thread.sleep(3000);
		ClickOnElement(pom.setInstancePp().getAdd());
		log.info("Added Successfully");
		implicitwait(5, TimeUnit.SECONDS);
		ClickOnElement(pom.setInstancePck().getPckout());
		implicitwait(5, TimeUnit.SECONDS);
		pom.setInstancePck().getQty().clear();
		inputValueElement(pom.setInstancePck().getQty(), "60");
		ClickOnElement(pom.setInstancePck().getConfirm_Pckout());
		log.info("Product confirmed");
		implicitwait(5, TimeUnit.SECONDS);
		String useremail = particular_Data("D:\\QA Testing\\Project Session\\Test Cases.xlsx", 10,5);
		inputValueElement(pom.setInstanceSi().getEmail(), useremail);
		//implicitwait(5, TimeUnit.SECONDS);
		ClickOnElement(pom.setInstanceSi().getCreate_Acct());
		implicitwait(5, TimeUnit.SECONDS);
		ClickOnElement(pom.setInstanceSi().getRespect());
		String firstName = particular_Data("D:\\QA Testing\\Project Session\\Test Cases.xlsx", 13, 5);
		inputValueElement(pom.setInstanceSi().getfName(), firstName);
		String lastName = particular_Data("D:\\QA Testing\\Project Session\\Test Cases.xlsx", 14,5);
		inputValueElement(pom.setInstanceSi().getlName(), lastName);
		String password = particular_Data("D:\\QA Testing\\Project Session\\Test Cases.xlsx", 16, 5);
		inputValueElement(pom.setInstanceSi().getPassword(), password);
		String day = particular_Data("D:\\QA Testing\\Project Session\\Test Cases.xlsx", 17, 5);
		inputValueElement(pom.setInstanceSi().getDay(), day);
		String month = particular_Data("D:\\QA Testing\\Project Session\\Test Cases.xlsx", 18, 5);
		inputValueElement(pom.setInstanceSi().getMonth(), month);
		String year = particular_Data("D:\\QA Testing\\Project Session\\Test Cases.xlsx", 19, 5);
		inputValueElement(pom.setInstanceSi().getYear(), year);
		ClickOnElement(pom.setInstanceSi().getNewsLetter1());
		ClickOnElement(pom.setInstanceSi().getOption());
		String company = particular_Data("D:\\QA Testing\\Project Session\\Test Cases.xlsx", 22, 5);
		inputValueElement(pom.setInstanceSi().getCompany(), company);
		String address = particular_Data("D:\\QA Testing\\Project Session\\Test Cases.xlsx", 23, 5);
		inputValueElement(pom.setInstanceSi().getAddress(), address);
		String address1 = particular_Data("D:\\QA Testing\\Project Session\\Test Cases.xlsx", 24, 5);
		inputValueElement(pom.setInstanceSi().getAddress1(), address1);
		String city = particular_Data("D:\\QA Testing\\Project Session\\Test Cases.xlsx", 25, 5);
		inputValueElement(pom.setInstanceSi().getCity(), city);
		String state = particular_Data("D:\\QA Testing\\Project Session\\Test Cases.xlsx", 26, 5);
		dropdown("text", pom.setInstanceSi().getState(), state);
		String zip = particular_Data("D:\\QA Testing\\Project Session\\Test Cases.xlsx", 27, 5);
		inputValueElement(pom.setInstanceSi().getZipCode(), zip);
		dropdown("index", pom.setInstanceSi().getCountry(), "1");
		String additionalInfo = particular_Data("D:\\QA Testing\\Project Session\\Test Cases.xlsx", 29, 5);
		inputValueElement(pom.setInstanceSi().getOtherinfo(), additionalInfo);
		String homeph = particular_Data("D:\\QA Testing\\Project Session\\Test Cases.xlsx", 30, 5);
		inputValueElement(pom.setInstanceSi().getHomeph(), homeph);
		String mobph = particular_Data("D:\\QA Testing\\Project Session\\Test Cases.xlsx", 31, 5);
		inputValueElement(pom.setInstanceSi().getMobileph(), mobph);
		pom.setInstanceSi().getAliasadd().clear();
		String otheradd = particular_Data("D:\\QA Testing\\Project Session\\Test Cases.xlsx", 32, 5);
		inputValueElement(pom.setInstanceSi().getAliasadd(), otheradd);
		ClickOnElement(pom.setInstanceSi().getRegister());
		log.info("Account Created Successfully");
		implicitwait(5, TimeUnit.SECONDS);
		ClickOnElement(pom.setInstancePc().getConfirmorder());
		implicitwait(5, TimeUnit.SECONDS);
		ClickOnElement(pom.setInstancePc().getAggreement());
		ClickOnElement(pom.setInstancePc().getCkout());
		implicitwait(5, TimeUnit.SECONDS);
		ClickOnElement(pom.SetInstancePmt().getPmtotion());
		implicitwait(5, TimeUnit.SECONDS);
		ClickOnElement(pom.setInstanceCo().getConfirmOrder());
		log.info("Order confirmed and please find the image for your reference.");
		takescreenshot(
				"C:\\\\Users\\\\Ramachandran\\\\eclipse-workspace\\\\Dec_Mini_Project\\\\Screenshot\\\\MPPageObjectMgr.png");
	}

}
