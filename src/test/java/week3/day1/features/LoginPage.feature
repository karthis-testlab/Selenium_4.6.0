Feature: Already registered user able to login into the sauce demo site

  Scenario: User able to login successfully with valid user credentials
    Given Ram is the already registered user of the sauce demo site
    When he login with his valid user credentials
    Then he should be able to login into system and redriect to the inventory page   