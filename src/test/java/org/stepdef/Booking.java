package org.stepdef;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking extends BaseMethods {

	public Booking() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindAll({@FindBy(id="first_name"),@FindBy(name="first_name"),@FindBy(xpath="(//input[@class='reg_input'])[1]")})
	private WebElement firstname;
	
	@FindAll({@FindBy(id="last_name"),@FindBy(name="last_name"),@FindBy(xpath="(//input[@class='reg_input'])[2]")})
	private WebElement lastName;
	
	@FindAll({@FindBy(id="address"),@FindBy(name="address"),@FindBy(xpath="(//input[@class='txtarea'])")})
	private WebElement address;
	
	@FindAll({@FindBy(id="cc_num"),@FindBy(name="cc_num"),@FindBy(xpath="(//input[@class='reg_input'])[3]")})
	private WebElement creditCardNo;
	
	@FindAll({@FindBy(id="cc_type"),@FindBy(name="cc_type"),@FindBy(xpath="//select[@class='select_combobox']")})
	private WebElement creditType;
	
	@FindAll({@FindBy(id="cc_exp_month"),@FindBy(name="cc_exp_month"),@FindBy(xpath="(//select[@class='select_combobox2'])[1]")})
	private WebElement expiryDate;
	
	@FindAll({@FindBy(id="cc_exp_year"),@FindBy(name="cc_exp_year"),@FindBy(xpath="(//select[@class='select_combobox2'])[2]")})
	private WebElement expriyYear;
	
	@FindAll({@FindBy(id="cc_cvv"),@FindBy(name="cc_cvv"),@FindBy(xpath="(//input[@class='reg_input'])[4]")})
	private WebElement cvv;
	
	@FindAll({@FindBy(id="book_now"),@FindBy(name="book_now"),@FindBy(xpath="(//input[@class='reg_button'])[1]")})
	private WebElement bookNow;
	
	
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCreditCardNo() {
		return creditCardNo;
	}
	public WebElement getCreditType() {
		return creditType;
	}
	public WebElement getExpiryDate() {
		return expiryDate;
	}
	public WebElement getExpriyYear() {
		return expriyYear;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getBookNow() {
		return bookNow;
	}
	

}
