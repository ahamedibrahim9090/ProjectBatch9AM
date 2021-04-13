package org.demoexcel;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BlazeDemoSite extends BlazeDemoBaseClass {
	ExtentReports report;
	ExtentHtmlReporter htmlReporter;
	ExtentTest extentTest;
	@BeforeClass
	private void configBrowser()
	{
		report = new ExtentReports();
		htmlReporter = new ExtentHtmlReporter("extentreport.html");
		report.attachReporter(htmlReporter);
		browserConfig();
		browserMaximize();
	}

	@Parameters({"url","fromcity","tocity"})
	@Test(priority = 1)
	private void login(String url,String fromCity,String toCity,Method m) throws IOException {
		report = new ExtentReports();
		htmlReporter = new ExtentHtmlReporter("ExtentReport.html");
		report.attachReporter(htmlReporter);
		extentTest = report.createTest("Select Travel Destination");
		extentTest.log(Status.INFO, "Verify dropdown is enabled");
		BlazeDemoFindFlights bdff = new BlazeDemoFindFlights();
		urlLaunch(url);
		WebElement fromCity1 = bdff.getFromCity();
		WebElement toCity1 = bdff.getToCity();
		WebElement findFlight = bdff.getFindFlight();
		if(fromCity1.isDisplayed()&&fromCity1.isEnabled()&&toCity1.isDisplayed()&&toCity1.isEnabled()&&findFlight.isDisplayed()&&findFlight.isEnabled())
		{
			extentTest.log(Status.INFO, "Departure & Destination is selected");
			selectByValue(bdff.getFromCity(),fromCity);
			selectByValue(bdff.getToCity(),toCity);
			ScreenShot(m.getName());
			clickAction(bdff.getFindFlight());
		}
		else
		{
			extentTest.log(Status.INFO, "Departure & Destination is not enbaled");
		}
	}

	@Test(priority = 2)
	private void selectLowestPrice(Method m) throws IOException
	{
		BlazeDemoReserve bdr = new BlazeDemoReserve();
		extentTest = report.createTest("Reserve the flight");
		extentTest.log(Status.INFO, "Verify the button is enabled or not");
		WebElement table = bdr.getTable();
		List<WebElement> elements = table.findElements(By.tagName("td"));
		List<String> price = new LinkedList<String>();
		for(int i = 0;i<elements.size();i++)
		{
			String text = elements.get(i).getText();
			if(text.contains("$"))
			{
				price.add(text);
			}
		}
		System.out.println(price);
		List<Float> convPrice = new LinkedList<Float>();
		float lowPrice = 0;
		int position = 0;
		for(int j = 0;j<price.size();j++)
		{
			String number = price.get(j);
			String replace = number.replace('$','0');
			float check = Float.parseFloat(replace);
			convPrice.add(check);
		}
		System.out.println(convPrice);
		for(int i = 0;i<convPrice.size();i++)
		{
			float price1 = convPrice.get(i);
			for(int j = i+1;j<convPrice.size();j++)
			{
				float price2 = convPrice.get(j);
				if(price1<price2)
				{
					lowPrice = price1;
					position = i;
				}
			}
		}
		position++;
			WebElement btnReserve = driver.findElement(By.xpath("(//input[@class='btn btn-small'])["+position+"]"));
			if(btnReserve.isDisplayed() && btnReserve.isEnabled())
			{
				extentTest.log(Status.PASS, "Reservation selection button is enabled");
				ScreenShot(m.getName());
				btnReserve.click();
		}
			else
			{
				extentTest.log(Status.FAIL, "Reservation selection button is not enabled");
			}
	}
	@Parameters({"firstName","adress","city","state","zipCode","cardType","CardNumber","month","year","nameCard"})
	@Test(priority = 3)
	private void purchase(String firstName,String address,String city,String state,String zipcode,String cardType,String cardNumber,String month,String year,String nameCard,Method m) throws IOException
	{
		BlazeDemoPurchase bdp = new BlazeDemoPurchase();
		extentTest = report.createTest("Details entry form");
		extentTest.log(Status.INFO, "Verify the field are displayed and enabled");
		WebElement firstName2 = bdp.getFirstName();
		WebElement address2 = bdp.getAddress();
		WebElement city2 = bdp.getCity();
		WebElement state2 = bdp.getState();
		WebElement zipCode2 = bdp.getZipCode();
		WebElement cardType2 = bdp.getCardType();
		WebElement creditCard = bdp.getCreditCard();
		WebElement cardMonth = bdp.getCardMonth();
		WebElement cardYear = bdp.getCardYear();
		WebElement nameonCard = bdp.getNameonCard();
		if(firstName2.isDisplayed() && firstName2.isEnabled() && address2.isDisplayed() && address2.isEnabled() && city2.isDisplayed() && city2.isEnabled() && state2.isDisplayed() && state2.isEnabled() && zipCode2.isDisplayed() && zipCode2.isEnabled() && cardType2.isDisplayed() &&cardType2.isEnabled() && creditCard.isDisplayed() && creditCard.isEnabled() && cardMonth.isDisplayed() && cardMonth.isEnabled() && cardYear.isDisplayed() && cardYear.isEnabled() && nameonCard.isDisplayed() && nameonCard.isEnabled())
		{
			extentTest.log(Status.PASS, "Details in the screen are entered in the field");
		sendkey(bdp.getFirstName(), firstName);
		sendkey(bdp.getAddress(),address);
		sendkey(bdp.getCity(), city);
		sendkey(bdp.getState(),state);
		sendkey(bdp.getZipCode(),zipcode);
		selectByValue(bdp.getCardType(), cardType);
		sendkey(bdp.getCreditCard(), cardNumber);
		clearValue(bdp.getCardMonth());
		sendkey(bdp.getCardMonth(), month);
		clearValue(bdp.getCardYear());
		sendkey(bdp.getCardYear(), year);
		sendkey(bdp.getNameonCard(), nameCard);
		ScreenShot(m.getName());
		clickAction(bdp.getSubmit());
		}
		else
		{
			extentTest.log(Status.FAIL, "Fields are not enabled ");
		}
	}
	

	@Test(priority = 4)
	private void confirmation(Method m) throws IOException
	{
		WebElement reservationId = driver.findElement(By.xpath("//table[@class='table']/tbody/tr/td[2]"));
		ScreenShot(m.getName());
		String text = reservationId.getText();
		System.out.println(text);
	}
	@AfterClass
	private void closeBrowser()
	{
		quitBrowser();
		report.flush();
	}
}
