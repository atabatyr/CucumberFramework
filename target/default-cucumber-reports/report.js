$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/jdbc_create.feature");
formatter.feature({
  "name": "Create Data",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@dbtest"
    }
  ]
});
formatter.background({
  "name": "User connected to the database",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user connects to the applicatiton database",
  "keyword": "Given "
});
formatter.match({
  "location": "database_stepdefinition.DBUpdate_StepDefinitions.user_connects_to_the_applicatiton_database()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Creating new Hotel",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@dbtest"
    }
  ]
});
formatter.step({
  "name": "create a new hotel with the new data",
  "keyword": "And "
});
formatter.match({
  "location": "database_stepdefinition.DBCreate_StepDefinitions.create_a_new_hotel_with_the_new_data()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify if the hotel is created",
  "keyword": "Then "
});
formatter.match({
  "location": "database_stepdefinition.DBCreate_StepDefinitions.verify_if_the_hotel_is_created()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/jdbc_read.feature");
formatter.feature({
  "name": "Read Data",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@dbtest"
    }
  ]
});
formatter.background({
  "name": "User connected to the database",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user connects to the database",
  "keyword": "Given "
});
formatter.match({
  "location": "database_stepdefinition.DBRead.user_connects_to_the_database()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Reading Hotel Reservations",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@dbtest"
    }
  ]
});
formatter.step({
  "name": "user gets \"Name\" the \"Hotel\" table",
  "keyword": "And "
});
formatter.match({
  "location": "database_stepdefinition.DBRead.user_gets_the_table(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user reads all rows in the \"Name\" column",
  "keyword": "And "
});
formatter.match({
  "location": "database_stepdefinition.DBRead.user_reads_all_rows_in_the_column(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user gets the value in row 15 in \"Name\" column and verifies the value is \"LILLE\"",
  "keyword": "And "
});
formatter.match({
  "location": "database_stepdefinition.DBRead.user_gets_the_value_in_row_in_column_and_verifies_the_value_is(java.lang.Integer,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user gets the value in row 1 in \"Name\" column and verifies the value is \"Rodisson Demo\"",
  "keyword": "And "
});
formatter.match({
  "location": "database_stepdefinition.DBRead.user_gets_the_value_in_row_in_column_and_verifies_the_value_is(java.lang.Integer,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user gets the value in row 10 in \"Name\" column and verifies the value is \"SUNSET\"",
  "keyword": "And "
});
formatter.match({
  "location": "database_stepdefinition.DBRead.user_gets_the_value_in_row_in_column_and_verifies_the_value_is(java.lang.Integer,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/jdbc_update.feature");
formatter.feature({
  "name": "Update Hotel Data",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@dbtest"
    }
  ]
});
formatter.background({
  "name": "User connected to the database",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user connects to the applicatiton database",
  "keyword": "Given "
});
formatter.match({
  "location": "database_stepdefinition.DBUpdate_StepDefinitions.user_connects_to_the_applicatiton_database()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Update hotels",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@dbtest"
    }
  ]
});
formatter.step({
  "name": "user updates Email as \"atab@update.com\" when IDHotel is 10",
  "keyword": "And "
});
formatter.match({
  "location": "database_stepdefinition.DBUpdate_StepDefinitions.user_updates_Email_as_when_IDHotel_is(java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
});