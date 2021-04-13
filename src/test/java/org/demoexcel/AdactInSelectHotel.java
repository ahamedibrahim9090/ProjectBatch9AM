package org.demoexcel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactInSelectHotel extends DemoBaseClass{
	public AdactInSelectHotel()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "radiobutton_0")
	private WebElement radioButton;
	
	@FindAll({
		@FindBy(id = "continue"),
		@FindBy(name = "continue")
	})
	private WebElement btnSelect;
	
	
	@FindBy(id = "continue")
	private WebElement btnCancel;




	public WebElement getBtnSelect() {
		return btnSelect;
	}

	public WebElement getBtnCancel() {
		return btnCancel;
	}

	public WebElement getRadioButton() {
		return radioButton;
	}

	
}
