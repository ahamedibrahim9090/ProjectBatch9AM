package org.demoexcel;

import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactInJunit {
	static WebDriver driver;
	@BeforeClass
	public static void browserLaunch()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://www.adactin.com/HotelApp/");
	}
	@Before
	public void beforeMethod()
	{
		Date date = new Date();
		System.out.println(date);
	}
	@Test
	public void HotelLogin() throws InterruptedException 
	{
		driver.findElement(By.id("username")).sendKeys("ahamedgreens");
		driver.findElement(By.id("password")).sendKeys("greens");
		driver.findElement(By.id("login")).click();
//		WebElement location = driver.findElement(By.id("location"));
//		Select select = new Select(location);
//		select.selectByIndex(3);
//		WebElement hotels =  driver.findElement(By.id("hotels"));
//		select = new Select(hotels);;
//		select.selectByVisibleText("Hotel Creek");
//		WebElement roomType = driver.findElement(By.id("room_type"));
//		select = new Select(roomType);
//		select.selectByValue("Super Deluxe");
//		WebElement noofRooms = driver.findElement(By.id("room_nos"));
//		select =  new Select(noofRooms);
//		List<WebElement> options = select.getOptions();
//		for(int i = 0;i<options.size();i++)
//		{
//			String attribute = options.get(i).getAttribute("value");
//			if(attribute.equals("10"))
//			{
//				select.selectByValue(attribute);
//			}
//		}
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//input[@value ='Search']")).click();
//		driver.findElement(By.xpath("//input[@id='radiobutton_0']")).click();
//		driver.findElement(By.id( "continue")).click();
//		driver.findElement(By.id("first_name")).sendKeys("ahamed");
//		driver.findElement(By.id("last_name")).sendKeys("greens");
//		driver.findElement(By.id("address")).sendKeys("virgampakkam rto office");
//		driver.findElement(By.id("cc_num")).sendKeys("1234567889012098");
//		new Select(driver.findElement(By.id("cc_type"))).selectByValue("AMEX");
//		driver.findElement(By.id("cc_cvv")).sendKeys("789");
//		new Select(driver.findElement(By.id("cc_exp_month"))).selectByIndex(7);
//		new Select(driver.findElement(By.id("cc_exp_year"))).selectByVisibleText("2022");
//		driver.findElement(By.id("book_now")).click();
//		Thread.sleep(10000);
		
		WebElement location = driver.findElement(By.id("location"));
		Select select = new Select(location);
		select.selectByIndex(3);
		WebElement hotels =  driver.findElement(By.id("hotels"));
		select = new Select(hotels);;
		select.selectByVisibleText("Hotel Creek");
		WebElement roomType = driver.findElement(By.id("room_type"));
		select = new Select(roomType);
		select.selectByValue("Super Deluxe");
		WebElement noofRooms = driver.findElement(By.id("room_nos"));
		select =  new Select(noofRooms);
		List<WebElement> options = select.getOptions();
		for(int i = 0;i<options.size();i++)
		{
			String attribute = options.get(i).getAttribute("value");
			if(attribute.equals("10"))
			{
				select.selectByValue(attribute);
			}
		}
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@value ='Search']")).click();
		driver.findElement(By.xpath("//input[@id='radiobutton_0']")).click();
		driver.findElement(By.id( "continue")).click();
		driver.findElement(By.id("first_name")).sendKeys("ahamed");
		driver.findElement(By.id("last_name")).sendKeys("greens");
		driver.findElement(By.id("address")).sendKeys("virgampakkam rto office");
		driver.findElement(By.id("cc_num")).sendKeys("1234567889012098");
		new Select(driver.findElement(By.id("cc_type"))).selectByValue("AMEX");
		driver.findElement(By.id("cc_cvv")).sendKeys("789");
		new Select(driver.findElement(By.id("cc_exp_month"))).selectByIndex(7);
		new Select(driver.findElement(By.id("cc_exp_year"))).selectByVisibleText("2022");
		driver.findElement(By.id("book_now")).click();
		Thread.sleep(10000);


	}
//	@Test
//	public void HotelRegistration() throws InterruptedException
//	{
//		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		WebElement location = driver.findElement(By.id("location"));
//		Select select = new Select(location);
//		select.selectByIndex(3);
//		WebElement hotels =  driver.findElement(By.id("hotels"));
//		select = new Select(hotels);;
//		select.selectByVisibleText("Hotel Creek");
//		WebElement roomType = driver.findElement(By.id("room_type"));
//		select = new Select(roomType);
//		select.selectByValue("Super Deluxe");
//		WebElement noofRooms = driver.findElement(By.id("room_nos"));
//		select =  new Select(noofRooms);
//		List<WebElement> options = select.getOptions();
//		for(int i = 0;i<options.size();i++)
//		{
//			String attribute = options.get(i).getAttribute("value");
//			if(attribute.equals("10"))
//			{
//				select.selectByValue(attribute);
//			}
//		}
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//input[@value ='Search']")).click();
//		driver.findElement(By.xpath("//input[@id='radiobutton_0']")).click();
//		driver.findElement(By.id( "continue")).click();
//		driver.findElement(By.id("first_name")).sendKeys("ahamed");
//		driver.findElement(By.id("last_name")).sendKeys("greens");
//		driver.findElement(By.id("address")).sendKeys("virgampakkam rto office");
//		driver.findElement(By.id("cc_num")).sendKeys("1234567889012098");
//		new Select(driver.findElement(By.id("cc_type"))).selectByValue("AMEX");
//		driver.findElement(By.id("cc_cvv")).sendKeys("789");
//		new Select(driver.findElement(By.id("cc_exp_month"))).selectByIndex(7);
//		new Select(driver.findElement(By.id("cc_exp_year"))).selectByVisibleText("2022");
//		driver.findElement(By.id("book_now")).click();
//		Thread.sleep(10000);
//
//	}
	@After
	public void AfterMethod()
	{
		Date date = new Date();
		System.out.println(date);
	}
	@AfterClass
	public static void quitBrowser()
	{
		driver.quit();
	}
}
