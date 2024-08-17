@All
Feature: Account

  @Test1 @EditInfo
  Scenario: Edit Info Success
    Given the user is on the voila page
    When the user click profile
    And the user click on the my profile
    When the user choose edit account info
    And the user click on the add phone number
    And the user click the understanding button
    When the user input the password account
    And the user click the confirm button
    When the user input the phone number
    And the user click on the verify phone number button
    Then the user input the code

