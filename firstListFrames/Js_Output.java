package firstListFrames;

/**
 * @author MuhammadHasnatRasool
 */
import frame.Output_Questions;
import java.awt.event.ActionEvent;
import java.util.Collections;
import javax.swing.JOptionPane;


public class Js_Output extends Output_Questions{
    

    public Js_Output(String name) {
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


  
    // output :20
    @Override
    public final void loadQuestions() {
      
        questions.add("What is the output of the following code:\n" +
"var x = 5;\n" +
"var y = '5';\n" +
"console.log(x == y);");

options.add("A) true, B) false, C) Error, D) undefined");
answers.add("A) true");

questions.add("What is the output of the following code:\n" +
"var x = 5;\n" +
"var y = '5';\n" +
"console.log(x === y);");

options.add("A) true, B) false, C) Error, D) undefined");
answers.add("B) false");

questions.add("What is the output of the following code:\n" +
"console.log(typeof null);");

options.add("A) 'null', B) 'object', C) 'undefined', D) 'number'");
answers.add("B) 'object'");

questions.add("What is the output of the following code:\n" +
"console.log(typeof undefined);");

options.add("A) 'undefined', B) 'null', C) 'object', D) 'number'");
answers.add("A) 'undefined'");

questions.add("What is the output of the following code:\n" +
"console.log(1 + '2' + 3);");

options.add("A) '6', B) '123', C) 123, D) '15'");
answers.add("B) '123'");

questions.add("What is the output of the following code:\n" +
"function foo() {\n" +
"    console.log(this);\n" +
"}\n" +
"foo();");

options.add("A) global object, B) undefined, C) foo, D) Error");
answers.add("A) global object");

questions.add("What is the output of the following code:\n" +
"var x = 10;\n" +
"if (x > 5) {\n" +
"    let y = 20;\n" +
"}\n" +
"console.log(y);");

options.add("A) 20, B) undefined, C) Error, D) null");
answers.add("C) Error");

questions.add("What is the output of the following code:\n" +
"var x = 1;\n" +
"function func() {\n" +
"    console.log(x);\n" +
"    var x = 2;\n" +
"}\n" +
"func();");

options.add("A) 1, B) 2, C) undefined, D) Error");
answers.add("C) undefined");

questions.add("What is the output of the following code:\n" +
"var x = [1, 2, 3];\n" +
"console.log(x.length);");

options.add("A) 2, B) 3, C) 4, D) undefined");
answers.add("B) 3");

questions.add("What is the output of the following code:\n" +
"function foo() {\n" +
"    return\n" +
"    {\n" +
"        message: 'Hello'\n" +
"    };\n" +
"}\n" +
"console.log(foo());");

options.add("A) undefined, B) { message: 'Hello' }, C) Error, D) null");
answers.add("A) undefined");

questions.add("What is the output of the following code:\n" +
"var x = 'Hello';\n" +
"console.log(x[1]);");

options.add("A) H, B) e, C) l, D) Error");
answers.add("B) e");

questions.add("What is the output of the following code:\n" +
"console.log([1, 2, 3] instanceof Array);");

options.add("A) true, B) false, C) Error, D) undefined");
answers.add("A) true");

questions.add("What is the output of the following code:\n" +
"var x = [1, 2, 3];\n" +
"x.push(4);\n" +
"console.log(x);");

options.add("A) [1, 2, 3], B) [1, 2, 3, 4], C) [4, 1, 2, 3], D) Error");
answers.add("B) [1, 2, 3, 4]");

questions.add("What is the output of the following code:\n" +
"var x = { a: 1, b: 2 };\n" +
"delete x.a;\n" +
"console.log(x);");

options.add("A) { a: 1, b: 2 }, B) { b: 2 }, C) { a: 1 }, D) Error");
answers.add("B) { b: 2 }");

questions.add("What is the output of the following code:\n" +
"function foo() {\n" +
"    return arguments.length;\n" +
"}\n" +
"console.log(foo(1, 2, 3));");

options.add("A) 1, B) 2, C) 3, D) Error");
answers.add("C) 3");

questions.add("What is the output of the following code:\n" +
"var x = { a: 1 };\n" +
"var y = Object.assign({}, x);\n" +
"y.a = 2;\n" +
"console.log(x.a);");

options.add("A) 1, B) 2, C) undefined, D) Error");
answers.add("A) 1");

questions.add("What is the output of the following code:\n" +
"var x = 1;\n" +
"x++;\n" +
"console.log(x);");

options.add("A) 0, B) 1, C) 2, D) Error");
answers.add("C) 2");

questions.add("What is the output of the following code:\n" +
"var x = 0;\n" +
"if (x) {\n" +
"    console.log('True');\n" +
"} else {\n" +
"    console.log('False');\n" +
"}");

options.add("A) True, B) False, C) Error, D) undefined");
answers.add("B) False");

questions.add("What is the output of the following code:\n" +
"function foo() {\n" +
"    console.log('foo');\n" +
"}\n" +
"var bar = foo;\n" +
"bar();");

options.add("A) foo, B) bar, C) foo bar, D) Error");
answers.add("A) foo");

questions.add("What is the output of the following code:\n" +
"var x = [1, 2, 3];\n" +
"x.splice(1, 1);\n" +
"console.log(x);");

options.add("A) [1, 2, 3], B) [1, 3], C) [2, 3], D) [1]");
answers.add("B) [1, 3]");



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
        new Js_Output(name).setVisible(true);
    }
    
}
