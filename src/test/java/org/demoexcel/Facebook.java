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
import junit.framework.Assert;

public class Facebook {
	static WebDriver driver;
	@BeforeClass
	public static void browserLaunch()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Assert.assertTrue(driver.getCurrentUrl().contains("facebook"));
	}
	@Before
	public void beforeMethod()
	{
		Date date = new Date();
		System.out.println(date);
	}
	@Test
	public void facebookLogin()
	{
		WebElement txtUserName=driver.findElement(By.id("email"));
		txtUserName.sendKeys("ahamed");
		Assert.assertEquals("ahamed", txtUserName.getAttribute("value"));
		WebElement txtPassword= driver.findElement(By.id("pass"));
		txtPassword.sendKeys("facebook");
		Assert.assertEquals("facebook", txtPassword.getAttribute("value"));
	}
	@After
	public void afterMethod()
	{
		Date date = new Date();
		System.out.println(date);
	}
	@AfterClass
	public static void afterClass()
	{
		driver.quit();
	}
}
