Feature: Login into application

  Scenario: Successful login
    Given Athena has an active account
    When he sends their valid credentials
    Then he should have access to manage his account