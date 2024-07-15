package firstListFrames;

/**
 * @author MuhammadHasnatRasool
 */
import frame.Output_Questions;
import java.awt.event.ActionEvent;
import java.util.Collections;
import javax.swing.JOptionPane;

public class Java_Output extends Output_Questions {

    public Java_Output(String name) {
        super(name);
        loadQuestions();
        setupQuiz();
    }

    private void setupQuiz() {
        shuffleIndices();
        selectTotalQuestions();
        setCurrentQuestion();
        setQuestionTextAndOptions();
    }

    private void shuffleIndices() {
        for (int i = 0; i < questions.size(); i++) {
            indices.add(i);
        }
        Collections.shuffle(indices);
    }

    @Override
    public void setQuestionTextAndOptions() {

        qno.setText("Question #: " + currentQno);
        question.setText("<html>" + questions.get(currentQuestionIndex).replace("{", "{\n").replace(":", ":\n").replace("}", "}\n").replace(";", ";\n").replace("\n", "<br>") + "</html>");
        opt1.setText(options.get(currentQuestionIndex).split(", ")[0]);
        opt2.setText(options.get(currentQuestionIndex).split(", ")[1]);
        opt3.setText(options.get(currentQuestionIndex).split(", ")[2]);
        opt4.setText(options.get(currentQuestionIndex).split(", ")[3]);

    }

