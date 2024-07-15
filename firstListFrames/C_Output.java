package firstListFrames;

/**
 * @author MuhammadHasnatRasool
 */
import frame.Output_Questions;
import java.awt.event.ActionEvent;
import java.util.Collections;

public class C_Output extends Output_Questions {

    public C_Output(String name) {
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

    // 67 output
    
    @Override
    public final void loadQuestions() {

        questions.add("What is the output of the following code: int x = 5; int y = 10; printf(\"%d\", x + y / 2);");
        options.add("A) 10, B) 12, C) 15, D) 20");
        answers.add("B) 10");

        questions.add("What is the output of the following code: char c = 'A'; int x = 5; printf(\"%c\", c + x);");
        options.add("A) F, B) G, C) H, D) I");
        answers.add("B) G");

        questions.add("What is the output of the following code: int x = 5; int y = 10; printf(\"%d\", (x + y) % 3);");
        options.add("A) 0, B) 1, C) 2, D) 3");
        answers.add("A) 0");

        questions.add("What is the output of the following code: char str[] = \"Hello\"; int x = 5; printf(\"%s\", str + x);");
        options.add("A) Hello, B) ello, C) llo, D) lo");
        answers.add("B) ello");

        questions.add("What is the output of the following code: int x = 5; int y = 10; printf(\"%d\", x * y / 2);");
        options.add("A) 25, B) 50, C) 75, D) 100");
        answers.add("A) 25");

        questions.add("What is the output of the following code: char c = 'A'; int x = 5; printf(\"%d\", (c + x) / 2);");
        options.add("A) 32, B) 33, C) 34, D) 35");
        answers.add("D) 35");

        questions.add("What is the output of the following code: int x = 5; int y = 10; printf(\"%d\", (x + y) / 3);");
        options.add("A) 5, B) 6, C) 7, D) 8");
        answers.add("A) 5");

        questions.add("What is the output of the following code: char str[] = \"Hello\"; int x = 5; printf(\"%s\", str - x);");
        options.add("A) Hello, B) elloH, C) lloH, D) loH");
        answers.add("B) elloH");

        questions.add("What is the output of the following code: int x = 5; int y = 10; printf(\"%d\", x * y - 2);");
        options.add("A) 48, B) 50, C) 52, D) 54");
        answers.add("A) 48");

        questions.add("What is the output of the following code: char c = 'A'; int x = 5; printf(\"%c\", (c - x) + 2);");
        options.add("A) C, B) D, C) E, D) F");
        answers.add("B) D");

        questions.add("What is the output of the following code: int x = 5; printf(\"%d\", x);");
        options.add("A) 3, B) 5, C) 7, D) 9");
        answers.add("B) 5");

        questions.add("What is the output of the following code: char c = 'A'; printf(\"%d\", c);");
        options.add("A) 65, B) 66, C) 67, D) 68");
        answers.add("A) 65");

        questions.add("What is the output of the following code: int x = 5; int y = 2; printf(\"%d\", x + y * 3);");
        options.add("A) 11, B) 13, C) 15, D) 17");
        answers.add("C) 15");

        questions.add("What is the output of the following code: int x = 5; if (x > 10) { printf(\"Greater\"); } else { printf(\"Less\"); }");
        options.add("A) Greater, B) Less, C) Error, D) None");
        answers.add("B) Less");

        questions.add("What is the output of the following code: int add(int x, int y) { return x + y; } printf(\"%d\", add(3, 5));");
        options.add("A) 5, B) 7, C) 8, D) 9");
        answers.add("B) 8");

        questions.add("What is the output of the following code: int arr[3] = {1, 2, 3}; printf(\"%d\", arr[1]);");
        options.add("A) 1, B) 2, C) 3, D) 4");
        answers.add("B) 2");

        questions.add("What is the output of the following code: int x = 5; int *ptr = &x; printf(\"%d\", *ptr);");
        options.add("A) 3, B) 5, C) 7, D) 9");
        answers.add("B) 5");

        questions.add("What is the output of the following code: char str[] = \"Hello\"; printf(\"%s\", str + 2);");
        options.add("A) Hello, B) ello, C) llo, D) lo");
        answers.add("B) ello");

        questions.add("What is the output of the following code: int *ptr = (int *) malloc(sizeof(int)); *ptr = 10; printf(\"%d\", *ptr);");
        options.add("A) 5, B) 10, C) 15, D) 20");
        answers.add("B) 10");

        questions.add("What is the output of the following code: FILE *fp = fopen(\"test.txt\", \"w\");<br></br> fprintf(fp, \"Hello\"); fclose(fp);");
        options.add("A) Hello, B) World, C) Error, D) None");
        answers.add("A) Hello");

        questions.add("What is the output of the following code: struct Point { int x, y; }; struct Point p = {1, 2}; printf(\"%d\", p.x);");
        options.add("A) 1, B) 2, C) 3, D) 4");
        answers.add("A) 1");

        questions.add("What is the output of the following code: union Data { int i; float f; }; union Data d; d.i = 5; printf(\"%d\", d.i);");
        options.add("A) 5, B) 10, C) 15, D) 20");
        answers.add("A) 5");

        questions.add("What is the output of the following code: enum Color { RED, GREEN, BLUE }; printf(\"%d\", GREEN);");
        options.add("A) 0, B) 1, C) 2, D) 3");
        answers.add("B) 1");

        questions.add("What is the output of the following code: int x = 5; int y = 3; printf(\"%d\", x & y);");
        options.add("A) 1, B) 2, C) 3, D) 4");
        answers.add("A) 1");

        questions.add("What is the output of the following code: #define SQUARE(x) (x*x) ; printf(\"%d\", SQUARE(3));");
        options.add("A) 3, B) 6, C) 9, D) 12");
        answers.add("C) 9");

        questions.add("What is the output of the following code: int main(int argc, char *argv[]) { printf(\"%s\", argv[1]); }");
        options.add("A) Hello, B) World, C) Test, D) None");
        answers.add("A) Hello");

        questions.add("What is the output of the following code: int x = 5; float y = (float)x; printf(\"%f\", y);");
        options.add("A) 5.0, B) 6.0, C) 7.0, D) 8.0");
        answers.add("A) 5.0");

        questions.add("What is the output of the following code: int x = 5; if (x > 10) { printf(\"Error\"); } else { printf(\"Success\"); }");
        options.add("A) Error, B) Success, C) None, D) Compile Error");
        answers.add("B) Success");

        questions.add("What is the output of the following code: int fact(int n) { if (n == 0) return 1; else return n * fact(n-1); } printf(\"%d\", fact(3));");
        options.add("A) 3, B) 6, C) 9, D) 12");
        answers.add("B) 6");

        questions.add("What is the output of the following code: int* ptr = (int*) malloc(sizeof(int)); *ptr = 10; printf(\"%d\", *ptr);");
        options.add("A) 5, B) 10, C) 15, D) 20");
        answers.add("B) 10");

        questions.add("What is the output of the following code: struct Node { int data; struct Node* next; }; struct Node* head = NULL; head = addNode(head, 5); printf(\"%d\", head->data);");
        options.add("A) 3, B) 5, C) 7, D) 9");
        answers.add("B) 5");

        questions.add("What is the output of the following code: int arr[3] = {1, 2, 3}; push(arr, 3); printf(\"%d\", pop(arr));");
        options.add("A) 1, B) 2, C) 3, D) 4");
        answers.add("C) 3");

        questions.add("What is the output of the following code: struct Node { int data; struct Node* left, right; }; struct Node root = newNode(5); printf(\"%d\", root->data);");
        options.add("A) 3, B) 5, C) 7, D) 9");
        answers.add("B) 5");

        questions.add("What is the output of the following code: int adjMatrix[3][3] = {{0, 1, 0}, {1, 0, 1}, {0, 1, 0}}; printf(\"%d\", adjMatrix[1][2]);");
        options.add("A) 0, B) 1, C) 2, D) 3");
        answers.add("B) 1");

        questions.add("What is the output of the following code: int hashTable[10] = {0}; insert(hashTable, 5); printf(\"%d\", hashTable[5]);");
        options.add("A) 0, B) 1, C) 2, D) 3");
        answers.add("B) 1");

        questions.add("What is the output of the following code: int arr[5] = {1, 2, 3, 4, 5}; printf(\"%d\", linearSearch(arr, 3));");
        options.add("A) 0, B) 1, C) 2, D) 3");
        answers.add("C) 2");

        questions.add("What is the output of the following code: int arr[5] = {5, 3, 2, 4, 1}; bubbleSort(arr); printf(\"%d\", arr[0]);");
        options.add("A) 1, B) 2, C) 3, D) 5");
        answers.add("A) 1");

        questions.add("What is the output of the following code:"
                + "int adjMatrix[3][3] = {{0, 1, 0}, {1, 0, 1}, {0, 1, 0}};"
                + "int DFS(int adjMatrix[][3], int start) {"
                + "int visited[3] = {0, 0, 0};"
                + "int count = 0;"
                + "DFSUtil(adjMatrix, start, visited, &count);"
                + "return count;"
                + "}"
                + "void DFSUtil(int adjMatrix[][3], int u, int visited[], int* count) {"
                + "visited[u] = 1;"
                + "(*count)++;"
                + "for (int v = 0; v < 3; v++) {"
                + "if (adjMatrix[u][v] == 1 && !visited[v]) {"
                + "DFSUtil(adjMatrix, v, visited, count);"
                + "}"
                + "}"
                + "}"
                + "printf(\"%d\", DFS(adjMatrix, 0));");
        options.add("A) 0, B) 1, C) 2, D) 3");
        answers.add("C) 2");

        questions.add("What is the output of the following code: int n = 4; int arr[] = {1, 2, 3, 4}; printf(\"%d\", backtrack(arr, n, 0));");
        options.add("A) 1, B) 2, C) 3, D) 4");
        answers.add("C) 3");

        questions.add("What is the output of the following code: int coins[] = {1, 2, 5}; int amount = 11; printf(\"%d\", greedy(coins, amount));");
        options.add("A) 2, B) 3, C) 4, D) 5");
        answers.add("C) 4");

        questions.add("What is the output of the following code: int arr[] = {1, 2, 3, 4}; int n = sizeof(arr)/sizeof(arr[0]); printf(\"%d\", divideConquer(arr, n, 0, n-1));");
        options.add("A) 1, B) 2, C) 3, D) 4");
        answers.add("B) 2");

        questions.add("What is the output of the following code: int x = 5; int y = 3; printf(\"%d\", x & y);");
        options.add("A) 1, B) 2, C) 3, D) 4");
        answers.add("A) 1");

        questions.add("What is the output of the following code: float x = 5.5; float y = 2.2; printf(\"%f\", x + y);");
        options.add("A) 7.7, B) 7.8, C) 7.9, D) 8.0");
        answers.add("A) 7.7");

        questions.add("What is the output of the following code: int x = INT_MAX; printf(\"%d\", x + 1);");
        options.add("A) -1, B) 0, C) 1, D) 2");
        answers.add("A) -1");

        questions.add("What is the output of the following code: int *ptr = NULL; printf(\"%d\", *ptr);");
        options.add("A) 0, B) 1, C) 2, D) Error");
        answers.add("D) Error");

        questions.add("What is the output of the following code: int *ptr = (int *) malloc(sizeof(int)); free(ptr); printf(\"%d\", *ptr);");
        options.add("A) 0, B) 1, C) 2, D) Error");
        answers.add("D) Error");

        questions.add("What is the output of the following code: int *ptr = (int *) malloc(sizeof(int)); printf(\"%d\", *ptr);");
        options.add("A) 0, B) 1, C) 2, D) Error");
        answers.add("D) Error");

        questions.add("What is the output of the following code: volatile int x = 5; printf(\"%d\", x);");
        options.add("A) 5, B) 6, C) 7, D) 8");
        answers.add("A) 5");

        questions.add("What is the output of the following code: int x = 5;"
                + " int y = 10; "
                + "int *ptr = &x; "
                + "int **pptr = &ptr; "
                + "printf(\"%d\", **pptr + y);"
                + "");
        options.add("A) 15, B) 20, C) 25, D) 30");
        answers.add("B) 20");

        questions.add("What is the output of the following code:"
                + "struct Node {"
                + "int data;"
                + "struct Node *next;"
                + "};"
                + "struct Node *head = NULL;"
                + "head = addNode(head, 5);"
                + "head = addNode(head, 10);"
                + "printf(\"%d\", head->next->data);"
                + "");
        options.add("A) 5, B) 10, C) 15, D) 20");
        answers.add("B) 10");

        questions.add("What is the output of the following code:"
                + "int arr[5] = {1, 2, 3, 4, 5};"
                + "int (*fp)(int *) = &sum;"
                + "printf(\"%d\", fp(arr));"
                + "");
        options.add("A) 10, B) 15, C) 20, D) 25");
        answers.add("C) 20");

        questions.add("What is the output of the following code:"
                + "char str[10] = \"Hello\";"
                + "char *ptr = str;"
                + "printf(\"%s\", ptr + 3);"
                + "");
        options.add("A) Hello, B) ello, C) llo, D) lo");
        answers.add("B) ello");

        questions.add("What is the output of the following code:"
                + "int x = 5;"
                + "int y = 10;"
                + "printf(\"%d\", (x & y) | (x ^ y));"
                + "");
        options.add("A) 5, B) 10, C) 15, D) 20");
        answers.add("C) 15");
        questions.add("What is the output of the following code:"
                + "int x = 5;"
                + "int y = 10;"
                + "int *ptr = &x;"
                + "int **pptr = &ptr;"
                + "printf(\"%d\", **pptr + y);"
                + "printf(\"%d\", **pptr);"
                + "");
        options.add("A) 15 5, B) 20 10, C) 25 15, D) 30 20");
        answers.add("A) 15 5");

        questions.add("What is the output of the following code:"
                + "struct Node {"
                + "int data;"
                + "struct Node *next;"
                + "};"
                + "struct Node *head = NULL;"
                + "head = addNode(head, 5);"
                + "head = addNode(head, 10);"
                + "head = addNode(head, 15);"
                + "printf(\"%d\", head->next->next->data);"
                + "");
        options.add("A) 5, B) 10, C) 15, D) 20");
        answers.add("C) 15");

        questions.add("What is the output of the following code:"
                + "int arr[5] = {1, 2, 3, 4, 5};"
                + "int (*fp)(int *) = &sum;"
                + "printf(\"%d\", fp(arr) + 5);"
                + "printf(\"%d\", fp(arr) + 10);"
                + "");
        options.add("A) 15 20, B) 20 25, C) 25 30, D) 30 35");
        answers.add("C) 25 30");

        questions.add("What is the output of the following code:"
                + "char str[10] = \"Hello\";"
                + "char *ptr = str;"
                + "printf(\"%s\" ptr + 3);"
                + "printf(\"%c\" *(ptr + 3));"
                + "");
        options.add("A) Hello l, B) ello o, C) llo l, D) lo H");
        answers.add("C) llo l");

        questions.add("What is the output of the following code:"
                + "int x = 5;"
                + "int y = 10;"
                + "printf(\"%d\" (x & y) | (x ^ y));"
                + "printf(\"%d\" (x | y) & (x ^ y));"
                + "");
        options.add("A) 15 5, B) 20 10, C) 25 15, D) 30 20");
        answers.add("C) 25 15");

        questions.add("What is the output of the following code:"
                + "int x = 5;"
                + "int y = 10;"
                + "int *ptr = &x;"
                + "printf(\"%d\", *ptr + y);"
                + "printf(\"%d\", *ptr);"
                + "");
        options.add("A) 15 5, B) 20 10, C) 25 15, D) 30 20");
        answers.add("A) 15 5");

        questions.add("What is the output of the following code:"
                + "struct Node {"
                + "int data;"
                + "struct Node *next;"
                + "};"
                + "struct Node *head = NULL;"
                + "head = addNode(head, 5);"
                + "head = addNode(head, 10);"
                + "head = addNode(head, 15);"
                + "printf(\"%d\", head->next->next->data);"
                + "printf(\"%d\", head->data);"
                + "");
        options.add("A) 15 5, B) 20 10, C) 25 15, D) 30 20");
        answers.add("C) 25 15");

        questions.add("What is the output of the following code:"
                + "int arr[5] = {1, 2, 3, 4, 5};"
                + "int (*fp)(int *) = &sum;"
                + "printf(\"%d\", fp(arr) + 10);"
                + "printf(\"%d\", fp(arr) + 20);"
                + "");
        options.add("A) 25 35, B) 30 40, C) 35 45, D) 40 50");
        answers.add("C) 35 45");
        questions.add("What is the output of the following code:"
                + "#include<stdio.h>"
                + "#include<string.h>"
                + "char str[20] = \"Hello World!\";"
                + "char *ptr = strtok(str, \" \");"
                + "printf(\"%s\", ptr);"
                + "printf(\"%s\", strtok(NULL, \" \"));"
                + "");
        options.add("A) Hello World!, B) Hello , C) World! D) , World!");
        answers.add("B) Hello ");

        questions.add("What is the output of the following code:"
                + "#include>stdio.h>"
                + "#include<math.h>"
                + "double x = 5.5;"
                + "double y = 2.2;"
                + "printf(\"%f\", ceil(x));"
                + "printf(\"%f\", floor(y));"
                + "");
        options.add("A) 6.0 2.0, B) 5.0 2.0, C) 6.0 1.0, D) 5.0 1.0");
        answers.add("A) 6.0 2.0");

        questions.add("What is the output of the following code:"
                + "#include<stdio.h>"
                + "#include<ctype.h>"
                + "int arr[5] = {1, 2, 3, 4, 5};"
                + "qsort(arr, 5, sizeof(int), compare);"
                + "printf(\"%d\", arr[0]);"
                + "printf(\"%d\", arr[4]);"
                + "");
        options.add("A) 1 5, B) 5 1, C) 2 4, D) 4 2");
        answers.add("B) 5 1");

        questions.add("What is the output of the following code:"
                + "#include<stdio.h>"
                + "#include<string.h>"
                + "char str[20] = \"Hello, World!\";"
                + "char *ptr = strstr(str, \"World\");"
                + "printf(\"%s\", ptr);"
                + "printf(\"%d\", strlen(ptr));"
                + "");
        options.add("A) World! 6, B) World 5, C) , World! 7, D) , World 6");
        answers.add("A) World! 6");

        questions.add("What is the output of the following code:"
                + "#include<stdio.h>"
                + "#include<math.h>"
                + "double x = 5.5;"
                + "double y = 2.2;"
                + "printf(\"%f\", pow(x, y));"
                + "printf(\"%f\", sqrt(x));"
                + "");
        options.add("A) 151.5 2.3, B) 151.2 2.4, C) 151.4 2.2, D) 151.6 2.1");
        answers.add("C) 151.4 2.2");

        questions.add("What is the output of the following code:"
                + "#include<string.h>"
                + "#include<stdlib.h>"
                + "int arr[5] = {1, 2, 3, 4, 5};"
                + "int *ptr = malloc(5 * sizeof(int));"
                + " memcpy(ptr, arr, 5 * sizeof(int));"
                + "printf(\"%d\", ptr[0]);"
                + "printf(\"%d\", ptr[4]);"
                + "");
        options.add("A) 1 5, B) 5 1, C) 2 4, D) 4 2");
        answers.add("A) 1 5");

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
        new C_Output(name).setVisible(true);
    }

}
