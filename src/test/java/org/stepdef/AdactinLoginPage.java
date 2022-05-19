package org.stepdef;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinLoginPage extends BaseMethods {
	
	public AdactinLoginPage()  {
		
		PageFactory.initElements(driver, this);
	}

	@FindAll({ @FindBy(id = "username"), @FindBy(name = "username"),
			@FindBy(xpath = "(//input[@class='login_input'])[1]") })
	private WebElement userName;

	@FindAll({ @FindBy(id = "password"), @FindBy(name = "password"),
			@FindBy(xpath = "(//input[@class='login_input'])[2]") })
	private WebElement passWord;

	@FindAll({ @FindBy(id = "login"), @FindBy(name = "login"), @FindBy(xpath = "(//input[@class='login_button'])") })
	private WebElement login;
	
	
	@FindBy(xpath = "//table[@class='login']//b")
	private WebElement errorMessage;
	
	

	

	public WebElement getErrorMessage() {
		return errorMessage;
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getLogin() {
		return login;
	}



}
