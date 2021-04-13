package org.demoexcel;

import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AdactInTestNG extends DemoBaseClass {

	/*
	 * @BeforeClass private void browserLaunch() { browserConfig();
	 * launchUrl("http://www.adactinhotelapp.com/index.php"); browserMaximize(); }
	 */

	// @Parameters({"username","password"})
	

	@Test(priority = 1, dataProvider = "Data", dataProviderClass = AdactINDataProvider.class)
	private void hotelLogin(String uName, String pass) {
		browserConfig();
		launchUrl("http://www.adactinhotelapp.com/index.php");
		browserMaximize();
		WebElement username = findelementId("username");
		enterValue(username, uName);
		WebElement password = findelementId("password");
		enterValue(password, pass);
		WebElement btnLogin = findelementId("login");
		clickAction(btnLogin);
	}

	// @Parameters({"location","hotels","room_type","room_nos","adult_room","child_room"})
	@Test(priority = 2, dataProvider = "SearchData", dataProviderClass = AdactINDataProvider.class)
	private void hotelSearch(String location, String hotel, String roomtype, String roomno, String adult, String child)
			throws InterruptedException {
		
		WebElement ddnLocation = findelementId("location");
		selectOptionByValue(ddnLocation, location);
		WebElement btnReset = findelementId("Reset");
		clickAction(btnReset);
		selectOptionByValue(ddnLocation, location);
		WebElement ddnHotel = findelementId("hotels");
		selectOptionByIndex(ddnHotel, Integer.parseInt(hotel));
		WebElement ddnRoomType = findelementId("room_type");
		selectOptionByValue(ddnRoomType, roomtype);
		WebElement ddnRoomnos = findelementId("room_nos");
		selectOptionByText(ddnRoomnos, roomno);
		WebElement txtcheckIn = findelementId("datepick_in");
		txtcheckIn.clear();
		enterValue(txtcheckIn, "08/02/2021");
		WebElement txtcheckOut = findelementId("datepick_out");
		txtcheckOut.clear();
		enterValue(txtcheckOut, "09/02/2021");
		WebElement ddnAdult = findelementId("adult_room");
		selectOptionByValue(ddnAdult, adult);
		WebElement ddnChild = findelementId("child_room");
		selectOptionByText(ddnChild, child);
		WebElement btnSubmit = findelementId("Submit");
		clickAction(btnSubmit);
	}

	@Test(priority = 3)
	private void hotelSelect() {
		WebElement radio = findelementId("radiobutton_0");
		clickAction(radio);
		WebElement btnContinue = findelementId("continue");
		clickAction(btnContinue);

	}

//	@Parameters({"first_name","last_name","address","cc_num","cc_type","cc_exp_month","cc_exp_year","cc_cvv"})
	@Test(priority = 4, dataProvider = "BookData", dataProviderClass = AdactINDataProvider.class)
	private void hotelBooking(String fname, String lname, String adress, String cardnum, String ctype, String ccexpmon,
			String ccexpyear, String cvv) {
		AdactInBookHotel adb = new AdactInBookHotel();
		enterValue(adb.getFirstName(), fname);
		enterValue(adb.getLastName(), lname);
		enterValue(adb.getAdress(), adress);
		enterValue(adb.getCreditCardNo(), cardnum);
		selectOptionByValue(adb.getCreditCardType(), ctype);
		selectOptionByText(adb.getCcExpireMonth(), ccexpmon);
		selectOptionByIndex(adb.getCcExpireYear(), Integer.parseInt(ccexpyear));
		enterValue(adb.getCcCVV(), cvv);
		clickAction(adb.getBookNowBtn());
	}

	@Test(priority = 5)
	private void orderNoCheck() {
		/*
		 * Wait wait = new
		 * FluentWait(driver).withTimeout(Duration.ofSeconds(60)).pollingEvery(Duration.
		 * ofSeconds(2)).ignoring(Throwable.class); WebElement btnLogout = (WebElement)
		 * wait.until(ExpectedConditions.elementToBeClickable(
		 * findelementXpath("//input[@id ='logout']"))); clickAction(btnLogout);
		 */
		WebElement btnLogout = findelementXpath("//a[@href='Logout.php']");
		clickAction(btnLogout);
	}
	/*
	 * @BeforeMethod private void screenShot1(Method m) throws IOException {
	 * TakeScreenshot(m.getName()); }
	 */

	@AfterMethod
	private void screenShot(Method m) throws IOException {
		String method = m.getName();
		String beforeMethod = method.concat("1");
		TakeScreenshot(beforeMethod);
	}

	@AfterClass
	private void closeBrowser() {
		quitBrowser();
	}

}
