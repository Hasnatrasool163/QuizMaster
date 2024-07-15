//package UserProfile;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
//import java.util.HashMap;
//import java.util.Map;
//
//public class UserProfileDataManager {
//    private static UserDataManager instance;
//    private Map<String, UserData> userDataMap;
//
//    private UserProfileDataManager() {
//        userDataMap = new HashMap<>();
//    }
//
//    public static UserDataManager getInstance() {
//        if (instance == null) {
//            instance = new UserDataManager();
//        }
//        return instance;
//    }
//
//    public void saveUserData(Map<String, UserData> userDataMap) {
//        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(DATA_FILE))) {
//            oos.writeObject(userDataMap);
//        } catch (IOException e) {
//        }
//    }
//
//    public Map<String, UserData> loadUserData() {
//        File file = new File(DATA_FILE);
//        if (file.exists()) {
//            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
//                return (Map<String, UserData>) ois.readObject();
//            } catch (IOException | ClassNotFoundException e) {
//                e.printStackTrace();
//            }
//        }
//        return new HashMap<>();
//    }
//
//    public void updateUserData(String username, UserData userData) {
//        userDataMap.put(username, userData);
//    }
//
//    public UserData getUserData(String username) {
//        return userDataMap.get(username);
//    }
//}
