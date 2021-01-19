Feature: register into application

  Scenario: Successful register
    Given Afraid has not an active account
    When he sends their valid information
    Then he should have access to login in his account