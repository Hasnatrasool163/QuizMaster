package Concepts;

import javax.swing.SwingUtilities;

public class ConcurrencyGUI extends AbstractConceptsGUI {

    public ConcurrencyGUI() {
        super("Concurrency in Java");
    }

    @Override
    protected String getTheoryText() {
        return """
               Concurrency in Java allows multiple tasks to execute simultaneously.
               
               Key Concepts:
               1. Threads vs. Processes
               2. Thread Lifecycle: Creation, States, Termination
               3. Synchronization and Locks
               4. Executors and Thread Pools
               
               Example of Creating Threads in Java:
               class MyThread extends Thread {
                   public void run() {
                       System.out.println("Thread running...");
                   }
               }
               """;
    }

    @Override
    protected String getExampleCode() {
        return """
               public class Main {
                   // Example of Creating Threads in Java
                   public static void main(String[] args) {
                       Thread thread = new Thread(() -> {
                           System.out.println("Thread running...");
                       });
                       thread.start();
                   }
               }
               """;
    }

    @Override
    protected void addQuizQuestions() {
        addQuizQuestion("Concurrency in Java allows multiple tasks to execute simultaneously.", true);
        addQuizQuestion("Processes in Java are lighter-weight than Threads.", false);
        addQuizQuestion("Thread.sleep() method in Java throws InterruptedException.", true);
        addQuizQuestion("Synchronization in Java is used to prevent thread interference and memory consistency errors.", true);
        addQuizQuestion("Executor framework in Java does not support thread pools.", false);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ConcurrencyGUI frame = new ConcurrencyGUI();
            frame.setVisible(true);
        });
    }
}
