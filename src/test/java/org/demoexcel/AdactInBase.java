package org.demoexcel;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;

public class AdactInBase extends DemoBaseClass {

	@BeforeClass
	public static void browserLaunch() {
		browserConfig();
	}

	@Test()
	public void tc0() {
		launchUrl("http://adactinhotelapp.com/index.php");
		browserMaximize();
		AdactInLogin adl = new AdactInLogin();
		enterValue(adl.getTxtUserName(), "ahamedgreens");
		enterValue(adl.getTxtPassword(), "greens");
		clickAction(adl.getBtnLogin());
		System.out.println("");
	}

	@Test
	public void tc1() {
		AdactInSearch ads = new AdactInSearch();
		selectOptionByIndex(ads.getdDnLocation(), 3);
		clickAction(ads.getBtnReset());
		selectOptionByIndex(ads.getdDnLocation(), 3);
		selectOptionByText(ads.getdDnHotels(), "Hotel Creek");
		selectOptionByValue(ads.getdDnRoomType(), "Double");
		selectOptionByText(ads.getdDnNoOfRooms(), "3 - Three");
		enterValue(ads.getCheckIn(), "10/10/2021");
		enterValue(ads.getCheckOut(), "11/10/2021");
		selectOptionByText(ads.getAdultPerRoom(), "3 - Three");
		selectOptionByIndex(ads.getChildPerRoom(), 0);
		clickAction(ads.getBtnSubmit());
	}

	@Test
	public void tc2() {
		AdactInSelectHotel adsl = new AdactInSelectHotel();
		clickAction(adsl.getRadioButton());
		clickAction(adsl.getBtnSelect());
	}

	@Test
	public void tc3() {
		AdactInBookHotel adb = new AdactInBookHotel();
		enterValue(adb.getFirstName(), "Ahamed");
		enterValue(adb.getLastName(), "Ibrahim");
		enterValue(adb.getAdress(), "greenstech,thoraipakkam");
		selectOptionByIndex(adb.getCreditCardType(), 3);
		selectOptionByText(adb.getCcExpireMonth(), "July");
		selectOptionByValue(adb.getCcExpireYear(), "2011");
		enterValue(adb.getCreditCardNo(), "1234567890123456");
		enterValue(adb.getCcCVV(), "234");
		clickAction(adb.getBookNowBtn());
		Alert simpleAlert = simpleAlert();
		simpleAlert.accept();
		selectOptionByValue(adb.getCcExpireYear(), "2021");
		clickAction(adb.getBookNowBtn());
	}

	@AfterClass
	public static void afterClass() {
		driver.quit();
	}
}