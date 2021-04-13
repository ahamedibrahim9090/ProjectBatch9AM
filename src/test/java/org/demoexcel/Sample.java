package org.demoexcel;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sample {

	public static void main(String[] args) throws IOException {
		
		LibGlobal global = new LibGlobal();
		WebDriver driver = global.getDriver();
		global.getUrl("https://www.google.com");
		global.maximizeWindow();
		global.fullScreen();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement element = global.findElement("//input[@name = 'q']");
		global.sendKeyMethod(element,"Greens Technology");	
		WebElement searchBtn = global.findElement("(//input[@value='Google Search'])[1]");
		global.clickMethod(searchBtn);
		WebElement searchBox = global.findElement("(//input[@name = 'q'])[1]");
		global.doubleClick(searchBox);
		global.rightClick(searchBox);
		global.getScreenshot();
		//global.closeActiveWindow();
		//global.quitBrowser();

	}

}
