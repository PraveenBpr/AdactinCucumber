package org.stepdef;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinSelectHotel extends BaseMethods {
	public AdactinSelectHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindAll({ @FindBy(id = "radiobutton_0"), @FindBy(name = "radiobutton_0"), @FindBy(xpath = "//input[@type='submit']") })
	private WebElement radioButton;

	@FindAll({ @FindBy(id = "continue"), @FindBy(name = "continue"), @FindBy(xpath = "//input[@type='submit']") })
	private WebElement Continue;

	public WebElement getRadioButton() {
		return radioButton;
	}

	public WebElement getContinue() {
		return Continue;
	}

}
