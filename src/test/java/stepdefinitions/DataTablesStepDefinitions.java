package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DataTablePage;
import utilities.ConfigReader;
import utilities.Driver;

public class DataTablesStepDefinitions {

    DataTablePage dataTablePage=new DataTablePage();
    @Given("user is on the datatables page")
    public void user_is_on_the_datatables_page() {
        Driver.getDriver().get(ConfigReader.getProperty("data_table_url"));

    }

    @Given("user clicks on the new button")
    public void user_clicks_on_the_new_button() {
        dataTablePage.newButton.click();
    }

    @When("user enters the firstname")
    public void user_enters_the_firstname() {
       dataTablePage.firstName.sendKeys("Bat");
    }

    @When("user enters the lastname")
    public void user_enters_the_lastname() {
        dataTablePage.lastName.sendKeys("Man");
    }

    @When("user enters the position")
    public void user_enters_the_position() {
        dataTablePage.position.sendKeys("SuperHero");
    }

    @When("user enters the office")
    public void user_enters_the_office() {
        dataTablePage.office.sendKeys("Mountains and Space");

    }

    @When("user enters the extension")
    public void user_enters_the_extension() {
        dataTablePage.extension.sendKeys("17");
    }

    @When("user enters the startdate")
    public void user_enters_the_startdate() {
       dataTablePage.startDate.sendKeys("2017-10-04");
    }

    @When("user enters the salary")
    public void user_enters_the_salary() {
        dataTablePage.salary.sendKeys("374.000");
    }


    @When("user clicks on the create button")
    public void user_clicks_on_the_create_button() {
        dataTablePage.createButton.click();
    }

    @When("search for the firstname")
    public void search_for_the_firstname() {
        dataTablePage.searchBox.sendKeys("Bat");
    }

    @Then("verify the name fields contains firstname")
    public void verify_the_name_fields_contains_firstname() {
        Assert.assertTrue(dataTablePage.nameField.getText().contains("Bat"));
    }



    @When("user enters the firstname {string}")
    public void user_enters_the_firstname(String string) {
        dataTablePage.firstName.sendKeys(string);

    }




    @When("user enters the lastname {string}")
    public void user_enters_the_lastname(String string) {
        dataTablePage.lastName.sendKeys(string);

    }
    @When("user enters the position {string}")
    public void user_enters_the_position(String string) {
        dataTablePage.position.sendKeys(string);
    }
    @When("user enters the office {string}")
    public void user_enters_the_office(String string) {
        dataTablePage.office.sendKeys(string);
    }
    @When("user enters the extension {string}")
    public void user_enters_the_extension(String string) {
        dataTablePage.extension.sendKeys(string);
    }
    @When("user enters the startdate {string}")
    public void user_enters_the_startdate(String string) {
        dataTablePage.startDate.sendKeys(string);
    }
    @When("user enters the salary {string}")
    public void user_enters_the_salary(String string) {
        dataTablePage.salary.sendKeys(string);
    }
    @When("search for the firstname {string}")
    public void search_for_the_firstname(String string) {
       dataTablePage.searchBox.sendKeys(string);
    }
    @Then("verify the name fields contains firstname {string}")
    public void verify_the_name_fields_contains_firstname(String string) throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue(dataTablePage.nameField.getText().contains(string));
    }



}
