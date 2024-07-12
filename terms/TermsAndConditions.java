package terms;

import rules.Rules;

import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.util.HashMap;
import java.util.Map;

public class TermsAndConditions extends JFrame {

    private JTextArea textArea;
    private JCheckBox checkBox;
    private JTextField nameField;
    private JButton acceptButton;
    public static String name ;
    public static String subject;

    private static Map<String, TermsAndConditions> instances = new HashMap<>();
    // Singleton instance getter
   public static TermsAndConditions getInstance(String subject) {
    if (!instances.containsKey(subject)) {
        instances.put(subject, new TermsAndConditions(subject));
    }
    return instances.get(subject);
}

    public TermsAndConditions(String subject) {
        TermsAndConditions.subject=subject;
        setTitle("Terms and Conditions");
        setUndecorated(true);
//        setAlwaysOnTop(true);
        setLayout(null);

        textArea = new JTextArea();
        textArea.setText("""
                         Terms and Conditions:
                         1. The quiz app is for personal use only.
                         2. You must be a human to use the app.
                         3. Questions may contain errors dont mind - rather verify.
                         4. You agree to use the app at your own risk.""");
        textArea.setOpaque(false);
        textArea.setEditable(false);
        textArea.setBounds(20, 20, 360, 150);
        add(textArea);

        checkBox = new JCheckBox("I accept the terms and conditions");
        checkBox.setBounds(20, 180, 280, 20);
        checkBox.setFont(new Font("Tahoma", Font.BOLD, 14));
        checkBox.addActionListener((ActionEvent e) -> {
            if (checkBox.isSelected())
                acceptButton.setEnabled(true);
        });
        add(checkBox);

        nameField = new JTextField("");
        nameField.setBounds(20, 240, 200, 25);
        add(nameField);

        JLabel nameLabel = new JLabel("Name");
        nameLabel.setBounds(20, 210, 40, 20);
        add(nameLabel);

        acceptButton = new JButton("Accept");
        acceptButton.setBounds(240, 240, 80, 25);
        acceptButton.setEnabled(false);
        acceptButton.addActionListener((ActionEvent e) -> {
            String inputName = nameField.getText().trim();
            if (checkBox.isSelected() && !inputName.isBlank()) {
                name = inputName;
                nameField.setText("");
                checkBox.setSelected(false);
                setVisible(false);
                dispose();
                new Rules(name, subject).setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Please enter your name and accept the terms.");
            }
        });
        add(acceptButton);

        setSize(400, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }

   
}
