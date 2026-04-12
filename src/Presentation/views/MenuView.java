package Presentation.views;

import Business.JImagePanel;

import javax.swing.*;
import java.awt.*;

public class MenuView extends View {
    private JImagePanel jipMain;
    private JPanel jpTop,jpCentre,jpBot;
    private JLabel jlTitleTop, jlTitleBottom;

    //COLOR CONSTANTS
    private final Color BACKGROUND_BUTTON = new Color(103, 51, 25);
    private final Color BACKGROUND_BUTTON_PRESSED = new Color(214, 196, 171);

    //IMAGES
    private final String BACKGROUND_URL = "src/Presentation/Images/background.jpg";

    @Override
    public void showView() {setVisible(true);}

    @Override
    public void hideView() {setVisible(false);}

    public MenuView(){
        //panels
        jipMain = new JImagePanel(BACKGROUND_URL);
        jpTop = new JPanel();
        jpCentre = new JPanel();
        jpBot = new JPanel();

        //labels
        jlTitleTop = new JLabel("WELCOME TO");
        jlTitleBottom = new JLabel("COFFEE CLICKER");

        setJipMain();
    }

    private void setJipMain() {
        setJpTop();
        setJpCentre();;
        setJpBot();;

        jipMain.setLayout(new BorderLayout());
        jipMain.setOpacityValue(0.5f);  //test use
        jipMain.add(jpTop, BorderLayout.NORTH);
        jipMain.add(jpCentre, BorderLayout.CENTER);
        jipMain.add(jpBot, BorderLayout.SOUTH);

        setLayout(new BorderLayout());
        add(jipMain, BorderLayout.CENTER);
    }

    private void setJpTop() {
        jpTop.setLayout(new BoxLayout(jpTop, BoxLayout.Y_AXIS));
        jpTop.setOpaque(false);
        jpTop.setBorder(BorderFactory.createEmptyBorder(40,0,20,0));

        jlTitleTop.setFont(new Font("Comic Sans MS", Font.BOLD, 60));
    }

    private void setJpCentre() {

    }

    private void setJpBot() {

    }


}
