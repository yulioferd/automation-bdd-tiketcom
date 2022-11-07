Feature: Feature to test find hotel ticket
  Scenario: find hotel ticket with successful input data ticket
    Given browser tiketcom is opened
    When user clicks hotel menu
    And user select from bali
    And user select checkin date
    And user select checkout date
    And user select kamar dan tamu
    And user clicks cari hotel
    Then hotel ticket is displayed