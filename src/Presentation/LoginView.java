package Presentation;

import javax.swing.*;
import java.awt.*;

public class LoginView {

    private JFrame frame;
    private JPanel jpMain, jpCentral, jpUsername, jpPassword, jpButtons, jpWrapper;
    private JLabel jlTitle, jlUsername, jlPassword, jlUsernameInstruction, jlPasswordInstruction;
    private JButton jbLogIn, jbSignUp, jbForgotPassword;

    private final int WIDTH_MAIN_FRAME = 1150;
    private final int HEIGHT_MAIN_FRAME = 800;
    private final int USERNAME_OPTION = 1;
    private final int PASSWORD_OPTION = 2;

    public LoginView() {
        frame = new JFrame("Login");

        //Panels
        jpMain = new JPanel();
        jpCentral = new JPanel();
        jpUsername = new JPanel();
        jpPassword = new JPanel();
        jpButtons = new JPanel();
        jpWrapper = new JPanel();

        //Labels
        jlTitle = new JLabel("LOG IN");
        jlUsername = new JLabel("Username");
        jlPassword = new JLabel("Password");
        jlUsernameInstruction = new JLabel("Must exist.");
        jlPasswordInstruction = new JLabel("Insert the password corresponding to the username.");

        //Buttons
        jbLogIn = new JButton("Log In");
        jbSignUp = new JButton("Don't have an account yet?\nSign up");
        jbForgotPassword = new JButton("Forgot Password?");

    }

    public void showLoginView() {
        frame = new JFrame("Login View");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH_MAIN_FRAME, HEIGHT_MAIN_FRAME);

        setMainPanel();
        frame.add(jpMain);
        frame.setVisible(true);

    }

    public void setMainPanel() {
        setTitle();
        setCenterPanel();
        setButtons();

        jpMain.setLayout(new BorderLayout());
        jpMain.add(jlTitle, BorderLayout.NORTH);
        jpMain.add(jpWrapper, BorderLayout.CENTER);
        jpMain.add(jpButtons, BorderLayout.SOUTH);
    }

    public void setTitle() {
        jlTitle.setFont(new Font("Times New Roman", Font.BOLD, 50));
        jlTitle.setBorder(BorderFactory.createEmptyBorder(50, 50, 10, 50));
        jlTitle.setHorizontalAlignment(JLabel.CENTER);
    }

    public void setCenterPanel() {
        jpUsername = setInformationPanel(USERNAME_OPTION);
        jpPassword = setInformationPanel(PASSWORD_OPTION);

        jpCentral.setLayout(new BoxLayout(jpCentral, BoxLayout.Y_AXIS));
        jpCentral.setBorder(BorderFactory.createEmptyBorder(0, 100, 0, 70));
        jpCentral.setAlignmentX(Component.CENTER_ALIGNMENT);
        jpCentral.setAlignmentY(Component.CENTER_ALIGNMENT);

        jpCentral.add(jpUsername);
        jpCentral.add(jpPassword);

        jpWrapper.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.NORTH;
        gbc.weighty = 1;
        gbc.insets = new Insets(70, 0, 0, 0);
        jpWrapper.add(jpCentral, gbc);
    }

    public JPanel setInformationPanel(int option) {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(0, 0, 40, 0));

        JLabel topLabel = new JLabel();
        JLabel descriptionLabel = new JLabel();
        JTextField jtfInformation = new JTextField();

        topLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        descriptionLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        jtfInformation.setAlignmentX(Component.LEFT_ALIGNMENT);

        jtfInformation.setPreferredSize(new Dimension(300, 50));

        switch (option) {
            case USERNAME_OPTION:
                topLabel.setText("Username");
                descriptionLabel.setText("Must exist.");
            break;

            case PASSWORD_OPTION:
                topLabel.setText("Password");
                descriptionLabel.setText("Insert the password corresponding to the username.");
            break;
        }

        panel.add(topLabel);
        panel.add(jtfInformation);
        panel.add(descriptionLabel);

        return panel;
    }


    public void setButtons() {

    }



}
