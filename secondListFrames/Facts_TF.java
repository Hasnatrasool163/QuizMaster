package secondListFrames;

import frame.True_False_Questions;

public class Facts_TF extends True_False_Questions {

    public Facts_TF(String name) {
        super(name);

    }
   
// facts30
    @Override
    public final void loadQuestions() {

        questions.add("The Eiffel Tower is located in London.");
        answers.add("False");

        questions.add("The Great Wall of China is visible from space with the naked eye.");
        answers.add("False");

        questions.add("Bananas are berries, but strawberries are not.");
        answers.add("True");

        questions.add("A leap year has 366 days.");
        answers.add("True");

        questions.add("Coffee is the most consumed beverage in the world.");
        answers.add("False");

        questions.add("Humans share approximately 50% of their DNA with bananas.");
        answers.add("True");

        questions.add("Lightning never strikes the same place twice.");
        answers.add("False");

        questions.add("Venus is the hottest planet in our solar system.");
        answers.add("True");

        questions.add("Polar bears' fur is white to blend in with the snow.");
        answers.add("False");

        questions.add("Mount Everest is the tallest mountain on Earth.");
        answers.add("True");

        questions.add("Diamonds are the hardest natural substance on Earth.");
        answers.add("True");

        questions.add("A day on Venus is longer than a year on Venus.");
        answers.add("True");

        questions.add("Goldfish only have a memory span of three seconds.");
        answers.add("False");

        questions.add("There are more stars in the universe than grains of sand on all the Earth's beaches.");
        answers.add("True");

        questions.add("Humans can distinguish between over a trillion different smells.");
        answers.add("True");

        questions.add("The longest river in the world is the Nile River.");
        answers.add("True");

        questions.add("The capital of Australia is Sydney.");
        answers.add("False");

        questions.add("Sharks are mammals.");
        answers.add("False");

        questions.add("The largest organ in the human body is the liver.");
        answers.add("False");

        questions.add("Birds are the only animals that lay eggs.");
        answers.add("False");

        questions.add("Venus is the second planet from the sun.");
        answers.add("True");

        questions.add("The Amazon Rainforest produces more than 20% of the world's oxygen.");
        answers.add("False");

        questions.add("Water boils at 100 degrees Celsius at sea level.");
        answers.add("True");

        questions.add("A group of crows is called a murder.");
        answers.add("True");

        questions.add("The shortest war in history lasted 38 minutes.");
        answers.add("True");

        questions.add("Honey never spoils.");
        answers.add("True");

        questions.add("An octopus has three hearts.");
        answers.add("True");

        questions.add("The Great Pyramid of Giza was originally covered in white casing stones that reflected the sun's light.");
        answers.add("True");

        questions.add("Sound travels faster in water than in air.");
        answers.add("True");

        questions.add("The currency of Japan is the Yen.");
        answers.add("True");

    }

    public static void main(String[] args) {
        new Facts_TF(name).setVisible(true);
    }

}
