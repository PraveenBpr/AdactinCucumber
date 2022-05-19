package org.stepdef;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinSearchHotel extends BaseMethods {
	public AdactinSearchHotel() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindAll({@FindBy(id="location"),@FindBy(name="location"),@FindBy(xpath="(//select [contains(@class,'search_combobox')])[1]")})
	private WebElement location;
	
	@FindAll({@FindBy(id="hotels"),@FindBy(name="hotels"),@FindBy(xpath="(//select [contains(@class,'search_combobox')])[2]")})
	private WebElement hotels;
	
	@FindAll({@FindBy(id="room_type"),@FindBy(name="room_type"),@FindBy(xpath="(//select [contains(@class,'search_combobox')])[3]")})
	private WebElement roomType;
	
	@FindAll({@FindBy(id="room_nos"),@FindBy(name="room_nos"),@FindBy(xpath="(//select [contains(@class,'search_combobox')])[4]")})
	private WebElement noOfRooms;
	
	@FindAll({@FindBy(id="datepick_in"),@FindBy(name="datepick_in"),@FindBy(xpath="(//input[@class='date_pick'])[1]")})
	private WebElement checkIn;
	
	@FindAll({@FindBy(id="datepick_out"),@FindBy(name="datepick_out"),@FindBy(xpath="(//input[@class='date_pick'])[2]")})
	private WebElement checkOut;
	
	@FindAll({@FindBy(id="adult_room"),@FindBy(name="adult_room"),@FindBy(xpath="(//select [contains(@class,'search_combobox')])[5]")})
	private WebElement adults;
	
	@FindAll({@FindBy(id="child_room"),@FindBy(name="child_room"),@FindBy(xpath="(//select [contains(@class,'search_combobox')])[6]")})
	private WebElement children;
	
	@FindAll({@FindBy(id="Submit"),@FindBy(name="Submit"),@FindBy(xpath="//input[@class='reg_button']")})
	private WebElement search;
	
	@FindBy(id="username_show")
	private WebElement message;
	
	
	@FindBy(xpath="//a[contains(text(),'Booked')]")
	private WebElement bookedIternary;
	
	
	@FindBy(id="checkin_span")
	private WebElement checkin_span;
	
	
	@FindBy(id="checkout_span")
	private WebElement checkout_span;
	
	
	
	public WebElement getBookedIternary() {
		return bookedIternary;
	}
	
	
	public WebElement getMessage() {
		return message;
	}
	
	public WebElement getSearch() {
		return search;
	}
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoomType() {
		return roomType;
	}
	public WebElement getNoOfRooms() {
		return noOfRooms;
	}
	public WebElement getCheckIn() {
		return checkIn;
	}
	public WebElement getCheckin_span() {
		return checkin_span;
	}


	public WebElement getCheckout_span() {
		return checkout_span;
	}


	public WebElement getCheckOut() {
		return checkOut;
	}
	public WebElement getAdults() {
		return adults;
	}
	public WebElement getChildren() {
		return children;
	}
	
	
}
