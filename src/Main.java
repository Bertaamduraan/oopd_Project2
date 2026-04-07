import Persistence.sql.SQLConnector;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        SQLConnector db = SQLConnector.getInstance();

        if (db != null) {
            System.out.println("Connection successful!");

            ResultSet rs = db.selectQuery("SELECT * FROM user");

            try {
                while (rs.next()) {
                    // Replace with your actual column names
                    System.out.println(rs.getString("column1") + " " + rs.getString("column2"));
                }
            } catch (SQLException e) {
                System.err.println("Error reading results --> " + e.getMessage());
            }

            db.disconnect();

        } else {
            System.err.println("Connection failed!");
        }
    }
}