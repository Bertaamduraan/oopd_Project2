package Presentation.controllers;

import Presentation.views.LoginView;
import Presentation.views.MainFrame;

import javax.swing.*;

public class AppController {
    static private MainFrame mainFrame;
    static private UserController userController;
    static private GameController gameController;
    static private StatsController statsController;

    public AppController() {
        mainFrame = new MainFrame(this);
        mainFrame.showMainFrame();
        userController = new UserController(this, new LoginView());
        gameController = new GameController();
        statsController = new StatsController();
    }

    public void switchToCard(String cardName) {
        mainFrame.switchCard(cardName);
    }
}
