package utilities;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;

public class BadgeManager {
    
    private static BadgeManager instance;

    private List<Badge> badgesEarned = new ArrayList<>();
    private List<Badge> allBadges = new ArrayList<>();
    
    public static BadgeManager getInstance() {
        if (instance == null) {
            instance = new BadgeManager();
        }
        return instance;
    }
    
    private BadgeManager() {
        initializeBadges();  // Initialize badges upon creation
    }

    private void initializeBadges() {
        allBadges.add(new Badge("Perfect Score", "Completed the quiz with no wrong answers!"));
        allBadges.add(new Badge("Quiz Master", "Answered 50 questions!"));
        allBadges.add(new Badge("20 Correct Answers in a Row", "Answered 20 questions correctly in a row!"));
        allBadges.add(new Badge("200 Points Club", "Scored 200 points!"));
        allBadges.add(new Badge("No Lifelines Used", "Completed the quiz without using any lifelines!"));
        allBadges.add(new Badge("5 in a Row", "Answered 5 questions in a row correctly!"));
        allBadges.add(new Badge("10 in a Row", "Answered 10 questions in a row correctly!"));
        allBadges.add(new Badge("15 in a Row", "Answered 15 questions in a row correctly!"));
        allBadges.add(new Badge("25 in a Row", "Answered 25 questions in a row correctly!"));
        allBadges.add(new Badge("50 in a Row", "Answered 50 questions in a row correctly!"));
        allBadges.add(new Badge("100 in a Row", "Answered 100 questions in a row correctly!"));
        allBadges.add(new Badge("Streak Master", "Achieved the highest streak!"));
        allBadges.add(new Badge("Lifeline Pro", "Used lifelines wisely!"));
        allBadges.add(new Badge("50 Points", "Scored 50 points!"));
        allBadges.add(new Badge("100 Points", "Scored 100 points!"));
        allBadges.add(new Badge("250 Points", "Scored 250 points!"));
        allBadges.add(new Badge("500 Points", "Scored 500 points!"));
        allBadges.add(new Badge("1000 Points", "Scored 1000 points!"));
        allBadges.add(new Badge("5000 Points", "Scored 5000 points!"));
        allBadges.add(new Badge("Expert", "Mastered all categories!"));
        allBadges.add(new Badge("Beginner", "Mastered the beginner category!"));
        allBadges.add(new Badge("Intermediate", "Mastered the intermediate category!"));
        allBadges.add(new Badge("Advanced", "Mastered the advanced category!"));
        allBadges.add(new Badge("Professional", "Mastered the professional category!"));
        allBadges.add(new Badge("Grandmaster", "Achieved Grandmaster status!"));
        allBadges.add(new Badge("World Champion", "Ranked as World Champion!"));
        allBadges.add(new Badge("Legendary", "Achieved Legendary status!"));
        allBadges.add(new Badge("Ultimate Achiever", "Reached the ultimate achievement!"));
        allBadges.add(new Badge("Quiz Whiz", "Became the Quiz Whiz!"));
    }

    public void addBadge(Badge badge) {
        badgesEarned.add(badge);
    }

    public void removeBadge(Badge badge) {
        badgesEarned.remove(badge);
    }

    public List<Badge> getBadgesEarned() {
        return badgesEarned;
    }

    public List<Badge> getAllBadges() {
        return allBadges;
    }

    public void setAllBadges(List<Badge> badges) {
        this.allBadges = badges;
    }

    public static ListModel<String> getBadgeListModel(){
        DefaultListModel<String> model = new DefaultListModel<>();
        for(Badge badge : getInstance().allBadges){
            model.addElement(badge.toString());
        }
        if(model.getSize() == 0){
            model.addElement("No badges available");
        }
        return model;
    }
}
