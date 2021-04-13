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
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {
	WebDriver driver;
	
	public WebDriver getDriver()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}
	public void getUrl(String url)
	{
		driver.get(url);
	}
	public WebElement findElement(String xpath)
	{
		WebElement element = driver.findElement(By.xpath(xpath));
		return element;
	}
	public void sendKeyMethod(WebElement element, String value) 
	{
		element.sendKeys(value);
	}
	public void clickMethod(WebElement element) {
	    element.click();
	}
	public void quitBrowser() {
		driver.quit();
	}
	public void closeActiveWindow() {
		driver.close();
	}
	public void doubleClick(WebElement element) {
		Actions action = new Actions(driver);
		action.doubleClick(element).perform();
	}
	public void maximizeWindow() {
		driver.manage().window().maximize();
	}
	public void fullScreen()
	{
		driver.manage().window().fullscreen();
	}
	public void rightClick(WebElement element)
	{
	Actions action = new Actions(driver);
	action.contextClick(element).perform();
		
	}
	public void getScreenshot() throws IOException {
		File destFile = new File("C:\\Users\\ELCOT\\eclipse-workspace\\DemoExcel\\screenshot\\screenshot.png");
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File loc = screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(loc, destFile);
		
		}
	
}
