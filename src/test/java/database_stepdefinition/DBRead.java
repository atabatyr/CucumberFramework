package database_stepdefinition;

import io.cucumber.java.en.Given;
import org.junit.Assert;

import java.sql.*;

public class DBRead {
    //URL FOR OUR SQL SERVER
    String url="jdbc:sqlserver://184.168.194.58:1433;databaseName=kaolapalacedb;user=Ahmet_User;password=Ahmet123!";
    String username="Ahmet_User";
    String password="Ahmet123!";

    Connection connection; //TO connect to the database
    Statement statement; // TO execute Query and get data
    ResultSet resultSet;

    @Given("user connects to the database")
    public void user_connects_to_the_database() throws SQLException {

        connection= DriverManager.getConnection(url,username,password);
        statement=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);

    }

    @Given("user gets {string} the {string} table")
    public void user_gets_the_table(String string, String string2) throws SQLException {

        //Running the query to connect tHotel table. we use dbo
        //Dynamic QUERY: SELECT Name from dbo.tHotel
        //resultSet=statement.executeQuery("Select Name from dbo.tHotel");
        resultSet=statement.executeQuery("Select "+string+" from dbo.t"+string2);

    }

    @Given("user reads all rows in the {string} column")
    public void user_reads_all_rows_in_the_column(String string) throws SQLException {

//        resultSet.next();//Skipping the first row .next() methods goes to the next row
//        resultSet.next();
//        resultSet.next();
//        Object object1=resultSet.getObject("Name");
//        System.out.println(object1);
//        resultSet.next();
//        System.out.println(resultSet.getObject("Name"));
//
//        resultSet.next();
//        System.out.println(resultSet.getObject("Name"));

        while(resultSet.next()){
            Object obj=resultSet.getObject(string);
            System.out.println(obj);
//            if(obj.toString().equals("SUNSET")){ //if there is a Hotel Name SUNSET it fails
//                Assert.fail();
//            }
        }

    }

    @Given("user gets the value in row {int} in {string} column and verifies the value is {string}")
    public void user_gets_the_value_in_row_in_column_and_verifies_the_value_is(Integer int1, String string, String string2) throws SQLException {

        resultSet.absolute(int1);// absolute go to the certain row
//        Object obj=resultSet.getObject(string);//going to the column and taking as obj
//        Assert.assertEquals(string2,obj.toString());
        String str=resultSet.getString(string);//going to the column and taking it as String
        Assert.assertEquals(string2,str);


    }



}
