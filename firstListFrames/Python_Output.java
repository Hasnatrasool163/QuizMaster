package firstListFrames;

/**
 * @author MuhammadHasnatRasool
 */
import frame.Output_Questions;
import java.awt.event.ActionEvent;
import java.util.Collections;
import javax.swing.JOptionPane;


public class Python_Output extends Output_Questions{
    

    public Python_Output(String name) {
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
        question.setText(questions.get(currentQuestionIndex));
        opt1.setText(options.get(currentQuestionIndex).split(", ")[0]);
        opt2.setText(options.get(currentQuestionIndex).split(", ")[1]);
        opt3.setText(options.get(currentQuestionIndex).split(", ")[2]);
        opt4.setText(options.get(currentQuestionIndex).split(", ")[3]);
    }


  // quiz 20:
    @Override
    public final void loadQuestions() {
      
        questions.add("What is the output of the following code:\n" +
"def func(x):\n" +
"    return x + 1\n" +
"print(func(5))");

options.add("A) 5, B) 6, C) Error, D) None");
answers.add("B) 6");

questions.add("What is the output of the following code:\n" +
"x = [1, 2, 3]\n" +
"print(x[1])");

options.add("A) 1, B) 2, C) 3, D) Error");
answers.add("B) 2");

questions.add("What is the output of the following code:\n" +
"x = 'hello'\n" +
"print(x[0:3])");

options.add("A) h, B) he, C) hel, D) hell");
answers.add("C) hel");

questions.add("What is the output of the following code:\n" +
"x = [1, 2, 3]\n" +
"y = x\n" +
"y.append(4)\n" +
"print(x)");

options.add("A) [1 2 3], B) [1 2 3 4], C) [4], D) Error");
answers.add("B) [1 2 3 4]");

questions.add("What is the output of the following code:\n" +
"def func(x, y=5):\n" +
"    return x + y\n" +
"print(func(2))");

options.add("A) 2, B) 5, C) 7, D) Error");
answers.add("C) 7");

questions.add("What is the output of the following code:\n" +
"x = {1: 'a', 2: 'b', 3: 'c'}\n" +
"print(x[2])");

options.add("A) a, B) b, C) c, D) Error");
answers.add("B) b");

questions.add("What is the output of the following code:\n" +
"x = (1, 2, 3)\n" +
"print(x[1])");

options.add("A) 1, B) 2, C) 3, D) Error");
answers.add("B) 2");

questions.add("What is the output of the following code:\n" +
"for i in range(3):\n" +
"    print(i)");

options.add("A) 0 1 2, B) 1 2 3, C) 0 1 2 3, D) Error");
answers.add("A) 0 1 2");

questions.add("What is the output of the following code:\n" +
"x = [1, 2, 3]\n" +
"x.insert(1, 5)\n" +
"print(x)");

options.add("A) [1, 2, 3], B) [1, 5, 2, 3], C) [5, 1, 2, 3], D) Error");
answers.add("B) [1, 5, 2, 3]");

questions.add("What is the output of the following code:\n" +
"def func():\n" +
"    global x\n" +
"    x = 5\n" +
"func()\n" +
"print(x)");

options.add("A) Error, B) 5, C) None, D) 0");
answers.add("B) 5");

questions.add("What is the output of the following code:\n" +
"x = [1, 2, 3, 4]\n" +
"y = x[1:3]\n" +
"print(y)");

options.add("A) [1 2], B) [2 3], C) [3 4], D) [2 3 4]");
answers.add("B) [2 3]");

questions.add("What is the output of the following code:\n" +
"def func(*args):\n" +
"    return args\n" +
"print(func(1, 2, 3))");

options.add("A) (1 2 3), B) [1 2 3], C) 1 2 3, D) Error");
answers.add("A) (1 2 3)");

questions.add("What is the output of the following code:\n" +
"x = {1, 2, 3, 3}\n" +
"print(x)");

options.add("A) {1 2 3 3}, B) {1 2 3}, C) [1 2 3], D) Error");
answers.add("B) {1 2 3}");

questions.add("What is the output of the following code:\n" +
"x = 'hello'\n" +
"y = 'world'\n" +
"print(f'{x} {y}')");

options.add("A) hello world, B) helloworld, C) hello, D) world");
answers.add("A) hello world");

questions.add("What is the output of the following code:\n" +
"try:\n" +
"    x = 1 / 0\n" +
"except ZeroDivisionError:\n" +
"    print('Error')");

options.add("A) 1, B) 0, C) Error, D) None");
answers.add("C) Error");

questions.add("What is the output of the following code:\n" +
"x = [1, 2, 3]\n" +
"print(len(x))");

options.add("A) 1, B) 2, C) 3, D) Error");
answers.add("C) 3");

questions.add("What is the output of the following code:\n" +
"x = '123'\n" +
"y = int(x)\n" +
"print(y + 1)");

options.add("A) 124, B) 1231, C) 123, D) Error");
answers.add("A) 124");

questions.add("What is the output of the following code:\n" +
"x = [1, 2, 3]\n" +
"x.remove(2)\n" +
"print(x)");

options.add("A) [1 2], B) [1 3], C) [2 3], D) Error");
answers.add("B) [1 3]");

questions.add("What is the output of the following code:\n" +
"x = [1, 2, 3]\n" +
"y = x.copy()\n" +
"y.append(4)\n" +
"print(x, y)");

options.add("A) [1 2 3] [1 2 3], B) [1 2 3 4] [1 2 3 4], C) [1 2 3] [1 2 3 4], D) Error");
answers.add("C) [1 2 3] [1 2 3 4]");

questions.add("What is the output of the following code:\n" +
"def func(a, b):\n" +
"    return a + b\n" +
"x = (1, 2)\n" +
"print(func(*x))");

options.add("A) 3, B) (1, 2), C) 1 2, D) Error");
answers.add("A) 3");


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
        new Python_Output(name).setVisible(true);
    }
    
}
