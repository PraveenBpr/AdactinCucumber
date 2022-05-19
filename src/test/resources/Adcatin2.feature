Feature: Validating adactin hotel booking applications

  Scenario Outline: User should login with his details and should confirm his login
    Given user should launch the "https://adactinhotelapp.com/index.php"
    Given user should enter the "<username>" and "<password>" and the login
    Given user should validate his login
    Given thesn print the message of the validation

    Examples: 
      | username   | password  |
      | PraveenBpr | 123456789 |

  Scenario Outline: User should login with the incorrect credentials and validate the error message
    Given user should launch the "https://adactinhotelapp.com/index.php"
    Given user should enter the "<username1>" and "<password>" and the login
    Given validate the error message is displayed or not.

  Scenario Outline: User should login with his details and provide important fields
    Given user should launch the "https://adactinhotelapp.com/index.php"
    Given user should enter the "<username>" and "<password>" and the login
    When user should select the details "<location>","<roomType>" ,"<checkInDate>","<checkOutDate>", "<noOfRooms>" , "<adults>" and search

  Scenario Outline: User should login with his details and provide the wrong details in date and validate the error message
    Given user should launch the "https://adactinhotelapp.com/index.php"
    Given user should enter the "<username>" and "<password>" and the login
    When user should select the details "<location>","<roomType>" ,"<checkInDate1>","<checkOutDate1>", "<noOfRooms>" , "<adults>" and search

  Scenario Outline: User should book the hotel and then cancel the particular booking
    Given user should launch the "https://adactinhotelapp.com/index.php"
    Given user should enter the "<username>" and "<password>" and the login
    When user should select the details "<location>","<hotel>","<roomType>" , "<no.of.rooms>" , "<adults>","<childs>"
    Given user should select the hotel
    And user should enter the details "<firstName>","<lastName>","<address>","<creditCardNo>","<cardType>","<mnth>","<year>","<cvv>"
    Then user should get the OrderId
    Then user should cancel the order with that particular orderId

  Scenario Outline: User should login and then cancel the any bookings in the listed
    Given user should launch the "https://adactinhotelapp.com/index.php"
    Given user should enter the "<username>" and "<password>" and the login
    Given user should enter into the Booked Iternary and then select the orderId and then click cancel.

    Examples: 
      | username   | password  | location | hotel       | roomType | no.of.rooms | adults  | childs  | firstName | lastName | address | creditCardNo     | cardType | mnth    | year | cvv |
      | PraveenBpr | 123456789 | Sydney   | Hotel Creek | Standard | 2 - Two     | 2 - Two | 2 - Two | Praveen   | Raj      | Chennai | 3164613651464698 | VISA     | January | 2022 | 154 |
