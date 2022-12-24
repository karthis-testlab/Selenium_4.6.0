Feature: Already registered user able to login into the sauce demo site

  Scenario: User able to login successfully with valid user credentials
    Given Ram is the already registered user of the sauce demo site
    When he login with his valid user credentials
    Then he should be able to login into system and redriect to the inventory page

  @skip
  Scenario: User unable to login without user name
    Given Ram is the already registered user of the sauce demo site
    When he wrongly click the login button without user credentials
    But he should able to see line error message and should not redirect into inventory page
