package Games;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.*;
import java.util.List;

public class DesignPatternsGame extends JFrame {

    private Map<String, String> designPatterns; 
    private List<String> shuffledKeys; 

    private JLabel patternLabel;
    private JEditorPane descriptionArea;
    private JButton nextButton;

    private int currentIndex;

    public DesignPatternsGame() {
        setTitle("Design Patterns Game");
        setSize(900,600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null); 
        initializeDesignPatterns();

        
        shuffledKeys = new ArrayList<>(designPatterns.keySet());
        Collections.shuffle(shuffledKeys);

        patternLabel = new JLabel();
        patternLabel.setFont(new Font("Arial", Font.BOLD, 18));
        descriptionArea = new JEditorPane();
        descriptionArea.setBackground(Color.ORANGE);
        descriptionArea.setForeground(Color.BLACK);
        descriptionArea.setSelectedTextColor(Color.red);
        descriptionArea.setContentType("text/html"); 
//        descriptionArea.setFont(new Font("Tahoma",Font.BOLD,20));
        descriptionArea.setEditable(false);
        descriptionArea.setAutoscrolls(false);
        JScrollPane scrollPane = new JScrollPane(descriptionArea);

        nextButton = new JButton("Next");
        nextButton.addActionListener((ActionEvent e) -> {
            showNextPattern();
        });

        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        topPanel.add(patternLabel);

        JPanel centerPanel = new JPanel(new BorderLayout(10, 10));
        centerPanel.add(scrollPane, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        bottomPanel.add(nextButton);

        mainPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(centerPanel, BorderLayout.CENTER);
        mainPanel.add(bottomPanel, BorderLayout.SOUTH);

        getContentPane().add(mainPanel);
        setVisible(true);
               
        currentIndex = 0;
        showNextPattern();
    }

  private void initializeDesignPatterns() {
    designPatterns = new HashMap<>();
    designPatterns.put("Singleton", """
                                    Ensure a class has only one instance and provide a global point of access to it.
                                    Example: `public class Singleton { private static Singleton instance; public static Singleton getInstance() { if (instance == null) { instance = new Singleton(); } return instance; } }`""");

    designPatterns.put("Factory Method", """
                                         Define an interface for creating an object, but let subclasses decide which class to instantiate.
                                         Example: `public abstract class Factory { public abstract Product createProduct(); }`""");

    designPatterns.put("Observer", """
                                   Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.
                                   Example: `public class Subject { private List<Observer> observers; public void notifyObservers() { for (Observer observer : observers) { observer.update(); } } }`""");

    designPatterns.put("Decorator", """
                                    Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.
                                    Example: `public class Decorator implements Component { private Component component; public Decorator(Component component) { this.component = component; } public void operation() { component.operation(); } }`""");

    designPatterns.put("Adapter", """
                                  Convert the interface of a class into another interface clients expect. Adapters let classes work together that couldn't otherwise because of incompatible interfaces.
                                  Example: `public class Adapter implements Target { private Adaptee adaptee; public Adapter(Adaptee adaptee) { this.adaptee = adaptee; } public void request() { adaptee.specificRequest(); } }`""");

    designPatterns.put("Facade", """
                                 Provide a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use.
                                 Example: `public class Facade { private Subsystem subsystem; public Facade(Subsystem subsystem) { this.subsystem = subsystem; } public void operation() { subsystem.operation1(); subsystem.operation2(); } }`""");

    designPatterns.put("Proxy", """
                                Provide a surrogate or placeholder for another object to control access to it.
                                Example: `public class Proxy implements Subject { private RealSubject realSubject; public Proxy(RealSubject realSubject) { this.realSubject = realSubject; } public void request() { realSubject.request(); } }`""");

    designPatterns.put("Command", """
                                  Encapsulate a request as an object, thereby allowing for parameterization of clients with different requests, queue or log requests, and support undoable operations.
                                  Example: `public class Command { private Receiver receiver; public Command(Receiver receiver) { this.receiver = receiver; } public void execute() { receiver.action(); } }`""");

    designPatterns.put("Bridge", """
                                 Decouple an abstraction from its implementation so that the two can vary independently.
                                 Example: `public abstract class Bridge { private Implementor implementor; public Bridge(Implementor implementor) { this.implementor = implementor; } public abstract void operation(); }`""");

    designPatterns.put("Iterator", """
                                   Provide a way to access the elements of an aggregate object sequentially without exposing its underlying representation.
                                   Example: `public class Iterator { private Aggregate aggregate; public Iterator(Aggregate aggregate) { this.aggregate = aggregate; } public Object next() { return aggregate.getNext(); } }`""");

    designPatterns.put("Composite", """
                                    Compose objects into tree structures to represent part-whole hierarchies. Composite lets clients treat individual objects and compositions of objects uniformly.
                                    Example: `public class Composite extends Component { private List<Component> children; public void add(Component component) { children.add(component); } public void operation() { for (Component component : children) { component.operation(); } } }`""");

    designPatterns.put("Strategy", """
                                   Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it.
                                   Example: `public class Strategy { private Algorithm algorithm; public Strategy(Algorithm algorithm) { this.algorithm = algorithm; } public void execute() { algorithm.execute(); } }`""");

    designPatterns.put("Template Method", """
                                          Define the skeleton of an algorithm in an operation, deferring some steps to subclasses. Template Method lets subclasses redefine certain steps of an algorithm without changing its structure.
                                          Example: `public abstract class TemplateMethod { public final void templateMethod() { step1(); step2(); step3(); } public abstract void step1(); public abstract void step2(); public abstract void step3(); }`""");
}


    private void showNextPattern() {
        if (currentIndex < shuffledKeys.size()) {
            String key = shuffledKeys.get(currentIndex);
            patternLabel.setText("Design Pattern: " + key);
            descriptionArea.setText("<html><body><font face=\"Tahoma\" size=\"22\">" + designPatterns.get(key).replace("{", "{\n").replace(":", ":\n").replace("Example", "\nExample").replace("}", "}\n").replace(";", ";\n").replace("\n", "<br>") + "</font></body></html>");
            currentIndex++;
        } else {
            JOptionPane.showMessageDialog(this, "You have reviewed all design patterns. Game Over!");
            System.exit(0); 
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(DesignPatternsGame::new);
    }
}