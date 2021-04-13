package org.demoexcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelNew {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\ELCOT\\eclipse-workspace\\DemoExcel\\ExcelFile\\ExcelDemo.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheet = w.getSheet("Sheet1");
		Row r = sheet.getRow(0);
		Cell c = r.getCell(0);
		c.setCellValue("FName");		
		FileOutputStream fos = new FileOutputStream(file);
		w.write(fos);
		System.out.println("done............................");
	}

}
