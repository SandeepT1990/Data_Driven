package com.ddfpractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Practice {
	
	public static  void Partial_E() throws Throwable {

		File f = new File("C:\\Users\\Sande_000\\Desktop\\java\\Data_Driven_Framework\\src\\test\\java\\com\\ddfpractice\\Data Driven Framework.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(1);
		Cell cell = row.getCell(1);
		CellType cellType = cell.getCellType();
		
		if (cellType.equals(cellType.STRING)) {
			
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
			
		}
		else if (cellType.equals(cellType.NUMERIC)) {
			
			double numericCellValue = cell.getNumericCellValue();
			
			int a = (int) numericCellValue;
			System.out.println(a);
			
			
		}
		}	
public static void main(String[] args) throws Throwable {
			
			Partial_E();
			
		
		}
		
		
		
		
		
		
	}


