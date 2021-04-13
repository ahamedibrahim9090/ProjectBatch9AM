package org.demoexcel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlazeDemoPurchase extends BlazeDemoBaseClass {
	public BlazeDemoPurchase()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "inputName")
	private WebElement firstName;
	@FindBy(id = "address")
	private WebElement address;
	@FindBy(id = "city")
	private WebElement city;
	@FindBy(id = "state")
	private WebElement state;
	@FindBy(id = "zipCode")
	private WebElement zipCode;
	@FindBy(id = "cardType")
	private WebElement cardType;
	@FindBy(id = "creditCardNumber")
	private WebElement creditCard;
	@FindBy(id = "creditCardMonth")
	private WebElement cardMonth;
	@FindBy(id = "creditCardYear")
	private WebElement cardYear;
	@FindBy(id = "nameOnCard")
	private WebElement nameonCard;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement submit;
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getSubmit() {
		return submit;
	}
	public WebElement getCity() {
		return city;
	}
	public WebElement getState() {
		return state;
	}
	public WebElement getZipCode() {
		return zipCode;
	}
	public WebElement getCardType() {
		return cardType;
	}
	public WebElement getCreditCard() {
		return creditCard;
	}
	public WebElement getCardMonth() {
		return cardMonth;
	}
	public WebElement getCardYear() {
		return cardYear;
	}
	public WebElement getNameonCard() {
		return nameonCard;
	}
	
}
