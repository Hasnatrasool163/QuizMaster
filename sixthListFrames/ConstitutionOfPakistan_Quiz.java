
package sixthListFrames;


import frame.Quiz;
/**
 * @author MuhammadHasnatRasool
 */
public class ConstitutionOfPakistan_Quiz extends Quiz{
    

    public ConstitutionOfPakistan_Quiz(String name) {
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


    // questions:49
    @Override
    public final void loadQuestions() {
        
        questions.add("What is the name of the document that serves as the supreme law of Pakistan?");
        options.add("A. Constitution of Pakistan, B. Pakistan Resolution, C. Lahore Resolution, D. Karachi Resolution");
        answers.add("A. Constitution of Pakistan");

        questions.add("In which year was the Constitution of Pakistan adopted?");
        options.add("A. 1947, B. 1956, C. 1962, D. 1973");
        answers.add("D. 1973");

        questions.add("Who was the chairman of the committee that drafted the Constitution of Pakistan?");
        options.add("A. Muhammad Ali Jinnah, B. Liaquat Ali Khan, C. Khawaja Nazimuddin, D. Abdur Rab Nishtar");
        answers.add("B. Liaquat Ali Khan");

        questions.add("What is the name of the preamble of the Constitution of Pakistan?");
        options.add("A. Objectives Resolution, B. Lahore Resolution, C. Pakistan Resolution, D. Karachi Resolution");
        answers.add("A. Objectives Resolution");

        questions.add("How many articles are there in the Constitution of Pakistan?");
        options.add("A. 200, B. 234, C. 250, D. 280");
        answers.add("C. 250");

        questions.add("What is the name of the first amendment to the Constitution of Pakistan?");
        options.add("A. First Amendment Act, 1974, B. Second Amendment Act, 1974, C. Third Amendment Act, 1975, D. Fourth Amendment Act, 1975");
        answers.add("A. First Amendment Act, 1974");

        questions.add("Which article of the Constitution deals with the fundamental rights of citizens?");
        options.add("A. Article 1-10, B. Article 11-20, C. Article 21-30, D. Article 31-40");
        answers.add("C. Article 21-30");

        questions.add("Who has the power to amend the Constitution of Pakistan?");
        options.add("A. President of Pakistan, B. Prime Minister of Pakistan, C. Parliament of Pakistan, D. Supreme Court of Pakistan");
        answers.add("C. Parliament of Pakistan");

        questions.add("What is the name of the phase of the Constitution that deals with the structure and organization of the government?");
        options.add("A. Phase I, B. Phase II, C. Phase III, D. Phase IV");
        answers.add("B. Phase II");

        questions.add("Which role is assigned to the President of Pakistan according to the Constitution?");
        options.add("A. Head of State, B. Head of Government, C. Commander-in-Chief, D. Chief Justice");
        answers.add("A. Head of State");

        questions.add("What is the name of the challenge faced by the Constitution of Pakistan during its early years?");
        options.add("A. Political instability, B. Economic crisis, C. Social unrest, D. International pressure");
        answers.add("A. Political instability");

        questions.add("In which year was the Constitution of Pakistan suspended?");
        options.add("A. 1947, B. 1956, C. 1962, D. 1977");
        answers.add("D. 1977");

        questions.add("Who was the Chief Martial Law Administrator during the suspension of the Constitution?");
        options.add("A. General Muhammad Zia-ul-Haq, B. General Yahya Khan, C. General Ayub Khan, D. General Pervez Musharraf");
        answers.add("A. General Muhammad Zia-ul-Haq");

        questions.add("What is the name of the amendment that introduced Islamic provisions in the Constitution?");
        options.add("A. Eighth Amendment, B. Ninth Amendment, C. Tenth Amendment, D. Eleventh Amendment");
        answers.add("A. Eighth Amendment");

        questions.add("Which article of the Constitution deals with the principle of policy?");
        options.add("A. Article 29, B. Article 30, C. Article 31, D. Article 32");
        answers.add("C. Article 31");

        questions.add("Who has the power to interpret the Constitution of Pakistan?");
        options.add("A. Supreme Court of Pakistan, B. High Courts of Pakistan, C. Federal Shariat Court, D. Council of Islamic Ideology");
        answers.add("A. Supreme Court of Pakistan");

        questions.add("What is the name of the phase of the Constitution that deals with the relationship between the federal government and the provinces?");
        options.add("A. Phase I, B. Phase II, C. Phase III, D. Phase IV");
        answers.add("C. Phase III");

        questions.add("Which role is assigned to the Prime Minister of Pakistan according to the Constitution?");
        options.add("A. Head of State, B. Head of Government, C. Commander-in-Chief, D. Chief Justice");
        answers.add("B. Head of Government");
        
        questions.add("What is the name of the article that deals with the protection of minorities in Pakistan?");
        options.add("A. Article 25, B. Article 26, C. Article 27, D. Article 28");
        answers.add("C. Article 27");

        questions.add("Who was the first Chief Justice of Pakistan?");
        options.add("A. Justice Abdur Rashid, B. Justice Muhammad Munir, C. Justice M. H. Kiani, D. Justice A. R. Cornelius");
        answers.add("A. Justice Abdur Rashid");

        questions.add("What is the name of the amendment that introduced the principle of separate electorates for Muslims and non-Muslims?");
        options.add("A. Eighth Amendment, B. Ninth Amendment, C. Tenth Amendment, D. Eleventh Amendment");
        answers.add("A. Eighth Amendment");

        questions.add("Which article of the Constitution deals with the freedom of speech and expression?");
        options.add("A. Article 19, B. Article 20, C. Article 21, D. Article 22");
        answers.add("A. Article 19");

        questions.add("Who has the power to appoint the Governor of a province?");
        options.add("A. President of Pakistan, B. Prime Minister of Pakistan, C. Chief Minister of the province, D. Speaker of the Provincial Assembly");
        answers.add("A. President of Pakistan");

        questions.add("What is the name of the phase of the Constitution that deals with the relationship between the federal government and the provinces?");
        options.add("A. Phase I, B. Phase II, C. Phase III, D. Phase IV");
        answers.add("C. Phase III");

        questions.add("Which role is assigned to the Speaker of the National Assembly according to the Constitution?");
        options.add("A. Presiding officer of the National Assembly, B. Deputy Speaker of the National Assembly, C. Leader of the House, D. Leader of the Opposition");
        answers.add("A. Presiding officer of the National Assembly");

        questions.add("What is the name of the challenge faced by the Constitution of Pakistan during the political crisis of 1977?");
        options.add("A. Political instability, B. Economic crisis, C. Social unrest, D. International pressure");
        answers.add("A. Political instability");

        questions.add("In which year was the Constitution of Pakistan restored after a period of suspension?");
        options.add("A. 1947, B. 1956, C. 1962, D. 1985");
        answers.add("D. 1985");

        questions.add("Who was the Chief Justice of Pakistan during the famous judgment of the Supreme Court in 1993?");
        options.add("A. Justice Nasim Hasan Shah, B. Justice Muhammad Afzal Zullah, C. Justice Abdul Qadeer Chaudhry, D. Justice Iftikhar Muhammad Chaudhry");
        answers.add("A. Justice Nasim Hasan Shah");

        questions.add("What is the name of the amendment that introduced the principle of gender equality in the Constitution?");
        options.add("A. Twelfth Amendment, B. Thirteenth Amendment, C. Fourteenth Amendment, D. Fifteenth Amendment");
        answers.add("C. Fourteenth Amendment");

        questions.add("Which article of the Constitution deals with the protection of the rights of women?");
        options.add("A. Article 25, B. Article 26, C. Article 27, D. Article 28");
        answers.add("A. Article 25");

        questions.add("Who has the power to appoint the Chief Election Commissioner of Pakistan?");
        options.add("A. President of Pakistan, B. Prime Minister of Pakistan, C. Chief Justice of Pakistan, D. Speaker of the National Assembly");
        answers.add("A. President of Pakistan");

        questions.add("What is the name of the phase of the Constitution that deals with the relationship between the federal government and the judiciary?");
        options.add("A. Phase I, B. Phase II, C. Phase III, D. Phase IV");
        answers.add("B. Phase II");

        questions.add("Which role is assigned to the Attorney General of Pakistan according to the Constitution?");
        options.add("A. Legal adviser to the government, B. Prosecutor general, C. Solicitor general, D. Advocate general");
        answers.add("A. Legal adviser to the government");

        questions.add("What is the name of the challenge faced by the Constitution of Pakistan during the war on terror?");
        options.add("A. Political instability, B. Economic crisis, C. Social unrest, D. International pressure");
        answers.add("D. International pressure");
        
        questions.add("What is the name of the article that deals with the protection of the rights of persons with disabilities?");
        options.add("A. Article 24, B. Article 25, C. Article 26, D. Article 27");
        answers.add("C. Article 26");

        questions.add("Who was the first woman to become the Speaker of the National Assembly of Pakistan?");
        options.add("A. Benazir Bhutto, B. Fehmida Mirza, C. Kalsoom Nawaz, D. Sherry Rehman");
        answers.add("B. Fehmida Mirza");

        questions.add("What is the name of the amendment that introduced the principle of local government in the Constitution?");
        options.add("A. Twelfth Amendment, B. Thirteenth Amendment, C. Fourteenth Amendment, D. Fifteenth Amendment");
        answers.add("B. Thirteenth Amendment");

        questions.add("Which article of the Constitution deals with the freedom of information?");
        options.add("A. Article 18, B. Article 19, C. Article 20, D. Article 21");
        answers.add("B. Article 19");

        questions.add("Who has the power to appoint the Chairman of the Council of Islamic Ideology?");
        options.add("A. President of Pakistan, B. Prime Minister of Pakistan, C. Chief Justice of Pakistan, D. Speaker of the National Assembly");
        answers.add("A. President of Pakistan");

        questions.add("What is the name of the phase of the Constitution that deals with the relationship between the federal government and the media?");
        options.add("A. Phase I, B. Phase II, C. Phase III, D. Phase IV");
        answers.add("B. Phase II");

        questions.add("Which role is assigned to the Information Commissioner according to the Constitution?");
        options.add("A. Chief Information Commissioner, B. Information Commissioner, C. Deputy Information Commissioner, D. Assistant Information Commissioner");
        answers.add("B. Information Commissioner");

        questions.add("What is the name of the challenge faced by the Constitution of Pakistan during the political crisis of 2009?");
        options.add("A. Political instability, B. Economic crisis, C. Social unrest, D. International pressure");
        answers.add("A. Political instability");

        questions.add("In which year was the Constitution of Pakistan amended to introduce the principle of women's empowerment?");
        options.add("A. 1947, B. 1956, C. 1962, D. 2011");
        answers.add("D. 2011");

        questions.add("Who was the Chief Justice of Pakistan during the famous judgment of the Supreme Court in 2012?");
        options.add("A. Justice Iftikhar Muhammad Chaudhry, B. Justice Abdul Hameed Dogar, C. Justice Muhammad Afzal Zullah, D. Justice Nasim Hasan Shah");
        answers.add("A. Justice Iftikhar Muhammad Chaudhry");

        questions.add("What is the name of the amendment that introduced the principle of judicial independence in the Constitution?");
        options.add("A. Twelfth Amendment, B. Thirteenth Amendment, C. Fourteenth Amendment, D. Fifteenth Amendment");
        answers.add("C. Fourteenth Amendment");

        questions.add("Which article of the Constitution deals with the protection of the rights of farmers?");
        options.add("A. Article 22, B. Article 23, C. Article 24, D. Article 25");
        answers.add("C. Article 24");

        questions.add("Who has the power to appoint the Chairman of the National Commission for Human Rights?");
        options.add("A. President of Pakistan, B. Prime Minister of Pakistan, C. Chief Justice of Pakistan, D. Speaker of the National Assembly");
        answers.add("A. President of Pakistan");

        questions.add("What is the name of the phase of the Constitution that deals with the relationship between the federal government and the civil society?");
        options.add("A. Phase I, B. Phase II, C. Phase III, D. Phase IV");
        answers.add("C. Phase III");

        questions.add("Which role is assigned to the Deputy Speaker of the National Assembly according to the Constitution?");
        options.add("A. Presiding officer, B. Deputy presiding officer, C. Chief whip, D. Leader of the House");
        answers.add("B. Deputy presiding officer");

        
    }
    

    public static void main(String[]args){
        new ConstitutionOfPakistan_Quiz(name).setVisible(true);
    }
    
}
