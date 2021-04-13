package org.demoexcel;

import java.time.Duration;
import java.util.Date;
import java.util.Set;
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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class RedBus {
	static WebDriver driver;
	@BeforeClass
	public static void browserLaunch()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		Assert.assertTrue(driver.getCurrentUrl().contains("redbus"));
	}
	@Before
	public void beforeMethod()
	{
		Date date = new Date();
		System.out.println(date);
	}
	@Test
	public void redbusLogin() throws InterruptedException
	{
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement btnLoadSignIn = driver.findElement(By.xpath("//div[@id ='sign-in-icon-down']"));
		btnLoadSignIn.click();
		WebElement btnSignInUp = driver.findElement(By.xpath("//li[text() =  'Sign In/Sign Up']"));
		btnSignInUp.click();
		WebElement frame = driver.findElement(By.xpath("//iframe[@class = 'modalIframe']"));
		driver.switchTo().frame(frame);
		WebElement signInBtnFrame = driver.findElement(By.xpath("//iframe[@title = 'Sign in with Google Button']"));
		driver.switchTo().frame(signInBtnFrame);
		Wait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(2)).ignoring(Throwable.class);
		WebElement googleSignIn = (WebElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[text() = 'Sign in with Google'])[1]")));
		googleSignIn.click();
		driver.switchTo().defaultContent();
		String windowHandle = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		for(String subWindow : windowHandles)
		{
			if(!subWindow.equals(windowHandle))
			{
				driver.switchTo().window(subWindow);
				WebElement txtUserName = driver.findElement(By.xpath("//input[@id='identifierId']"));
				txtUserName.sendKeys("ahamedibrahim094@gmail.com");
				String userName= txtUserName.getAttribute("value");
				Assert.assertEquals("ahamedibrahim094@gmail.com", userName);
				driver.findElement(By.xpath("//div[@id='identifierNext']")).click();
				Thread.sleep(5000);
			}
		}
	}
	@After
	public void afterMethod()
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
