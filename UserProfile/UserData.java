package UserProfile;

import static UserProfile.User_View.badges;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import utilities.Badge;

public class UserData implements Serializable {
    private static final long serialVersionUID = 1L;
    private String username;
    private String password;
    private int totalQuestionsSolved;
    private int highestScore;
    private int currentScore;
    public  int wrongAttempts;
    private int mcqAttempted;
    private int truefalseAttempted;
    private int codingquestionsAttempted;
    private int easyQuestionsAttempted;
    private int mediumQuestionsAttempted;
    private int hardQuestionsAttempted;
    private int points;
    private int badgesCount;

//    private static Map<String, UserData> userDataMap;
    private static Map<String, UserData> userDataMap ;
    private static UserData instance;

    private Map<String, Integer> stats;
    private List<Badge> badgesEarned;
    public static boolean isGuestMode = false;
    private static final String DATA_FILE = System.getProperty("user.home") + "/QuizAppUserData/userdata.txt";
    
    public UserData() {}
    
    static{
        userDataMap = loadUserData();
    }
    
    public static UserData getInstance() {
        if (instance == null) {
            instance = new UserData();
        }
        return instance;
    }
   
    public static Map<String, UserData> getUserDataMap() {
        return userDataMap;
    }

    public void setUserDataMap(Map<String, UserData> newUserDataMap) {
        userDataMap.putAll(newUserDataMap);
    }

    // Constructor
    public UserData(String username, String password) {
        this.username = username;
        this.password = password;
        this.totalQuestionsSolved = 0;
        this.highestScore = 0;
        this.currentScore = 0;
        this.wrongAttempts = 0;
        this.mcqAttempted = 0;
        this.truefalseAttempted = 0;
        this.codingquestionsAttempted = 0;
        this.easyQuestionsAttempted=0;
        this.mediumQuestionsAttempted=0;
        this.hardQuestionsAttempted=0;
        this.points = 0;
        this.stats = new HashMap<>();
        this.badgesEarned = new ArrayList<>();
        this.badgesCount=0;
    }

    // Getters and Setters
    public String getUsername() {
        return username;
    }
    
    public void addBadge(String title, String message) {
    Badge badge = new Badge(title, message);
    badgesEarned.add(badge);
    badgesCount++;
}


    public List<Badge> getBadgesEarned() {
        return badgesEarned;
    }
    
    public boolean hasBadge(String badgeName) {
        return badges.contains(badgeName);
    }
     
    public String getPassword() {
        return password;
    }
    
    public int getTotalQuestionsSolved() {
        return totalQuestionsSolved;
    }

    public int getHighestScore() {
        return highestScore;
    }

    public int getCurrentScore() {
        return currentScore;
    }

    public int getWrongAttempts() {
        return wrongAttempts;
    }

    public void setCurrentScore(int currentScore) {
        this.currentScore += currentScore;
        if (currentScore > highestScore) {
            highestScore = currentScore;
        }
    }

    public void incrementQuestionsSolved() {
        totalQuestionsSolved++;
    }

    public void incrementWrongAttempts() {
        wrongAttempts++;
    }

    public void incrementPoints(int value) {
        points += value;
    }

    public void resetCurrentScore() {
        currentScore = 0;
    }

    public Map<String, Integer> getStats() {
        return stats;
    }

    public int getMcqAttempted() {
        return mcqAttempted;
    }

    public void setMcqAttempted(int mcqAttempted) {
        this.mcqAttempted += mcqAttempted;
    }

    public int getTruefalseAttempted() {
        return truefalseAttempted;
    }

    public void setTruefalseAttempted(int truefalseAttempted) {
        this.truefalseAttempted += truefalseAttempted;
    }

    public int getCodingquestionsAttempted() {
        return codingquestionsAttempted;
    }

