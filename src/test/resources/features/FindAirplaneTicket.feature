Feature: Feature to test find airplane ticket
  Scenario: find hotel ticket with successful input data airplane
    Given browser tiket.com is opened
    When user clicks pesawat menu
    And user select from jakarta
    And user select to surabaya
    And user select date on calendar
    And user select penumpang dan kelas kabin
    And user clicks cari penerbangan
    Then tiket penerbangan is displayed