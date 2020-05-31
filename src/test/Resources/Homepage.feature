Feature: Southhall travel home page functionality
  @smoke
  Scenario: user searching for flight on south hall website home page
    Given user is on south hall travel web site home page
    When user click on departure tab and choose Heathrow
    And user click on destination tab and choose Ahmedabad
    And user select departing date 6th June
    And user select return date 10th June
    And user select 2 adult
    And user choose on Air India air line
    And user click on search button
    Then user can see search result page
