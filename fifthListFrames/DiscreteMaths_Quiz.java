package fifthListFrames;

import frame.Quiz;

/**
 * @author MuhammadHasnatRasool
 */
public class DiscreteMaths_Quiz extends Quiz {

    public DiscreteMaths_Quiz(String name) {
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

    
   
    @Override
    public void setQuestionTextAndOptions() {
        qno.setText("Question #: " + currentQno);
        question.setText(questions.get(currentQuestionIndex));
        opt1.setText(options.get(currentQuestionIndex).split(", ")[0]);
        opt2.setText(options.get(currentQuestionIndex).split(", ")[1]);
        opt3.setText(options.get(currentQuestionIndex).split(", ")[2]);
        opt4.setText(options.get(currentQuestionIndex).split(", ")[3]);
    }

    // questions:66
    @Override
    public final void loadQuestions() {

        questions.add("Which of the following logic sequences is correct: 1, 2, 4, 8, _?");
        options.add("A) 12, B) 14, C) 16, D) 18");
        answers.add("C) 16");

        questions.add("What is the next number in the series: 1, 4, 9, 16, 25, _?");
        options.add("A) 36, B) 37, C) 38, D) 39");
        answers.add("A) 36");

        questions.add("Which of the following is a prime number?");
        options.add("A) 10, B) 15, C) 17, D) 21");
        answers.add("C) 17");

        questions.add("What is the greatest common divisor (GCD) of 24 and 36?");
        options.add("A) 6, B) 8, C) 12, D) 18");
        answers.add("C) 12");

        questions.add("What is the value of 2^5?");
        options.add("A) 8, B) 16, C) 32, D) 64");
        answers.add("C) 32");

        questions.add("In a set theory, what is the intersection of sets A and B?");
        options.add("A) Elements in A only, B) Elements in B only, C) Elements in both A and B, D) Elements in neither A nor B");
        answers.add("C) Elements in both A and B");

        questions.add("What is the next number in the series: 2, 3, 5, 7, 11, _?");
        options.add("A) 12, B) 13, C) 14, D) 15");
        answers.add("B) 13");

        questions.add("Which of the following is an even number?");
        options.add("A) 15, B) 23, C) 36, D) 41");
        answers.add("C) 36");

        questions.add("In Boolean algebra, what is the result of A AND NOT A?");
        options.add("A) 0, B) 1, C) A, D) NOT A");
        answers.add("A) 0");

        questions.add("What is the binary equivalent of the decimal number 10?");
        options.add("A) 1000, B) 1010, C) 1100, D) 1110");
        answers.add("B) 1010");

        questions.add("Which of the following is a valid subset of {1, 2, 3}?");
        options.add("A) {1, 2, 4}, B) {2, 3}, C) {3, 4, 5}, D) {4, 5, 6}");
        answers.add("B) {2, 3}");

        questions.add("What is the value of 5! (5 factorial)?");
        options.add("A) 20, B) 60, C) 120, D) 720");
        answers.add("C) 120");

        questions.add("What is the next number in the Fibonacci sequence: 0, 1, 1, 2, 3, 5, _?");
        options.add("A) 6, B) 7, C) 8, D) 9");
        answers.add("C) 8");

        questions.add("Which of the following is a tautology?");
        options.add("A) A AND NOT A, B) A OR NOT A, C) A XOR A, D) A AND A");
        answers.add("B) A OR NOT A");

        questions.add("What is the sum of the first 10 natural numbers?");
        options.add("A) 45, B) 50, C) 55, D) 60");
        answers.add("C) 55");

        questions.add("Which graph theory term describes a set of vertices connected by edges?");
        options.add("A) Graph, B) Tree, C) Node, D) Path");
        answers.add("A) Graph");

        questions.add("What is the Cartesian product of sets A = {1, 2} and B = {x, y}?");
        options.add("A) {(1 x) (2 y)} B) {(1 1) (2, 2)}, C) {(1 x) (1 y) (2 x) (2 y)}, D) {(x 1) (y 2)}");
        answers.add("C) {(1 x) (1 y) (2 x) (2 y)}");

        questions.add("What is the next number in the geometric sequence: 3, 9, 27, _?");
        options.add("A) 36, B) 54, C) 81, D) 108");
        answers.add("C) 81");

        questions.add("Which of the following represents an empty set?");
        options.add("A) {0}, B) { }, C) {null}, D) {empty}");
        answers.add("B) { }");

        questions.add("What is the value of the expression 3 + 4 * 2?");
        options.add("A) 14, B) 11, C) 10, D) 20");
        answers.add("B) 11");

        questions.add("In a combinatorial problem, how many ways can you arrange 3 books on a shelf?");
        options.add("A) 3, B) 6, C) 9, D) 12");
        answers.add("B) 6");

        questions.add("What is the least common multiple (LCM) of 4 and 6?");
        options.add("A) 8, B) 12, C) 16, D) 24");
        answers.add("B) 12");

        questions.add("What is the sum of the first 5 odd numbers?");
        options.add("A) 15, B) 20, C) 25, D) 30");
        answers.add("C) 25");

        questions.add("Which of the following is an irrational number?");
        options.add("A) 1/2, B) 3/4, C) sqrt(2), D) 0.25");
        answers.add("C) sqrt(2)");

        questions.add("What is the result of the Boolean expression A OR (A AND B)?");
        options.add("A) A AND B, B) A OR B, C) A, D) B");
        answers.add("C) A");

        questions.add("Which of the following is a complete graph with 3 vertices?");
        options.add("A) A triangle, B) A square, C) A line, D) A pentagon");
        answers.add("A) A triangle");

        questions.add("What is the hexadecimal equivalent of the binary number 1010?");
        options.add("A) A, B) B, C) C, D) D");
        answers.add("A) A");

        questions.add("What is the sum of the first 5 prime numbers?");
        options.add("A) 18, B) 26, C) 28, D) 30");
        answers.add("C) 28");

        questions.add("Which of the following is a one-to-one function?");
        options.add("A) f(x) = x^2, B) f(x) = 2x, C) f(x) = x^3, D) f(x) = x + 1");
        answers.add("B) f(x) = 2x");

        questions.add("In set theory, what does the union of sets A and B represent?");
        options.add("A) Elements in A only, B) Elements in B only, C) Elements in both A and B, D) Elements in either A or B or both");
        answers.add("D) Elements in either A or B or both");

        questions.add("What is the result of the Boolean expression A XOR A?");
        options.add("A) 0, B) 1, C) A, D) NOT A");
        answers.add("A) 0");

        questions.add("Which of the following represents a bijective function?");
        options.add("A) One-to-one and onto, B) Only one-to-one, C) Only onto, D) Neither one-to-one nor onto");
        answers.add("A) One-to-one and onto");

        questions.add("What is the next number in the series: 1, 1, 2, 3, 5, 8, _?");
        options.add("A) 10, B) 11, C) 12, D) 13");
        answers.add("D) 13");

        questions.add("In graph theory, what is a path that visits every vertex exactly once?");
        options.add("A) Euler path, B) Hamiltonian path, C) Euler circuit, D) Hamiltonian circuit");
        answers.add("B) Hamiltonian path");

        questions.add("Which of the following is an example of a surjective function?");
        options.add("A) f(x) = x^2, B) f(x) = x + 1, C) f(x) = 2x, D) f(x) = x/2");
        answers.add("B) f(x) = x + 1");

        questions.add("What is the result of the Boolean expression A AND (A OR B)?");
        options.add("A) A AND B, B) A OR B, C) A, D) B");
        answers.add("C) A");

        questions.add("Which of the following is the negation of the statement 'All swans are white'?");
        options.add("A) No swans are white, B) Some swans are not white, C) All swans are not white, D) Some swans are white");
        answers.add("B) Some swans are not white");

        questions.add("What is the next number in the series: 2, 5, 10, 17, 26, _?");
        options.add("A) 35, B) 37, C) 39, D) 41");
        answers.add("B) 37");

        questions.add("Which of the following is a valid binary number?");
        options.add("A) 102, B) 110, C) 212, D) 301");
        answers.add("B) 110");

        questions.add("In a logical expression, what is the identity element for the OR operation?");
        options.add("A) 0, B) 1, C) A, D) NOT A");
        answers.add("A) 0");

        questions.add("What is the value of the expression 4! / 2! ?");
        options.add("A) 2, B) 4, C) 6, D) 12");
        answers.add("C) 6");

        questions.add("What is the complement of a set A?");
        options.add("A) Elements in A only, B) Elements not in A, C) Elements in both A and B, D) Elements in neither A nor B");
        answers.add("B) Elements not in A");

        questions.add("What is the union of sets A and B?");
        options.add("A) Elements in A only, B) Elements in B only, C) Elements in both A and B, D) Elements in either A or B or both");
        answers.add("D) Elements in either A or B or both");

        questions.add("What is the difference between sets A and B?");
        options.add("A) Elements in A only, B) Elements in B only, C) Elements in both A and B, D) Elements in A but not in B");
        answers.add("D) Elements in A but not in B");

        questions.add("What is the Cartesian product of sets A and B?");
        options.add("A) Ordered pairs (a, b) where a in A and b in B, B) Ordered pairs (a, b) where a in B and b in A, C) Elements in both A and B, D) Elements in neither A nor B");
        answers.add("A) Ordered pairs (a, b) where a in A and b in B");

        questions.add("What is a relation from set A to set B?");
        options.add("A) A function from A to B, B) A subset of A x B, C) A subset of B x A, D) A subset of A");
        answers.add("B) A subset of A x B");

        questions.add("What is a function from set A to set B?");
        options.add("A) A relation from A to B, B) A relation from B to A, C) A subset of A x B, D) A well-defined relation from A to B");
        answers.add("D) A well-defined relation from A to B");

        questions.add("What is the domain of a function f?");
        options.add("A) The range of f, B) The codomain of f, C) The set of inputs for f, D) The set of outputs for f");
        answers.add("C) The set of inputs for f");

        questions.add("What is the range of a function f?");
        options.add("A) The domain of f, B) The codomain of f, C) The set of inputs for f, D) The set of outputs for f");
        answers.add("D) The set of outputs for f");

        questions.add("What is the converse of a statement 'if p then q'?");
        options.add("A) If q then p, B) If not p then not q, C) If p then not q, D) If not q then p");
        answers.add("A) If q then p");

        questions.add("What is the contrapositive of a statement 'if p then q'?");
        options.add("A) If q then p, B) If not p then not q, C) If not q then not p, D) If p then not q");
        answers.add("C) If not q then not p");

        questions.add("What is modus ponens?");
        options.add("A) If p then q - q therefore p, B) If p then q - p therefore q, C) If p then q - not q therefore not p, D) If p then q - not p therefore not q");
        answers.add("B) If p then q - p therefore q");

        questions.add("What is modus tollens?");
        options.add("A) If p then q - q therefore p, B) If p then q - p therefore q, C) If p then q - not q therefore not p, D) If p then q - not p therefore not q");
        answers.add("C) If p then q - not q therefore not p");

        questions.add("What is the law of excluded middle?");
        options.add("A) p or not p, B) p and not p, C) p implies not q, D) not p implies q");
        answers.add("A) p or not p");

        questions.add("What is the law of non-contradiction?");
        options.add("A) p and not p, B) p or not p, C) p implies q, D) not p implies not q");
        answers.add("A) p and not p");

        questions.add("What is the rule of existential generalization?");
        options.add("A) For all x, P(x) implies P(a), B) For all x, P(x) implies not P(a), C) P(a) implies exists x, P(x), D) not P(a) implies exists x, not P(x)");
        answers.add("C) P(a) implies exists x, P(x)");

        questions.add("What is the rule of universal generalization?");
        options.add("A) P(a) implies for all x, P(x), B) P(a) implies exists x, P(x), C) For all x, P(x) implies P(a), D) not P(a) implies for all x, not P(x)");
        answers.add("A) P(a) implies for all x, P(x)");

        questions.add("What is the rule of modus ponens in predicate logic?");
        options.add("A) For all x, P(x) implies Q(x), P(a) therefore Q(a), B) For all x, P(x) implies Q(x), Q(a) therefore P(a), C) Exists x, P(x) implies Q(x), P(a) therefore Q(a), D) Exists x, P(x) implies Q(x), Q(a) therefore P(a)");
        answers.add("A) For all x, P(x) implies Q(x), P(a) therefore Q(a)");

        questions.add("What is the rule of modus tollens in predicate logic?");
        options.add("A) For all x, P(x) implies Q(x), not Q(a) therefore not P(a), B) For all x, P(x) implies Q(x), not P(a) therefore not Q(a), C) Exists x, P(x) implies Q(x), not Q(a) therefore not P(a), D) Exists x, P(x) implies Q(x), not P(a) therefore not Q(a)");
        answers.add("A) For all x, P(x) implies Q(x), not Q(a) therefore not P(a)");

        questions.add("What is the rule of hypothetical syllogism?");
        options.add("A) If p then q q then r therefore p then r, B) If p then q - r then p - therefore q then r, C) If p then q - not q then r - therefore p then r, D) If p then q - not r then q - therefore p then r");
        answers.add("A) If p then q q then r therefore p then r");

        questions.add("What is the rule of categorical syllogism?");
        options.add("A) All A are B All B are C therefore All A are C, B) All A are B No B are C therefore No A are C, C) Some A are B Some B are C therefore Some A are C, D) No A are B All B are C therefore No A are C");
        answers.add("A) All A are B All B are C therefore All A are C");

        questions.add("What is the converse of a statement 'All A are B'?");
        options.add("A) Some A are B, B) No A are B, C) All B are A, D) Some B are A");
        answers.add("C) All B are A");

        questions.add("What is the contrapositive of a statement 'All A are B'?");
        options.add("A) Some A are B, B) No A are B, C) All non-B are non-A, D) Some non-B are non-A");
        answers.add("C) All non-B are non-A");

        questions.add("What is the inverse of a statement 'All A are B'?");
        options.add("A) Some A are B, B) No A are B, C) All A are not B, D) Some A are not B");
        answers.add("C) All A are not B");

        questions.add("What is the equivalent statement of 'p implies q'?");
        options.add("A) not p or q, B) p or not q, C) not p and q, D) p and not q");
        answers.add("A) not p or q");

        questions.add("What is the equivalent statement of 'p is equivalent to q'?");
        options.add("A) p implies q and q implies p, B) p or q and not p or not q, C) p and q or not p and not q, D) p or not q and q or not p");
        answers.add("A) p implies q and q implies p");

    }



    public static void main(String[] args) {
        new DiscreteMaths_Quiz(name).setVisible(true);
    }

}
