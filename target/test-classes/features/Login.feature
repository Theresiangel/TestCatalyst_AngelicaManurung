#@All
#Feature: Login
#
#  @Test1 @Login
#  Scenario: login Success
#    Given the user is on voila page
#    When the user choose the sign in button
#    And the user enters the username and password
#    Then the user clicks the sign in button
#
#  @Test2 @Login @Negative
#  Scenario: login invalid with wrong username
#    Given the user is on voila page
#    When the user choose the sign in button
#    And the user enters the invalid username and password
#    And the user clicks the sign in button
#    Then User get a error message
#
#  @Test3 @Login @Negative
#  Scenario: login invalid with wrong password
#    Given the user is on voila page
#    When the user choose the sign in button
#    And the user enters the username and invalid password
#    And the user clicks the sign in button
#    Then User get a error message