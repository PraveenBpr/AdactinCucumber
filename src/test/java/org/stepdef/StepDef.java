package org.stepdef;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef extends BaseMethods {
	AdactinLoginPage alp;
	AdactinSearchHotel ash;
	CancellationPage cp;
	BaseMethods bm = new BaseMethods();

	@Given("user should launch the {string}")
	public void userShouldLaunchThe(String string) {
		getUrl("chrome", string);

	}

	@Given("user should enter the username {string} and password {string} and the login")
	public void userShouldEnterTheUsernameAndPasswordAndTheLogin(String string, String string2) {
		alp = new AdactinLoginPage();
		bm.typeText(alp.getUserName(), string);
		bm.typeText(alp.getPassWord(), string2);
		bm.click(alp.getLogin());

	}

	@Given("user should validate his login")
	public void userShouldValidateHisLogin() {
		ash = new AdactinSearchHotel();
		String attribute = bm.getAttribute(ash.getMessage(), "value");
		boolean contains = attribute.contains("PraveenBpr");
		Assert.assertTrue(contains);
		System.out.println("\n"+"Scenario1:A login is Validated : "+attribute);
	}

	@Given("user should enter the username {string} and password {string} and then login")
	public void userShouldEnterTheUsernameAndPasswordAndThenLogin(String string, String string2) {
		alp = new AdactinLoginPage();
		bm.typeText(alp.getUserName(), string);
		bm.typeText(alp.getPassWord(), string2);
		bm.click(alp.getLogin());

	}

	@Given("validate the error message is displayed or not.")
	public void validateTheErrorMessageIsDisplayedOrNot() {
		alp = new AdactinLoginPage();
		String text = bm.getText(alp.getErrorMessage());
		boolean contains = text.contains("Invalid");
		Assert.assertTrue(contains);
		System.out.println("\n" + text);
		System.out.println("\n" + "Scenario2:Error Message is Validated");

	}

	@When("user should select the important details {string},{string} ,{string},{string}, {string} , {string} and search")
	public void userShouldSelectTheImportantDetailsAndSearch(String string, String string2, String string3,
			String string4, String string5, String string6) {
		ash = new AdactinSearchHotel();
		bm.dropText(ash.getLocation(), string);
		bm.dropText(ash.getRoomType(), string2);
		bm.clear(ash.getCheckIn());
		bm.clear(ash.getCheckOut());
		bm.typeText(ash.getCheckIn(), string3);
		bm.typeText(ash.getCheckOut(), string4);
		bm.dropText(ash.getNoOfRooms(), string5);
		bm.dropText(ash.getAdults(), string6);
		bm.click(ash.getSearch());
		System.out.println("Scenario 3: The Important fields are entered");

	}

	@When("user should select the  valid details {string},{string},{string} , {string} , {string},{string}")
	public void userShouldSelectTheValidDetails(String string, String string2, String string3, String string4,
			String string5, String string6) {
		ash = new AdactinSearchHotel();
		bm.dropText(ash.getLocation(), string);
		bm.dropText(ash.getHotels(), string2);
		bm.dropText(ash.getRoomType(), string3);
		bm.dropText(ash.getNoOfRooms(), string4);
		bm.dropText(ash.getAdults(), string5);
		bm.dropText(ash.getChildren(), string6);
		bm.click(ash.getSearch());
	}

	@When("user should select the wrong details {string},{string} ,{string},{string}, {string} , {string} and search")
	public void userShouldSelectTheWrongDetailsAndSearch(String string, String string2, String string3, String string4,
			String string5, String string6) throws InterruptedException {
		ash = new AdactinSearchHotel();
		bm.dropText(ash.getLocation(), string);
		bm.dropText(ash.getRoomType(), string2);
		bm.clear(ash.getCheckIn());
		bm.clear(ash.getCheckOut());
		bm.typeText(ash.getCheckIn(), string3);
		bm.typeText(ash.getCheckOut(), string4);
		bm.dropText(ash.getNoOfRooms(), string5);
		bm.dropText(ash.getAdults(), string6);
		bm.click(ash.getSearch());
		Thread.sleep(3000);
		String text = bm.getText(ash.getCheckin_span());
		String text2 = bm.getText(ash.getCheckout_span());
		boolean contains = text.contains("shall be");
		Assert.assertTrue(contains);
		System.out.println("\n"+text);
		boolean contains2 = text2.contains("shall be");
		Assert.assertTrue(contains2);
		System.out.println(text2);
		System.out.println("Scenario 3:The Error Message is Validated");
	}

	@Given("user should select the hotel and click continue")
	public void userShouldSelectTheHotelAndClickContinue() {
		AdactinSelectHotel act = new AdactinSelectHotel();
		bm.click(act.getRadioButton());
		bm.click(act.getContinue());

	}

	@Given("user should enter the details {string},{string},{string},{string},{string},{string},{string},{string} and click book")
	public void userShouldEnterTheDetailsAndClickBook(String string, String string2, String string3, String string4,
			String string5, String string6, String string7, String string8) throws InterruptedException {
		Booking book = new Booking();
		bm.typeText(book.getFirstname(), string);
		bm.typeText(book.getLastName(), string2);
		bm.typeText(book.getAddress(), string3);
		bm.typeText(book.getCreditCardNo(), string4);
		bm.dropText(book.getCreditType(), string5);
		bm.dropText(book.getExpiryDate(), string6);
		bm.dropText(book.getExpriyYear(), string7);
		bm.typeText(book.getCvv(), string8);
		bm.click(book.getBookNow());
		Thread.sleep(5000);
	}

	@Then("user should get the OrderId")
	public void userShouldGetTheOrderId() throws InterruptedException {
		BookingConfirmation bc = new BookingConfirmation();
		String attribute = bm.getAttribute(bc.getOrderId(), "value");
		Thread.sleep(3000);
		System.out.println("\n"+ "OrderId is : "+attribute);
	}

	@Then("user should cancel the order with that particular orderId")
	public void userShouldCancelTheOrderWithThatParticularOrderId() throws InterruptedException {
		BookingConfirmation bc = new BookingConfirmation();
		String attribute = bm.getAttribute(bc.getOrderId(), "value");
		Thread.sleep(3000);
		bm.click(bc.getMyIternary());
		cp = new CancellationPage();
		bm.typeText(cp.getSearchBox(),attribute);
		bm.click(cp.getGo());
		bm.click(cp.getCheckBox());
		bm.click(cp.getButtonCancel());
		Alert alert = driver.switchTo().alert();
		alert.accept();
		System.out.println("Scenario 5: Order is Cancelled");

	}

	@Given("user should enter into the Booked Iternary and then select the orderId and then click cancel.")
	public void userShouldEnterIntoTheBookedIternaryAndThenSelectTheOrderIdAndThenClickCancel() {
		ash = new AdactinSearchHotel();
		cp = new CancellationPage();
		bm.click(ash.getBookedIternary());
		cp = new CancellationPage();
		List<WebElement> cancel = cp.getCancel();
		bm.click(cancel.get(2));
		Alert a = driver.switchTo().alert();
		a.accept();
		System.out.println("\n"+ "Scenario 6: Order Cancelling is Successfully completed");

	}

}
