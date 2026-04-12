package Presentation.views;

import java.awt.*;

public class GameView extends View {

    //COLOR CONSTANTS
    private final Color BACKGROUND_BUTTON = new Color(103, 51, 25);
    private final Color BACKGROUND_BUTTON_PRESSED = new Color(214, 196, 171);

    //IMAGES
    private final String BACKGROUND_URL = "src/Presentation/Images/background.jpg";

    @Override
    public void showView() {setVisible(true);}

    @Override
    public void hideView() {setVisible(false);}
}
