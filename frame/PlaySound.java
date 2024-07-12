package frame;

import java.io.IOException;
import java.io.InputStream;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author MuhammadHasnatRasool
 */

public class PlaySound {
   public static void playSound(String soundName) {
    try {
        InputStream inputStream = ClassLoader.getSystemResourceAsStream("sounds/" + soundName);
        if (inputStream == null) {
            System.err.println("Sound file not found: " + soundName);
            return;
        }
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(inputStream);
        if (audioInputStream == null) {
            System.err.println("Error initializing audio input stream");
            return;
        }
        AudioFormat format = audioInputStream.getFormat();
        SourceDataLine.Info info = new DataLine.Info(SourceDataLine.class, format);
        try (SourceDataLine line = (SourceDataLine) AudioSystem.getLine(info)) {
            line.open(format);
            line.start();
            int nBytesRead = 0;
            byte[] data = new byte[line.getBufferSize() / 5];
            while (nBytesRead != -1) {
                nBytesRead = audioInputStream.read(data, 0, data.length);
                if (nBytesRead == -1) {
                    break;
                }
                line.write(data, 0, nBytesRead);
            }
            line.drain();
            line.stop();
        }
    } catch (IOException | LineUnavailableException | UnsupportedAudioFileException ex) {
        ex.printStackTrace();
    }
}
   
}

