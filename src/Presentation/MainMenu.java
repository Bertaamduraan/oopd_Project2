package Presentation;

import javax.swing.*;
import java.awt.*;

public class MainMenu extends JFrame {
    private JPanel sidebar;
    private boolean visible = false;
    private final int SIDEBAR_WIDTH = 200;

    public MainMenu(String username) {
            setTitle("Sidebar derecha");
            setSize(600, 400);
            setDefaultCloseOperation(EXIT_ON_CLOSE);

            JLayeredPane layeredPane = getLayeredPane();

            // Panel principal
            JPanel mainPanel = new JPanel();
            mainPanel.setBackground(Color.WHITE);
            mainPanel.setBounds(0, 0, 600, 400);
            layeredPane.add(mainPanel, JLayeredPane.DEFAULT_LAYER);

            // Sidebar (empieza fuera por la derecha)
            sidebar = new JPanel();
            sidebar.setLayout(new BoxLayout(sidebar, BoxLayout.Y_AXIS));
            sidebar.setBackground(new Color(40, 40, 40));
            sidebar.setBounds(600, 0, SIDEBAR_WIDTH, 400);
            layeredPane.add(sidebar, JLayeredPane.PALETTE_LAYER);

            // Botones del menú
            sidebar.add(createButton("Perfil"));
            sidebar.add(createButton("Configuración"));
            sidebar.add(createButton("Cerrar sesión"));

            // Botón ⋮ arriba a la derecha
            JButton menuButton = new JButton("⋮");
            menuButton.setBounds(540, 10, 50, 30);
            layeredPane.add(menuButton, JLayeredPane.MODAL_LAYER);

            menuButton.addActionListener(e -> toggleSidebar());

            setLayout(null);
        }

        private JButton createButton(String text) {
            JButton btn = new JButton(text);
            btn.setAlignmentX(Component.CENTER_ALIGNMENT);
            return btn;
        }

        private void toggleSidebar() {
            int frameWidth = getWidth();
            int targetX = visible ? frameWidth : frameWidth - SIDEBAR_WIDTH;
            visible = !visible;

            new Thread(() -> {
                int x = sidebar.getX();

                while (x != targetX) {
                    x += (targetX > x) ? 5 : -5;
                    sidebar.setLocation(x, 0);

                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException ignored) {}
                }

                sidebar.setLocation(targetX, 0);
            }).start();
        }
    }
