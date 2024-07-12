package frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.BevelBorder;
import Hasnat.HMeter;

/**
 *
 * @author MuhammadHasnatRasool
 */

public  class frame extends JFrame implements ActionListener{
    
    public JLabel qno, feedback,pointslbl;
    public JTextArea question;
    public JRadioButton opt1, opt2, opt3, opt4;
    public ButtonGroup groupoptions;
    public JButton next,back,prev, submit, lifeline;
    public JScrollPane scrollPane; 
    public HMeter meter;
    public static int count = 0;
//    public static int score = 0;
    
    private static final int FRAME_WIDTH = 1200; // int
    private static final int FRAME_HEIGHT = 750; // int

    private static final int QUESTION_LABEL_X = 40; // int
    private static final int QUESTION_LABEL_Y = 220; // int
    private static final int QUESTION_LABEL_WIDTH = 250; // int
    private static final int QUESTION_LABEL_HEIGHT = 30; // int

    private static final int QUESTION_TEXT_X = 40; // int
    private static final int QUESTION_TEXT_Y = 260; // int
    private static final int QUESTION_TEXT_WIDTH = 850; // int

    private static final int OPTION_BUTTON_X = 60; // int
    private static final int OPTION_BUTTON_Y = 350; // int
    private static final int OPTION_BUTTON_WIDTH = 800; // int
    private static final int OPTION_BUTTON_HEIGHT = 30; // int

    private static final int NEXT_BUTTON_X = 940; // int
    private static final int NEXT_BUTTON_Y = 360; // int
    private static final int NEXT_BUTTON_WIDTH = 200; // int
    private static final int NEXT_BUTTON_HEIGHT = 40; // int

    private static final int PREV_BUTTON_X = 940; // int
    private static final int PREV_BUTTON_Y = 410; // int
    private static final int PREV_BUTTON_WIDTH = 200; // int
    private static final int PREV_BUTTON_HEIGHT = 40; // int

    private static final int BACK_BUTTON_X = 940; // int
    private static final int BACK_BUTTON_Y = 460; // int
    private static final int BACK_BUTTON_WIDTH = 200; // int
    private static final int BACK_BUTTON_HEIGHT = 40; // int

    private static final int LIFELINE_BUTTON_X = 940; // int
    private static final int LIFELINE_BUTTON_Y = 510; // int
    private static final int LIFELINE_BUTTON_WIDTH = 200; // int
    private static final int LIFELINE_BUTTON_HEIGHT = 40; // int

    private static final int SUBMIT_BUTTON_X = 940; // int
    private static final int SUBMIT_BUTTON_Y = 560; // int
    private static final int SUBMIT_BUTTON_WIDTH = 200; // int
    private static final int SUBMIT_BUTTON_HEIGHT = 40; // int

    private static final int FONT_SIZE = 22; // int
    private static final int FONT_STYLE = Font.PLAIN; // int
    private static final String FONT_NAME = "Tahoma";
    private static final String FONT_NAME2 = "Dialog";// string options


    private static final Color BACKGROUND_COLOR = Color.WHITE; // Color
    private static final Color BUTTON_BACKGROUND_COLOR = new Color(30, 144, 255); // Color
    private static final Color BUTTON_FOREGROUND_COLOR = Color.WHITE; // Color
   
