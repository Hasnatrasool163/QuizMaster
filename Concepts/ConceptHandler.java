package Concepts;

// Define a ConceptHandler interface
interface ConceptHandler {
    String getTheoryText();
    String getExampleCode();
    String getQuizQuestions();
    String[] getCorrectAnswers();
    static void addQuizQuestions(String question, boolean answer){
    }
}
