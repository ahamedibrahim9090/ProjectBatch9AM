package org.demoexcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.commons.lang.time.DateUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {

	public static void main(String[] args) throws IOException 
	{
		File file = new File("C:\\Users\\ELCOT\\eclipse-workspace\\DemoExcel\\ExcelFile\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook w = new XSSFWorkbook(fis);
		Sheet shet = w.getSheet("Sheet1");
		for(int i =0;i<shet.getPhysicalNumberOfRows();i++)
		{
			Row row = shet.getRow(i);
			for(int j = 0;j<row.getPhysicalNumberOfCells();j++)
			{
				
				Cell c = row.getCell(j);
				int cellType = c.getCellType();
				if(cellType == 0)
				{
					if(DateUtil.isCellDateFormatted(c))
					{
					/*SimpleDateFormat format = new SimpleDateFormat("dd-MMM-yy");
					String name = format.format(c.getDateCellValue());
					System.out.println(name);*/
						String name = new SimpleDateFormat("dd-MMM-yy").format(c.getDateCellValue());
						System.out.println(name);
					}
					else
					{
					/*double d = c.getNumericCellValue();
					long l = (long)d;
					String name = String.valueOf(l);
					System.out.println(name);*/
						String name = String.valueOf((long)c.getNumericCellValue());
						System.out.println(name);
						
					}
				}
				else
				{
					String name = c.getStringCellValue();
					System.out.println(name);
				}
		}
	}
	}
}
