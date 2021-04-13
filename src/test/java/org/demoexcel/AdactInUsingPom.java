package org.demoexcel;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactInUsingPom extends AdactInSearch {


	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		AdactInLogin adl = new AdactInLogin();
		WebElement txtUserName = adl.getTxtUserName();
		txtUserName.sendKeys("ahamedgreens");
		WebElement txtPass = adl.getTxtPassword();
		txtPass.sendKeys("greens");
		WebElement btnLogin = adl.getBtnLogin();
		btnLogin.click();
		AdactInSearch ads = new AdactInSearch();
		WebElement getdDnLocation = ads.getdDnLocation();
		Select select = new Select(getdDnLocation);
		select.selectByIndex(5);
		WebElement getdDnHotels = ads.getdDnHotels();
		select = new Select(getdDnHotels);
		select.selectByVisibleText("Hotel Hervey");
		WebElement getdDnRoomType = ads.getdDnRoomType();
		select = new Select(getdDnRoomType);
		select.selectByValue("Super Deluxe");
		WebElement getdDnNoOfRooms = ads.getdDnNoOfRooms();
		select =  new Select(getdDnNoOfRooms);
		select.selectByVisibleText("10 - Ten");
		WebElement checkIn2 = ads.getCheckIn();
		checkIn2.sendKeys("05/04/2021");
		WebElement checkOut2 = ads.getCheckOut();
		checkOut2.sendKeys("06/04/2021");
		WebElement adultPerRoom2 = ads.getAdultPerRoom();
		select = new Select(adultPerRoom2);
		select.selectByValue("4");
		WebElement getChildPerRoom2 = ads.getChildPerRoom();
		select = new Select(getChildPerRoom2);
		select.selectByValue("4");
		WebElement btnReset2 = ads.getBtnReset();
		btnReset2.click();
		
		
		
	}

}
