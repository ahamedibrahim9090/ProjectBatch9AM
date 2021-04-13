package org.demoexcel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactInBookHotel extends DemoBaseClass{
	public AdactInBookHotel()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "first_name")
	private WebElement  firstName;
	@FindBy(id = "last_name")
	private WebElement lastName;
	@FindBy(id = "address")
	private WebElement adress;
	@FindBy(id = "cc_num")
	private WebElement creditCardNo;
	@FindBy(id = "cc_type")
	private WebElement  creditCardType;
	@FindBy(id = "cc_exp_month")
	private WebElement ccExpireMonth;
	@FindBy(id ="cc_exp_year")
	private WebElement ccExpireYear;
	@FindBy(id = "cc_cvv")
	private WebElement ccCVV;
	@FindBy(id = "book_now")
	private WebElement bookNowBtn;
	@FindBy(id = "cancel")
	private WebElement cancelBtn;
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getAdress() {
		return adress;
	}
	public WebElement getCreditCardNo() {
		return creditCardNo;
	}
	public WebElement getCreditCardType() {
		return creditCardType;
	}
	public WebElement getCcExpireMonth() {
		return ccExpireMonth;
	}
	public WebElement getCcExpireYear() {
		return ccExpireYear;
	}
	public WebElement getCcCVV() {
		return ccCVV;
	}
	public WebElement getBookNowBtn() {
		return bookNowBtn;
	}
	public WebElement getCancelBtn() {
		return cancelBtn;
	}
}