    public JComboBox<String> lifelineBox;
    
    
    public frame(){
//        frame.name = name;
        setMinimumSize(new Dimension(FRAME_WIDTH,FRAME_HEIGHT));
        setResizable(false);
        
        setTitle("Questions-Window");
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        getContentPane().setBackground(BACKGROUND_COLOR);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLocationByPlatform(true);
        setLayout(null);
        
        ImageIcon pointsIcon = new ImageIcon(ClassLoader.getSystemResource("usericons/point-bronze.png"));
//        Image i = pointsIcon.getImage().getScaledInstance(50,50,Image.SCALE_SMOOTH);
//        ImageIcon icon0 = new ImageIcon(i);
        pointslbl = new JLabel("");
        pointslbl.setIcon(pointsIcon);
        pointslbl.setBounds(950,150,100,50);
        pointslbl.setForeground(Color.WHITE);
        add(pointslbl);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/quiz.jpg"));
        Image img = i1.getImage().getScaledInstance(1200,200,Image.SCALE_FAST);
        ImageIcon icon = new ImageIcon(img);
        JLabel image = new JLabel(icon);
        image.setBounds(0, 0, 1200, 200);
        add(image);
        
        
        meter = new HMeter();
        meter.setText("Score:"+0);
        meter.setBounds(960,210,150,150);
        meter.setAnimate(false);
        meter.setEnabled(false);
        meter.setForeground(Color.LIGHT_GRAY);
        meter.setCursor(new Cursor(Cursor.HAND_CURSOR));
        meter.setBackgroundColor(BUTTON_BACKGROUND_COLOR);
        meter.setHollow(true);
        meter.setProgressColor(Color.decode("#C6F7D5"));
//        meter.setBoundaryColor(Color.decode("#C6F7D5"));
        meter.setBoundaryColor(new Color(255, 204, 102));
        meter.setTextColor(Color.WHITE);
        add(meter);
        
        qno = new JLabel();
        qno.setBounds(QUESTION_LABEL_X, QUESTION_LABEL_Y, QUESTION_LABEL_WIDTH-50, QUESTION_LABEL_HEIGHT);
        qno.setFont(new Font(FONT_NAME, FONT_STYLE, FONT_SIZE));

        add(qno);
        
        question = new JTextArea();
        question.setEditable(false);
        question.setLineWrap(true);
        question.setWrapStyleWord(true);
        question.setForeground(Color.BLACK);
        question.setBackground(Color.ORANGE);
        question.setForeground(Color.DARK_GRAY);
        question.setBounds(QUESTION_TEXT_X, QUESTION_TEXT_Y, QUESTION_TEXT_WIDTH, QUESTION_LABEL_HEIGHT+150);
        question.setFont(new Font(FONT_NAME, FONT_STYLE, FONT_SIZE));
        question.setSelectedTextColor(Color.WHITE);
        question.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
        question.setAutoscrolls(true);
        question.setOpaque(true);
        question.setToolTipText("Read it carefully and choose any suitable option below");
//        add(question);
        
        scrollPane= new JScrollPane(question);
        scrollPane.setBounds(QUESTION_TEXT_X, QUESTION_TEXT_Y, QUESTION_TEXT_WIDTH, QUESTION_LABEL_HEIGHT + 150);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        add(scrollPane);
        
        opt1 = new JRadioButton("");
        opt1.setBounds(OPTION_BUTTON_X, OPTION_BUTTON_Y+120, OPTION_BUTTON_WIDTH, OPTION_BUTTON_HEIGHT);
        opt1.setBackground(Color.WHITE);
        opt1.setForeground(BUTTON_BACKGROUND_COLOR);
        opt1.setToolTipText("its your option1: goodLuck");
        opt1.setFont(new Font(FONT_NAME2, FONT_STYLE, 20));
        opt1.setAutoscrolls(true);
        opt1.setOpaque(true);
//        opt1.setContentAreaFilled(false);
        add(opt1);
        
        opt2 = new JRadioButton("");
        opt2.setBounds(OPTION_BUTTON_X, OPTION_BUTTON_Y+180, OPTION_BUTTON_WIDTH, OPTION_BUTTON_HEIGHT);
        opt2.setBackground(Color.WHITE);
        opt2.setFont(new Font(FONT_NAME2, FONT_STYLE, 20));
        opt2.setAutoscrolls(true);
        opt2.setForeground(BUTTON_BACKGROUND_COLOR);
        opt2.setToolTipText("I am option 2: goodLuck");
        opt2.setOpaque(true);
        add(opt2);
        
        opt3 = new JRadioButton("");
        opt3.setBounds(OPTION_BUTTON_X, OPTION_BUTTON_Y+240, OPTION_BUTTON_WIDTH, OPTION_BUTTON_HEIGHT);
        opt3.setBackground(Color.WHITE);
        opt3.setFont(new Font(FONT_NAME2, FONT_STYLE, 20));
        opt3.setAutoscrolls(true);
        opt3.setToolTipText("I am option 3: goodLuck");
        opt3.setForeground(BUTTON_BACKGROUND_COLOR);
        opt3.setOpaque(true);
        add(opt3);
        
        opt4 = new JRadioButton("");
        opt4.setBounds(OPTION_BUTTON_X, OPTION_BUTTON_Y+300, OPTION_BUTTON_WIDTH, OPTION_BUTTON_HEIGHT);
        opt4.setBackground(Color.WHITE);
        opt4.setFont(new Font(FONT_NAME2, FONT_STYLE, 20));
        opt4.setAutoscrolls(true);
        opt4.setToolTipText("I am option 4: goodLuck");
        opt4.setForeground(BUTTON_BACKGROUND_COLOR);
        opt4.setOpaque(true);
        add(opt4);
        
        groupoptions = new ButtonGroup();
        groupoptions.add(opt1);
        groupoptions.add(opt2);
        groupoptions.add(opt3);
        groupoptions.add(opt4);
        
        next = new JButton("Next");
        next.setBounds(NEXT_BUTTON_X, NEXT_BUTTON_Y+20, NEXT_BUTTON_WIDTH, NEXT_BUTTON_HEIGHT);
        next.setFont(new Font(FONT_NAME, FONT_STYLE, FONT_SIZE));
        next.setBackground(BUTTON_BACKGROUND_COLOR);
        next.setForeground(BUTTON_FOREGROUND_COLOR);
        next.addActionListener(this);
        next.setToolTipText("Submit answer to move to next question");
        add(next);
        
        
        prev = new JButton("Prev");
        prev.setBounds(PREV_BUTTON_X, PREV_BUTTON_Y+20, PREV_BUTTON_WIDTH, PREV_BUTTON_HEIGHT);
        prev.setFont(new Font(FONT_NAME, FONT_STYLE, FONT_SIZE));
        prev.setBackground(BUTTON_BACKGROUND_COLOR);
        prev.setForeground(BUTTON_FOREGROUND_COLOR);
        prev.addActionListener(this);
        prev.setToolTipText("use wisely if you want to move back to previous question");
        add(prev);
        
        
        back = new JButton("Back");
        back.setBounds(BACK_BUTTON_X, BACK_BUTTON_Y+20, BACK_BUTTON_WIDTH, BACK_BUTTON_HEIGHT);
        back.setFont(new Font(FONT_NAME, FONT_STYLE, FONT_SIZE));
        back.setBackground(BUTTON_BACKGROUND_COLOR);
        back.setForeground(BUTTON_FOREGROUND_COLOR);
        back.addActionListener(this);
        back.setToolTipText("Press to move back to Main Menu");
        add(back);
        
        String[] lifelineOptions = {"50-50 Lifeline", "Skip Question"};
        lifelineBox = new JComboBox<>(lifelineOptions);
        lifelineBox.setBounds(LIFELINE_BUTTON_X, LIFELINE_BUTTON_Y+20, LIFELINE_BUTTON_WIDTH, LIFELINE_BUTTON_HEIGHT);
        lifelineBox.setFont(new Font(FONT_NAME, FONT_STYLE, FONT_SIZE));
        lifelineBox.setBackground(BUTTON_BACKGROUND_COLOR);
        lifelineBox.setForeground(BUTTON_FOREGROUND_COLOR);
        lifelineBox.setOpaque(true);
        lifelineBox.addActionListener(this);
        lifelineBox.setEditable(false);
        lifelineBox.setToolTipText("Confused in options use any of two lifelines");
        add(lifelineBox);
        
        submit = new JButton("Submit");
        submit.setBounds(SUBMIT_BUTTON_X, SUBMIT_BUTTON_Y+20, SUBMIT_BUTTON_WIDTH, SUBMIT_BUTTON_HEIGHT);
        submit.setFont(new Font(FONT_NAME, FONT_STYLE, FONT_SIZE));
        submit.setBackground(BUTTON_BACKGROUND_COLOR);
        submit.setForeground(BUTTON_FOREGROUND_COLOR);
        submit.addActionListener(this);
        submit.setToolTipText("press to check answer and then press next!");
        add(submit);
        
        feedback = new JLabel("");
        feedback.setBounds(300, 220, 650, 20);
        feedback.setFont(new Font(FONT_NAME, Font.BOLD, FONT_SIZE-2));
        add(feedback);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public static void main(String[]args){
        new frame().setVisible(true);
    }
    
}
