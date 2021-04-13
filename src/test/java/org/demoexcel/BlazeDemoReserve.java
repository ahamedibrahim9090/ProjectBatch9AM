package org.demoexcel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlazeDemoReserve extends BlazeDemoBaseClass{
	public BlazeDemoReserve()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//table[@class='table']")
	private WebElement table;
	public WebElement getTable() {
		return table;
	}
}
