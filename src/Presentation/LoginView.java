package Presentation;

import javax.swing.*;
import java.awt.*;

public class LoginView {

    private JFrame frame;
    private JPanel jpMain, jpCentral, jpUsername, jpPassword, jpButtons, jpLogin;
    private JLabel jlTitle;
    private JButton jbLogIn, jbSignUp, jbForgotPassword;

    private final int WIDTH_MAIN_FRAME = 1150;
    private final int HEIGHT_MAIN_FRAME = 800;
    private final Color BACKGROUND_BUTTON = new Color(103, 51, 25);
    private final Color BACKGROUND_BUTTON_PRESSED = new Color(214, 196, 171);

    public LoginView() {
        frame = new JFrame("Login");

        //Panels
        jpMain = new JPanel();
        jpCentral = new JPanel();
        jpUsername = new JPanel();
        jpPassword = new JPanel();
        jpButtons = new JPanel();
        jpLogin = new JPanel();

        //Labels
        jlTitle = new JLabel("LOG IN");

        //Buttons
        jbLogIn = new JButton("Log In");
        jbSignUp = new JButton("Don't have an account yet? \nSign up");
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
        jpMain.add(jpCentral, BorderLayout.CENTER);
        jpMain.add(jpButtons, BorderLayout.SOUTH);
    }

    public void setTitle() {
        jlTitle.setFont(new Font("Times New Roman", Font.BOLD, 50));
        jlTitle.setBorder(BorderFactory.createEmptyBorder(50, 50, 10, 50));
        jlTitle.setHorizontalAlignment(JLabel.CENTER);
    }

    public void setCenterPanel() {

        setUsernamePanel();
        setPasswordPanel();
        setLogInPanel();

        jpCentral.setLayout(new BoxLayout(jpCentral, BoxLayout.Y_AXIS));
        jpCentral.setBorder(BorderFactory.createEmptyBorder(60, 0, 0, 0));

        jpUsername.setAlignmentX(Component.CENTER_ALIGNMENT);
        jpPassword.setAlignmentX(Component.CENTER_ALIGNMENT);

        jpCentral.add(jpUsername);
        jpCentral.add(jpPassword);
        jpCentral.add(jpLogin);


    }

    public void setUsernamePanel() {
        jpUsername.setLayout(new BoxLayout(jpUsername, BoxLayout.Y_AXIS));
        jpUsername.setBorder(BorderFactory.createEmptyBorder(0, 0, 40, 0));

        JLabel topLabel = new JLabel("Username: ");
        JTextField jtfInformation = new JTextField();

        topLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        jtfInformation.setAlignmentX(Component.LEFT_ALIGNMENT);

        jtfInformation.setPreferredSize(new Dimension(300, 50));
        jtfInformation.setMaximumSize(new Dimension(300, 50));

        jpUsername.add(topLabel);
        jpUsername.add(jtfInformation);
    }

    public void setPasswordPanel() {
        jpPassword.setLayout(new BoxLayout(jpPassword, BoxLayout.Y_AXIS));
        jpPassword.setBorder(BorderFactory.createEmptyBorder(0, 0, 40, 0));

        JLabel topLabel = new JLabel("Password: ");
        JTextField jtfInformation = new JPasswordField();

        topLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        jtfInformation.setAlignmentX(Component.LEFT_ALIGNMENT);

        jtfInformation.setPreferredSize(new Dimension(300, 50));
        jtfInformation.setMaximumSize(new Dimension(300, 50));

        jpPassword.add(topLabel);
        jpPassword.add(jtfInformation);
    }

    public void setLogInPanel() {
        jpLogin = new JPanel(new FlowLayout(FlowLayout.CENTER));

        jbLogIn.setPreferredSize(new Dimension(150, 40));
        jbLogIn.setAlignmentX(Component.CENTER_ALIGNMENT);
        jbLogIn.setAlignmentY(Component.CENTER_ALIGNMENT);

        jbLogIn.setBackground(BACKGROUND_BUTTON_PRESSED);
        jbLogIn.setOpaque(true);
        jbLogIn.setContentAreaFilled(true);

        jpLogin.add(jbLogIn);
    }

    public void setButtons() {
        jpButtons.setLayout(new BoxLayout(jpButtons, BoxLayout.Y_AXIS));
        jpButtons.setBorder(BorderFactory.createEmptyBorder(0, 0, 30, 0));

        jbSignUp.setPreferredSize(new Dimension(250, 50));
        jbSignUp.setMaximumSize(new Dimension(250, 50));
        jbSignUp.setAlignmentX(Component.CENTER_ALIGNMENT);
        jbSignUp.setAlignmentY(Component.CENTER_ALIGNMENT);

        jbForgotPassword.setPreferredSize(new Dimension(250, 50));
        jbForgotPassword.setMaximumSize(new Dimension(150, 50));
        jbForgotPassword.setAlignmentX(Component.CENTER_ALIGNMENT);
        jbForgotPassword.setAlignmentY(Component.CENTER_ALIGNMENT);

        jpButtons.add(jbSignUp);
        jpButtons.add(jbForgotPassword);
    }



}
