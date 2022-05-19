$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Adactin1.feature");
formatter.feature({
  "name": "Validating adactin hotel booking applications",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User should login with his details and should confirm his login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user should launch the \"https://adactinhotelapp.com/index.php\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.userShouldLaunchThe(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should enter the username \"PraveenBpr\" and password \"123456789\" and the login",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.userShouldEnterTheUsernameAndPasswordAndTheLogin(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should validate his login",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.userShouldValidateHisLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "print the message of the validation",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "User should login with the incorrect credentials and validate the error message",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@reg"
    }
  ]
});
formatter.step({
  "name": "user should launch the \"https://adactinhotelapp.com/index.php\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.userShouldLaunchThe(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should enter the username \"ParveenBpr1\" and password \"6814614hg\" and then login",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.userShouldEnterTheUsernameAndPasswordAndThenLogin(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate the error message is displayed or not.",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.validateTheErrorMessageIsDisplayedOrNot()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should login with his details and provide important fields",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@E2E"
    }
  ]
});
formatter.step({
  "name": "user should launch the \"https://adactinhotelapp.com/index.php\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.userShouldLaunchThe(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should enter the username \"PraveenBpr\" and password \"123456789\" and the login",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.userShouldEnterTheUsernameAndPasswordAndTheLogin(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should select the important details \"Sydney\",\"Standard\" ,\"20/05/2022\",\"21/05/2022\", \"2 - Two\" , \"2 - Two\" and search",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef.userShouldSelectTheImportantDetailsAndSearch(String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should login with his details and provide the wrong details in date and validate the error message",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "user should launch the \"https://adactinhotelapp.com/index.php\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.userShouldLaunchThe(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should enter the username \"PraveenBpr\" and password \"123456789\" and the login",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.userShouldEnterTheUsernameAndPasswordAndTheLogin(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should select the wrong details \"Sydney\",\"Standard\" ,\"21/05/2022\",\"20/05/2022\", \"2 - Two\" , \"2 - Two\" and search",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef.userShouldSelectTheWrongDetailsAndSearch(String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should validate the error msg and print the message",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "User should book the hotel and then cancel the particular booking",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@reTest"
    }
  ]
});
formatter.step({
  "name": "user should launch the \"https://adactinhotelapp.com/index.php\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.userShouldLaunchThe(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should enter the username \"PraveenBpr\" and password \"123456789\" and the login",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.userShouldEnterTheUsernameAndPasswordAndTheLogin(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should select the  valid details \"Sydney\",\"Hotel Creek\",\"Standard\" , \"2 - Two\" , \"2 - Two\",\"2 - Two\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef.userShouldSelectTheValidDetails(String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should select the hotel and click continue",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.userShouldSelectTheHotelAndClickContinue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should enter the details \"Praveen\",\"Raj\",\"kpm\",\"1234567890123456\",\"VISA\",\"January\",\"2022\",\"154\" and click book",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.userShouldEnterTheDetailsAndClickBook(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should get the OrderId",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.userShouldGetTheOrderId()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should cancel the order with that particular orderId",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.userShouldCancelTheOrderWithThatParticularOrderId()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should login and then cancel the any bookings in the listed",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke1"
    }
  ]
});
formatter.step({
  "name": "user should launch the \"https://adactinhotelapp.com/index.php\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.userShouldLaunchThe(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should enter the username \"PraveenBpr\" and password \"123456789\" and the login",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.userShouldEnterTheUsernameAndPasswordAndTheLogin(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should enter into the Booked Iternary and then select the orderId and then click cancel.",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.userShouldEnterIntoTheBookedIternaryAndThenSelectTheOrderIdAndThenClickCancel()"
});
formatter.result({
  "status": "passed"
});
});