package com.naresh.password;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PasswordGeneratorUI extends JFrame {
    private JTextField passwordField;

    // Constructor
    public PasswordGeneratorUI() {
        passwordField = new JTextField();
        setLayout(new BorderLayout());

        // Result box
        add(passwordField, BorderLayout.CENTER);

        // Generate button
        JButton generateButton = new JButton("Refresh");
        generateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                passwordField.setText(generatePassword());
            }
        });

        // Add components to the frame
        JPanel panel = new JPanel(new FlowLayout());
        panel.add(generateButton);
        add(panel, BorderLayout.SOUTH);

        // Initial password generation
        passwordField.setText(generatePassword());
        passwordField.setText(BorderLayout.CENTER);
    }

    // Generate password
    private String generatePassword() {
        PasswordGenerator passwordGenerator = new PasswordGenerator();
        return passwordGenerator.generatePassword();
    }

    // Main method
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PasswordGeneratorUI gui = new PasswordGeneratorUI();
            gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            gui.pack();
            gui.setVisible(true);
        });
    }
}
