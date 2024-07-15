package firstListFrames;

/**
 * @author MuhammadHasnatRasool
 */
import frame.Output_Questions;
import java.awt.event.ActionEvent;
import java.util.Collections;


public class C_Plus_Plus_Output extends Output_Questions{
    

    public C_Plus_Plus_Output(String name) {
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


  
    // 20 output
    @Override
    public final void loadQuestions() {
      
        questions.add("""
                      What is the output of the following code:
                      #include <iostream>
                      using namespace std;
                      int main() {
                          int arr[3] = {1, 2, 3};
                          cout << arr[2] << endl;
                          return 0;
                      }""");

options.add("A) 1, B) 2, C) 3, D) Undefined behavior");
answers.add("C) 3");

questions.add("""
              What is the output of the following code:
              #include <iostream>
              using namespace std;
              int main() {
                  int x = 10 / 3;
                  cout << x << endl;
                  return 0;
              }""");

options.add("A) 3.333, B) 3, C) 0, D) Compilation error");
answers.add("B) 3");

questions.add("""
              What is the output of the following code:
              #include <iostream>
              using namespace std;
              int main() {
                  int x = 5;
                  int y = 10;
                  int z = x > y ? x : y;
                  cout << z << endl;
                  return 0;
              }""");

options.add("A) 5, B) 10, C) 15, D) Compilation error");
answers.add("B) 10");

questions.add("""
              What is the output of the following code:
              #include <iostream>
              using namespace std;
              int main() {
                  int x = 5;
                  while (x > 0) {
                      x--;
                  }
                  cout << x << endl;
                  return 0;
              }""");

options.add("A) 5, B) 4, C) 1, D) 0");
answers.add("D) 0");

questions.add("""
              What is the output of the following code:
              #include <iostream>
              using namespace std;
              void printMessage() {
                  cout << "Hello, World!" << endl;
              }
              int main() {
                  printMessage();
                  return 0;
              }""");

options.add("A) Hello, B) World!, C) Hello, World!, D) Compilation error");
answers.add("C) Hello, World!");

questions.add("""
              What is the output of the following code:
              #include <iostream>
              using namespace std;
              int main() {
                  string s = "Hello";
                  s += " World";
                  cout << s << endl;
                  return 0;
              }""");

options.add("A) Hello, B) World, C) Hello World, D) Compilation error");
answers.add("C) Hello World");

questions.add("""
              What is the output of the following code:
              #include <iostream>
              using namespace std;
              int main() {
                  string s = "Hello";
                  cout << s.length() << endl;
                  return 0;
              }""");

options.add("A) 4, B) 5, C) 6, D) Compilation error");
answers.add("B) 5");

questions.add("""
              What is the output of the following code:
              #include <iostream>
              using namespace std;
              int main() {
                  int a = 5;
                  int b = 10;
                  int max = (a > b) ? a : b;
                  cout << max << endl;
                  return 0;
              }""");

options.add("A) 5, B) 10, C) 0, D) Compilation error");
answers.add("B) 10");

questions.add("""
              What is the output of the following code:
              #include <iostream>
              using namespace std;
              int main() {
                  int a = 5;
                  int b = 10;
                  swap(a, b);
                  cout << a << " " << b << endl;
                  return 0;
              }""");

options.add("A) 5 10, B) 10 5, C) 0 0, D) Compilation error");
answers.add("B) 10 5");

questions.add("""
              What is the output of the following code:
              #include <iostream>
              using namespace std;
              int main() {
                  int arr[] = {1, 2, 3, 4, 5};
                  int *p = arr;
                  cout << *(p + 2) << endl;
                  return 0;
              }""");

options.add("A) 1, B) 2, C) 3, D) 4");
answers.add("C) 3");

questions.add("""
              What is the output of the following code:
              #include <iostream>
              using namespace std;
              int main() {
                  int a = 5;
                  a = a++ * 2;
                  cout << a << endl;
                  return 0;
              }""");

options.add("A) 5, B) 10, C) 6, D) 12");
answers.add("B) 10");

questions.add("""
              What is the output of the following code:
              #include <iostream>
              using namespace std;
              int main() {
                  int x = 10;
                  int &ref = x;
                  ref = 20;
                  cout << x << endl;
                  return 0;
              }""");

options.add("A) 10, B) 20, C) 30, D) Compilation error");
answers.add("B) 20");

questions.add("""
              What is the output of the following code:
              #include <iostream>
              using namespace std;
              class Base {
              public:
                  virtual void show() {
                      cout << "Base class" << endl;
                  }
              };
              class Derived : public Base {
              public:
                  void show() {
                      cout << "Derived class" << endl;
                  }
              };
              int main() {
                  Base *b;
                  Derived d;
                  b = &d;
                  b->show();
                  return 0;
              }""");

options.add("A) Base class, B) Derived class, C) Compilation error, D) Runtime error");
answers.add("B) Derived class");

questions.add("""
              What is the output of the following code:
              #include <iostream>
              using namespace std;
              class A {
              public:
                  A() { cout << "A's constructor" << endl; }
              };
              class B : public A {
              public:
                  B() { cout << "B's constructor" << endl; }
              };
              int main() {
                  B b;
                  return 0;
              }""");

options.add("A) A's constructor, B) B's constructor, C) A's constructor B's constructor, D) Compilation error");
answers.add("C) A's constructor B's constructor");

questions.add("""
              What is the output of the following code:
              #include <iostream>
              using namespace std;
              class Base {
              public:
                  Base() { cout << "Base constructor" << endl; }
                  virtual ~Base() { cout << "Base destructor" << endl; }
              };
              class Derived : public Base {
              public:
                  Derived() { cout << "Derived constructor" << endl; }
                  ~Derived() { cout << "Derived destructor" << endl; }
              };
              int main() {
                  Base *b = new Derived();
                  delete b;
                  return 0;
              }""");

options.add("A) Base constructor Derived constructor Base destructor, B) Base constructor Derived constructor Derived destructor Base destructor, C) Base constructor Derived constructor Derived destructor, D) Compilation error");
answers.add("B) Base constructor Derived constructor Derived destructor Base destructor");

questions.add("""
              What is the output of the following code:
              #include <iostream>
              using namespace std;
              template <typename T>
              T add(T a, T b) {
                  return a + b;
              }
              int main() {
                  cout << add(5, 10) << endl;
                  return 0;
              }""");

options.add("A) 15, B) 5, C) 10, D) Compilation error");
answers.add("A) 15");

questions.add("""
              What is the output of the following code:
              #include <iostream>
              using namespace std;
              int main() {
                  int a = 10;
                  int b = 20;
                  int &ref = a;
                  ref = b;
                  cout << a << endl;
                  return 0;
              }""");

options.add("A) 10, B) 20, C) 30, D) Compilation error");
answers.add("B) 20");

questions.add("""
              What is the output of the following code:
              #include <iostream>
              using namespace std;
              int main() {
                  int *p = new int;
                  *p = 5;
                  cout << *p << endl;
                  delete p;
                  return 0;
              }""");

options.add("A) 5, B) 0, C) Garbage value, D) Compilation error");
answers.add("A) 5");

questions.add("""
              What is the output of the following code:
              #include <iostream>
              using namespace std;
              int main() {
                  int a = 5;
                  int *p = &a;
                  cout << *p << endl;
                  return 0;
              }""");

options.add("A) 5, B) 0, C) Address of a, D) Compilation error");
answers.add("A) 5");

questions.add("""
              What is the output of the following code:
              #include <iostream>
              using namespace std;
              int main() {
                  int a = 5;
                  int *p = &a;
                  *p = 10;
                  cout << a << endl;
                  return 0;
              }""");

options.add("A) 5, B) 10, C) Garbage value, D) Compilation error");
answers.add("B) 10");


    }
    
 
    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
    }
    
    public static void main(String[]args){
        
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
        new C_Plus_Plus_Output(name).setVisible(true);
    }
    
}
