package sixthListFrames;

import frame.Quiz;

/**
 * @author MuhammadHasnatRasool
 */
public class WorldPolitics_Quiz extends Quiz{
    

    public WorldPolitics_Quiz(String name) {
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

    // questions:37

    @Override
    public final void loadQuestions() {

        
        questions.add("Who is the current Secretary-General of the United Nations(by 2024)?");
        options.add("A. António Guterres, B. Ban Ki-moon, C. Kofi Annan, D. Boutros Boutros-Ghali");
        answers.add("A. António Guterres");

        questions.add("Which country is the largest emitter of greenhouse gases?");
        options.add("A. China, B. United States, C. India, D. Russia");
        answers.add("A. China");

        questions.add("What is the name of the peace agreement signed between the US and the Taliban in 2020?");
        options.add("A. Doha Agreement, B. Kabul Accord, C. Taliban Treaty, D. Afghan Peace Deal");
        answers.add("A. Doha Agreement");

        questions.add("Who is the current President of the European Commission?");
        options.add("A. Ursula von der Leyen, B. Jean-Claude Juncker, C. Donald Tusk, D. Angela Merkel");
        answers.add("A. Ursula von der Leyen");

        questions.add("Which organization is responsible for regulating international trade?");
        options.add("A. World Trade Organization, B. International Monetary Fund, C. World Bank, D. United Nations");
        answers.add("A. World Trade Organization");

        questions.add("What is the name of the UK's exit from the European Union?");
        options.add("A. Brexit, B. Grexit, C. Frexit, D. Italexit");
        answers.add("A. Brexit");

        questions.add("Who is the current President of Russia?");
        options.add("A. Vladimir Putin, B. Dmitry Medvedev, C. Mikhail Gorbachev, D. Boris Yeltsin");
        answers.add("A. Vladimir Putin");

        questions.add("Which country is the largest economy in the world?");
        options.add("A. United States, B. China, C. Japan, D. Germany");
        answers.add("B. China");

        questions.add("What is the name of the international agreement on climate change?");
        options.add("A. Paris Agreement, B. Kyoto Protocol, C. Copenhagen Accord, D. Montreal Protocol");
        answers.add("A. Paris Agreement");

        questions.add("Who is the current Prime Minister of India?");
        options.add("A. Narendra Modi, B. Manmohan Singh, C. Jawaharlal Nehru, D. Indira Gandhi");
        answers.add("A. Narendra Modi");

        questions.add("Which organization is responsible for promoting democracy and human rights?");
        options.add("A. United Nations, B. European Union, C. Council of Europe, D. Organization for Security and Co-operation in Europe");
        answers.add("C. Council of Europe");

        questions.add("What is the name of the conflict in eastern Ukraine?");
        options.add("A. Donbass War, B. Ukrainian Civil War, C. Russo-Ukrainian War, D. Crimean Crisis");
        answers.add("A. Donbass War");

        questions.add("Who is the current President of China?");
        options.add("A. Xi Jinping, B. Hu Jintao, C. Jiang Zemin, D. Deng Xiaoping");
        answers.add("A. Xi Jinping");

        questions.add("Which country is the largest producer of oil?");
        options.add("A. Saudi Arabia, B. Russia, C. United States, D. Iraq");
        answers.add("A. Saudi Arabia");

        questions.add("What is the name of the international criminal court?");
        options.add("A. International Criminal Court, B. International Court of Justice, C. European Court of Human Rights, D. African Court on Human and Peoples' Rights");
        answers.add("A. International Criminal Court");

        questions.add("Who is the current Prime Minister of the United Kingdom?");
        options.add("A. Boris Johnson, B. Theresa May, C. David Cameron, D. Tony Blair");
        answers.add("A. Boris Johnson");

        questions.add("Which organization is responsible for promoting economic cooperation among its member states?");
        options.add("A. Organization for Economic Co-operation and Development, B. World Trade Organization, C. International Monetary Fund, D. World Bank");
        answers.add("A. Organization for Economic Co-operation and Development");

        questions.add("What is the name of the conflict in Syria?");
        options.add("A. Syrian Civil War, B. Syrian Crisis, C. Syrian Conflict, D. Arab Spring");
        answers.add("A. Syrian Civil War");

        questions.add("Who is the current President of France?");
        options.add("A. Emmanuel Macron, B. François Hollande, C. Nicolas Sarkozy, D. Jacques Chirac");
        answers.add("A. Emmanuel Macron");

        questions.add("Which country is the largest producer of natural gas?");
        options.add("A. Russia, B. United States, C. Saudi Arabia, D. Iran");
        answers.add("A. Russia");
        
        questions.add("What is the name of the European Union's migration policy?");
        options.add("A. Dublin Regulation, B. Schengen Agreement, C. EU Migration Policy, D. Refugee Convention");
        answers.add("A. Dublin Regulation");

        questions.add("Who is the current Secretary-General of NATO?");
        options.add("A. Jens Stoltenberg, B. Anders Fogh Rasmussen, C. Jaap de Hoop Scheffer, D. George Robertson");
        answers.add("A. Jens Stoltenberg");

        questions.add("Which country is the largest trading partner of the European Union?");
        options.add("A. United States, B. China, C. Russia, D. India");
        answers.add("A. United States");

        questions.add("What is the name of the international agreement on cybersecurity?");
        options.add("A. Paris Call for Trust and Security in Cyberspace, B. Budapest Convention on Cybercrime, C. Geneva Conventions on Cyber Warfare, D. Vienna Convention on Cyber Diplomacy");
        answers.add("A. Paris Call for Trust and Security in Cyberspace");

        questions.add("Who is the current President of the African Union?");
        options.add("A. Macky Sall, B. Abdel Fattah el-Sisi, C. Cyril Ramaphosa, D. Paul Kagame");
        answers.add("A. Macky Sall");

        questions.add("Which organization is responsible for promoting human rights in Africa?");
        options.add("A. African Commission on Human and Peoples' Rights, B. African Court on Human and Peoples' Rights, C. African Union Human Rights Commission, D. United Nations Human Rights Council");
        answers.add("A. African Commission on Human and Peoples' Rights");

        questions.add("What is the name of the conflict in Yemen?");
        options.add("A. Yemeni Civil War, B. Yemeni Crisis, C. Yemeni Conflict, D. Arab Spring");
        answers.add("A. Yemeni Civil War");

        questions.add("Who is the current Prime Minister of Canada?");
        options.add("A. Justin Trudeau, B. Stephen Harper, C. Jean Chrétien, D. Pierre Trudeau");
        answers.add("A. Justin Trudeau");

        questions.add("Which country is the largest producer of wheat?");
        options.add("A. China, B. India, C. Russia, D. United States");
        answers.add("A. China");

        questions.add("What is the name of the international agreement on trade in services?");
        options.add("A. General Agreement on Trade in Services, B. Trade in Services Agreement, C. Services Trade Agreement, D. World Trade Organization Agreement on Services");
        answers.add("A. General Agreement on Trade in Services");

        questions.add("Who is the current President of Brazil?");
        options.add("A. Jair Bolsonaro, B. Michel Temer, C. Dilma Rousseff, D. Luiz Inácio Lula da Silva");
        answers.add("A. Jair Bolsonaro");

        questions.add("Which organization is responsible for promoting economic cooperation among its member states in South America?");
        options.add("A. Union of South American Nations, B. Mercosur, C. Community of Latin American and Caribbean States, D. Organization of American States");
        answers.add("A. Union of South American Nations");

        questions.add("What is the name of the conflict in Libya?");
        options.add("A. Libyan Civil War, B. Libyan Crisis, C. Libyan Conflict, D. Arab Spring");
        answers.add("A. Libyan Civil War");

        questions.add("Who is the current Prime Minister of Australia?");
        options.add("A. Scott Morrison, B. Malcolm Turnbull, C. Tony Abbott, D. Julia Gillard");
        answers.add("A. Scott Morrison");

        questions.add("Which country is the largest producer of coffee?");
        options.add("A. Brazil, B. Vietnam, C. Colombia, D. Ethiopia");
        answers.add("A. Brazil");

        questions.add("What is the name of the international agreement on intellectual property?");
        options.add("A. Agreement on Trade-Related Aspects of Intellectual Property Rights, B. World Intellectual Property Organization Treaty, C. Paris Convention for the Protection of Industrial Property, D. Berne Convention for the Protection of Literary and Artistic Works");
        answers.add("A. Agreement on Trade-Related Aspects of Intellectual Property Rights");

        questions.add("Who is the current President of South Africa?");
        options.add("A. Cyril Ramaphosa, B. Jacob Zuma, C. Thabo Mbeki, D. Nelson Mandela");
        answers.add("A. Cyril Ramaphosa");

        
    }

    public static void main(String[]args){
        new WorldPolitics_Quiz(name).setVisible(true);
    }
    
}
