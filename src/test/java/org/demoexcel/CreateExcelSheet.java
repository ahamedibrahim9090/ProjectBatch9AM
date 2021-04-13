package org.demoexcel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateExcelSheet {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\ELCOT\\eclipse-workspace\\DemoExcel\\ExcelFile\\Data.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet createSheet = w.createSheet("Datas");
		Row row = createSheet.createRow(0);
		Cell cell = row.createCell(0);
		cell.setCellValue("Selenium");
		FileOutputStream fos = new FileOutputStream(file);
		w.write(fos);
		System.out.println("done.........................");
	}

}
