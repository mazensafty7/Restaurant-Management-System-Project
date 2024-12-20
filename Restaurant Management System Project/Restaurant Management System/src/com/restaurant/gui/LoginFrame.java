package com.restaurant.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginFrame extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public LoginFrame() {
        // Set title and window properties
        setTitle("Restaurant Management - Login");
        setSize(1200, 800);  // Adjusted window size for better proportions
        setLocationRelativeTo(null);  // Center the window on screen
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);  // Prevent resizing

        // Set up the panel with GridBagLayout for better control over component positioning
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        panel.setBackground(new Color(40, 40, 40)); // Darker background for better contrast

        // Create and add labels and text fields
        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField(20);
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField(20);
        loginButton = new JButton("Login");

        // Customize components (e.g., fonts, colors)
        usernameLabel.setFont(new Font("Roboto", Font.PLAIN, 16)); // Changed font to Roboto
        passwordLabel.setFont(new Font("Roboto", Font.PLAIN, 16)); // Changed font to Roboto
        usernameField.setFont(new Font("Roboto", Font.PLAIN, 16));
        passwordField.setFont(new Font("Roboto", Font.PLAIN, 16));
        loginButton.setFont(new Font("Roboto", Font.BOLD, 16));

        // Set custom colors
        usernameLabel.setForeground(Color.WHITE);
        passwordLabel.setForeground(Color.WHITE);

        usernameField.setBackground(new Color(240, 240, 240)); // Light background for text field
        passwordField.setBackground(new Color(240, 240, 240)); // Light background for password field
        usernameField.setForeground(Color.BLACK);
        passwordField.setForeground(Color.BLACK);

        loginButton.setBackground(new Color(70, 130, 180)); // Blue background for button
        loginButton.setForeground(Color.WHITE);
        loginButton.setFocusPainted(false);
        loginButton.setBorder(BorderFactory.createLineBorder(new Color(70, 130, 180))); // Match the border to button color

        // Add components to the panel with positioning
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(usernameLabel, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 2;  // Make the text field span across the grid
        panel.add(usernameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(passwordLabel, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 2;  // Make the text field span across the grid
        panel.add(passwordField, gbc);

        // Add space between text fields
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(new JLabel(), gbc);  // Empty label to add space

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 3; // Make the login button span all columns
        gbc.insets = new Insets(20, 0, 0, 0); // Add some margin above the button
        panel.add(loginButton, gbc);

        // Add the panel to the frame's content pane
        add(panel, BorderLayout.CENTER);

        // Set up login button action
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Login logic
                String username = usernameField.getText();
                char[] password = passwordField.getPassword();
                String passwordStr = new String(password);

                if (username.equals("mazen") && passwordStr.equals("3356")) {
                    JOptionPane.showMessageDialog(LoginFrame.this, "Login successful!", "Success", JOptionPane.INFORMATION_MESSAGE);

                    // Open the main frame after successful login
                    MainFrame mainFrame = new MainFrame();
                    mainFrame.setVisible(true);
                    LoginFrame.this.dispose();  // Close the login frame
                } else {
                    JOptionPane.showMessageDialog(LoginFrame.this, "Invalid username or password.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1178, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 681, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
     // Main method to launch the login frame
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                LoginFrame frame = new LoginFrame();
                frame.setVisible(true);
            }
        });
    }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

