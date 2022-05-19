package org.stepdef;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmation extends BaseMethods {
	public BookingConfirmation() {
		PageFactory.initElements(driver, this);
	}
	@FindAll({@FindBy(id="order_no"),@FindBy(name="order_no"),@FindBy(xpath="(//input[@class='disable_text'])[15]")})
	private WebElement orderId;

	
	
	@FindBy(id="my_itinerary")
	private WebElement myIternary;
	
	
	
	
	
	
	
	







	public WebElement getMyIternary() {
		return myIternary;
	}







	public WebElement getOrderId() {
		return orderId;
	}

}
	