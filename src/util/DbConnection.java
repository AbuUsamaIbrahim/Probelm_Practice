package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbConnection {
    public static void main(String [] args){
        try {
//            Class.forName("oracle.jdbc.driver.OracleDriver");
            String oracleJdbcUrl  = "jdbc:oracle:thin:@192.168.27.253:1523:db1";
            String userName = "testing_130721";
            String password = "testing";
            Connection connection = DriverManager.getConnection( oracleJdbcUrl,userName,password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM CUSTOMER_ZONE");
            while (resultSet.next()){
                System.out.println(resultSet.getString((3)));
            }
            connection.close();

        }catch (Exception e){
            System.out.println(e);
        }

    }
}
