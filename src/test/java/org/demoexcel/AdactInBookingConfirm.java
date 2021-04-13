package org.demoexcel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactInBookingConfirm extends DemoBaseClass {
	
	public AdactInBookingConfirm()
	{
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(id = "logout")
	private WebElement logout;	
	public WebElement getLogout() {
		return logout;
	}
}
