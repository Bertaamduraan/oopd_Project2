import Persistence.sql.SQLConnector;
import Presentation.views.LoginView;
import Presentation.views.MainFrame;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        /*
        SwingUtilities.invokeLater(. {

        });
        */
        MainFrame mFrame = new MainFrame();
        mFrame.showMainFrame();

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


        // VIEW TESTING
        LoginView loginView = new LoginView();
        loginView.showLoginView();
        */

    }
}