    public void setCodingquestionsAttempted(int codingquestionsAttempted) {
        this.codingquestionsAttempted += codingquestionsAttempted;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getEasyquestionsAttempted() {
        return easyQuestionsAttempted;
    }

    public void setEasyquestionsAttempted(int easyQuestionsAttempted) {
        this.easyQuestionsAttempted += easyQuestionsAttempted;
    }

    public int getMediumquestionsAttempted() {
        return mediumQuestionsAttempted;
    }

    public void setMediumquestionsAttempted(int mediumQuestionsAttempted) {
        this.mediumQuestionsAttempted += mediumQuestionsAttempted;
    }

    public int getHardquestionsAttempted() {
        return hardQuestionsAttempted;
    }

    public void setHardquestionsAttempted(int hardQuestionsAttempted) {
        this.hardQuestionsAttempted += hardQuestionsAttempted;
    }

    public int getBadgesCount() {
        return badgesCount;
    }
    
    
    public static boolean isIsGuestMode() {
        return isGuestMode;
    }

 
    // Save user data to file
     public static void saveUserData() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(DATA_FILE))) {
            oos.writeObject(UserData.getUserDataMap());
        } catch (IOException e) {
        }
    }

    // Load user data from file
    @SuppressWarnings("unchecked")
    public static Map<String, UserData> loadUserData() {
        File file = new File(DATA_FILE);
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                return (Map<String, UserData>) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
            }
        }
        return new HashMap<>();
    }

    
    private String formatUserData() {
        return username + "," + totalQuestionsSolved + "," + highestScore + "," + stats.getOrDefault("score", 0) + ","
                + stats.getOrDefault("correct", 0) + "," + stats.getOrDefault("wrong", 0) +","+ stats.getOrDefault("badge", 0)+ "," + mcqAttempted + ","
                + truefalseAttempted + "," + codingquestionsAttempted + "," + easyQuestionsAttempted + "," + mediumQuestionsAttempted + "," + hardQuestionsAttempted + ","+ points + ","  + System.lineSeparator();
    }

    public void updateStats(String username, int score,int points, int correct, int wrong, int mcq, int truefalse, int coding, int badgeCount) {
        UserData userData = UserData.getUserDataMap().get(username);
        userData.totalQuestionsSolved += correct + wrong;
        userData.setPoints(points);
        userData.setCurrentScore(score);
        userData.setWrongAttempts(wrong);
        userData.setBadgesCount(badgeCount);
        userData.stats.put("score", score);
        userData.stats.put("points", points);
        userData.stats.put("correct", correct);
        userData.stats.put("wrong", wrong);
        userData.stats.put("badge", badgeCount);
        userData.mcqAttempted += mcq;
        userData.truefalseAttempted += truefalse;
        userData.codingquestionsAttempted += coding;
        saveUserData();
    }

    public void updateTotalQuestions(String username, int mcq, int truefalse, int coding) {
        UserData userData = UserData.getUserDataMap().get(username);
        userData.mcqAttempted += mcq;
        userData.truefalseAttempted += truefalse;
        userData.codingquestionsAttempted += coding;
        saveUserData();
    }

    public void updateStats(String username, int score,int points, int correct, int wrong, int badgeCount) {
        UserData userData = UserData.getUserDataMap().get(username);
        userData.totalQuestionsSolved += correct + wrong;
        userData.setPoints(points);
        userData.setCurrentScore(score);
        userData.setWrongAttempts(wrong);
        userData.setBadgesCount(badgesCount);
        userData.stats.put("score", score);
        userData.stats.put("points", points);
        userData.stats.put("correct", correct);
        userData.stats.put("wrong", wrong);
        userData.stats.put("badge", badgeCount);
            for (int i = 0; i < badgeCount; i++) {
        userData.badgesEarned.add(badgesEarned.get(i));
    }
        saveUserData();
    }
    
    public void updateStats(String username, int score, int points, int correct, int wrong, int mcq, int truefalse, int coding, int badgeCount, boolean isLeetCode) {
    UserData userData = UserData.getUserDataMap().get(username);
    userData.totalQuestionsSolved += correct + wrong;
    userData.setPoints(points);
    userData.setCurrentScore(score);
    userData.setWrongAttempts(wrong);
    userData.setBadgesCount(badgeCount);
    if (score > userData.highestScore) {
        userData.highestScore = score;
    }
    userData.stats.put("score", score);
    userData.stats.put("points", points);
    userData.stats.put("correct", correct);
    userData.stats.put("wrong", wrong);
    userData.stats.put("badge", badgeCount);
    if (isLeetCode) {
        updateTotalLeetCodeQuestions(username, correct, wrong, 0);
    } else {
        userData.mcqAttempted += mcq;
        userData.truefalseAttempted += truefalse;
        userData.codingquestionsAttempted += coding;
    }
    saveUserData();
}

    public void incrementEasyQuestionsAttempted(){
        easyQuestionsAttempted++;
    }
    
    public void incrementMediumQuestionsAttempted(){
        mediumQuestionsAttempted++;
    }
    public void incrementHardQuestionsAttempted(){
        hardQuestionsAttempted++;
    }
    
