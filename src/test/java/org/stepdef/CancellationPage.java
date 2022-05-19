package org.stepdef;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CancellationPage extends BaseMethods {

	public CancellationPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "order_id_text")
	private WebElement searchBox;

	@FindBy(id = "search_hotel_id")
	private WebElement go;

	@FindAll({@FindBy(id = "ids[]"),@FindBy(xpath="//input[@type='checkbox']"),@FindBy(xpath = "//input[@value='612360']")})
	private WebElement checkBox;

	@FindBy(xpath = "//input[@type='button']")
	private List<WebElement> cancel;

	@FindBy(name = "cancelall")
	private WebElement buttonCancel;

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getGo() {
		return go;
	}

	public WebElement getCheckBox() {
		return checkBox;
	}

	

	public WebElement getButtonCancel() {
		return buttonCancel;
	}

	public List<WebElement> getCancel() {
		return cancel;
	}

}
