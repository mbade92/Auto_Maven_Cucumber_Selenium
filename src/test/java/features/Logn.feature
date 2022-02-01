Feature: Login Feature

  Scenario: Login with valid username and password

    Given User navigates to the site

    When User enters valid username and password

    And User clicks submit

    Then User logs in successfully