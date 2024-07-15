package rules;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import frame.Menu;

public class Rules extends JFrame implements ActionListener {

    String name;
    JButton start, back;
    String subject;

    public Rules(String name, String subject) {
        this.subject = subject;
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setAlwaysOnTop(true);
        setLayout(null);

        JLabel heading = new JLabel("Welcome " + name + " to the Quiz World");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);
        
        ImageIcon scoreIcon = new ImageIcon(ClassLoader.getSystemResource("usericons/star.png"));
        JLabel scoreImageLabel = new JLabel(scoreIcon);
        scoreImageLabel.setBounds(300, 50, 30, 30);
        add(scoreImageLabel);

        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(
                "<html>"
                + "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>"
                + "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>"
                + "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>"
                + "4. Crying is allowed but please do so quietly." + "<br><br>"
                + "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>"
                + "6. Do not get nervous if your friend is answering more questions, apply your mind and think" + "<br><br>"
                + "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>"
                + "8. Keep going dont look at sides for help, Good Luck" + "<br><br>"
                + "<html>"
        );
        add(rules);

        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setFont(new Font("Tahoma",Font.BOLD,16));
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(30, 144, 254));
        start.setFont(new Font("Tahoma",Font.BOLD,16));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);

        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            JFrame frame = FrameFactory.getFrame(subject, name);
            frame.setVisible(true);
        } else {
            Menu.getInstance().setVisible(true);
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Rules("User", "").setVisible(true);
    }
}
