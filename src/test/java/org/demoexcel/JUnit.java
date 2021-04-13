package org.demoexcel;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JUnit {
	static WebDriver driver;
	@BeforeClass
	public static void beforeClass()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
	}
	@AfterClass
	public static void afterClass()
	{
		driver.quit();
	}
	@Before
	public void beforeMethod()
	{
		Date date = new Date();
		System.out.println(date);
	}
	@Test
	public void test()
	{
		WebElement txtUserName = driver.findElement(By.id("username"));
		txtUserName.sendKeys("ahamed");
		driver.findElement(By.id("password")).sendKeys("check");
		driver.findElement(By.id("login")).click();
	}
	@After
	public void afterMethod()
	{
		Date date = new Date();
		System.out.println(date);
	}
	
	
}
