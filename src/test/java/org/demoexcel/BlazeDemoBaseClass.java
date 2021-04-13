package org.demoexcel;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BlazeDemoBaseClass {
	public static WebDriver driver;


	public static void browserConfig() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	public static void urlLaunch(String url)
	{
		driver.get(url);
	}
	public static void browserMaximize()
	{
		driver.manage().window().maximize();
	}
	public static WebElement findElementByXpath(String locator)
	{
		WebElement element = driver.findElement(By.xpath(locator));
		return element;
	}

	public static void selectByValue(WebElement element, String value)
	{
		Select select = new Select(element);
		select.selectByValue(value);	
	}

	public static void selectByText(WebElement element, String value)
	{
		Select select = new Select(element);
		select.selectByVisibleText(value);	
	}
	public static void clickAction(WebElement element)
	{
		element.click();
	}
	public static void sendkey(WebElement element,String value)
	{
		element.sendKeys(value);
	}
	public static void clearValue(WebElement element)
	{
		element.clear();
	}
	public static void ScreenShot(String filename) throws IOException
	{
		File file = new File("C:\\Users\\ELCOT\\eclipse-workspace\\DemoExcel\\BlazeDemoScreenshot\\"+filename+".png");
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File loc = screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(loc, file);
	}
	public static void quitBrowser()
	{
		driver.quit();
	}

}
