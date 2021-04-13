package org.demoexcel;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGAssert extends DemoBaseClass{

	@Test(groups = {"smoke"})
	private void tc0()
	{
		System.out.println("Method 1");
	}
	@Test(groups = {"smoke","sanity"})
	private void tc1()
	{
		System.out.println("Method 2");
	}
	@Test(groups = {"retest"})
	private void tc2()
	{
		System.out.println("Method 3");
	}
	@Test(groups = {"reg"})
	private void tc3()
	{

		System.out.println("Method 4");
	}
	@Test(groups = {"E2E"},dependsOnGroups = {"reg","retest"})
	private void tc4()
	{
		System.out.println("Method 5");
	}

	/*@BeforeClass
	private void browser()
	{
		browserConfig();
		launchUrl("http://adactinhotelapp.com/");
		browserMaximize();
	}
	@Test
	private void hotelLogin()
	{
		AdactInLogin adl = new AdactInLogin();
		WebElement txtUserName = adl.getTxtUserName();
		enterValue(txtUserName, "ahamedgreens");
		String attributeValues = attributeValues(txtUserName);
		System.out.println(attributeValues);
		Assert.assertEquals("ahamedgreens",attributeValues);
		WebElement txtPassword = adl.getTxtPassword();
		enterValue(txtPassword,"greens");
		String attributeValues2 = attributeValues(txtPassword);
		System.out.println(attributeValues2);
		Assert.assertEquals("greens", attributeValues2);
		clickAction(adl.getBtnLogin());
	}
	@Test
	private void hotelSearch()
	{
		AdactInSearch ads = new AdactInSearch();
		WebElement getdDnLocation = ads.getdDnLocation();
		selectOptionByIndex(getdDnLocation, 2);
		String attributeValues3 = attributeValues(getdDnLocation);
		Assert.assertEquals("Melbourne",attributeValues3);
		System.out.println(attributeValues3);
		selectOptionByValue(ads.getdDnHotels(), "Hotel Creek");
		String attributeValues = attributeValues(ads.getdDnHotels());
		System.out.println(attributeValues);
		SoftAssert sAssert = new SoftAssert();
		sAssert.assertEquals("Hotel Hervey",sAssert);
		selectOptionByText(ads.getdDnRoomType(),"Deluxe");
		String attributeValues2 = attributeValues(ads.getdDnRoomType());
		sAssert.assertEquals("Super Deluxe", attributeValues2);
		System.out.println(attributeValues2);


	}
	@AfterClass
	private void closeBrowser()
	{
		quitBrowser();
	}*/
}
