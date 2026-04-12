package Presentation.views;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    CardLayout cardLayout = new CardLayout();
    private LoginView loginView;
    private RegisterView registerView;
    private StatsView statsView;

    private final int WIDTH_MAIN_FRAME = 1150;
    private final int HEIGHT_MAIN_FRAME = 800;


    private void configureFrame() {
        setSize(WIDTH_MAIN_FRAME, HEIGHT_MAIN_FRAME);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContent();
    }

    public void showMainFrame() {
        configureFrame();
        setVisible(true);
    }

    private void setContent() {
        JPanel mainPanel = new JPanel(cardLayout);

        loginView =  new LoginView();
        registerView =  new RegisterView();
        statsView = new StatsView();


        mainPanel.add(loginView, "loginView");
        mainPanel.add(registerView, "registerView");

        loginView.getSingUpButton().addActionListener(e -> {
            cardLayout.show(mainPanel, "registerView");
        });

        registerView.getLogInButton().addActionListener(e -> {
            cardLayout.show(mainPanel, "loginView");
        });


        cardLayout.show(mainPanel, "loginView");
        add(mainPanel);
    }
}
