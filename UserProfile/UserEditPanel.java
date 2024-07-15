package UserProfile;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class UserEditPanel extends JPanel {

    private JComboBox<ImageIcon> avatarComboBox;
    private JButton saveButton;
    private JTextField nicknameField;

    public UserEditPanel() {
        setupUI();
    }

    private void setupUI() {
        setLayout(new GridLayout(3, 2, 10, 10));
        JLabel nicknameLabel = new JLabel("Nickname:");
        nicknameField = new JTextField();
        JLabel avatarLabel = new JLabel("Choose Avatar:");
        avatarComboBox = new JComboBox<>();
        saveButton = new JButton("Save");

        
        String[] avatars = {"skull.png", "smiley.png", "skull-happy.png","skull-sad.png","skull-old.png"}; // Replace with actual file names
        for (String avatar : avatars) {
          
            ImageIcon icon = createImageIcon("usericons/" + avatar);
            if (icon != null) {
                avatarComboBox.addItem(icon);
            }
        }

        avatarComboBox.setRenderer(new AvatarComboBoxRenderer());

        add(nicknameLabel);
        add(nicknameField);
        add(avatarLabel);
        add(avatarComboBox);
        add(new JLabel()); 
        add(saveButton);

        saveButton.addActionListener((ActionEvent e) -> {
            String newNickname = nicknameField.getText();
            ImageIcon selectedAvatar = (ImageIcon) avatarComboBox.getSelectedItem();
            JOptionPane.showMessageDialog(UserEditPanel.this, "Changes saved successfully!");
        });
    }

    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = ClassLoader.getSystemResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }

    class AvatarComboBoxRenderer extends DefaultListCellRenderer {
        @Override
        public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
            JLabel label = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            if (value instanceof ImageIcon icon) {
                label.setIcon(icon);
                label.setText("");
            }
            return label;
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("User Edit Panel");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);
        frame.setLocationByPlatform(true);

        UserEditPanel editPanel = new UserEditPanel();
        frame.add(editPanel);

        frame.setVisible(true);
    }
}
