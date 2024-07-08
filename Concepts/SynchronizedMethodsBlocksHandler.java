package Concepts;

class SynchronizedMethodsBlocksHandler implements ConceptHandler {
    public String getTheoryText() {
        return """
               Synchronized Methods:
               1. A method declared with the synchronized keyword is thread-safe.
               2. Only one thread can access a synchronized method at a time.
               
               Synchronized Blocks:
               1. Allows more fine-grained control over which part of the code is synchronized.
               2. Provides a way to synchronize only a portion of a method.
               """;
    }

    public String getExampleCode() {
        return """
               class Counter {
                   private int count = 0;
                   
                   public synchronized void increment() {
                       count++;
                   }
                   
                   public void incrementWithBlock() {
                       synchronized (this) {
                           count++;
                       }
                   }
                   
                   public int getCount() {
                       return count;
                   }
               }
               
               public class TestSynchronization {
                   public static void main(String[] args) {
                       Counter counter = new Counter();
                       
                       Thread t1 = new Thread(() -> {
                           for (int i = 0; i < 1000; i++) {
                               counter.increment();
                           }
                       });
                       
                       Thread t2 = new Thread(() -> {
                           for (int i = 0; i < 1000; i++) {
                               counter.incrementWithBlock();
                           }
                       });
                       
                       t1.start();
                       t2.start();
                       
                       try {
                           t1.join();
                           t2.join();
                       } catch (InterruptedException e) {
                           e.printStackTrace();
                       }
                       
                       System.out.println("Count: " + counter.getCount()); // Outputs: Count: 2000
                   }
               }
               """;
    }

    public String getQuizQuestions() {
        return """
               1. A method declared with the synchronized keyword is thread-safe. (True/False)
               2. Only one thread can access a synchronized method at a time. (True/False)
               3. In the example, the final count will always be 2000. (True/False)
               4. Synchronized blocks provide a way to synchronize only a portion of a method. (True/False)
               """;
    }

    public String[] getCorrectAnswers() {
        return new String[] {
            "True",
            "True",
            "True",
            "True"
        };
    }
}
