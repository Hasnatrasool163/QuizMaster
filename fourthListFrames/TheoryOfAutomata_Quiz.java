package fourthListFrames;

import frame.Quiz;

/**
 * @author MuhammadHasnatRasool
 */

public class TheoryOfAutomata_Quiz extends Quiz {

    public TheoryOfAutomata_Quiz(String name) {
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

// questions: 28
    @Override
    public final void loadQuestions() {

        questions.add("What is the basic building block of a finite automaton?");
        options.add("A) State, B) Transition, C) Symbol, D) String");
        answers.add("A) State");

        questions.add("Which type of automaton recognizes a regular language?");
        options.add("A) DFA, B) NFA, C) PDA, D) TM");
        answers.add("A) DFA");

        questions.add("What is the purpose of the start state in an automaton?");
        options.add("A) To accept the input string, B) To reject the input string, C) To start the computation, D) To end the computation");
        answers.add("C) To start the computation");

        questions.add("Which automaton can recognize a language that is not regular?");
        options.add("A) DFA, B) NFA, C) PDA, D) TM");
        answers.add("D) TM");

        questions.add("What is the difference between a DFA and an NFA?");
        options.add("A) DFA is non-deterministic, NFA is deterministic, B) DFA is deterministic, NFA is non-deterministic, C) DFA has a single start state, NFA has multiple start states, D) DFA has multiple start states, NFA has a single start state");
        answers.add("B) DFA is deterministic, NFA is non-deterministic");

        questions.add("Which automaton is equivalent to a regular expression?");
        options.add("A) DFA, B) NFA, C) PDA, D) TM");
        answers.add("B) NFA");

        questions.add("What is the purpose of the final state in an automaton?");
        options.add("A) To accept the input string, B) To reject the input string, C) To start the computation, D) To end the computation");
        answers.add("A) To accept the input string");

        questions.add("Which automaton can recognize a language that is context-free?");
        options.add("A) DFA, B) NFA, C) PDA, D) TM");
        answers.add("C) PDA");

        questions.add("What is the difference between a PDA and a TM?");
        options.add("A) PDA is non-deterministic, TM is deterministic, B) PDA is deterministic, TM is non-deterministic, C) PDA has a single stack, TM has multiple stacks, D) PDA has multiple stacks, TM has a single stack");
        answers.add("B) PDA is deterministic, TM is non-deterministic");

        questions.add("Which automaton is more powerful than a DFA?");
        options.add("A) NFA, B) PDA, C) TM, D) None of the above");
        answers.add("C) TM");

        questions.add("What is the purpose of the transition function in an automaton?");
        options.add("A) To move from one state to another, B) To accept the input string, C) To reject the input string, D) To start the computation");
        answers.add("A) To move from one state to another");

        questions.add("Which automaton recognizes a language that is not context-free?");
        options.add("A) DFA, B) NFA, C) PDA, D) TM");
        answers.add("D) TM");

        questions.add("What is the difference between a deterministic and non-deterministic automaton?");
        options.add("A) Deterministic automaton always accepts, non-deterministic automaton always rejects, B) Deterministic automaton always rejects, non-deterministic automaton always accepts, C) Deterministic automaton has a single path, non-deterministic automaton has multiple paths, D) Deterministic automaton has multiple paths, non-deterministic automaton has a single path");
        answers.add("C) Deterministic automaton has a single path, non-deterministic automaton has multiple paths");

        questions.add("Which automaton is equivalent to a context-free grammar?");
        options.add("A) DFA, B) NFA, C) PDA, D) TM");
        answers.add("C) PDA");

        questions.add("What is the purpose of the stack in a PDA?");
        options.add("A) To store the input string, B) To store the current state, C) To store the transition history, D) To store the output string");
        answers.add("C) To store the transition history");

        questions.add("What is the necessary and sufficient condition for a language to be recognized by a DFA?");
        options.add("A) The language is finite, B) The language is regular, C) The language is context-free, D) The language is recursive");
        answers.add("B) The language is regular");

        questions.add("Which type of automaton is equivalent to a regular expression with backreferences?");
        options.add("A) DFA, B) NFA, C) PDA, D) TM");
        answers.add("D) TM");

        questions.add("What is the purpose of the epsilon transition in an NFA?");
        options.add("A) To move from one state to another without consuming input, B) To accept the input string, C) To reject the input string, D) To start the computation");
        answers.add("A) To move from one state to another without consuming input");

        questions.add("Which automaton can recognize a language that is not recursive?");
        options.add("A) DFA, B) NFA, C) PDA, D) TM");
        answers.add("D) TM");

        questions.add("What is the difference between a Mealy machine and a Moore machine?");
        options.add("A) Mealy machine has output on transitions, Moore machine has output on states, B) Mealy machine has output on states, Moore machine has output on transitions, C) Mealy machine is deterministic, Moore machine is non-deterministic, D) Mealy machine is non-deterministic, Moore machine is deterministic");
        answers.add("A) Mealy machine has output on transitions, Moore machine has output on states");

        questions.add("Which automaton is equivalent to a pushdown automaton with a single stack symbol?");
        options.add("A) DFA, B) NFA, C) PDA, D) TM");
        answers.add("B) NFA");

        questions.add("What is the purpose of the trap state in a DFA?");
        options.add("A) To accept the input string, B) To reject the input string, C) To start the computation, D) To end the computation");
        answers.add("B) To reject the input string");

        questions.add("Which automaton can recognize a language that is not context-free?");
        options.add("A) DFA, B) NFA, C) PDA, D) TM");
        answers.add("D) TM");

        questions.add("What is the difference between a deterministic and non-deterministic PDA?");
        options.add("A) Deterministic PDA has a single path, non-deterministic PDA has multiple paths, B) Deterministic PDA has multiple paths, non-deterministic PDA has a single path, C) Deterministic PDA is equivalent to a DFA, non-deterministic PDA is equivalent to an NFA, D) Deterministic PDA is equivalent to an NFA, non-deterministic PDA is equivalent to a DFA");
        answers.add("A) Deterministic PDA has a single path, non-deterministic PDA has multiple paths");

        questions.add("Which automaton is equivalent to a context-free grammar with left recursion?");
        options.add("A) DFA, B) NFA, C) PDA, D) TM");
        answers.add("D) TM");

        questions.add("What is the purpose of the stack in a TM?");
        options.add("A) To store the input string, B) To store the current state, C) To store the transition history, D) To store the output string");
        answers.add("C) To store the transition history");

        questions.add("Which automaton can recognize a language that is not recursive enumerable?");
        options.add("A) DFA, B) NFA, C) PDA, D) TM");
        answers.add("D) TM");

        questions.add("What is the difference between a TM and a universal TM?");
        options.add("A) TM is equivalent to a DFA, universal TM is equivalent to an NFA, B) TM is equivalent to an NFA, universal TM is equivalent to a DFA, C) TM has a single tape, universal TM has multiple tapes, D) TM has multiple tapes, universal TM has a single tape");
        answers.add("C) TM has a single tape, universal TM has multiple tapes");

    }
    
    public static void main(String[] args) {
        new TheoryOfAutomata_Quiz(name).setVisible(true);
    }

}
