package org.demoexcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactInLogin extends DemoBaseClass {
	
	public AdactInLogin()
	{
		PageFactory.initElements(driver, this);
	}
	//AdactInLogin
	@FindBy(id="username")
	private WebElement txtUserName;
	@FindBy(xpath = "//input[@id = 'password']")
	private WebElement txtPassword;
	@FindBy(name = "login")
	private WebElement btnLogin;
	

	public WebElement getTxtUserName() {
		return txtUserName;
	}
	public WebElement getTxtPassword() {
		return txtPassword;
	}
	public WebElement getBtnLogin() {
		return btnLogin;
	}
	//Search Hotel
//	@FindBy(id = "location")
//	private WebElement dDnLocation;
//	@FindBy(id = "hotels")
//	private WebElement dDnHotels;
//	@FindBy(id = "room_type")
//	private WebElement dDnRoomType;
//	@FindBy(id = "room_nos")
//	private WebElement dDnNoOfRooms;
//	@FindBy(id = "datepick_in")
//	private WebElement checkIn;
//	@FindBy(id = "datepick_out")
//	private WebElement checkOut;
//	@FindBy(id = "adult_room")
//	private WebElement AdultPerRoom;
//	@FindBy(id = "child_room")
//	private WebElement ChildPerRoom;
//	@FindBy(id = "Submit")
//	private WebElement btnSubmit;
//	@FindBy(id = "Reset")
//	private WebElement btnReset;
//	public WebElement getdDnLocation() {
//		return dDnLocation;
//	}
//	public WebElement getdDnHotels() {
//		return dDnHotels;
//	}
//	public WebElement getdDnRoomType() {
//		return dDnRoomType;
//	}
//	public WebElement getdDnNoOfRooms() {
//		return dDnNoOfRooms;
//	}
//	public WebElement getCheckIn() {
//		return checkIn;
//	}
//	public WebElement getCheckOut() {
//		return checkOut;
//	}
//	public WebElement getAdultPerRoom() {
//		return AdultPerRoom;
//	}
//	public WebElement getChildPerRoom() {
//		return ChildPerRoom;
//	}
//	public WebElement getBtnSubmit() {
//		return btnSubmit;
//	}
//	public WebElement getBtnReset() {
//		return btnReset;
//	}
//	
}
