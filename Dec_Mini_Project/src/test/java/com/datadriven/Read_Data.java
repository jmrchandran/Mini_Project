package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data {
	public static void particular_Data() throws IOException {

		File f = new File("D:\\Family_Data.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(3);
		Cell cell = row.getCell(0);
		CellType cellType = cell.getCellType();
		if (cellType.equals(cellType.STRING)) {
			String cellValue = cell.getStringCellValue();
			System.out.println("Particular Data String Value is: " + cellValue);
		} else if (cellType.equals(cellType.NUMERIC)) {
			double ncellvalue = cell.getNumericCellValue();
			int cellValue = (int) ncellvalue;
			System.out.println("Particular Data Numeric Value is: " + "\t" + "\t" + cellValue);
		}

	}

	public static void all_Data() throws IOException {
		File f = new File("D:\\\\Family_Data.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		int numberOfRows = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i < numberOfRows; i++) {
			Row row = sheetAt.getRow(i);
			int numberOfCells = row.getPhysicalNumberOfCells();
			for (int j = 0; j < numberOfCells; j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				if (cellType.equals(cellType.STRING)) {
					String cellValue = cell.getStringCellValue();
					System.out.println("All The String Cell Value is: " + "\t" + "\t" + cellValue);
				} else if (cellType.equals(cellType.NUMERIC)) {
					double ncellValue = cell.getNumericCellValue();
					int cellValue = (int) ncellValue;
					System.out.println("All The Numeric Value is: " + "\t" + "\t" + cellValue);

				}

			}

		}

	}

	public static void row_Data() throws IOException {
		File f = new File("D:\\\\Family_Data.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(2);
		int numberOfCells = row.getPhysicalNumberOfCells();
		for (int i = 0; i < numberOfCells; i++) {
			Cell cell = row.getCell(i);
			CellType cellType = cell.getCellType();
			if (cellType.equals(cellType.STRING)) {
				String value = cell.getStringCellValue();
				System.out.println("The Row Value is: " + value);
			} else if (cellType.equals(cellType.NUMERIC)) {
				double cellValue = cell.getNumericCellValue();
				int value = (int) cellValue;
				System.out.println("The Row Value is: " + value);
			}
		}
	}
	public static void cell_Data() throws IOException {
		File f=new File("D:\\\\Family_Data.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(4);
		Cell cell = row.getCell(1);
		Cell cell2 = row.getCell(2);
		CellType cellType = cell.getCellType();
		CellType cellType2 = cell2.getCellType();
		if(cellType.equals(cellType.STRING)) {
			String value = cell.getStringCellValue();
			System.out.println("\n"+"Cell String Value: "+value);
		}
		else if (cellType.equals(cellType.NUMERIC)) {
			double nvalue = cell.getNumericCellValue();
			int value=(int) nvalue;
			System.out.println("\n"+"Cell String Value: "+value);
			
			
		}
		if(cellType2.equals(cellType2.STRING)) {
			String value1 = cell2.getStringCellValue();
			System.out.println("\n"+"Cell Numeric Value: "+value1);
			
		}
		else if (cellType2.equals(cellType2.NUMERIC)) {
			double nvalue1 = cell2.getNumericCellValue();
			int value1=(int)nvalue1;
			System.out.println("\n"+"Cell Numeric Value: "+value1);
		}
		wb.close();
	}
	

	public static void main(String[] args) throws Throwable {
		particular_Data();
		System.out.println("\n");
		all_Data();
		System.out.println("\n");
		row_Data();
		System.out.println("\n");
		cell_Data();
	}
}