public void updateStatistic(String username, String category, boolean correct) {
    UserData userData = UserData.getUserDataMap().get(username);
    int point = 0;
    int totalQuestions = 1;
    switch (category.toLowerCase()) {
        case "easy" -> {
            point = correct ? 20 : -5;
            userData.setEasyquestionsAttempted(1);
            System.out.println("Easy questions attempted: " + easyQuestionsAttempted);
            userData.stats.put("easy", easyQuestionsAttempted);
        }
        case "medium" -> {
            point = correct ? 50 : -5;
            setMediumquestionsAttempted(1);
            System.out.println("Medium questions attempted: " + mediumQuestionsAttempted);
            userData.stats.put("medium", mediumQuestionsAttempted);
        }
        case "hard" -> {
            point = correct ? 100 : -5;
            setHardquestionsAttempted(1);
            System.out.println("Hard questions attempted: " + hardQuestionsAttempted);
            userData.stats.put("hard", hardQuestionsAttempted);
        }
        default -> {
        }
    }
    if (userData != null) {
        userData.incrementPoints(point);
        int currentCount = userData.stats.getOrDefault(category, 0);
        userData.stats.put(category, currentCount + 1);
        System.out.println("Stats map: " + userData.stats);
        userData.setTotalQuestionsSolved(totalQuestions);
        updateTotalQuestions(username,0,0,totalQuestions);
        updateTotalLeetCodeQuestions(username, category.equals("easy") ? 1 : 0, category.equals("medium") ? 1 : 0, category.equals("hard") ? 1 : 0);
        checkForBadges(category);
    }
}

public void updateTotalLeetCodeQuestions(String username, int easy, int medium, int hard) {
    UserData userData = UserData.getUserDataMap().get(username);
//    userData.stats.put("easy", easy);
//    userData.stats.put("medium", medium);
//    userData.stats.put("hard", hard);
    userData.easyQuestionsAttempted += easy;
    userData.mediumQuestionsAttempted += medium;
    userData.hardQuestionsAttempted += hard;
    saveUserData();
}




private void incrementStat(String category) {
    stats.put(category, stats.getOrDefault(category, 0) + 1);
}

public void checkForBadges(String category) {
    List<Badge> localBadges = new ArrayList<>(badges);
    switch (category) {
        case "Easy" -> {
            if (stats.getOrDefault("Easy", 0) >= 10 && !localBadges.contains("Easy 10 Problem Mastery")) {
                addBadge("Easy 10 Problem Mastery", "Mastered 10 Easy problems on LeetCode!");
                badgesEarned.add(new Badge("Easy 10 Problem Mastery", "Mastered 10 Easy problems on LeetCode!"));
                badgesCount++;
            }
            if (stats.getOrDefault("Easy", 0) >= 20 && !localBadges.contains("Easy 20 Problem Mastery")) {
                addBadge("Easy 20 Problem Mastery", "Mastered 20 Easy problems on LeetCode!");
                badgesEarned.add(new Badge("Easy 20 Problem Mastery", "Mastered 20 Easy problems on LeetCode!"));
                badgesCount++;
            }
        }
        case "Medium" -> {
            if (stats.getOrDefault("Medium", 0) >= 10 && !localBadges.contains("Medium 10 Problem Mastery")) {
                addBadge("Medium 10 Problem Mastery", "Mastered 10 Medium problems on LeetCode!");
                badgesEarned.add(new Badge("Medium 10 Problem Mastery", "Mastered 10 Medium problems on LeetCode!"));
                badgesCount++;
            }
        }
        case "Hard" -> {
            if (stats.getOrDefault("Hard", 0) >= 10 && !localBadges.contains("Hard 10 Problem Mastery")) {
                addBadge("Hard 10 Problem Mastery", "Mastered 10 Hard problems on LeetCode!");
                badgesEarned.add(new Badge("Hard 10 Problem Mastery", "Mastered 10 Hard problems on LeetCode!"));
                badgesCount++;
            }
        }
    }
}
    public void setTotalQuestionsSolved(int totalQuestionsSolved) {
        this.totalQuestionsSolved += totalQuestionsSolved;
    }

    public void setHighestScore(int highestScore) {
        this.highestScore = highestScore;
    }

    public void setWrongAttempts(int wrongAttempts) {
        this.wrongAttempts += wrongAttempts;
    }

    public void setBadgesCount(int badgesCount) {
        this.badgesCount += badgesCount;
    }
    
    
     @Override
    public String toString() {
        return "UserData{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", totalQuestionsSolved=" + totalQuestionsSolved +
                ", highestScore=" + highestScore +
                ", currentScore=" + currentScore +
                ", wrongAttempts=" + wrongAttempts +
                ", mcqAttempted=" + mcqAttempted +
                ", truefalseAttempted=" + truefalseAttempted +
                ", codingquestionsAttempted=" + codingquestionsAttempted +
                ", easyQuestionsAttempted=" + easyQuestionsAttempted +
                ", mediumQuestionsAttempted=" + mediumQuestionsAttempted +
                ", hardQuestionsAttempted=" + hardQuestionsAttempted +
                ", points=" + points +
                ", badgesCount=" + badgesCount +
                ", stats=" + stats +
//                ", totalMcqQuestions=" + totalMcqQuestions +
//                ", totalTrueFalseQuestions=" + totalTrueFalseQuestions +
//                ", totalCodingQuestions=" + totalCodingQuestions +
                '}';
    }

    // sample testing
   
