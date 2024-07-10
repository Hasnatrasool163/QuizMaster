package utilities;

import java.awt.Desktop;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import org.json.JSONObject;

public class VersionChecker {

    private static final String GITHUB_API_URL = "https://api.github.com/repos/Hasnatrasool163/QuizMaster/releases/latest";
    private static final String CURRENT_VERSION = "QuizAppv1.5.1.1"; 
    private static final String USER_DATA_FILE = "src/UserProfile/userdata.txt";
    private static final String BACKUP_DATA_FILE = "backup_userdata.txt"; 

    public static boolean isUpdateAvailable() throws IOException {
        URL url = new URL(GITHUB_API_URL);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.connect();

        int responseCode = conn.getResponseCode();

        if (responseCode != 200) {
            throw new RuntimeException("HttpResponseCode: " + responseCode);
        } else {
            String inline = "";
            try (Scanner scanner = new Scanner(url.openStream())) {
                while (scanner.hasNext()) {
                    inline += scanner.nextLine();
                }
            }

            JSONObject json = new JSONObject(inline);
            String latestVersion = json.getString("tag_name");

            return !CURRENT_VERSION.equals(latestVersion);
        }
    }

    public static String getLatestVersionURL() throws IOException {
        URL url = new URL(GITHUB_API_URL);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.connect();

        int responseCode = conn.getResponseCode();

        if (responseCode != 200) {
            throw new RuntimeException("HttpResponseCode: " + responseCode);
        } else {
            String inline = "";
            try (Scanner scanner = new Scanner(url.openStream())) {
                while (scanner.hasNext()) {
                    inline += scanner.nextLine();
                }
            }

            JSONObject json = new JSONObject(inline);
            return json.getString("html_url");
        }
    }

    public static void openURLInBrowser(String url) {
        if (Desktop.isDesktopSupported()) {
            try {
                Desktop.getDesktop().browse(new URI(url));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        }
    }

    public static void backupUserData() throws IOException {
        Path source = Paths.get(USER_DATA_FILE);
        Path backup = Paths.get(BACKUP_DATA_FILE);
        Files.copy(source, backup);
        System.out.println("User data backed up to " + backup.toString());
    }

    public static void restoreUserData() throws IOException {
        Path backup = Paths.get(BACKUP_DATA_FILE);
        Path destination = Paths.get(USER_DATA_FILE);
        if (Files.exists(backup)) {
            Files.copy(backup, destination);
            System.out.println("User data restored from " + backup.toString());
        } else {
            System.out.println("No backup found to restore.");
        }
    }
}
