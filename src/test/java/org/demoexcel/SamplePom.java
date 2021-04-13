package org.demoexcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SamplePom extends FacebookLogin {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		FacebookLogin fb = new FacebookLogin();
		WebElement txtEmail = fb.getTxtEmail();
		txtEmail.sendKeys("facebook");
		WebElement txtPass = fb.getTxtPass();
		txtPass.sendKeys("facebook");
		WebElement btnLogin = fb.getBtnLogin();
		btnLogin.click();

	}

}
