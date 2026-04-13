import Persistence.sql.SQLConnector;
import Presentation.controllers.AppController;
import Presentation.views.LoginView;
import Presentation.views.MainFrame;
import Presentation.views.StatsView;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new AppController();
        });



        /*
        SQLConnector db = SQLConnector.getInstance();

        if (db != null) {
            System.out.println("Connection successful!");

            ResultSet rs = db.selectQuery("SELECT * FROM user");

            try {
                while (rs.next()) {
                    // Replace with your actual column names
                    System.out.println(rs.getString("user_id") + " " + rs.getString("password"));
                }
            } catch (SQLException e) {
                System.err.println("Error reading results --> " + e.getMessage());
            }

            db.disconnect();

        } else {
            System.err.println("Connection failed!");
        }

*/
        // VIEW TESTING
        //String[] options = {"1", "2", "3"};
       //StatsView statsView = new StatsView(options, options);
       //statsView.showStatsView();


    }
}