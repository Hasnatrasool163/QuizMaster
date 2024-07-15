package score;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.List;
import utilities.Badge;
import frame.Menu;
import UserProfile.UserData;
import static UserProfile.User_View.currentUser;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import utilities.QuestionType;
import static utilities.QuestionType.CODING;
import static utilities.QuestionType.MCQ;
import static utilities.QuestionType.TRUE_FALSE;

public class Score extends JFrame implements ActionListener {

    private UserData userData;
    private int score;
    private int points;
    private int wrongAnswers;
    private int totalQuestions;
    private QuestionType questionType; 
    private int badgeCount;

    public Score(UserData userData, int score,int points, int wrongAnswers, int totalQuestions, List<Badge> badgesEarned,QuestionType questionType) {
        this.userData = userData;
        this.score = score;
        this.points=points;
        this.wrongAnswers = wrongAnswers;
        this.totalQuestions = totalQuestions;
        this.questionType=questionType;
        this.badgeCount=badgesEarned.size();
        
       for (Badge badge : badgesEarned) {
        if (!userData.hasBadge(badge.getName())) {
            userData.addBadge(badge.getName(), badge.getDescription());
        }
    }
        initializeUI(userData.getUsername(), score,points, wrongAnswers, totalQuestions, badgesEarned);
        
            updateUserData();
    }

    public Score(String name, int score,int points, int wrongAnswers, int totalQuestions,List<Badge> badgesEarned) {
        this.score = score;
        this.points=points;
        this.wrongAnswers = wrongAnswers;
        this.totalQuestions = totalQuestions;
        initializeUI(name, score,points ,wrongAnswers, totalQuestions, badgesEarned);
    }

    private void updateUserData() {
    if (UserData.getUserDataMap().containsKey(currentUser.getUsername())) {
       
        switch (questionType) {
            case MCQ -> {userData.setMcqAttempted(totalQuestions);
            userData.updateTotalQuestions(currentUser.getUsername(),totalQuestions, 0, 0);}
            case TRUE_FALSE -> {userData.setTruefalseAttempted(totalQuestions);
            userData.updateTotalQuestions(currentUser.getUsername(),0, totalQuestions, 0);}
            case CODING -> {userData.setCodingquestionsAttempted(totalQuestions);
             userData.updateTotalQuestions(currentUser.getUsername(),0, 0, totalQuestions);}
            default -> { }
        }
        userData.updateStats(currentUser.getUsername(),score,points, totalQuestions - wrongAnswers, wrongAnswers,badgeCount);
        UserData.saveUserData();
    }
}
     
     
   
    
    
   
    private void initializeUI(String name, int score,int points, int wrongAnswers, int totalQuestions, List<Badge> badgesEarned) {
        setBounds(400, 150, 750, 600);
        getContentPane().setBackground(Color.WHITE);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(null);

        ImageIcon scoreIcon = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image scaledScoreImage = scoreIcon.getImage().getScaledInstance(200, 250, Image.SCALE_DEFAULT);
        ImageIcon scaledScoreIcon = new ImageIcon(scaledScoreImage);
        JLabel scoreImageLabel = new JLabel(scaledScoreIcon);
        scoreImageLabel.setBounds(10, 150, 250, 250);
        add(scoreImageLabel);

        JLabel headingLabel = new JLabel("Thank you, " + name + " for your time!");
        headingLabel.setBounds(45, 30, 700, 30);
        headingLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(headingLabel);

        JLabel scoreLabel = new JLabel("Your score is " + score);
        scoreLabel.setBounds(350, 200, 300, 30);
        scoreLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(scoreLabel);

        JLabel feedbackLabel = new JLabel("Total questions: " + totalQuestions + ". You got " + wrongAnswers + " wrong.");
        feedbackLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
        feedbackLabel.setBounds(100, 100, 550, 30);
        add(feedbackLabel);

        if (badgesEarned != null && !badgesEarned.isEmpty()) {
            int startY = 380;
            JLabel badgesLabel = new JLabel("Badges Earned:");
            badgesLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
            badgesLabel.setBounds(320, startY, 200, 30);
            add(badgesLabel);

            startY += 40;
            for (Badge badge : badgesEarned) {
                JLabel badgeLabel = new JLabel(badge.getName() + ": " + badge.getDescription());
                badgeLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
                badgeLabel.setBounds(150, startY, 600, 20);
                add(badgeLabel);
                startY += 30;
            }
        }

        JButton playAgainButton = new JButton("Play Again");
        playAgainButton.setBounds(380, 270, 120, 30);
        playAgainButton.setBackground(new Color(30, 144, 255));
        playAgainButton.setForeground(Color.WHITE);
        playAgainButton.addActionListener(this);
        add(playAgainButton);

        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent ae) {
        Menu.getInstance().setVisible(true);
        setVisible(false);
    }
}



