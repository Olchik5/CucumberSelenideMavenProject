Feature: Sconto Login
  Login into the website to see the user area

  Scenario: Succeful Login
    Given Navigate to Home Page
    When Click on the Anmelden icon
    Then Login Page displayed

    When Enter valid user credentials
    And Click on Anmelden button
    Then Home Page diplayed

    When Click on Main Konto icon
    Then User name displayed