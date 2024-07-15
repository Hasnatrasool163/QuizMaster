package UserProfile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class UserDataManager {
    private static final String USER_DATA_DIR = System.getProperty("user.home") + "/QuizAppUserData";
    private static final String USER_DATA_FILE = USER_DATA_DIR + "/userdata.txt";
    private static final String BACKUP_DATA_FILE = USER_DATA_DIR + "/backup_userdata.txt";

    public static void setupUserDataDirectory() {
        File directory = new File(USER_DATA_DIR);
        if (!directory.exists()) {
            directory.mkdirs();
            directory.setReadable(true, false); 
            directory.setWritable(true, false); 
            directory.setExecutable(false, false); 
            System.out.println("User data directory created at: " + USER_DATA_DIR);
        }
    }

    public static void backupUserData() throws IOException {
        Path source = Paths.get(USER_DATA_FILE);
        Path backup = Paths.get(BACKUP_DATA_FILE);
        if (Files.exists(source)) {
            Files.copy(source, backup, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("User data backed up to " + backup.toString());
        }
    }

    public static void restoreUserData() throws IOException {
        Path backup = Paths.get(BACKUP_DATA_FILE);
        Path destination = Paths.get(USER_DATA_FILE);
        if (Files.exists(backup)) {
            Files.copy(backup, destination, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("User data restored from " + backup.toString());
        } else {
            System.out.println("No backup found to restore.");
        }
    }
    
    public static File getUserDataFile() {
        return new File(USER_DATA_FILE);
    }
}
