@sanity
  Feature: Create an account

    Scenario: Create an account with valid credentials

      When I click on sign in button on home page
      Given I enter emailId as "autopractice@gmail.com" in create an account page
      And I click on Create an account button
      When I select "Mr." on title
      And I enter below details:
      |FirstName|LastName|Password    |Date of Birth|
      |auto     |practice|autopractice|1/2/2000     |
      When I click on "Sign up for our newsletter!" check box


