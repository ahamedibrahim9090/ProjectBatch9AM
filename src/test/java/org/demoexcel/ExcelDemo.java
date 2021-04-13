package org.demoexcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDemo {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\ELCOT\\eclipse-workspace\\DemoExcel\\ExcelFile\\ExcelDemo.xlsx");
		//To change file into object
		FileInputStream stream = new FileInputStream(file);
		//Object to workbook (excel)
		Workbook w = new XSSFWorkbook(stream);
		Sheet sheet = w.getSheet("Sheet1");
		int rowCount = sheet.getPhysicalNumberOfRows();
		for(int i = 0;i<rowCount;i++)
		{
			Row row = sheet.getRow(i);
			System.out.println("Row Count  "+i);
			int cellCount = row.getPhysicalNumberOfCells();
			for(int j = 0;j<=cellCount;j++)
			{
				Cell cell= row.getCell(j);
				System.out.println(cell);
			}
			System.out.println("\n");
		}
	}

}
