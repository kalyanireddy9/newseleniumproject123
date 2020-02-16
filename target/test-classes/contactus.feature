@regression
Feature: contact us

  Scenario: contact us with valid credentials

    When I click on Contact us button on home page
    And I select "Customer service" as subject heading from drop down
    Given I enter emailId as "kalyani@gmail.com
    And I enter order reference as "123"
    And I enter message in message box
    When I click on Send button

    
