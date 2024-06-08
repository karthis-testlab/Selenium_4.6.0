Feature: Already registered user able to login into the sauce demo site

  @smoke
  Scenario: User able to login successfully with valid user credentials
    Given Ram is the already registered user of the sauce demo site
    When he login with his valid user credentials
    Then he should be able to login into system and redriect to the inventory page

  @smoke @regression
  Scenario: User able to book the sedan cab from taxi.com app
    Given User wants to select a car type "sedan" from taxi.com app
    When User selects car "sedan" and pick up point "Chennai" and drop location "Madurai"
    Then Driver starts the journey
    And User pays 5000 rupees

  @regression
  Scenario: User able to book the suv cab from taxi.com app
    Given User wants to select a car type "sedan" from taxi.com app
    When User selects car "sedan" and pick up point "Chennai" and drop location "Trichy"
    Then Driver starts the journey
    And User pays 7000 rupees

  @pending
  Scenario: User able to book the mini cab from taxi.com app
    Given User wants to select a car type "sedan" from taxi.com app
    When User selects car "sedan" and pick up point "Chennai" and drop location "Pondi"
    Then Driver starts the journey
    And User pays 3000 rupees
