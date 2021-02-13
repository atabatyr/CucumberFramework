package database_stepdefinition;

import io.cucumber.java.en.Given;
import utilities.DBUtils;

import java.sql.SQLException;

public class DBUpdate_StepDefinitions {


    @Given("user connects to the applicatiton database")
    public void user_connects_to_the_applicatiton_database() {
        DBUtils.createConnection();


    }

    @Given("user updates Email as {string} when IDHotel is {int}")
    public void user_updates_Email_as_when_IDHotel_is(String string, Integer int1) throws Exception {
        //Writing a query
        String query= "Select email from dbo.tHotel";
        //Executing query
        DBUtils.executeQuery(query);
        //Skip the first 3 lines. We should use resultSet to skip
        //resultSet=>Driver.getResultSet();
//        DBUtils.getResultSet().next();
//        DBUtils.getResultSet().next();
//        DBUtils.getResultSet().next();

        while(DBUtils.getResultSet().next()){
            String str=DBUtils.getResultSet().getString("Email");
            System.out.println(str);
        }

        String updateQuery="Update dbo.tHotel set email='"+string+"' Where IdHotel="+int1;
        DBUtils.executeQuery(updateQuery);
        System.out.println(DBUtils.getRowCount());
        System.out.println(DBUtils.getRowList(query));
        DBUtils.closeConnection();


    }




}
