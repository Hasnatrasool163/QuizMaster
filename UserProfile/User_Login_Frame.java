package UserProfile;


import frame.Menu;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class User_Login_Frame extends JFrame implements ActionListener {
    JButton register, login, guest, eyebtn;
    JTextField tfname;
    JPasswordField tfpassword;
    boolean toggle = false;
    ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("icons/openeye.png"));
    ImageIcon eyeicon = new ImageIcon(ClassLoader.getSystemResource("icons/closeeye.png"));
    
    private static User_Login_Frame instance;
    
    public static User_Login_Frame getInstance(){
        if(instance==null){
            instance = new User_Login_Frame();
        }
        return instance;
    }

    public User_Login_Frame() {
        setTitle("User-Login/Register-Screen");
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setLocationByPlatform(true);
        setAlwaysOnTop(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        requestFocus();

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 600, 500);
        add(image);

        JLabel heading = new JLabel("Learning World");
        heading.setBounds(720, 60, 400, 45);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);

        JLabel name = new JLabel("Enter your name");
        name.setBounds(810, 150, 300, 20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        name.setForeground(new Color(30, 144, 254));
        add(name);

        tfname = new JTextField();
        tfname.setBounds(735, 200, 300, 25);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        tfname.setToolTipText("Enter username here !");
        add(tfname);
        
        ImageIcon user1 = new ImageIcon(ClassLoader.getSystemResource("bettericons/user1.jpeg"));
        Image userImage = user1.getImage().getScaledInstance(100, 70,Image.SCALE_SMOOTH );
        ImageIcon user2 = new ImageIcon(userImage);
        ImageIcon password1= new ImageIcon(ClassLoader.getSystemResource("bettericons/key1.jpeg"));
        Image passwordImage = password1.getImage().getScaledInstance(100, 70,Image.SCALE_SMOOTH );
        ImageIcon password2 = new ImageIcon(passwordImage);
        JLabel userIcon = new JLabel(user2);
        userIcon.setBounds(610, 160, 100, 70);
        add(userIcon);
        JLabel passwordIcon = new JLabel(password2);
        passwordIcon.setBounds(610, 260, 100, 70);
        add(passwordIcon);

        JLabel password = new JLabel("Enter your password");
        password.setBounds(810, 250, 300, 20);
        password.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        password.setForeground(new Color(30, 144, 254));
        add(password);
        
        eyebtn = new JButton(eyeicon);
        eyebtn.setBackground(Color.WHITE);
        eyebtn.setBorderPainted(false);
        eyebtn.setForeground(Color.WHITE);
//        eyebtn.setDisabledIcon(icon);
        eyebtn.setBounds(1040, 305, 50, 20);
        add(eyebtn);
//        eyebtn.addActionListener(this);

        tfpassword = new JPasswordField();
        tfpassword.setBounds(735, 300, 300, 25);
        tfpassword.setFont(new Font("Times New Roman", Font.BOLD, 20));
        tfpassword.setToolTipText("Enter password here !");
        add(tfpassword);

        register = new JButton("Register");
        register.setBounds(715, 350, 120, 30);
        register.setFont(new Font("Tahoma", Font.BOLD, 20));
        register.setBackground(new Color(30, 144, 254));
        register.setForeground(Color.WHITE);
//        register.addActionListener(this);
        register.setToolTipText("Press to register username password");
        add(register);

        login = new JButton("Login");
        login.setBounds(915, 350, 120, 30);
        login.setFont(new Font("Tahoma", Font.BOLD, 20));
        login.setBackground(new Color(30, 144, 254));
        login.setForeground(Color.WHITE);
//        login.addActionListener(this);
        login.setToolTipText("Press to login by username-password verification");
        add(login);

        guest = new JButton("Guest-Mode");
        guest.setBounds(800, 400, 180, 30);
        guest.setFont(new Font("Tahoma", Font.BOLD, 20));
        guest.setBackground(new Color(30, 144, 254));
        guest.setForeground(Color.WHITE);
//        guest.addActionListener(this);
        guest.setToolTipText("Press to skip register ,login - Get access to Main Menu");
        add(guest);

        setSize(1200, 500);
        setLocation(200, 150);
        setVisible(true);
        tfname.requestFocus();
        initListeners();
    }

private void initListeners() {
    guest.addActionListener(this);
    register.addActionListener(this);
    login.addActionListener(this);
    eyebtn.addActionListener(this);
}

@Override
public void actionPerformed(ActionEvent ae) {
    if (ae.getSource() == register) {
        registerButtonHandler();
    } else if (ae.getSource() == login) {
        loginButtonHandler();
    } else if (ae.getSource() == guest) {
        guestButtonHandler();
    } else if (ae.getSource() == eyebtn) {
        eyeButtonHandler();
    }
}

private void registerButtonHandler() {
    String username = tfname.getText();
    String password = "";
    if (tfpassword.getPassword().length > 0) {
        password = new String(tfpassword.getPassword());
    }
    if (username.isBlank() || password.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Username - password cannot be empty!", "Date-Entry-Failed", JOptionPane.ERROR_MESSAGE, new ImageIcon(ClassLoader.getSystemResource("usericons/ghost.png")));
        return;
    } else if (password.length() < 3 || password.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Password must be greater than of length 3", "Date-Entry-Failed", JOptionPane.ERROR_MESSAGE, new ImageIcon(ClassLoader.getSystemResource("usericons/poop-smiley.png")));
        return;
    }
    Map<String, UserData> userDataMap = UserData.getUserDataMap();
    if (!userDataMap.containsKey(username)) {
        UserData newUser = new UserData(username, password);
        userDataMap.put(username, newUser);
        UserData.saveUserData();
        String message = "<html>" + "<body>" + "<h2>Registration successful!</h2>" + "<h3>Welcome " + " " + username + ".</h3>" + "<p>Re-enter login details and press login below.</p>" + "</body>" + "</html>";
        JOptionPane.showMessageDialog(this, "" + message, "Registration", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(ClassLoader.getSystemResource("usericons/present.png")));
        tfname.setText("");
        tfpassword.setText("");
    } else {
        JOptionPane.showMessageDialog(this, "Username already exists!", "Registration-Failed", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(ClassLoader.getSystemResource("usericons/poison.png")));
    }
}

private void loginButtonHandler() {
    String username = tfname.getText();
    String password = new String(tfpassword.getPassword());
    Map<String, UserData> userDataMap = UserData.getUserDataMap();
    UserData user = userDataMap.get(username);
    if (user != null && user.getPassword().equals(password)) {
        JOptionPane.showMessageDialog(this, "Login successful!");
        System.out.println(username + "is login now!");
        UserData.isGuestMode = false;
        new User_View(username).setVisible(true);
        dispose();
    } else {
        JOptionPane.showMessageDialog(this, "Please Register to continue", "Login-Failed", JOptionPane.WARNING_MESSAGE, new ImageIcon(ClassLoader.getSystemResource("icons/login.png")));
    }
}

private void guestButtonHandler() {
    UserData.isGuestMode = true;
    setVisible(false);
    Menu.getInstance().setVisible(true);
}

private void eyeButtonHandler() {
    if (!toggle) {
        tfpassword.setEchoChar((char) 0);
        toggle = true;
        eyebtn.setIcon(icon);
    } else {
        tfpassword.setEchoChar('*');
        toggle = false;
        eyebtn.setIcon(eyeicon);
    }
}


    public static void main(String[] args) {
        UserData.loadUserData();
        new User_Login_Frame().setVisible(true);
    }
}
