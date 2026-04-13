package Presentation.views;

import java.awt.*;

public class MenuView extends View {

    public MenuView() {
        setBackground(Color.RED);
    }

    @Override
    public void showView() {
        setVisible(true);
    }

    @Override
    public void hideView() {
        setVisible(false);
    }
}
