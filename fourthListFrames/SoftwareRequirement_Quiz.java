package fourthListFrames;

/**
 * @author MuhammadHasnatRasool
 */
import frame.Quiz;


public class SoftwareRequirement_Quiz extends Quiz{
    

    public SoftwareRequirement_Quiz(String name) {
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


    @Override
    public final void loadQuestions() {
  
        // 16
        questions.add("What is the process of defining and documenting software requirements called?");
        options.add("A) Requirements gathering, B) Requirements analysis, C) Requirements specification, D) Requirements validation");
        answers.add("C) Requirements specification");

        questions.add("Which of the following is a type of software requirement?");
        options.add("A) Functional, B) Non-functional, C) Technical, D) Business");
        answers.add("A) Functional");

        questions.add("What is a use case?");
        options.add("A) A description of a software feature, B) A scenario that describes how a user interacts with a software system, C) A type of software requirement, D) A software development methodology");
        answers.add("B) A scenario that describes how a user interacts with a software system");

        questions.add("What is the purpose of a requirements management tool?");
        options.add("A) To manage software development projects, B) To document software requirements, C) To test software systems, D) To deploy software systems");
        answers.add("B) To document software requirements");

        questions.add("Which of the following is a benefit of requirements gathering?");
        options.add("A) Improved software quality, B) Reduced software development time, C) Increased software development cost, D) Decreased user satisfaction");
        answers.add("A) Improved software quality");

        questions.add("What is a functional requirement?");
        options.add("A) A requirement that describes how a software system should behave, B) A requirement that describes what a software system should do, C) A requirement that describes the constraints on a software system, D) A requirement that describes the assumptions made about a software system");
        answers.add("B) A requirement that describes what a software system should do");

        questions.add("Which of the following is an example of a non-functional requirement?");
        options.add("A) The software system must be able to process 100 transactions per second, B) The software system must be able to store 1000 users' data, C) The software system must be able to operate on a Windows platform, D) The software system must be able to provide a response within 2 seconds");
        answers.add("D) The software system must be able to provide a response within 2 seconds");

        questions.add("What is the purpose of requirements analysis?");
        options.add("A) To define software requirements, B) To document software requirements, C) To validate software requirements, D) To analyze software requirements");
        answers.add("D) To analyze software requirements");

        questions.add("Which of the following is a type of requirements analysis?");
        options.add("A) Functional analysis, B) Non-functional analysis, C) Technical analysis, D) Business analysis");
        answers.add("A) Functional analysis");

        questions.add("What is a requirements specification document?");
        options.add("A) A document that describes software requirements, B) A document that describes software development plans, C) A document that describes software testing plans, D) A document that describes software deployment plans");
        answers.add("A) A document that describes software requirements");

        questions.add("Which of the following is a benefit of requirements specification?");
        options.add("A) Improved software development time, B) Reduced software development cost, C) Increased software quality, D) Decreased user satisfaction");
        answers.add("C) Increased software quality");

        questions.add("What is the purpose of requirements validation?");
        options.add("A) To define software requirements, B) To document software requirements, C) To analyze software requirements, D) To ensure that software requirements are correct and complete");
        answers.add("D) To ensure that software requirements are correct and complete");

        questions.add("Which of the following is a type of requirements validation?");
        options.add("A) Functional validation, B) Non-functional validation, C) Technical validation, D) Business validation");
        answers.add("A) Functional validation");

        questions.add("What is a use case diagram?");
        options.add("A) A diagram that describes software system architecture, B) A diagram that describes software system components, C) A diagram that describes software system interactions, D) A diagram that describes software system behavior");
        answers.add("C) A diagram that describes software system interactions");

        questions.add("Which of the following is a benefit of use case diagrams?");
        options.add("A) Improved software development time, B) Reduced software development cost, C) Increased software quality, D) Decreased user satisfaction");
        answers.add("C) Increased software quality");

        questions.add("What is a requirements management process?");
        options.add("A) A process that defines software requirements, B) A process that documents software requirements, C) A process that analyzes software requirements, D) A process that manages software requirements throughout the software development lifecycle");
        answers.add("D A process that manages software requirements throughout the software development lifecycle");
        
    }
    

    public static void main(String[]args){
        new SoftwareRequirement_Quiz(name).setVisible(true);
    }
    
}
