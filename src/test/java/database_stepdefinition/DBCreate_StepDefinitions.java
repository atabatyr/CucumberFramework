package database_stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DBUtils;

import javax.naming.Name;
import java.sql.SQLException;

public class DBCreate_StepDefinitions {

    @Given("create a new hotel with the new data")
    public void create_a_new_hotel_with_the_new_data() throws SQLException {
        String insertQuery="insert into dbo.tHotel" +
                "(Code,Name,Address, Phone, Email, IDGroup, CreateDate,CreateUser) " +
                "values('678','createAta','newaddress','33333333','test@testemail.com',10012,'2020-11-01 13:38:47.597','4')";
        DBUtils.executeQuery(insertQuery);
    }

    @Then("verify if the hotel is created")
    public void verify_if_the_hotel_is_created() {
        String read="Select Name from dbo.tHotel";
        //getColumnData is returning list of data in certain column
        //DBUtils.getColumnData(read,"Name").toString will return all Name from the dbo.tHotel table
        Assert.assertTrue(DBUtils.getColumnData(read, "Name").toString().contains("createAta"));

        System.out.println(DBUtils.getColumnData(read, "Name").toString());

        DBUtils.closeConnection();
    }


}
