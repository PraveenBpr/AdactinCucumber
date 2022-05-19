Feature: Validating adactin hotel booking applications

  @smoke
  Scenario: User should login with his details and should confirm his login
    Given user should launch the "https://adactinhotelapp.com/index.php"
    Given user should enter the username "PraveenBpr" and password "123456789" and the login
    Given user should validate his login
    Given print the message of the validation

  @reg
  Scenario: User should login with the incorrect credentials and validate the error message
    Given user should launch the "https://adactinhotelapp.com/index.php"
    Given user should enter the username "ParveenBpr1" and password "6814614hg" and then login
    Given validate the error message is displayed or not.

  @E2E
  Scenario: User should login with his details and provide important fields
    Given user should launch the "https://adactinhotelapp.com/index.php"
    Given user should enter the username "PraveenBpr" and password "123456789" and the login
    When user should select the important details "Sydney","Standard" ,"20/05/2022","21/05/2022", "2 - Two" , "2 - Two" and search

  @sanity
  Scenario: User should login with his details and provide the wrong details in date and validate the error message
    Given user should launch the "https://adactinhotelapp.com/index.php"
    Given user should enter the username "PraveenBpr" and password "123456789" and the login
    When user should select the wrong details "Sydney","Standard" ,"21/05/2022","20/05/2022", "2 - Two" , "2 - Two" and search
    Given user should validate the error msg and print the message

  @reTest
  Scenario: User should book the hotel and then cancel the particular booking
    Given user should launch the "https://adactinhotelapp.com/index.php"
    Given user should enter the username "PraveenBpr" and password "123456789" and the login
    When user should select the  valid details "Sydney","Hotel Creek","Standard" , "2 - Two" , "2 - Two","2 - Two"
    Given user should select the hotel and click continue
    And user should enter the details "Praveen","Raj","kpm","1234567890123456","VISA","January","2022","154" and click book
    Then user should get the OrderId
    Then user should cancel the order with that particular orderId

  @smoke1
  Scenario: User should login and then cancel the any bookings in the listed
    Given user should launch the "https://adactinhotelapp.com/index.php"
    Given user should enter the username "PraveenBpr" and password "123456789" and the login
    Given user should enter into the Booked Iternary and then select the orderId and then click cancel.