    // output : 29
    @Override
    public final void loadQuestions() {

//        questions.add("What is the output of the following code:\n "
//                + "public class Main {\n"
//                + " public static void main(String[] args) "
//                + "{ \n"
//                + "List<Integer> list = new ArrayList<>();\n"
//                + " list.add(1);\n"
//                + " list.add(2);\n "
//                + "System.out.println(list.get(2)); \n"
//                + "}\n "
//                + "   \n              }");
//        options.add("A) 1, B) 2, C) null, D) IndexOutOfBoundsException");
//        answers.add("D) IndexOutOfBoundsException");
//
//        questions.add("What is the output of the following code: "
//                + "public class Main {"
//                + " public static void main(String[] args) "
//                + "{ "
//                + "String str = \"Hello\";"
//                + " System.out.println(str.substring(5, 2)); "
//                + "} "
//                + " }");
//
//        options.add("A) Hello, B) ello, C) StringIndexOutOfBoundsException, D) null");
//        answers.add("C) StringIndexOutOfBoundsException");
//
//        questions.add("What is the output of the following code: "
//                + "public class Main {"
//                + " public static void main(String[] args) "
//                + "{ "
//                + "String str = null; "
//                + " System.out.println(str.toString()); "
//                + "} "
//                + " }");
//
//        options.add("A) null, B) NullPointerException, C) toString(), D) Hello");
//        answers.add("B) NullPointerException");
//
//        questions.add("What is the output of the following code: "
//                + "public class Main {"
//                + " public static void main(String[] args) "
//                + "{ "
//                + "Printable printable = new Document(); "
//                + " printable.print(); "
//                + "} "
//                + "} "
//                + "interface Printable { "
//                + " void print(); "
//                + "} "
//                + "class Document implements Printable { "
//                + " public void print() { "
//                + " System.out.println(\"Printing a document\"); "
//                + " } "
//                + "}");
//
//        options.add("A) Printing a document, B) null, C) Printable, D) Document");
//        answers.add("A) Printing a document");
//
//        questions.add("What is the output of the following code: "
//                + "public class Main {"
//                + " public static void main(String[] args) "
//                + "{ "
//                + "Shape shape = new Circle(); "
//                + " shape.draw(); "
//                + "} "
//                + "} "
//                + "abstract class Shape { "
//                + " public abstract void draw(); "
//                + "} "
//                + "class Circle extends Shape { "
//                + " public void draw() { "
//                + " System.out.println(\"Drawing a circle\"); "
//                + " } "
//                + "}");
//
//        options.add("A) Drawing a circle, B) Drawing a shape, C) null, D) Circle");
//        answers.add("A) Drawing a circle");
//        questions.add("What is the output of the following code: "
//                + "public class Main {"
//                + " public static void main(String[] args) "
//                + "{ "
//                + "Animal animal = new Dog(); "
//                + " animal.sound(); "
//                + "} "
//                + "} "
//                + "class Animal {"
//                + " public void sound() {"
//                + " System.out.println(\"Animal makes a sound\");"
//                + " }"
//                + "} "
//                + "class Dog extends Animal {"
//                + " @Override"
//                + " public void sound() {"
//                + " System.out.println(\"Dog barks\");"
//                + " }"
//                + "}");
//
//        options.add("A) Animal makes a sound, B) Dog barks, C) No output, D) Error");
//        answers.add("B) Dog barks");
//
//        questions.add("What is the output of the following code: "
//                + "public class Main {"
//                + " public static void main(String[] args) "
//                + "{ "
//                + "Thread thread = new Thread(new Runnable() {"
//                + " public void run() {"
//                + " System.out.println(\"Thread is running\");"
//                + " }"
//                + "});"
//                + " thread.start();"
//                + "} "
//                + "}");
//
//        options.add("A) Thread is running, B) No output, C) Error, D) Program terminates");
//        answers.add("A) Thread is running");
//
//        questions.add("What is the output of the following code: "
//                + "public class Main {"
//                + " public static void main(String[] args) "
//                + "{ "
//                + "List<Integer> list = new ArrayList<>();"
//                + "list.add(1);"
//                + " list.add(2);"
//                + " list.add(3);"
//                + " System.out.println(list.get(2));"
//                + "} "
//                + "}");
//
//        options.add("A) 1, B) 2, C) 3, D) IndexOutOfBoundsException");
//        answers.add("C) 3");
//
//        questions.add("What is the output of the following code:\n"
//                + "public class Main {\n"
//                + "    public static void main(String[] args) {\n"
//                + "        StringBuilder sb = new StringBuilder(\"Hello\");\n"
//                + "        sb.insert(1, \"ey\");\n"
//                + "        System.out.println(sb.toString());\n"
//                + "    }\n"
//                + "}");
//
//        options.add("A) Heyllo, B) Hleyllo, C) Helley, D) Hello");
//        answers.add("B) Hleyllo");
//
//        questions.add("What is the output of the following code:\n"
//                + "public class Main {\n"
//                + "    public static void main(String[] args) {\n"
//                + "        int[] arr = {1, 2, 3};\n"
//                + "        for (int i : arr) {\n"
//                + "            arr[i] = arr[i] * 2;\n"
//                + "        }\n"
//                + "        System.out.println(arr[2]);\n"
//                + "    }\n"
//                + "}");
//
//        options.add("A) 2, B) 4, C) 6, D) ArrayIndexOutOfBoundsException");
//        answers.add("C) 6");
//
//        questions.add("What is the output of the following code:\n"
//                + "public class Main {\n"
//                + "    public static void main(String[] args) {\n"
//                + "        try {\n"
//                + "            int result = 10 / 0;\n"
//                + "        } catch (ArithmeticException e) {\n"
//                + "            System.out.println(\"ArithmeticException\");\n"
//                + "        }\n"
//                + "    }\n"
//                + "}");
//
//        options.add("A) 10, B) ArithmeticException, C) 0, D) RuntimeException");
//        answers.add("B) ArithmeticException");
//
//        questions.add("What is the output of the following code:\n"
//                + "public class Main {\n"
//                + "    public static void main(String[] args) {\n"
//                + "        String str = \"Java\";\n"
//                + "        str = str.concat(\" Programming\");\n"
//                + "        System.out.println(str);\n"
//                + "    }\n"
//                + "}");
//
//        options.add("A) Java, B) Java Programming, C) Programming, D) null");
//        answers.add("B) Java Programming");
//
//        questions.add("What is the output of the following code:\n"
//                + "public class Main {\n"
//                + "    public static void main(String[] args) {\n"
//                + "        int[] arr = {1, 2, 3};\n"
//                + "        for (int i = 0; i < arr.length; i++) {\n"
//                + "            arr[i] = arr[i] + 1;\n"
//                + "        }\n"
//                + "        System.out.println(arr[1]);\n"
//                + "    }\n"
//                + "}");
//
//        options.add("A) 1, B) 2, C) 3, D) 4");
//        answers.add("D) 4");
//
//        questions.add("What is the output of the following code:\n"
//                + "public class Main {\n"
//                + "    public static void main(String[] args) {\n"
//                + "        int a = 5;\n"
//                + "        int b = 10;\n"
//                + "        int max = (a > b) ? a : b;\n"
//                + "        System.out.println(max);\n"
//                + "    }\n"
//                + "}");
//
//        options.add("A) 5, B) 10, C) 0, D) Error");
//        answers.add("B) 10");
//
//        questions.add("What is the output of the following code:\n"
//                + "public class Main {\n"
//                + "    public static void main(String[] args) {\n"
//                + "        String s1 = \"Hello\";\n"
//                + "        String s2 = \"Hello\";\n"
//                + "        System.out.println(s1 == s2);\n"
//                + "    }\n"
//                + "}");
//
//        options.add("A) true, B) false, C) Compilation error, D) Runtime error");
//        answers.add("A) true");
//
//        questions.add("What is the output of the following code:\n"
//                + "public class Main {\n"
//                + "    public static void main(String[] args) {\n"
//                + "        String s1 = new String(\"Hello\");\n"
//                + "        String s2 = new String(\"Hello\");\n"
//                + "        System.out.println(s1 == s2);\n"
//                + "    }\n"
//                + "}");
//
//        options.add("A) true, B) false, C) Compilation error, D) Runtime error");
//        answers.add("B) false");
//
//        questions.add("What is the output of the following code:\n"
//                + "public class Main {\n"
//                + "    public static void main(String[] args) {\n"
//                + "        int a = 10;\n"
//                + "        int b = 5;\n"
//                + "        System.out.println(a + b);\n"
//                + "    }\n"
//                + "}");
//
//        options.add("A) 5, B) 10, C) 15, D) 0");
//        answers.add("C) 15");
//
//        questions.add("What is the output of the following code:\n"
//                + "public class Main {\n"
//                + "    public static void main(String[] args) {\n"
//                + "        String s = \"Hello\";\n"
//                + "        s = s + \" World\";\n"
//                + "        System.out.println(s);\n"
//                + "    }\n"
//                + "}");
//
//        options.add("A) Hello, B) Hello World, C) World, D) null");
//        answers.add("B) Hello World");
//
//        questions.add("What is the output of the following code:\n"
//                + "public class Main {\n"
//                + "    public static void main(String[] args) {\n"
//                + "        int[] arr = {1, 2, 3, 4, 5};\n"
//                + "        int sum = 0;\n"
//                + "        for (int num : arr) {\n"
//                + "            sum += num;\n"
//                + "        }\n"
//                + "        System.out.println(sum);\n"
//                + "    }\n"
//                + "}");
//
//        options.add("A) 10, B) 11, C) 12, D) 15");
//        answers.add("D) 15");
//
//        questions.add("What is the output of the following code:\n"
//                + "public class Main {\n"
//                + "    public static void main(String[] args) {\n"
//                + "        int x = 5;\n"
//                + "        int y = 10;\n"
//                + "        int z = 15;\n"
//                + "        int result = x + y * z;\n"
//                + "        System.out.println(result);\n"
//                + "    }\n"
//                + "}");
//
//        options.add("A) 75, B) 200, C) 155, D) 65");
//        answers.add("C) 155");
//
//        questions.add("What is the output of the following code:\n"
//                + "public class Main {\n"
//                + "    public static void main(String[] args) {\n"
//                + "        String s1 = \"abc\";\n"
//                + "        String s2 = new String(\"abc\");\n"
//                + "        System.out.println(s1.equals(s2));\n"
//                + "    }\n"
//                + "}");
//
//        options.add("A) true, B) false, C) Compilation error, D) Runtime error");
//        answers.add("A) true");
//
//        questions.add("What is the output of the following code:\n"
//                + "public class Main {\n"
//                + "    public static void main(String[] args) {\n"
//                + "        int a = 10;\n"
//                + "        int b = 20;\n"
//                + "        System.out.println(a > b ? \"a is greater\" : \"b is greater\");\n"
//                + "    }\n"
//                + "}");
//
//        options.add("A) a is greater, B) b is greater, C) 10, D) 20");
//        answers.add("B) b is greater");
//
//        questions.add("What is the output of the following code:\n"
//                + "public class Main {\n"
//                + "    public static void main(String[] args) {\n"
//                + "        for (int i = 0; i < 5; i++) {\n"
//                + "            if (i == 2) {\n"
//                + "                continue;\n"
//                + "            }\n"
//                + "            System.out.println(i);\n"
//                + "        }\n"
//                + "    }\n"
//                + "}");
//
//        options.add("A) 0 1 2 3 4, B) 0 1 3 4, C) 0 1 2 4, D) 0 1 2 3");
//        answers.add("B) 0 1 3 4");
//
//        questions.add("What is the output of the following code:\n"
//                + "public class Main {\n"
//                + "    public static void main(String[] args) {\n"
//                + "        int x = 5;\n"
//                + "        while (x > 0) {\n"
//                + "            x--;\n"
//                + "        }\n"
//                + "        System.out.println(x);\n"
//                + "    }\n"
//                + "}");
//
//        options.add("A) 5, B) 4, C) 1, D) 0");
//        answers.add("D) 0");
//
//        questions.add("What is the output of the following code:\n"
//                + "public class Main {\n"
//                + "    public static void main(String[] args) {\n"
//                + "        String str = \"Java\";\n"
//                + "        str = str.replace('a', 'o');\n"
//                + "        System.out.println(str);\n"
//                + "    }\n"
//                + "}");
//
//        options.add("A) Java, B) Jovo, C) Jova, D) Jovo");
//        answers.add("B) Jovo");
//
//        questions.add("What is the output of the following code:\n"
//                + "public class Main {\n"
//                + "    public static void main(String[] args) {\n"
//                + "        StringBuilder sb = new StringBuilder(\"Hello\");\n"
//                + "        sb.delete(1, 3);\n"
//                + "        System.out.println(sb.toString());\n"
//                + "    }\n"
//                + "}");
//
//        options.add("A) Hlo, B) Helo, C) Hllo, D) Hell");
//        answers.add("A) Hlo");
//
//        questions.add("What is the output of the following code:\n"
//                + "public class Main {\n"
//                + "    public static void main(String[] args) {\n"
//                + "        int a = 5;\n"
//                + "        a = a++ * 2;\n"
//                + "        System.out.println(a);\n"
//                + "    }\n"
//                + "}");
//
//        options.add("A) 5, B) 10, C) 6, D) 12");
//        answers.add("B) 10");
//
//        questions.add("What is the output of the following code:\n"
//                + "public class Main {\n"
//                + "    public static void main(String[] args) {\n"
//                + "        int a = 5;\n"
//                + "        int b = 10;\n"
//                + "        int c = 15;\n"
//                + "        System.out.println((a > b) && (b < c));\n"
//                + "    }\n"
//                + "}");
//
//        options.add("A) true, B) false, C) 15, D) Compilation error");
//        answers.add("B) false");
//
//        questions.add("What is the output of the following code:\n"
//                + "public class Main {\n"
//                + "    public static void main(String[] args) {\n"
//                + "        String str = \"Hello\";\n"
//                + "        System.out.println(str.charAt(1));\n"
//                + "    }\n"
//                + "}");
//
//        options.add("A) H, B) e, C) l, D) o");
//        answers.add("B) e");
        
        questions.add("What is the output of the following code? + public class Animal { + public int sound() { + return 10; + } + } + public class Dog extends Animal { + public int sound() { + return 20; + } + } + public class Main { + public static void main(String[] args) { + Animal myAnimal = new Dog(); + System.out.println(myAnimal.sound()); + } + }");
        options.add("A) 10, B) 20, C) 30, D) 40");
        answers.add("B) 20");

        questions.add("What is the output of the following code? + import java.util.*; + public class Main { + public static void main(String[] args) { + List<String> list = new ArrayList<>(Arrays.asList('A', 'B', 'C')); + list.remove(1); + System.out.println(list); + } + }");
        options.add("A) [A B], B) [B C], C) [A C], D) [C]");
        answers.add("C) [A C]");

//questions.add("What is the output of the following code? + import java.util.*; + public class Main { + public static void main(String[] args) { + Queue<Integer> queue = new LinkedList<>(); + queue.add(1); + queue.add(2); + queue.add(3); + System.out.println(queue.poll()); + System.out.println(queue.peek()); + } + }");
//options.add("A) 1 2", "B) 1 3", "C) 2 3", "D) 3 2");
//answers.add("A) 1 2");
//
//questions.add("What is the output of the following code? + import java.util.*; + class Box<T> { + private T t; + public void set(T t) { this.t = t; } + public T get() { return t; } + } + public class Main { + public static void main(String[] args) { + Box<String> stringBox = new Box<>(); + stringBox.set('Hello'); + System.out.println(stringBox.get()); + } + }");
//options.add("A) Hello", "B) null", "C) Error", "D) Box");
//answers.add("A) Hello");
//
//questions.add("What is the output of the following code? + import java.util.*; + public class Main { + public static void main(String[] args) { + List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)); + list.set(2, 10); + System.out.println(list); + } + }");
//options.add("A) [1, 2, 10, 4, 5]", "B) [1, 10, 3, 4, 5]", "C) [10, 2, 3, 4, 5]", "D) [1, 2, 3, 4, 10]");
//answers.add("A) [1, 2, 10, 4, 5]");
//
//questions.add("What is the output of the following code? + import java.io.*; + public class Main { + public static void main(String[] args) { + try (BufferedWriter writer = new BufferedWriter(new FileWriter('test.txt'))) { + writer.write('Hello World'); + } catch (IOException e) { + e.printStackTrace(); + } + }");
//options.add("A) FileNotFoundException", "B) IOException", "C) Hello World", "D) No output");
//answers.add("C) Hello World");
//
//questions.add("What is the output of the following code? + class A { + void display() { + System.out.println('A'); + } + } + class B extends A { + void display() { + System.out.println('B'); + } + } + public class Main { + public static void main(String[] args) { + A obj = new B(); + obj.display(); + } + }");
//options.add("A) A", "B) B", "C) A B", "D) Compilation error");
//answers.add("B) B");
//
//questions.add("What is the output of the following code? + import java.util.*; + public class Main { + public static void main(String[] args) { + Set<String> set = new HashSet<>(Arrays.asList('A', 'B', 'C')); + set.add('A'); + System.out.println(set); + } + }");
//options.add("A) [A, B, C, A]", "B) [A, B, C]", "C) [B, C]", "D) [A, A, B, B, C, C]");
//answers.add("B) [A, B, C]");
//
//questions.add("What is the output of the following code? + import java.util.*; + public class Main { + public static void main(String[] args) { + Stack<Integer> stack = new Stack<>(); + stack.push(1); + stack.push(2); + stack.push(3); + System.out.println(stack.pop()); + System.out.println(stack.peek()); + } + }");
//options.add("A) 1 2", "B) 3 2", "C) 2 3", "D) 1 3");
//answers.add("B) 3 2");
//
//questions.add("What is the output of the following code? + import java.util.*; + class GenericClass<T> { + private T t; + public void set(T t) { this.t = t; } + public T get() { return t; } + } + public class Main { + public static void main(String[] args) { + GenericClass<Integer> intClass = new GenericClass<>(); + intClass.set(123); + System.out.println(intClass.get()); + } + }");
//options.add("A) 123", "B) null", "C) Error", "D) GenericClass");
//answers.add("A) 123");
//
//questions.add("What is the output of the following code? + import java.util.*; + public class Main { + public static void main(String[] args) { + List<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5)); + list.add(2, 10); + System.out.println(list); + } + }");
//options.add("A) [1, 2, 10, 3, 4, 5]", "B) [1, 10, 2, 3, 4, 5]", "C) [10, 1, 2, 3, 4, 5]", "D) [1, 2, 3, 4, 5, 10]");
//answers.add("A) [1, 2, 10, 3, 4, 5]");
//
//questions.add("What is the output of the following code? + import java.io.*; + public class Main { + public static void main(String[] args) { + try (BufferedReader reader = new BufferedReader(new FileReader('test.txt'))) { + System.out.println(reader.readLine()); + } catch (IOException e) { + e.printStackTrace(); + } + }");
//options.add("A) FileNotFoundException", "B) IOException", "C) Contents of test.txt", "D) No output");
//answers.add("C) Contents of test.txt");
//
//questions.add("What is the output of the following code? + class Parent { + void show() { + System.out.println('Parent'); + } + } + class Child extends Parent { + void show() { + System.out.println('Child'); + } + } + public class Main { + public static void main(String[] args) { + Parent p = new Child(); + p.show(); + } + }");
//options.add("A) Parent", "B) Child", "C) Parent Child", "D) Compilation error");
//answers.add("B) Child");
//
//questions.add("What is the output of the following code? + import java.util.*; + public class Main { + public static void main(String[] args) { + Map<Integer, String> map = new HashMap<>(); + map.put(1, 'A'); + map.put(2, 'B'); + map.put(3, 'C'); + map.put(1, 'D'); + System.out.println(map.get(1)); + } + }");
//options.add("A) A", "B) B", "C) C", "D) D");
//answers.add("D) D");
//
//questions.add("What is the output of the following code? + import java.util.*; + public class Main { + public static void main(String[] args) { + Deque<Integer> deque = new LinkedList<>(); + deque.addFirst(1); + deque.addLast(2); + deque.addFirst(3); + System.out.println(deque); + } + }");
//options.add("A) [3, 1, 2]", "B) [1, 3, 2]", "C) [2, 1, 3]", "D) [1, 2, 3]");
//answers.add("A) [3, 1, 2]");

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
    }

    public static void main(String[] args) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(C_Output.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        new Java_Output(name).setVisible(true);
    }

}
