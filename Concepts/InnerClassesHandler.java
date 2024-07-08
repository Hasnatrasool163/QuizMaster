package Concepts;


class InnerClassesHandler implements ConceptHandler {
    public String getTheoryText() {
        return """
               Inner Classes:
               1. Classes defined within another class.
               2. Can access the members of the outer class.
               
               Types of Inner Classes:
               1. Member Inner Class: Defined at the member level of a class.
               2. Static Nested Class: Defined with the static keyword.
               3. Local Inner Class: Defined within a method.
               4. Anonymous Inner Class: Defined without a class name and used for immediate use.
               """;
    }

    public String getExampleCode() {
        return """
               public class OuterClass {
                   private String message = "Hello from the Outer class!";
                   
                   class MemberInnerClass {
                       public void display() {
                           System.out.println(message);
                       }
                   }
                   
                   static class StaticNestedClass {
                       public void display() {
                           System.out.println("Hello from the Static Nested class!");
                       }
                   }
                   
                   public void localInnerClassMethod() {
                       class LocalInnerClass {
                           public void display() {
                               System.out.println("Hello from the Local Inner class!");
                           }
                       }
                       
                       LocalInnerClass localInnerClass = new LocalInnerClass();
                       localInnerClass.display();
                   }
                   
                   public void anonymousInnerClassMethod() {
                       Runnable runnable = new Runnable() {
                           public void run() {
                               System.out.println("Hello from the Anonymous Inner class!");
                           }
                       };
                       
                       new Thread(runnable).start();
                   }
                   
                   public static void main(String[] args) {
                       OuterClass outer = new OuterClass();
                       
                       // Member Inner Class
                       OuterClass.MemberInnerClass memberInner = outer.new MemberInnerClass();
                       memberInner.display();
                       
                       // Static Nested Class
                       OuterClass.StaticNestedClass staticNested = new OuterClass.StaticNestedClass();
                       staticNested.display();
                       
                       // Local Inner Class
                       outer.localInnerClassMethod();
                       
                       // Anonymous Inner Class
                       outer.anonymousInnerClassMethod();
                   }
               }
               """;
    }

    public String getQuizQuestions() {
        return """
               1. Inner classes can access the members of the outer class. (True/False)
               2. Static nested classes can access the non-static members of the outer class. (True/False)
               3. Local inner classes are defined within a method. (True/False)
               4. Anonymous inner classes are used for immediate use without a class name. (True/False)
               """;
    }

    public String[] getCorrectAnswers() {
        return new String[] {
            "True",
            "False",
            "True",
            "True"
        };
    }
}
