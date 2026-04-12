package Presentation.views;

import Business.JImagePanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MenuView extends View {
    private JImagePanel jipMain;
    private JPanel jpTop,jpCentre,jpBot;
    private JImagePanel jipTitleTop, jipTitleBottom, jipCoffeeCup;
    private JButton jbPlay, jbStats, jbConfig;

    //DIMENSION CONSTANTS
    private final Dimension DIMENSION_BUTTON= new Dimension(150, 50);

    //COLOR CONSTANTS
    private final Color BACKGROUND_BUTTON = new Color(103, 51, 25);
    private final Color BACKGROUND_BUTTON_PRESSED = new Color(214, 196, 171);

    //IMAGES
    private final String BACKGROUND_URL = "src/Presentation/Images/background.jpg";
    private final String TITLE_TOP_URL = "src/Presentation/Images/welcome_to.png";
    private final String TITLE_BOT_URL = "src/Presentation/Images/title.png";
    private final String COFFEE_CUP = "src/Presentation/Images/coffee_cup.png";


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
        //jipTitleTop = new JLabel("WELCOME TO");
        //jipTitleBottom = new JLabel("COFFEE CLICKER");

        //images
        jipTitleTop = new JImagePanel(TITLE_TOP_URL);
        jipTitleBottom = new JImagePanel(TITLE_BOT_URL);
        jipCoffeeCup = new JImagePanel(COFFEE_CUP);

        //buttons
        jbPlay = new JButton("PLAY");
        jbStats = new JButton("STATS");
        jbConfig = new JButton("CONFIG");

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
        jpTop.setPreferredSize(new Dimension(getWidth(), 200));
        
        //text version
        /*
        jipTitleTop.setFont(new Font("Comic Sans MS", Font.BOLD, 60));
        jipTitleTop.setForeground(BACKGROUND_BUTTON);
        jipTitleTop.setAlignmentX(Component.CENTER_ALIGNMENT);
        jipTitleTop.setHorizontalAlignment(JLabel.CENTER);

        jipTitleBottom.setFont(new Font("Comic Sans MS", Font.ITALIC, 30));
        jipTitleBottom.setForeground(BACKGROUND_BUTTON_PRESSED);
        jipTitleBottom.setAlignmentX(Component.CENTER_ALIGNMENT);
        jipTitleBottom.setHorizontalAlignment(JLabel.CENTER);
        */

        jipTitleTop.setAlignmentX(Component.CENTER_ALIGNMENT);
        jipTitleTop.setOpaque(false);
        jipTitleBottom.setAlignmentX(Component.CENTER_ALIGNMENT);
        jipTitleBottom.setOpaque(false);
        jipTitleTop.setPreferredSize(new Dimension(400, 80));
        jipTitleTop.setMaximumSize(new Dimension(400, 80));
        jipTitleBottom.setPreferredSize(new Dimension(600, 100));
        jipTitleBottom.setMaximumSize(new Dimension(600, 100));

        jpTop.add(jipTitleTop);
        jpTop.add(Box.createVerticalStrut(10));
        jpTop.add(jipTitleBottom);

    }

    private void setJpCentre() {
        jpCentre.setLayout(new BoxLayout(jpCentre, BoxLayout.Y_AXIS));
        jpCentre.setOpaque(false);

        jipCoffeeCup.setAlignmentX(Component.CENTER_ALIGNMENT);
        jipCoffeeCup.setOpaque(false);
        jipCoffeeCup.setPreferredSize(new Dimension(250,300));
        jipCoffeeCup.setMaximumSize(new Dimension(250,300));

        jpCentre.add(jipCoffeeCup);
    }

    private void setJpBot() {
        jpBot.setLayout(new FlowLayout(FlowLayout.CENTER,40,40));
        jpBot.setOpaque(false);
        jpBot.setBorder(BorderFactory.createEmptyBorder(20,0,40,0));

        setButton(jbPlay,DIMENSION_BUTTON);
        setButton(jbStats,DIMENSION_BUTTON);
        setButton(jbConfig,DIMENSION_BUTTON);

        jpBot.add(jbPlay);
        jpBot.add(jbStats);
        jpBot.add(jbConfig);
    }

    private void setButton(JButton button, Dimension dimension) {
        button.setPreferredSize(dimension);
        button.setMaximumSize(dimension);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        button.setAlignmentY(Component.CENTER_ALIGNMENT);
        button.setBackground(BACKGROUND_BUTTON);
        button.setOpaque(true);
        button.setContentAreaFilled(true);

        //for macOS users - fixes gray default button TODO fix
        button.setBorderPainted(false);

        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                button.setBackground(BACKGROUND_BUTTON_PRESSED);
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                button.setBackground(BACKGROUND_BUTTON);
            }
        });
    }


}