//    public static void main(String[] args) {
//        // Create some sample user data
//        UserData user1 = new UserData("user1", "password1");
//        user1.setTotalQuestionsSolved(100);
//        user1.setCurrentScore(500);
//        user1.setHighestScore(600);
//        user1.setWrongAttempts(10);
//        user1.setMcqAttempted(50);
//        user1.setTruefalseAttempted(30);
//        user1.setCodingquestionsAttempted(20);
//        user1.setEasyquestionsAttempted(40);
//        user1.setMediumquestionsAttempted(30);
//        user1.setHardquestionsAttempted(20);
//        user1.setPoints(1500);
////        user1.setTotalMcqQuestions(200);
////        user1.setTotalTrueFalseQuestions(150);
////        user1.setTotalCodingQuestions(100);
//        user1.getStats().put("Easy", 30);
//        user1.getStats().put("Medium", 20);
//        user1.getStats().put("Hard", 10);
//        user1.setBadgesCount(5);
//
//        // Save user data to file
////        Map<String, UserData> userDataMap = new HashMap<>();
//        userDataMap.put(user1.getUsername(), user1);
//        saveUserData();
//        System.out.println("User data saved to file.");
//
//        
//        Map<String, UserData> loadedUserData = loadUserData();
//        if (!loadedUserData.isEmpty()) {
//            System.out.println("User data loaded from file:");
//            for (UserData userData : loadedUserData.values()) {
//                System.out.println(userData);
//            }
//        } else {
//            System.out.println("No user data found in file.");
//        }
//    }

//        public static void main(String[] args) {
//    // Create a new user
//    UserData user = new UserData("testUser", "password");
//
//    // Print empty user details
//    System.out.println("Empty User Details:");
//    System.out.println(user.formatUserData());
//
//    // Add some stats
//    user.updateStats(100, 5, 2, 3, 2, 1);
//    user.incrementEasyQuestionsAttempted();
//    user.incrementMediumQuestionsAttempted();
//    user.incrementHardQuestionsAttempted();
//
//    // Print updated user details
//    System.out.println("\nUpdated User Details after adding stats:");
//    System.out.println(user.formatUserData());
//
//    // Add a badge
//    user.addBadge("Test Badge", "Test badge description");
//
//    // Print updated user details
//    System.out.println("\nUpdated User Details after adding badge:");
//    System.out.println(user.formatUserData());
//
//    // Update total questions solved
//    user.setTotalQuestionsSolved(10);
//
//    // Print updated user details
//    System.out.println("\nUpdated User Details after updating total questions solved:");
//    System.out.println(user.formatUserData());
//
//    // Update highest score
//    user.setHighestScore(150);
//
//    // Print updated user details
//    System.out.println("\nUpdated User Details after updating highest score:");
//    System.out.println(user.formatUserData());
//
//    // Update wrong attempts
//    user.setWrongAttempts(5);
//
//    // Print updated user details
//    System.out.println("\nUpdated User Details after updating wrong attempts:");
//    System.out.println(user.formatUserData());
//    UserData.userDataMap.put("testUser", user);
//
//    // Save user data to file
//    UserData.saveUserData();
//
//    UserData.loadUserData();
//    // Load user data from file
//            System.out.println(UserData.userDataMap);
//
//    // Print loaded user details
//    System.out.println("\nLoaded User Details from file:");
//    System.out.println(UserData.userDataMap.get("testUser").formatUserData());
//}


}

