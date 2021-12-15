package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {

	public static void writeData() throws Exception {
		File f=new File("D:\\\\\\\\Family_Data.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
		wb.createSheet("Credential").createRow(0).createCell(0).setCellValue("UserName");
		wb.getSheet("Credential").getRow(0).createCell(1).setCellValue("Password");
		wb.getSheet("Credential").createRow(1).createCell(0).setCellValue("LithR");
		wb.getSheet("Credential").getRow(1).createCell(1).setCellValue("test@123");
		wb.getSheet("Credential").createRow(2).createCell(0).setCellValue("KaviR");
		wb.getSheet("Credential").getRow(2).createCell(1).setCellValue(123456);
		FileOutputStream fos=new FileOutputStream(f);
		wb.write(fos);
		wb.close();
		System.out.println("Write Successfully");
		

	}
	
	public static void main(String[] args) throws Throwable {
		writeData();
	}
}
