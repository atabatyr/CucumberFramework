@dbtest
Feature: Update Hotel Data
  Background: User connected to the database
    Given user connects to the applicatiton database

  Scenario: Update hotels
    And user updates Email as "atab@update.com" when IDHotel is 10
