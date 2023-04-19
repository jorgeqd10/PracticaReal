Feature: validate Laptops page

  Scenario: Get price of the devices
    Given I open device page
    Then Go to laptops page
    And Get laptop price 5
