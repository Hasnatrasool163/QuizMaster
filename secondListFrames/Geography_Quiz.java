package secondListFrames;

import frame.Quiz;

/**
 * @author MuhammadHasnatRasool
 */
public class Geography_Quiz extends Quiz {

    public Geography_Quiz(String name) {
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

// questions:44
    @Override
    public final void loadQuestions() {

        questions.add("Which of the following is the longest river in the world?");
        options.add("A) Amazon River, B) Nile River, C) Yangtze River, D) Mississippi River");
        answers.add("B) Nile River");

        questions.add("What is the capital city of Australia?");
        options.add("A) Sydney, B) Melbourne, C) Canberra, D) Brisbane");
        answers.add("C) Canberra");

        questions.add("Mount Everest, the highest peak in the world, is located in which mountain range?");
        options.add("A) Alps, B) Andes, C) Himalayas, D) Rockies");
        answers.add("C) Himalayas");

        questions.add("Which country is known as the 'Land of the Rising Sun'?");
        options.add("A) China, B) Japan, C) South Korea, D) Thailand");
        answers.add("B) Japan");

        questions.add("What is the largest desert in the world?");
        options.add("A) Sahara Desert, B) Gobi Desert, C) Arabian Desert, D) Antarctica");
        answers.add("A) Sahara Desert");

        questions.add("Which ocean is the largest and deepest on Earth?");
        options.add("A) Atlantic Ocean, B) Indian Ocean, C) Pacific Ocean, D) Southern Ocean");
        answers.add("C) Pacific Ocean");

        questions.add("Which city is located at the confluence of the Blue Nile and White Nile?");
        options.add("A) Cairo, B) Khartoum, C) Nairobi, D) Addis Ababa");
        answers.add("B) Khartoum");

        questions.add("The Great Barrier Reef, the world's largest coral reef system, is located off the coast of which country?");
        options.add("A) Brazil, B) Australia, C) Philippines, D) South Africa");
        answers.add("B) Australia");

        questions.add("Which continent is known as the 'Dark Continent'?");
        options.add("A) Asia, B) Africa, C) South America, D) Antarctica");
        answers.add("B) Africa");

        questions.add("What is the capital city of Brazil?");
        options.add("A) Rio de Janeiro, B) Brasília, C) São Paulo, D) Salvador");
        answers.add("B) Brasília");

        questions.add("Which of the following countries does not have a coastline on the Mediterranean Sea?");
        options.add("A) Italy, B) Greece, C) Turkey, D) Iraq");
        answers.add("D) Iraq");

        questions.add("Which river flows through Paris, the capital of France?");
        options.add("A) Danube River, B) Rhine River, C) Seine River, D) Thames River");
        answers.add("C) Seine River");

        questions.add("Which African country is known as the 'Pearl of Africa'?");
        options.add("A) Kenya, B) Tanzania, C) Uganda, D) Rwanda");
        answers.add("C) Uganda");

        questions.add("The Suez Canal connects which two bodies of water?");
        options.add("A) Red Sea and Arabian Sea, B) Mediterranean Sea and Black Sea, C) Persian Gulf and Gulf of Oman, D) Red Sea and Mediterranean Sea");
        answers.add("D) Red Sea and Mediterranean Sea");

        questions.add("Which of the following cities is located at the highest elevation above sea level?");
        options.add("A) La Paz, B) Quito, C) Kathmandu, D) Bogotá");
        answers.add("A) La Paz");

        questions.add("Which country is the largest by land area?");
        options.add("A) Russia, B) Canada, C) China, D) United States");
        answers.add("A) Russia");

        questions.add("What is the world's largest island?");
        options.add("A) Greenland, B) Madagascar, C) Borneo, D) New Guinea");
        answers.add("A) Greenland");

        questions.add("Which of the following is a landlocked country in South America?");
        options.add("A) Brazil, B) Argentina, C) Paraguay, D) Chile");
        answers.add("C) Paraguay");

        questions.add("Which mountain range spans along the western coast of South America?");
        options.add("A) Andes, B) Rockies, C) Alps, D) Himalayas");
        answers.add("A) Andes");

        questions.add("Which of the following countries does the equator pass through?");
        options.add("A) Brazil, B) Indonesia, C) Democratic Republic of the Congo, D) All of the above");
        answers.add("D) All of the above");

        questions.add("The city of Istanbul is located in two continents. Which continents are they?");
        options.add("A) Europe and Asia, B) Africa and Europe, C) Asia and Africa, D) Asia and Australia");
        answers.add("A) Europe and Asia");

        questions.add("Which of the following is the largest freshwater lake by surface area in the world?");
        options.add("A) Lake Superior, B) Lake Baikal, C) Lake Victoria, D) Great Bear Lake");
        answers.add("A) Lake Superior");

        questions.add("Which desert is located in southern Africa and is known for its red sand dunes?");
        options.add("A) Sahara Desert, B) Kalahari Desert, C) Atacama Desert, D) Namib Desert");
        answers.add("D) Namib Desert");

        questions.add("Which river is the longest in Europe?");
        options.add("A) Rhine River, B) Danube River, C) Volga River, D) Thames River");
        answers.add("C) Volga River");

        questions.add("Which country is the smallest by land area?");
        options.add("A) Monaco, B) Vatican City, C) Nauru, D) San Marino");
        answers.add("B) Vatican City");

        questions.add("Which ocean is bordered by the eastern coast of Africa?");
        options.add("A) Atlantic Ocean, B) Indian Ocean, C) Pacific Ocean, D) Southern Ocean");
        answers.add("B) Indian Ocean");

        questions.add("What is the capital city of Canada?");
        options.add("A) Toronto, B) Ottawa, C) Montreal, D) Vancouver");
        answers.add("B) Ottawa");

        questions.add("Which of the following countries does NOT have a coastline on the Caspian Sea?");
        options.add("A) Iran, B) Russia, C) Turkey, D) Kazakhstan");
        answers.add("C) Turkey");

        questions.add("Which river is considered the lifeline of Egypt?");
        options.add("A) Tigris River, B) Euphrates River, C) Nile River, D) Jordan River");
        answers.add("C) Nile River");

        questions.add("Which of the following is the largest city in Africa by population?");
        options.add("A) Lagos, B) Cairo, C) Kinshasa, D) Johannesburg");
        answers.add("A) Lagos");

        questions.add("The city of Mecca, a holy site in Islam, is located in which country?");
        options.add("A) Saudi Arabia, B) Iraq, C) Iran, D) Jordan");
        answers.add("A) Saudi Arabia");

        questions.add("Which of the following is the largest city by land area?");
        options.add("A) Tokyo, B) New York City, C) Moscow, D) Shanghai");
        answers.add("C) Moscow");

        questions.add("What is the world's largest archipelago?");
        options.add("A) Philippines, B) Japan, C) Indonesia, D) Maldives");
        answers.add("C) Indonesia");

        questions.add("Which of the following countries does NOT have a coastline on the Pacific Ocean?");
        options.add("A) Ecuador, B) Colombia, C) Peru, D) Bolivia");
        answers.add("D) Bolivia");

        questions.add("Which sea is located between Europe and Asia?");
        options.add("A) Adriatic Sea, B) Baltic Sea, C) Mediterranean Sea, D) Black Sea");
        answers.add("D) Black Sea");

        questions.add("What is the capital city of South Africa?");
        options.add("A) Johannesburg, B) Cape Town, C) Durban, D) Pretoria");
        answers.add("D) Pretoria");

        questions.add("Which of the following countries is landlocked?");
        options.add("A) Bangladesh, B) Myanmar, C) Cambodia, D) Nepal");
        answers.add("D) Nepal");

        questions.add("Which of the following countries is known as the 'Land of a Thousand Lakes'?");
        options.add("A) Finland, B) Sweden, C) Norway, D) Denmark");
        answers.add("A) Finland");

        questions.add("Which river is the longest river in China?");
        options.add("A) Yangtze River, B) Yellow River, C) Mekong River, D) Pearl River");
        answers.add("A) Yangtze River");

        questions.add("What is the largest island country in the world?");
        options.add("A) Indonesia, B) Japan, C) Philippines, D) New Zealand");
        answers.add("A) Indonesia");

        questions.add("Which of the following countries has the largest coastline?");
        options.add("A) Canada, B) Australia, C) United States, D) Russia");
        answers.add("D) Russia");

        questions.add("Which mountain range stretches along the western coast of North America?");
        options.add("A) Rockies, B) Andes, C) Alps, D) Sierra Nevada");
        answers.add("A) Rockies");

        questions.add("Which river is the longest river entirely within Russia?");
        options.add("A) Yenisei River, B) Amur River, C) Lena River, D) Ob River");
        answers.add("C) Lena River");

        questions.add("Which country is known as the 'Land of Fire and Ice'?");
        options.add("A) Norway, B) Iceland, C) Greenland, D) Finland");
        answers.add("B) Iceland");

    }


    public static void main(String[] args) {
        new Geography_Quiz(name).setVisible(true);
    }

}
