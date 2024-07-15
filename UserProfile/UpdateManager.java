package UserProfile;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class UpdateManager {
    private static final String DOWNLOAD_URL = "https://github.com/Hasnatrasool163/QuizMaster/releases/download/QuizAppv1.5.1.0/QuizApp.jar";
    public static final String LOCAL_JAR_PATH = System.getProperty("user.home") + "/QuizApp/QuizApp.jar";

    public static void downloadNewVersion() throws IOException {
        URL url = new URL(DOWNLOAD_URL);
        try (InputStream in = new BufferedInputStream(url.openStream());
             FileOutputStream out = new FileOutputStream(LOCAL_JAR_PATH)) {
            byte[] dataBuffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                out.write(dataBuffer, 0, bytesRead);
            }
            System.out.println("Downloaded new version to " + LOCAL_JAR_PATH);
        } catch (IOException e) {
            System.out.println("failed");
//            JOptionPane.showMessageDialog(null, "Failed to download new version. Please try again later.");
        }
    }
}

