package org.demoexcel;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoBaseClass {
	public static WebDriver driver;
	public static void browserConfig () {
	//1
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	public static void launchUrl(String url)
	{
		//2
		driver.get(url);
	}
	public static WebElement findelementXpath(String xpath)
	{
		//3
		WebElement findElement = driver.findElement(By.xpath(xpath));
		return findElement;
	}
	public static WebElement findelementId(String id)
	{
		//4
		WebElement findElement = driver.findElement(By.id(id));
		return findElement;
	}
	public static WebElement findElementName(String name)
	{
		//5
		WebElement findElement = driver.findElement(By.name(name));
		return findElement;
	}
	public static List<WebElement> findElementsTagName(String tagName)
	{
		//6
		List<WebElement> findElementsTag= driver.findElements(By.tagName(tagName));
		return findElementsTag;
	}
	public static void windowClose()
	{
		//7
		driver.close();
	}
	public static void quitBrowser()
	{
		//8
		driver.quit();
	}
	public static void browserMaximize()
	{
		//9
		driver.manage().window().maximize();
		
	}
	public static String getCurrentUrl()
	{
		//10
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
	public static String getTitle()
	{
		//11
		String title = driver.getTitle();
		return title;
	}
	public static Alert simpleAlert()
	{
		//12
		Alert alert = driver.switchTo().alert();
		return alert;
	}
	public static Alert confrimAlert()
	{
		//13
		Alert alert = driver.switchTo().alert();
		return alert;
	}
	public static Alert promptAlert()
	{
		//14
		Alert alert = driver.switchTo().alert();
		return alert;	
	}
	
	public static void dragandDrop(WebElement src,WebElement dest)
	{
		//15
		Actions action = new Actions(driver);
		action.dragAndDrop(src, dest).perform();
	}
	public static void rightClick(WebElement element)
	{
		//16
		new Actions(driver).contextClick(element).perform();
	}
	public static void doubleClick(WebElement element)
	{
		//17
		new Actions(driver).doubleClick(element).perform();
	}
	public static void enterValue(WebElement element,String value)
	{
		//18
		element.sendKeys(value);
	}
	public static void clickAction(WebElement element)
	{
		//19
		element.click();
	}
	public static List<WebElement> getOptionsFromDropdown(WebElement element)
	{
		//20
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		return options;
	}
	public static void selectOptionByIndex(WebElement element,int adult)
	{
		//21
		new Select(element).selectByIndex(adult);
	}
	public static void selectOptionByText(WebElement element,String text)
	{
		//22
		new Select(element).selectByVisibleText(text);
	}
	public static void selectOptionByValue(WebElement element,String value)
	{
		//23
		new Select(element).selectByValue(value);
	}
	public static void selectAllOptions(List<WebElement> allOptions,WebElement element)
	{
		//24
		for(int i = 0;i<allOptions.size();i++)
		{
			new Select(element).selectByIndex(i);
		}
	}
	public static void TakeScreenshot(String fileName) throws IOException
	{
		//25
		File file = new File("C:\\Users\\ELCOT\\eclipse-workspace\\DemoExcel\\screenshot\\"+fileName+".png");
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File loc = screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(loc, file);
	}
	public static void waitImplicit() {
		//26
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		
	}
	public static void mouseHover(WebElement xpath) {
		//27
		Actions action = new Actions(driver);
		action.moveToElement(xpath).perform();	
	}
	public static void switchFrame(WebElement frameName) {
		driver.switchTo().frame(frameName);
	}
	 
	public static String attributeValues(WebElement element)
	{
		String attributeValue = element.getAttribute("value");
		return attributeValue;
	}
	
	
	
	
	
	
	
	
}
