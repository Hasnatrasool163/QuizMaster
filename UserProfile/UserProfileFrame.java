package UserProfile;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridLayout;

public class UserProfileFrame extends JFrame {

    private UserData currentUser;

    public UserProfileFrame(UserData currentUser) {
        this.currentUser = currentUser;
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 2));
        panel.add(new JLabel("Username:"));
        panel.add(new JLabel(currentUser.getUsername()));
        System.out.println("Username: " + currentUser.getUsername());
        panel.add(new JLabel("Total Questions Solved:"));
        panel.add(new JLabel(String.valueOf(currentUser.getTotalQuestionsSolved())));
        System.out.println("Total Questions Solved: " + currentUser.getTotalQuestionsSolved());
        panel.add(new JLabel("Highest Score:"));
        panel.add(new JLabel(String.valueOf(currentUser.getHighestScore())));
        System.out.println("Highest Score: " + currentUser.getHighestScore());
        panel.add(new JLabel("Current Score:"));
        panel.add(new JLabel(String.valueOf(currentUser.getCurrentScore())));
        System.out.println("Current Score: " + currentUser.getCurrentScore());
        panel.add(new JLabel("Wrong Attempts:"));
        panel.add(new JLabel(String.valueOf(currentUser.getWrongAttempts())));
        System.out.println("Wrong Attempts: " + currentUser.getWrongAttempts());
        panel.add(new JLabel("MCQ Attempted:"));
        panel.add(new JLabel(String.valueOf(currentUser.getMcqAttempted())));
        System.out.println("MCQ Attempted: " + currentUser.getMcqAttempted());
        panel.add(new JLabel("True/False Attempted:"));
        panel.add(new JLabel(String.valueOf(currentUser.getTruefalseAttempted())));
        System.out.println("True/False Attempted: " + currentUser.getTruefalseAttempted());
        panel.add(new JLabel("Coding Questions Attempted:"));
        panel.add(new JLabel(String.valueOf(currentUser.getCodingquestionsAttempted())));
        System.out.println("Coding Questions Attempted: " + currentUser.getCodingquestionsAttempted());
        panel.add(new JLabel("Easy Questions Attempted:"));
        panel.add(new JLabel(String.valueOf(currentUser.getEasyquestionsAttempted())));
        System.out.println("Easy Questions Attempted: " + currentUser.getEasyquestionsAttempted());
        panel.add(new JLabel("Medium Questions Attempted:"));
        panel.add(new JLabel(String.valueOf(currentUser.getMediumquestionsAttempted())));
        System.out.println("Medium Questions Attempted: " + currentUser.getMediumquestionsAttempted());
        panel.add(new JLabel("Hard Questions Attempted:"));
        panel.add(new JLabel(String.valueOf(currentUser.getHardquestionsAttempted())));
        System.out.println("Hard Questions Attempted: " + currentUser.getHardquestionsAttempted());
        panel.add(new JLabel("Points:"));
        panel.add(new JLabel(String.valueOf(currentUser.getPoints())));
        System.out.println("Points: " + currentUser.getPoints());
        panel.add(new JLabel("Badges Count:"));
        panel.add(new JLabel(String.valueOf(currentUser.getBadgesCount())));
        System.out.println("Badges Count: " + currentUser.getBadgesCount());
        add(panel);
        pack();
        setVisible(true);
    }

    public static void showUserProfile(String username) {
        UserData currentUser = UserData.getUserDataMap().get(username);
        if (currentUser != null) {
            new UserProfileFrame(currentUser).setVisible(true);
        } else {
            System.out.println("User not found!");
        }
    }

    public static void main(String[] args) {
        showUserProfile("hasnat");
    }
}
