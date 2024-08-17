#@All
#Feature: Checkout
#
#  @Test1 @CheckoutBefore
#  Scenario: Checkout Success
#    Given the user is on the voila page
#    When the user select the item menu
#    And the user choose the item
#    And the user click on the add to bag button for the item
#    And the user click on the shopping bag icon
#    And the user click on the checkout button
#    When the user fills out the address form
#    And the user clicks on the upload payment proof button
#    And the user selects a shipping method
#    And the user clicks on the placeholder button
#    And the user fills out the payment upload form
#    Then the user should see the checkout success message
#
#  @Test2 @Checkout
#  Scenario: Checkout Success
#    Given the user is on the voila page
#    When the user select the item menu
#    And the user choose the item
#    And the user click on the add to bag button for the item
#    And the user click on the shopping bag icon
#    And the user click on the checkout button
#    And the user clicks on the upload payment proof button
#    And the user selects a shipping method
#    And the user clicks on the placeholder button
#    And the user fills out the payment upload form
#    Then the user should see the checkout success message
#
#  @Test3 @CheckoutWithOrder
#  Scenario: Checkout Success
#    Given the user is on the voila page
#    When the user click profile
#    And the user click on the order history
#    When the user choose the order
#    And the user clicks on the upload payment proof
#    And the user fills out the payment upload form
#    Then the user should see the checkout success message