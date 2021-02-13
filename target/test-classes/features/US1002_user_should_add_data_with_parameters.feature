
Feature: US1002_user_should_add_data_with_parameters
  @regression
  Scenario: TC01_Testing_the_data_tables_web_page
    Given user is on the datatables page
    And user clicks on the new button
    When user enters the firstname "Bat"
    When user enters the lastname "Ata"
    When user enters the position "Developer"
    When user enters the office "GOOGLE"
    When user enters the extension "CEO"
    When user enters the startdate "2020-10-12"
    When user enters the salary "64000"
    And user clicks on the create button
    And search for the firstname "Bat"
    Then verify the name fields contains firstname "Bat"


  @regression
  Scenario: TC03_Testing_the_data_tables_web_page
    Given user is on the datatables page
    And user clicks on the new button
    When user enters the firstname "fakeFirst1"
    When user enters the lastname "fakeLast1"
    When user enters the position "Developer1"
    When user enters the office "Microsoft1"
    When user enters the extension "CEO1"
    When user enters the startdate "2020-11-11"
    When user enters the salary "2500001"
    And user clicks on the create button
    And search for the firstname "fakeFirst1"
    Then verify the name fields contains firstname "fakeFirst1"

  Scenario: TC04_Testing_the_data_tables_web_page
    Given user is on the datatables page
    And user clicks on the new button
    When user enters the firstname "fakeFirst4"
    When user enters the lastname "fakeLast4"
    When user enters the position "Developer4"
    When user enters the office "Microsoft4"
    When user enters the extension "CEO4"
    When user enters the startdate "2020-11-11"
    When user enters the salary "2500004"
    And user clicks on the create button
    And search for the firstname "fakeFirst4"
    Then verify the name fields contains firstname "fakeFirst4"

  Scenario: TC05_Testing_the_data_tables_web_page
    Given user is on the datatables page
    And user clicks on the new button
    When user enters the firstname "fakeFirst5"
    When user enters the lastname "fakeLast5"
    When user enters the position "Developer5"
    When user enters the office "Microsoft5"
    When user enters the extension "CEO5"
    When user enters the startdate "2020-11-11"
    When user enters the salary "2500005"
    And user clicks on the create button
    And search for the firstname "fakeFirst5"
    Then verify the name fields contains firstname "fakeFirst5"

