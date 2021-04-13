package org.demoexcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) throws IOException {
		//creating 
		File file = new File("C:\\Users\\ELCOT\\eclipse-workspace\\DemoExcel\\ExcelFile\\TestData.xlsx");
		//Convert file into object
		FileInputStream stream = new FileInputStream(file);
		
		//convert object into workbook (excel)
		Workbook w = new XSSFWorkbook(stream);
		
		//get sheet from excel
		Sheet s = w.getSheet("Sheet1");
		
		//get row from the sheet
		Row r  = s.getRow(2);
		
		//To get value of each cell from the row
		System.out.println("Getting the value from the specified row");
		for(int i = 0;i<r.getPhysicalNumberOfCells();i++)
		{
			Cell cell = r.getCell(i);
			System.out.println(cell);
		}
		
		//Get cell from row
		System.out.println("\nGet the value from the specific cell");
		Cell c = r.getCell(0);
		System.out.println(c+"\n");
		
		//Get the count of cell present in the row
		int count = r.getPhysicalNumberOfCells();
		System.out.println("Number of cells present in row "+count+"\n");
		
		//Get the count of row present in the sheet
		int count1 = s.getPhysicalNumberOfRows();
		System.out.println("Number of rows present in the sheet"+count1+"\n");
		
		for(int j = 0; j<s.getPhysicalNumberOfRows();j++)
		{
			System.out.println("RowCount"+j);
			Row row = s.getRow(j);
			for(int k = 0;k<row.getPhysicalNumberOfCells();k++)
			{
				Cell cells = row.getCell(k);
				System.out.println(cells);
			}
			System.out.println();
		}
		
	}

}