
package frame;

import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author MuhammadHasnatRasool
 */
public abstract class Output_Frame2 extends JFrame implements ActionListener{
    public static String name;
    String[] lifelineOptions = {"50-50", "SkipQ"};
    public JLabel pointslbl;
    /**
     * Creates new form Output_Frame
     * @param name of user
     */
    public Output_Frame2(String name) {
        Output_Frame2.name=name;
        setTitle("Output_Questions");
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setLayout(null);
        setSize(1200,750);
        setResizable(false);
        setLocation(100,20);
        getContentPane().setBackground(Color.WHITE);
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    private void initComponents() {
        groupoptions = new javax.swing.ButtonGroup();
        opt1 = new javax.swing.JRadioButton();
        opt3 = new javax.swing.JRadioButton();
        opt2 = new javax.swing.JRadioButton();
        opt4 = new javax.swing.JRadioButton();
        question = new JEditorPane();
        jScrollPane2 = new javax.swing.JScrollPane(question);
        next = new javax.swing.JButton();
        prev = new javax.swing.JButton();
        submit = new javax.swing.JButton();
        lifelineBox = new JComboBox<>(lifelineOptions);
        back = new javax.swing.JButton();
        qno = new javax.swing.JLabel();
        feedback = new javax.swing.JLabel();
        meter = new Hasnat.HMeter();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 750));
        opt1.setBackground(new java.awt.Color(255, 255, 255));
        opt1.setFont(new java.awt.Font("Tahoma", 1, 20)); 
        opt1.setForeground(new java.awt.Color(51, 153, 255));
        opt1.setText("A");
        opt1.setOpaque(true);
        opt1.setBounds(60,520,370,30);
        opt1.setVisible(true);
        add(opt1);

        opt2.setBackground(new java.awt.Color(255, 255, 255));
        opt2.setFont(new java.awt.Font("Tahoma", 1, 20)); 
        opt2.setForeground(new java.awt.Color(51, 153, 255));
        opt2.setText("B");
        opt2.setOpaque(true);
        opt2.setBounds(60,630,370,30);
        opt2.setVisible(true);
        add(opt2);
        
        opt3.setBackground(new java.awt.Color(255, 255, 255));
        opt3.setFont(new java.awt.Font("Tahoma", 1, 20)); 
        opt3.setForeground(new java.awt.Color(51, 153, 255));
        opt3.setText("C");
        opt3.setOpaque(true);
        opt3.setBounds(472,520,400,30);
        opt3.setVisible(true);
        add(opt3);
        
        opt4.setFont(new java.awt.Font("Tahoma", 1, 20)); 
        opt4.setBackground(new java.awt.Color(255, 255, 255));
        opt4.setForeground(new java.awt.Color(51, 153, 255));
        opt4.setText("D");
        opt4.setOpaque(true);
        opt4.setBounds(472,630,400,30);
        opt4.setVisible(true);
        add(opt4);
        
         
        groupoptions.add(opt1);
        groupoptions.add(opt2);
        groupoptions.add(opt3);
        groupoptions.add(opt4);
        

        jScrollPane2.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setForeground(new java.awt.Color(255, 255, 204));
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane2.setBounds(30,90,850,400);
        add(jScrollPane2);
        
        ImageIcon pointsIcon = new ImageIcon(ClassLoader.getSystemResource("usericons/point-bronze.png"));
//        Image i = pointsIcon.getImage().getScaledInstance(50,50,Image.SCALE_SMOOTH);
//        ImageIcon icon0 = new ImageIcon(i);
        pointslbl = new JLabel("");
        pointslbl.setIcon(pointsIcon);
        pointslbl.setBounds(1000,290,150,50);
        pointslbl.setForeground(Color.WHITE);
        add(pointslbl);

        question.setEditable(false);
        question.setBackground(new java.awt.Color(255, 204, 102));
        question.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        question.setContentType("text/html"); 
        question.setFont(new java.awt.Font("Tahoma", 1, 48)); 
        question.setToolTipText("output questions area.");
        question.setCaretColor(new java.awt.Color(255, 0, 0));
        question.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        question.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        question.setFocusTraversalPolicyProvider(true);
        question.setMargin(new java.awt.Insets(5, 20, 10, 40));
        question.setSelectedTextColor(Color.WHITE);
        question.setSelectionColor(new java.awt.Color(135, 206, 235));
        question.setBounds(30,90,850,400);
        question.setText("<html><head></head><body></body></html>");
//        jScrollPane2.setViewportView(question);

        next.setBackground(new java.awt.Color(30, 144, 255));
        next.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        next.setForeground(new java.awt.Color(255, 255, 255));
        next.setText("Next");
        next.setToolTipText("Submit answer to move to next question");
        next.addActionListener(this);
        next.setBounds(940,350,200,50);
        add(next);

        prev.setBackground(new java.awt.Color(30, 144, 255));
        prev.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        prev.setForeground(new java.awt.Color(255, 255, 255));
        prev.setText("Prev");
        prev.setToolTipText("use wisely if you want to move back to previous question");
        prev.addActionListener(this);
        prev.setBounds(940,410,200,50);
        add(prev);

        submit.setBackground(new java.awt.Color(30, 144, 255));
        submit.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        submit.setForeground(new java.awt.Color(255, 255, 255));
        submit.setText("Submit");
        submit.addActionListener(this);
        submit.setBounds(940,590,200,50);
        add(submit);

        lifelineBox.setBackground(new java.awt.Color(30, 144, 255));
        lifelineBox.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        lifelineBox.setForeground(new java.awt.Color(255, 255, 255));
        lifelineBox.setMaximumRowCount(3);
        lifelineBox.setToolTipText("Confused in options use any of two linelines");
        lifelineBox.setOpaque(true);
        lifelineBox.setEditable(false);
        lifelineBox.addActionListener(this);
        lifelineBox.setBounds(940,530,200,50);
        add(lifelineBox);

        back.setBackground(new java.awt.Color(30, 144, 255));
        back.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("Back");
        back.setToolTipText("Press to move back to Main Menu");
        back.setBounds(940,470,200,50);
        add(back);
        back.addActionListener(this);

        qno.setFont(new java.awt.Font("Tahoma", 1, 22)); 
        qno.setText("Qno:1");
        qno.setBounds(50,20,180,30);
        add(qno);

        feedback.setText("feedback");
        feedback.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        feedback.setBounds(450,20,700,40);
        add(feedback);

        meter.setForeground(java.awt.Color.lightGray);
        meter.setBackgroundColor(new Color(30,144,255));
        meter.setBoundaryColor(new java.awt.Color(255, 204, 102));
        meter.setProgressColor(new java.awt.Color(198, 247, 213));
        meter.setText("Score:0");
        meter.setTextColor(new java.awt.Color(255, 255, 255));
        meter.setBounds(940,85,200,200);
        add(meter);
  
    }                      
                                 
    public JButton back;
    public JLabel feedback;
    public javax.swing.ButtonGroup groupoptions;
    public javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JComboBox<String> lifelineBox;
    public Hasnat.HMeter meter;
    public JButton next;
    public javax.swing.JRadioButton opt1;
    public javax.swing.JRadioButton opt2;
    public javax.swing.JRadioButton opt3;
    public javax.swing.JRadioButton opt4;
    public JButton prev;
    public JLabel qno;
    public JEditorPane question;
    public JButton submit;
                      
}
