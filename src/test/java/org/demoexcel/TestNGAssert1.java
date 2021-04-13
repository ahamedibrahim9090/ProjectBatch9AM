package org.demoexcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGAssert1 {
	@Parameters({"browser"})
	@Test
	private void tc0(String s)
	{
		if(s.equalsIgnoreCase("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		System.out.println(Thread.currentThread().getId());
		}
		else if(s.equalsIgnoreCase("firefox"))
		{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		System.out.println(Thread.currentThread().getId());
	}
}
}