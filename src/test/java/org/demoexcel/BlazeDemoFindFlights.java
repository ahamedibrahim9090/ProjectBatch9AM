package org.demoexcel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class BlazeDemoFindFlights extends BlazeDemoBaseClass {
	public BlazeDemoFindFlights()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//select[@name='fromPort']")
	private WebElement fromCity;
	@FindBy(xpath = "//select[@name = 'toPort']")
	private WebElement toCity;
	@FindBy(xpath = "//input[@value = 'Find Flights']")
	private WebElement findFlight;
	public WebElement getFindFlight() {
		return findFlight;
	}
	public WebElement getFromCity() {
		return fromCity;
	}
	public WebElement getToCity() {
		return toCity;
	}
}
