package Presentation.views;

import Business.JImagePanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RegisterView extends View {
    private JImagePanel jpiMain;
    private JPanel jpCentral, jpUsername, jpPassword, jpButtons, jpLogin;
    private JLabel jlTitle;
    private JTextField jtfUsername;
    private JPasswordField jtfPassword;

    //DIMENSION CONSTANTS
    private final Dimension DIMENSION_TEXTFIELD = new Dimension(300, 50);
    private final Dimension DIMENSION_BUTTON_LOGIN = new Dimension(150, 40);
    private final Dimension DIMENSION_BUTTON_SIGNIN = new Dimension(250, 50);

    //COLOR CONSTANTS
    private final Color BACKGROUND_BUTTON = new Color(103, 51, 25);
    private final Color BACKGROUND_BUTTON_PRESSED = new Color(214, 196, 171);

    //IMAGES
    private final String BACKGROUND_URL = "src/Presentation/Images/background.jpg";

    public RegisterView() {
        //Panels
        jpiMain = new JImagePanel(BACKGROUND_URL);
        jpCentral = new JPanel();
        jpUsername = new JPanel();
        jpPassword = new JPanel();
        jpButtons = new JPanel();
        jpLogin = new JPanel();

        //Labels
        jlTitle = new JLabel("SIGN UP");

        //Text fields
        jtfUsername = new JTextField();
        jtfPassword = new JPasswordField();

        setMainPanel();
    }

    @Override
    public void showView() {
        setVisible(true);
    }

    @Override
    public void hideView() {
        setVisible(true);
    }

    private void setMainPanel() {
        setTitle();
        setCenterPanel();
        setButtons();

        jpiMain.setLayout(new BorderLayout());
        jpiMain.setOpacityValue(0.5f);
        jpiMain.add(jlTitle, BorderLayout.NORTH);
        jpiMain.add(jpCentral, BorderLayout.CENTER);

        setLayout(new BorderLayout());
        add(jpiMain, BorderLayout.CENTER);
    }

    private void setTitle() {
        jlTitle.setFont(new Font("Times New Roman", Font.BOLD, 50));
        jlTitle.setBorder(BorderFactory.createEmptyBorder(50, 50, 10, 50));
        jlTitle.setHorizontalAlignment(JLabel.CENTER);
    }

    private void setCenterPanel() {
        setUsernamePanel();
        setPasswordPanel();
        setLogInPanel();

        jpCentral.setLayout(new BoxLayout(jpCentral, BoxLayout.Y_AXIS));
        jpCentral.setBorder(BorderFactory.createEmptyBorder(60, 0, 0, 0));
        jpCentral.setOpaque(false);

        jpUsername.setAlignmentX(Component.CENTER_ALIGNMENT);
        jpPassword.setAlignmentX(Component.CENTER_ALIGNMENT);

        jpCentral.add(jpUsername);
        jpCentral.add(jpPassword);
        jpCentral.add(jpLogin);

    }

    private void setUsernamePanel() {
        jpUsername.setLayout(new BoxLayout(jpUsername, BoxLayout.Y_AXIS));
        jpUsername.setBorder(BorderFactory.createEmptyBorder(0, 0, 40, 0));

        JLabel topLabel = new JLabel("Username: ");

        topLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        topLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
        setUsernameTextField();

        jpUsername.setOpaque(false);

        jpUsername.add(topLabel);
        jpUsername.add(jtfUsername);
    }

    private void setPasswordPanel() {
        jpPassword.setLayout(new BoxLayout(jpPassword, BoxLayout.Y_AXIS));
        jpPassword.setBorder(BorderFactory.createEmptyBorder(0, 0, 40, 0));
        jpPassword.setOpaque(false);

        JLabel topLabel = new JLabel("Password: ");

        topLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        topLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
        setPasswordTextField();

        jpPassword.setOpaque(false);

        jpPassword.add(topLabel);
        jpPassword.add(jtfPassword);
    }

    private void setUsernameTextField() {
        jtfUsername.setAlignmentX(Component.LEFT_ALIGNMENT);

        jtfUsername.setPreferredSize(DIMENSION_TEXTFIELD);
        jtfUsername.setMaximumSize(DIMENSION_TEXTFIELD);
        jtfUsername.setBackground(BACKGROUND_BUTTON);

        //TODO: CHECK IF THIS GOES HERE
        jtfUsername.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                jtfUsername.setBackground(BACKGROUND_BUTTON_PRESSED);
                jtfUsername.setForeground(Color.BLACK);
            }

            @Override
            public void focusLost(FocusEvent e) {
                jtfUsername.setBackground(BACKGROUND_BUTTON);
                jtfUsername.setForeground(Color.WHITE);
            }
        });

        jtfUsername.setBorder(
                BorderFactory.createCompoundBorder(
                        BorderFactory.createLineBorder(Color.BLACK, 2),
                        BorderFactory.createEmptyBorder(0, 10, 0, 0)
                )
        );

    }

    private void setPasswordTextField() {
        jtfPassword.setAlignmentX(Component.LEFT_ALIGNMENT);
        jtfPassword.setPreferredSize(DIMENSION_TEXTFIELD);
        jtfPassword.setMaximumSize(DIMENSION_TEXTFIELD);
        jtfPassword.setBackground(BACKGROUND_BUTTON);

        //TODO: CHECK IF THIS GOES HERE
        jtfPassword.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                jtfPassword.setBackground(BACKGROUND_BUTTON_PRESSED);
                jtfPassword.setForeground(Color.BLACK);
            }

            @Override
            public void focusLost(FocusEvent e) {
                jtfPassword.setBackground(BACKGROUND_BUTTON);
                jtfPassword.setForeground(Color.WHITE);
            }
        });

        jtfPassword.setBorder(
                BorderFactory.createCompoundBorder(
                        BorderFactory.createLineBorder(Color.BLACK, 2),
                        BorderFactory.createEmptyBorder(0, 10, 0, 0)
                )
        );

    }

    private void setLogInPanel() {
        jpLogin = new JPanel(new FlowLayout(FlowLayout.CENTER));

        jpLogin.setOpaque(false);

    }

    private void setButtons() {
        jpButtons.setLayout(new BoxLayout(jpButtons, BoxLayout.Y_AXIS));
        jpButtons.setBorder(BorderFactory.createEmptyBorder(0, 0, 30, 0));
        jpButtons.setOpaque(false);

        jpButtons.add(Box.createVerticalStrut(10));
    }

}
