package org.demoexcel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelDataWebsite {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement dDnCountry = driver.findElement(By.xpath("//select[@id='countries']"));
		Select select = new Select(dDnCountry);
		List<WebElement> country = select.getOptions();
		File file = new File("C:\\Users\\ELCOT\\eclipse-workspace\\DemoExcel\\ExcelFile\\DemoAutomation.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet sheet = w.createSheet("dropdown");
		for(int i = 0;i<country.size();i++)
		{
			Row row = sheet.createRow(i);
			Cell cell = row.createCell(0);
		    String value = country.get(i).getText();
		    cell.setCellValue(value);
		}
		FileOutputStream fos = new FileOutputStream(file);
		w.write(fos);
	}

}
