Feature: Feature to test login functionality
  Scenario: Check login with successful username and password
    Given user is on login page
    When browser tiket.com is open
    And user enters number <phone>
    And clicks on Lanjutkan
    And input otp code verification
    Then user is navigated to the home page

    Examples:
    |phone|
    |81218041648|