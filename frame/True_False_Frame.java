package frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.border.BevelBorder;

/**
 *
 * @author MuhammadHasnatRasool
 */
public abstract class True_False_Frame extends JFrame implements ActionListener {
    public static String name;
    private static final Color BUTTON_FOREGROUND_COLOR = Color.WHITE; // Color
    private static final Color BUTTON_BACKGROUND_COLOR = new Color(30, 144, 255); // Color

  
    public True_False_Frame() {
        setTitle("True/False Questions");
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setLayout(null);
        setSize(1200, 750);
        setResizable(false);
        setLocation(100, 20);
        getContentPane().setBackground(Color.WHITE);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        question = new JTextArea();
        group = new ButtonGroup();
        trueOption = new JRadioButton("True");
        falseOption = new JRadioButton("False");
        next = new JButton("Next");
        submit = new JButton("Submit");
        back = new JButton("Back");
        feedback = new JLabel("");
        meter = new Hasnat.HMeter();
        qno = new JLabel("Qno:1");
        
        ImageIcon pointsIcon = new ImageIcon(ClassLoader.getSystemResource("bettericons/points.jpeg"));
        Image pointsImage = pointsIcon.getImage().getScaledInstance(50,30,Image.SCALE_SMOOTH);
        ImageIcon pointsIcon2 = new ImageIcon(pointsImage);
        pointslbl = new JLabel("");
        pointslbl.setIcon(pointsIcon2);
        pointslbl.setBounds(1020,150,150,30);
        pointslbl.setForeground(Color.WHITE);
        add(pointslbl);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/tf.png"));
        Image img = i1.getImage().getScaledInstance(1200,200,Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(img);
        JLabel image = new JLabel(icon);
        image.setBounds(0, 0, 1200, 200);
        add(image);

        question.setFont(new Font("Tahoma", Font.BOLD, 24));
        question.setBounds(30, 300, 850, 250);
        question.setBackground(Color.ORANGE);
        question.setLineWrap(true);
        question.setWrapStyleWord(true);
        question.setEditable(false);
        question.setSelectedTextColor(BUTTON_FOREGROUND_COLOR);
        question.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
        question.setAutoscrolls(true);
        question.setOpaque(true);
        question.setToolTipText("Read it carefully and choose either true or false");
//        question.setText("Sample True/False Question Text");
        
        trueOption.setFont(new Font("Tahoma", Font.BOLD, 20));
        trueOption.setForeground(BUTTON_BACKGROUND_COLOR);
        trueOption.setBackground(BUTTON_FOREGROUND_COLOR);
        trueOption.setBounds(60, 590, 150, 50);
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("icons/tick.png"));
        trueOption.setIcon(ticon);
        trueOption.addActionListener(this);

        falseOption.setFont(new Font("Tahoma", Font.BOLD, 20));
        falseOption.setForeground(BUTTON_BACKGROUND_COLOR);
        falseOption.setBackground(BUTTON_FOREGROUND_COLOR);
        falseOption.setBounds(260, 590, 150, 50);
        ImageIcon cicon = new ImageIcon(ClassLoader.getSystemResource("icons/cross.png"));
        falseOption.setIcon(cicon);
        falseOption.addActionListener(this);
        
        group.add(trueOption);
        group.add(falseOption);
        
        next.setFont(new Font("Tahoma", Font.BOLD, 22));
        next.setBounds(940, 450, 200, 50);
        next.setBackground(BUTTON_BACKGROUND_COLOR);
        next.setForeground(BUTTON_FOREGROUND_COLOR);
        next.addActionListener(this);

        back.setFont(new Font("Tahoma", Font.BOLD, 22));
        back.setBounds(940, 520, 200, 50);
        back.setBackground(BUTTON_BACKGROUND_COLOR);
        back.setForeground(BUTTON_FOREGROUND_COLOR);
        back.addActionListener(this);
        
        submit.setFont(new Font("Tahoma", Font.BOLD, 22));
        submit.setBounds(940, 590, 200, 50);
        submit.setBackground(BUTTON_BACKGROUND_COLOR);
        submit.setForeground(BUTTON_FOREGROUND_COLOR);
        submit.addActionListener(this);

        feedback.setFont(new Font("Tahoma", Font.BOLD, 18));
        feedback.setBounds(250, 230, 700, 40);

        meter.setForeground(Color.LIGHT_GRAY);
        meter.setBackgroundColor(new Color(30, 144, 255));
        meter.setBoundaryColor(new Color(255, 204, 102));
        meter.setProgressColor(new Color(198, 247, 213));
        meter.setText("Score: 0");
        meter.setTextColor(Color.WHITE);
        meter.setBounds(940, 225, 200, 200);
        meter.setMaximumValue(100);

        qno.setFont(new Font("Tahoma", Font.BOLD, 22));
        qno.setBounds(50, 230, 180, 30);

        add(question);
        add(trueOption);
        add(falseOption);
        add(next);
        add(submit);
        add(back);
        add(feedback);
        add(meter);
        add(qno);
    }

   
    // Variables declaration - do not modify
    public JTextArea question;
    public ButtonGroup  group;
    public JRadioButton trueOption;
    public JRadioButton falseOption;
    public JButton submit;
    public JButton back;
    public JButton next;
    public JLabel feedback;
    public Hasnat.HMeter meter;
    public JLabel qno;
    public JLabel pointslbl;
    // End of variables declaration
}
