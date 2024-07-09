package Java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author MuhammadHasnatRasool
 */
// first short questions frame for java 
public class ShortQuestions_Frame {
   static JFrame frame;

    private static final int FONT_SIZE = 18;
    private static final int WIDTH = 900;
    private static final int HEIGHT = 600;

    public static void main(String[] args) {
        createFrame();
        frame.setVisible(true);
    }

    public static JFrame createFrame() {
        frame = new JFrame("Practice Questions");
        frame.add(createUI());
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLocationByPlatform(true);
        return frame;
    }

    private static JComponent createUI() {
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setPreferredSize(new Dimension(WIDTH, HEIGHT));

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 1));

        for (int i = 0; i < 26; i++) {
            panel.add(createQuestionPanel(i));
        }

        scrollPane.setViewportView(panel);
        return scrollPane;
    }

    private static JComponent createQuestionPanel(int index) {
        JLabel questionText = new JLabel();
        questionText.setForeground(new Color(30, 144, 255));
        questionText.setFont(new Font("Tahoma", Font.BOLD, FONT_SIZE));

        JTextArea answerText = new JTextArea(5, 20);
        answerText.setFont(new Font("Tahoma", Font.PLAIN, FONT_SIZE));
        answerText.setBackground(Color.ORANGE);
        answerText.setForeground(Color.BLACK);
        answerText.setAutoscrolls(true);
        answerText.setOpaque(true);
        answerText.setSelectedTextColor(Color.red);
        answerText.setLineWrap(true);
        answerText.setWrapStyleWord(true);
        answerText.setVisible(false);

        JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, questionText, answerText);
        splitPane.setAutoscrolls(true);
        splitPane.setDividerLocation(100);
        int preferredHeight = answerText.getPreferredSize().height;
        splitPane.setPreferredSize(new Dimension(WIDTH, preferredHeight + 50));

        addQuestionListeners(questionText, answerText);

        switch (index) {
            case 0:
                questionText.setText("What is the purpose of the 'public static void main' method in Java?");
                answerText.setText("The 'public static void main' method is the entry point of a Java program. It is called by the Java Virtual Machine (JVM) when the program is started.");
                break;
            case 1:
                questionText.setText("What is the difference between '==' and '.equals()' in Java?");
                answerText.setText("The '==' operator checks if two objects are the same instance, while the '.equals()' method checks if two objects have the same value.");
                break;
            case 2:
                questionText.setText("What is the purpose of the 'finally' block in Java?");
                answerText.setText("The 'finally' block is used to execute code that must be run regardless of whether an exception is thrown or not.");
                break;
            case 3:
                questionText.setText("What is the difference between 'break' and 'continue' in Java?");
                answerText.setText("The 'break' statement exits the current loop or switch statement, while the 'continue' statement skips to the next iteration of the loop.");
                break;
            case 4:
                questionText.setText("What is the purpose of the 'super' keyword in Java?");
                answerText.setText("The 'super' keyword is used to access the members of a superclass from a subclass.");
                break;
            case 5:
                questionText.setText("What is the purpose of the 'this' keyword in Java?");
                answerText.setText("The 'this' keyword is used to refer to the current object.");
                break;
            case 6:
                questionText.setText("What is the difference between 'abstract' and 'interface' in Java?");
                answerText.setText("An abstract class provides a partial implementation, while an interface provides a contract.");
                break;
            case 7:
                questionText.setText("What is the purpose of the 'static' keyword in Java?");
                answerText.setText("The 'static' keyword is used to create class-level variables and methods.");
                break;
            case 8:
                questionText.setText("What is the difference between 'String' and 'StringBuffer' in Java?");
                answerText.setText("String is immutable, while StringBuffer is mutable.");
                break;
            case 9:
                questionText.setText("What is the purpose of the 'finalize' method in Java?");
                answerText.setText("The 'finalize' method is called by the garbage collector before an object is destroyed.");
                break;
            case 10:
                questionText.setText("What is the difference between 'abstract' and 'interface' in Java?");
                answerText.setText("An abstract class provides a partial implementation, while an interface provides a contract. An abstract class can have both abstract and concrete methods, while an interface can only have abstract methods.");
                break;

            case 11:
                questionText.setText("What is the purpose of the 'clone()' method in Java?");
                answerText.setText("The 'clone()' method creates a copy of an object. It is used to create a new instance of the same class, with the same state as the original object.");
                break;

            case 12:
                questionText.setText("What is the difference between 'HashMap' and 'TreeMap' in Java?");
                answerText.setText("HashMap is a hash table-based implementation, while TreeMap is a balanced binary search tree-based implementation. HashMap is faster for lookup and insertion, while TreeMap maintains a sorted order.");
                break;

            case 13:
                questionText.setText("What is the purpose of the 'synchronized' keyword in Java?");
                answerText.setText("The 'synchronized' keyword is used to ensure thread safety. It locks an object, preventing other threads from accessing it until the lock is released.");
                break;

            case 14:
                questionText.setText("What is the difference between 'HTTP' and 'HTTPS'?");
                answerText.setText("HTTP is a protocol for transferring data over the internet, while HTTPS is a secure version of HTTP that encrypts data using SSL/TLS.");
                break;

            case 15:
                questionText.setText("What is the purpose of the 'finally' block in Java?");
                answerText.setText("The 'finally' block is used to execute code that must be run regardless of whether an exception is thrown or not. It is used for cleanup code, such as closing files or releasing resources.");
                break;

            case 16:
                questionText.setText("What is the difference between 'overloading' and 'overriding' in Java?");
                answerText.setText("Overloading is when multiple methods with the same name can be defined with different parameters. Overriding is when a subclass provides a different implementation of a method already defined in its superclass.");
                break;

            case 17:
                questionText.setText("What is the purpose of the 'transient' keyword in Java?");
                answerText.setText("The 'transient' keyword is used to indicate that a field should not be serialized. It is used for fields that are not important for the object's state, such as temporary variables.");
                break;

            case 18:
                questionText.setText("What is the difference between 'ArrayList' and 'LinkedList' in Java?");
                answerText.setText("ArrayList is a resizable array-based implementation, while LinkedList is a doubly-linked list-based implementation. ArrayList is faster for random access, while LinkedList is faster for insertion and deletion.");
                break;

            case 19:
                questionText.setText("What is the purpose of the 'volatile' keyword in Java?");
                answerText.setText("The 'volatile' keyword is used to indicate that a field may be modified by multiple threads. It ensures that changes to the field are visible to all threads.");
                break;

            case 20:
                questionText.setText("What is the difference between 'static' and 'instance' methods in Java?");
                answerText.setText("Static methods are associated with a class, while instance methods are associated with an object. Static methods can only access static fields and methods, while instance methods can access both static and instance fields and methods.");
                break;

            case 21:
                questionText.setText("What is the purpose of the 'enum' keyword in Java?");
                answerText.setText("The 'enum' keyword is used to define a set of named constants. Enums can have methods and fields, and can be used in switch statements.");
                break;

            case 22:
                questionText.setText("What is the difference between 'HashSet' and 'TreeSet' in Java?");
                answerText.setText("HashSet is a hash table-based implementation, while TreeSet is a balanced binary search tree-based implementation. HashSet is faster for lookup and insertion, while TreeSet maintains a sorted order.");
                break;

            case 23:
                questionText.setText("What is the purpose of the 'assert' keyword in Java?");
                answerText.setText("The 'assert' keyword is used to assert that a condition is true. If the condition is false, an AssertionError is thrown.");
                break;

            case 24:
                questionText.setText("What is the difference between 'InputStream' and 'OutputStream' in Java?");
                answerText.setText("InputStream is used to read data from a source, while OutputStream is used to write data to a destination.");
                break;

            case 25:
                questionText.setText("What is the purpose of the 'ThreadLocal' class in Java?");
                answerText.setText("The ThreadLocal class is used to create variables that are local to a thread. It is used to store data that is specific to a thread, such as user preferences.");
                break;

        }

        return splitPane;
    }

    private static void addQuestionListeners(JLabel questionText, final JTextArea answerText) {
        questionText.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                answerText.setVisible(true);
            }

            public void mouseWheelMoved(MouseEvent e) {
                answerText.setVisible(true);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    answerText.setVisible(false);
                }
            }
        });
    }

    static class main {

        public main(String[] string) {
        JFrame frame = createFrame();
        frame.add(createUI());
        frame.pack();
        frame.setVisible(true);
        }
    }
}
