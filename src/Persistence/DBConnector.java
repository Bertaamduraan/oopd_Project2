package Persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {

    private static Connection con;

    public static Connection getConection() {

        try {
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test",
                    "root", ""
            );
        } catch (SQLException e) {
            System.out.println("Error when connecting: " + e.getMessage());
        }
       return con;
    }
}
