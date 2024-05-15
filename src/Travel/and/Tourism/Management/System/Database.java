package Travel.and.Tourism.Management.System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Database {
    Connection connection;
    Statement statement;

    Database(){

        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/travel","root","nabajit9");
            statement=connection.createStatement();

        }
        catch (Exception exception){
            exception.printStackTrace();
        }

    }
}
