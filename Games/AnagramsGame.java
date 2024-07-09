package Games;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnagramsGame extends JPanel {

    private List<String> words;
    private String currentWord;
    private JLabel wordLabel;
    private JTextField inputField;
    private JButton submitButton;
    private int score;
    private JLabel scoreLabel;
    private JLabel guideLabel;

    public AnagramsGame() {
        words = new ArrayList<>();
        words.add("listen");
        words.add("acts");
        words.add("angel");
        words.add("real");
        words.add("lad");
        words.add("ale");
        words.add("tea");
        words.add("silent");
        words.add("enlist");
        words.add("tinsel");
        words.add("cat");
        words.add("scan");
        words.add("tac");
        words.add("cast");
        words.add("glean");
        words.add("lane");
        words.add("lang");
        words.add("lean");
        words.add("rage");
        words.add("age");
        words.add("regal");
        words.add("gear");
        words.add("care");
        words.add("race");
        words.add("read");
        words.add("lead");
        words.add("deal");
        words.add("dear");
        words.add("dale");
        words.add("leaf");
        words.add("eat");
        words.add("meat");
        words.add("team");
        words.add("mate");
        words.add("tame");
        words.add("meta");
        words.add("beat");
        words.add("bate");
        words.add("tab");
        words.add("table");
        words.add("able");
        words.add("bale");
        words.add("tale");
        words.add("late");
        words.add("code");
        words.add("codec");
        words.add("odes");
        words.add("cote");
        words.add("cot");
        words.add("act");
        words.add("cat");
        words.add("cab");
        words.add("cad");
        words.add("cade");
        words.add("caged");
        words.add("cager");
        words.add("cages");
        words.add("cake");
        words.add("cakes");
        words.add("cale");
        words.add("call");
        words.add("calls");
        words.add("calm");
        words.add("calms");
        words.add("cam");
        words.add("came");
        words.add("camp");
        words.add("camps");
        words.add("cams");
        words.add("can");
        words.add("cane");
        words.add("canes");
        words.add("cans");
        words.add("cant");
        words.add("cap");
        words.add("cape");
        words.add("capes");
        words.add("caps");
        words.add("car");
        words.add("care");
        words.add("cares");
        words.add("carl");
        words.add("carp");
        words.add("cart");
        words.add("carts");
        words.add("case");
        words.add("cases");
        words.add("cast");
        words.add("casts");
        words.add("cat");
        words.add("cate");
        words.add("cats");
        words.add("cave");
        words.add("caves");
        words.add("ceil");
        words.add("cele");
        words.add("cell");
        words.add("cells");
        words.add("cent");
        words.add("cede");
        words.add("ceiling");
        words.add("ceilings");
        words.add("celt");
        words.add("celts");
        words.add("cend");
        words.add("cense");
        words.add("cents");
        words.add("cert");
        words.add("certs");
        words.add("cete");
        words.add("chad");
        words.add("chain");
        words.add("chains");
        words.add("chair");
        words.add("chairs");
        words.add("cham");
        words.add("champ");
        words.add("champs");
        words.add("chance");
        words.add("chances");
        words.add("change");
        words.add("changes");
        words.add("chant");
        words.add("chants");
        words.add("chaos");
        words.add("chaos");
        words.add("chap");
        words.add("chape");
        words.add("chapel");
        words.add("chapes");
        words.add("chaps");
        words.add("char");
        words.add("chart");
        words.add("charts");
        words.add("chase");
        words.add("chases");
        words.add("chat");
        words.add("chats");
        words.add("cheap");
        words.add("cheat");
        words.add("cheats");
        words.add("check");
        words.add("checks");
        words.add("cheek");
        words.add("cheeks");
        words.add("cheer");
        words.add("cheers");
        words.add("chef");
        words.add("chefs");
        words.add("chem");
        words.add("chide");
        words.add("chief");
        words.add("chiefs");
        words.add("child");
        words.add("children");
        words.add("chill");
        words.add("chills");
        words.add("chime");
        words.add("chimes");
        words.add("chin");
        words.add("chine");
        words.add("chink");
        words.add("chips");
        words.add("chip");
        words.add("choice");
        words.add("choices");
        words.add("choir");
        words.add("choirs");
        words.add("choke");
        words.add("chokes");
        words.add("chomp");
        words.add("chomps");
        words.add("choose");
        words.add("chooses");
        words.add("chop");
        words.add("chops");
        words.add("chord");
        words.add("chords");
        words.add("chore");
        words.add("chores");
        words.add("choice");
        words.add("church");
        words.add("cinch");
        words.add("cine");
        words.add("cines");
        words.add("cing");
        words.add("circe");
        words.add("circuit");
        words.add("circuits");
        words.add("cire");
        words.add("cires");
        words.add("cork");
        words.add("corks");
        words.add("corn");
        words.add("corne");
        words.add("corns");
        words.add("corp");
        words.add("corps");
        words.add("corse");
        words.add("corses");
        words.add("cost");
        words.add("costs");
        words.add("could");
        words.add("count");
        words.add("counts");
        words.add("court");
        words.add("courts");
        words.add("cous");
        words.add("couse");
        words.add("cousin");
        words.add("cousins");
        words.add("cover");
        words.add("covers");
        words.add("cow");
        words.add("cowl");
        words.add("cowls");
        words.add("cows");

        guideLabel = new JLabel("Unscramble the letters to form a valid English word");
        guideLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        guideLabel.setBounds(20, 20, 400, 30);
        add(guideLabel);

        currentWord = getRandomWord();
        wordLabel = new JLabel(currentWord);
        wordLabel.setFont(new Font("Arial", Font.BOLD, 40));
        wordLabel.setBounds(50, 50, 400, 50);

        inputField = new JTextField(15);
        inputField.setFont(new Font("Arial", Font.PLAIN, 30));
        inputField.setBounds(50, 120, 300, 40);

        submitButton = new JButton("Submit");
        submitButton.setFont(new Font("Arial", Font.BOLD, 30));
        submitButton.setBounds(50, 180, 300, 40);

        score = 0;
        scoreLabel = new JLabel("Score: " + score);
        scoreLabel.setFont(new Font("Arial", Font.BOLD, 30));
        scoreLabel.setBounds(50, 240, 250, 40);

        setLayout(null);
        add(wordLabel);
        add(inputField);
        add(submitButton);
        add(scoreLabel);

        submitButton.addActionListener((e) -> {
            String input = inputField.getText().trim();
            if (!input.isEmpty()) {
                if (isAnagram(input, currentWord)) {
                    score++;
                    scoreLabel.setText("Score: " + score);
                    JOptionPane.showMessageDialog(this, "Correct! Your score is " + score);
                } else {
                    JOptionPane.showMessageDialog(this, "Incorrect. Try again!");
                }
                currentWord = getRandomWord();
                wordLabel.setText(currentWord);
                inputField.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Please enter a word.");
            }
        });
    }

    private boolean isAnagram(String input, String word) {
        char[] inputArray = input.toCharArray();
        char[] wordArray = word.toCharArray();
        Arrays.sort(inputArray);
        Arrays.sort(wordArray);
        return Arrays.equals(inputArray, wordArray);
    }

    private String getRandomWord() {
        return words.get((int) (Math.random() * words.size()));
    }
    
    public void initializeGame() {
        JFrame frame = new JFrame("Anagrams Game");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.add(this);
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
       SwingUtilities.invokeLater(() -> {
            AnagramsGame game = new AnagramsGame();
            game.initializeGame();
        });
    }
}
