package secondListFrames;

import frame.Quiz;

/**
 * @author MuhammadHasnatRasool
 */

public class Facts_Quiz extends Quiz{
    

    public Facts_Quiz(String name) {
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

// questions: 29
  
    @Override
    public final void loadQuestions() {
       
       
        questions.add("Which of the following is a myth about the Great Wall of China?");
        options.add("A) It is visible from the Moon, B) Built in a single construction period, C) Made entirely of stone, D) Has a continuous wall");
        answers.add("A) It is visible from the Moon");

        questions.add("What is a common myth about the discovery of America by Christopher Columbus?");
        options.add("A) He discovered America in 1492, B) He landed in the United States, C) He proved the Earth was round, D) He was the first European to reach America");
        answers.add("C) He proved the Earth was round");

        questions.add("Which of these is a fact about the Great Pyramid of Giza?");
        options.add("A) It is the largest pyramid in the world, B) Built by slaves, C) Contains hidden chambers, D) Made of limestone");
        answers.add("D) Made of limestone");

        questions.add("What is a myth about the Loch Ness Monster in Scotland?");
        options.add("A) It has wings, B) It is a type of fish, C) It has been scientifically proven to exist, D) It is a modern legend");
        answers.add("A) It has wings");

        questions.add("Which of these is a fact about Stonehenge in England?");
        options.add("A) It was built by the Romans, B) Used as a burial site, C) Made of volcanic rock, D) Aligned with the winter solstice");
        answers.add("D) Aligned with the winter solstice");

        questions.add("What is a myth about Cleopatra, the last queen of Egypt?");
        options.add("A) She was Egyptian, B) She was killed by a snake bite, C) She was a pharaoh, D) She was beautiful");
        answers.add("B) She was killed by a snake bite");

        questions.add("Which of these is a fact about the Eiffel Tower in France?");
        options.add("A) It was designed by Gustave Eiffel, B) It was originally painted red, C) It was built in the 18th century, D) It was originally a lighthouse");
        answers.add("A) It was designed by Gustave Eiffel");

        questions.add("What is a common myth about the Great Sphinx of Giza?");
        options.add("A) It has a lion's body and a human head, B) It was built by aliens, C) It is older than the pyramids, D) It guards the city of Alexandria");
        answers.add("B) It was built by aliens");

        questions.add("Which of these is a fact about the Taj Mahal in India?");
        options.add("A) It was built by Emperor Akbar, B) It is made entirely of black marble, C) It is a Hindu temple, D) It was built as a mausoleum");
        answers.add("D) It was built as a mausoleum");

        questions.add("What is a myth about the Bermuda Triangle?");
        options.add("A) Ships and planes disappear regularly, B) It is located in the Pacific Ocean, C) It has no boundaries, D) It has a rational explanation");
        answers.add("A) Ships and planes disappear regularly");

        questions.add("Which of these is a fact about the Easter Island statues?");
        options.add("A) They were built by the Mayans, B) They all face towards the sea, C) They were constructed in a single day, D) They represent gods and ancestors");
        answers.add("D) They represent gods and ancestors");

        questions.add("What is a myth about the city of Atlantis?");
        options.add("A) It was a powerful empire, B) It is located in the Mediterranean Sea, C) It was discovered in the 19th century, D) It was ruled by Alexander the Great");
        answers.add("A) It was a powerful empire");

        questions.add("Which of these is a fact about the Mona Lisa painting?");
        options.add("A) It was painted by Michelangelo, B) It is housed in the Louvre Museum, C) It was created in the 20th century, D) It depicts a Greek goddess");
        answers.add("B) It is housed in the Louvre Museum");

        questions.add("What is a common myth about the city of Pompeii?");
        options.add("A) It was destroyed by a tsunami, B) It was completely buried in lava, C) It was a Roman capital, D) It was founded by Julius Caesar");
        answers.add("B) It was completely buried in lava");

        questions.add("Which of these is a fact about the Panama Canal?");
        options.add("A) It was built in the 19th century, B) It connects the Atlantic and Indian Oceans, C) It is entirely underground, D) It is located in South America");
        answers.add("A) It was built in the 19th century");

        questions.add("What is a myth about the Seven Wonders of the Ancient World?");
        options.add("A) They are all located in Asia, B) They were all built in the same era, C) They were all destroyed by natural disasters, D) They were all created by the same architect");
        answers.add("B) They were all built in the same era");

        questions.add("Which of these is a fact about the Acropolis in Athens?");
        options.add("A) It was a Roman temple, B) It is dedicated to the goddess Venus, C) It is located in Italy, D) It includes the Parthenon");
        answers.add("D) It includes the Parthenon");

        questions.add("What is a myth about the city of Machu Picchu?");
        options.add("A) It was built by the Incas, B) It was discovered in the 19th century, C) It was a military fortress, D) It is located in Argentina");
        answers.add("C) It was a military fortress");

        questions.add("Which of these is a fact about the Statue of Liberty in New York?");
        options.add("A) It was a gift from France, B) It is made entirely of gold, C) It was built in the 20th century, D) It represents the goddess Athena");
        answers.add("A) It was a gift from France");

        questions.add("What is a common myth about the Mona Lisa painting?");
        options.add("A) It was painted in a day, B) It has no eyebrows, C) It was stolen twice, D) It was painted by Vincent van Gogh");
        answers.add("B) It has no eyebrows");

        questions.add("Which of these is a fact about the Roman Colosseum?");
        options.add("A) It was built as a temple, B) It could accommodate over 100,000 spectators, C) It is located in Greece, D) It was destroyed by fire");
        answers.add("B) It could accommodate over 100,000 spectators");

        questions.add("What is a myth about the Tower of London?");
        options.add("A) It was built in the 14th century, B) It houses the British Crown Jewels, C) It has no ravens, D) It was a royal residence");
        answers.add("C) It has no ravens");

        questions.add("Which of these is a fact about the Statue of Christ the Redeemer in Brazil?");
        options.add("A) It was built in the 19th century, B) It is located in Rio de Janeiro, C) It is made of bronze, D) It was built by the French");
        answers.add("B) It is located in Rio de Janeiro");

        questions.add("What is a myth about the Loch Ness Monster?");
        options.add("A) It has been proven to exist, B) It is a type of fish, C) It has wings, D) It has no scales");
        answers.add("A) It has been proven to exist");

        questions.add("Which of these is a fact about the Berlin Wall?");
        options.add("A) It was built in the 18th century, B) It divided East and West Germany, C) It was destroyed by earthquake, D) It was a tourist attraction");
        answers.add("B) It divided East and West Germany");

        questions.add("What is a common myth about the Pyramids of Egypt?");
        options.add("A) They were built by aliens, B) They were all built in the same century, C) They contain no hieroglyphics, D) They are all located in Cairo");
        answers.add("A) They were built by aliens");

        questions.add("Which of these is a fact about the Amazon Rainforest?");
        options.add("A) It is the smallest rainforest in the world, B) It is located in Africa, C) It is also known as the Congo Rainforest, D) It produces 20% of the world's oxygen");
        answers.add("D) It produces 20% of the world's oxygen");

        questions.add("What is a myth about the city of Venice?");
        options.add("A) It has no canals, B) It is sinking at a rapid rate, C) It is located in Greece, D) It was built in the 21st century");
        answers.add("B) It is sinking at a rapid rate");

        questions.add("Which of these is a fact about the Sahara Desert?");
        options.add("A) It is the coldest desert in the world, B) It is the smallest desert in Africa, C) It has the largest sand dunes in the world, D) It is located in South America");
        answers.add("C) It has the largest sand dunes in the world");

    }

    
    public static void main(String[]args){
        new Facts_Quiz(name).setVisible(true);
    }
    
}
