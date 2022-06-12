package Pokedex_MySQL_JDBC;
//import jdbc drivers

import com.sun.java.util.jar.pack.DriverResource;

import java.sql.*;

public class Main {
    //create a connection to the database
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pokedex","root","");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from pokemon");

        } catch (Exception e) {
           e.printStackTrace();
        }
    }
}


