
Feature: US1003_user_should_add_data_scenario_outline
  @regression
  Scenario Outline: TC01_Testing_the_data_tables_web_page
    Given user is on the datatables page
    And user clicks on the new button
    When user enters the firstname "<firstname>"
    When user enters the lastname "<lastname>"
    When user enters the position "<position>"
    When user enters the office "<office>"
    When user enters the extension "<extension>"
    When user enters the startdate "<startdate>"
    When user enters the salary "<salary>"
    And user clicks on the create button
    And search for the firstname "<firstname>"
    Then verify the name fields contains firstname "<firstname>"

    Examples: test data for the data table test
    |firstname|lastname|position|office|extension|startdate|salary|
    |Batyr     |Ata     |doctor     |TX    |456      |2020-10-12 |125000|
    |Ata       |Bat     |teacher    |CA    |457      |2020-11-11 |120000|
    |John      |Travolta|TA         |LA    |455      |2020-09-09 |123000|
    |Kidman    |Arnold  |developer  |NY    |478      |2020-07-10 |122000|
    |Nicole    |Jane    |Assistant  |OH    |452      |2020-05-12 |120000|