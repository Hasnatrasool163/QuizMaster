
package sixthListFrames;


import frame.Quiz;
/**
 * @author MuhammadHasnatRasool
 */
public class ForeignPolicy_Quiz extends Quiz{
    

    public ForeignPolicy_Quiz(String name) {
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


    // questions:43
    @Override
    public final void loadQuestions() {

    
        questions.add("Who was the first Foreign Minister of Pakistan?");
        options.add("A. Muhammad Zafarullah Khan, B. Liaquat Ali Khan, C. Muhammad Ali Jinnah, D. Ghulam Muhammad");
        answers.add("A. Muhammad Zafarullah Khan");

        questions.add("What was the name of Pakistan's first foreign policy doctrine?");
        options.add("A. Pakistan's Foreign Policy Doctrine, B. Muhammad Ali Jinnah's Doctrine, C. Liaquat Ali Khan's Doctrine, D. The Karachi Doctrine");
        answers.add("D. The Karachi Doctrine");

        questions.add("Which country was the first to recognize Pakistan's independence?");
        options.add("A. United Kingdom, B. United States, C. Soviet Union, D. Iran");
        answers.add("A. United Kingdom");

        questions.add("What was the name of the treaty signed between Pakistan and the United States in 1954?");
        options.add("A. Mutual Defense Assistance Agreement, B. Pakistan-US Treaty of Cooperation, C. Southeast Asia Treaty Organization, D. Central Treaty Organization");
        answers.add("A. Mutual Defense Assistance Agreement");

        questions.add("Who was the Pakistani diplomat who played a key role in the creation of the Organization of Islamic Cooperation?");
        options.add("A. Muhammad Zafarullah Khan, B. Aga Shahi, C. Sahabzada Yaqub Khan, D. Abdul Sattar");
        answers.add("A. Muhammad Zafarullah Khan");

        questions.add("What was the name of the conflict between Pakistan and India in 1947?");
        options.add("A. Indo-Pakistani War of 1947, B. Kashmir War, C. Partition Conflict, D. Independence War");
        answers.add("A. Indo-Pakistani War of 1947");

        questions.add("Who was the Pakistani leader who visited China in 1956 and established diplomatic relations?");
        options.add("A. Muhammad Ali Jinnah, B. Liaquat Ali Khan, C. Ayub Khan, D. Zulfikar Ali Bhutto");
        answers.add("C. Ayub Khan");

        questions.add("What was the name of the Pakistani military operation in East Pakistan in 1971?");
        options.add("A. Operation Searchlight, B. Operation Blitz, C. Operation Trident, D. Operation Python");
        answers.add("A. Operation Searchlight");

        questions.add("Who was the Pakistani diplomat who served as the United Nations Secretary-General from 1972 to 1981?");
        options.add("A. Muhammad Zafarullah Khan, B. Aga Shahi, C. Sahabzada Yaqub Khan, D. Kurt Waldheim");
        answers.add("A. Muhammad Zafarullah Khan");

        questions.add("What was the name of the treaty signed between Pakistan and Afghanistan in 1976?");
        options.add("A. Pakistan-Afghanistan Treaty of Friendship, B. Afghanistan-Pakistan Treaty of Cooperation, C. Durand Line Agreement, D. Pak-Afghan Border Treaty");
        answers.add("C. Durand Line Agreement");

        questions.add("Who was the Pakistani leader who visited the United States in 1980 and secured military aid?");
        options.add("A. Zulfikar Ali Bhutto, B. Muhammad Zia-ul-Haq, C. Benazir Bhutto, D. Nawaz Sharif");
        answers.add("B. Muhammad Zia-ul-Haq");

        questions.add("What was the name of the Pakistani military operation in Kargil in 1999?");
        options.add("A. Operation Vijay, B. Operation Badr, C. Operation Koh-e-Payan, D. Operation Safed Sagar");
        answers.add("C. Operation Koh-e-Payan");

        questions.add("Who was the Pakistani diplomat who served as the Foreign Minister of Pakistan from 2002 to 2007?");
        options.add("A. Khurshid Mahmud Kasuri, B. Shah Mahmood Qureshi, C. Hina Rabbani Khar, D. Sartaj Aziz");
        answers.add("A. Khurshid Mahmud Kasuri");

        questions.add("What was the name of the treaty signed between Pakistan and China in 2005?");
        options.add("A. Pakistan-China Treaty of Friendship, B. China-Pakistan Treaty of Cooperation, C. Pakistan-China Free Trade Agreement, D. China-Pakistan Strategic Partnership Agreement");
        answers.add("D. China-Pakistan Strategic Partnership Agreement");

        questions.add("Who was the Pakistani leader who visited India in 2011 and resumed diplomatic talks?");
        options.add("A. Asif Ali Zardari, B. Yousaf Raza Gillani, C. Nawaz Sharif, D. Pervez Musharraf");
        answers.add("C. Nawaz Sharif");
        
        questions.add("What was the name of the Pakistani military operation in North Waziristan in 2014?");
        options.add("A. Operation Zarb-e-Azb, B. Operation Rah-e-Nijat, C. Operation Sher Dil, D. Operation Khwakh Ba De Sham");
        answers.add("A. Operation Zarb-e-Azb");

        questions.add("Who was the Pakistani Army Chief during the Operation Zarb-e-Azb?");
        options.add("A. General Raheel Sharif, B. General Ashfaq Parvez Kayani, C. General Pervez Musharraf, D. General Qamar Javed Bajwa");
        answers.add("A. General Raheel Sharif");

        questions.add("What was the name of the Pakistani political party that came into power in 2013?");
        options.add("A. Pakistan Muslim League (N), B. Pakistan Peoples Party, C. Pakistan Tehreek-e-Insaf, D. Jamiat Ulema-e-Islam (F)");
        answers.add("A. Pakistan Muslim League (N)");

        questions.add("Who was the Pakistani Prime Minister who visited the United States in 2015?");
        options.add("A. Nawaz Sharif, B. Shahid Khaqan Abbasi, C. Imran Khan, D. Yousaf Raza Gillani");
        answers.add("A. Nawaz Sharif");

        questions.add("What was the name of the Chinese investment project in Pakistan launched in 2015?");
        options.add("A. China-Pakistan Economic Corridor, B. Pakistan-China Friendship Project, C. China-Pakistan Investment Initiative, D. Pakistan-China Development Program");
        answers.add("A. China-Pakistan Economic Corridor");

        questions.add("Who was the Pakistani diplomat who served as the Foreign Secretary of Pakistan from 2014 to 2017?");
        options.add("A. Aizaz Ahmad Chaudhry, B. Jalil Abbas Jilani, C. Salman Bashir, D. Tehmina Janjua");
        answers.add("A. Aizaz Ahmad Chaudhry");

        questions.add("What was the name of the Indian military operation in Kashmir in 2016?");
        options.add("A. Operation Calm Down, B. Operation All Out, C. Operation Hawk's Eye, D. Operation Sudarshan");
        answers.add("B. Operation All Out");

        questions.add("Who was the Pakistani Army Chief who retired in 2016?");
        options.add("A. General Raheel Sharif, B. General Ashfaq Parvez Kayani, C. General Pervez Musharraf, D. General Qamar Javed Bajwa");
        answers.add("A. General Raheel Sharif");

        questions.add("What was the name of the Pakistani political party that was disqualified from elections in 2017?");
        options.add("A. Pakistan Muslim League (N), B. Pakistan Peoples Party, C. Pakistan Tehreek-e-Insaf, D. Jamaat-e-Islami");
        answers.add("A. Pakistan Muslim League (N)");

        questions.add("Who was the Pakistani Prime Minister who was disqualified from office in 2017?");
        options.add("A. Nawaz Sharif, B. Shahid Khaqan Abbasi, C. Imran Khan, D. Yousaf Raza Gillani");
        answers.add("A. Nawaz Sharif");

        questions.add("What was the name of the Pakistani military operation in Punjab in 2017?");
        options.add("A. Operation Radd-ul-Fasaad, B. Operation Zarb-e-Azb, C. Operation Sher Dil, D. Operation Khwakh Ba De Sham");
        answers.add("A. Operation Radd-ul-Fasaad");

        questions.add("Who was the Pakistani diplomat who served as the High Commissioner to the United Kingdom from 2017 to 2020?");
        options.add("A. Syed Ibne Abbas, B. Mohammad Nafees Zakaria, C. Abdul Basit, D. Maleeha Lodhi");
        answers.add("B. Mohammad Nafees Zakaria");

        questions.add("What was the name of the Pakistani political party that won the general elections in 2018?");
        options.add("A. Pakistan Tehreek-e-Insaf, B. Pakistan Muslim League (N), C. Pakistan Peoples Party, D. Jamiat Ulema-e-Islam (F)");
        answers.add("A. Pakistan Tehreek-e-Insaf");

        questions.add("Who was the Pakistani Prime Minister who visited Saudi Arabia in 2019?");
        options.add("A. Imran Khan, B. Nawaz Sharif, C. Shahid Khaqan Abbasi, D. Yousaf Raza Gillani");
        answers.add("A. Imran Khan");
        
        questions.add("What was the name of the Pakistani military operation in Balochistan in 2020?");
        options.add("A. Operation Radd-ul-Fasaad, B. Operation Zarb-e-Azb, C. Operation Sher Dil, D. Operation Mountain Viper");
        answers.add("D. Operation Mountain Viper");

        questions.add("Who was the Pakistani Army Chief who took office in 2020?");
        options.add("A. General Qamar Javed Bajwa, B. General Asim Munir, C. General Faiz Hameed, D. General Sahir Shamshad Mirza");
        answers.add("B. General Asim Munir");

        questions.add("What was the name of the Pakistani political party that formed a coalition government in 2020?");
        options.add("A. Pakistan Tehreek-e-Insaf, B. Pakistan Muslim League (N), C. Pakistan Peoples Party, D. Jamiat Ulema-e-Islam (F)");
        answers.add("A. Pakistan Tehreek-e-Insaf");

        questions.add("Who was the Pakistani Prime Minister who visited China in 2020?");
        options.add("A. Imran Khan, B. Nawaz Sharif, C. Shahid Khaqan Abbasi, D. Yousaf Raza Gillani");
        answers.add("A. Imran Khan");

        questions.add("What was the name of the Pakistani military operation in Sindh in 2020?");
        options.add("A. Operation Radd-ul-Fasaad, B. Operation Zarb-e-Azb, C. Operation Sher Dil, D. Operation Grand Fury");
        answers.add("D. Operation Grand Fury");

        questions.add("Who was the Pakistani diplomat who served as the Foreign Minister of Pakistan from 2020 to 2022?");
        options.add("A. Shah Mahmood Qureshi, B. Bilawal Bhutto Zardari, C. Khawaja Muhammad Asif, D. Sartaj Aziz");
        answers.add("A. Shah Mahmood Qureshi");

        questions.add("What was the name of the Indian military operation in Ladakh in 2020?");
        options.add("A. Operation Vijay, B. Operation Meghdoot, C. Operation Falcon, D. Operation Snow Leopard");
        answers.add("D. Operation Snow Leopard");

        questions.add("Who was the Pakistani Army Chief who retired in 2020?");
        options.add("A. General Qamar Javed Bajwa, B. General Asim Munir, C. General Faiz Hameed, D. General Sahir Shamshad Mirza");
        answers.add("A. General Qamar Javed Bajwa");

        questions.add("What was the name of the Pakistani political party that won the provincial elections in Punjab in 2020?");
        options.add("A. Pakistan Tehreek-e-Insaf, B. Pakistan Muslim League (N), C. Pakistan Peoples Party, D. Jamiat Ulema-e-Islam (F)");
        answers.add("B. Pakistan Muslim League (N)");

        questions.add("Who was the Pakistani Prime Minister who visited the United Arab Emirates in 2020?");
        options.add("A. Imran Khan, B. Nawaz Sharif, C. Shahid Khaqan Abbasi, D. Yousaf Raza Gillani");
        answers.add("A. Imran Khan");

        questions.add("What was the name of the Pakistani military operation in Khyber Pakhtunkhwa in 2020?");
        options.add("A. Operation Radd-ul-Fasaad, B. Operation Zarb-e-Azb, C. Operation Sher Dil, D. Operation Thunderbolt");
        answers.add("D. Operation Thunderbolt");

        questions.add("Who was the Pakistani diplomat who served as the High Commissioner to India from 2020 to 2022?");
        options.add("A. Syed Ibne Abbas, B. Mohammad Nafees Zakaria, C. Abdul Basit, D. Maleeha Lodhi");
        answers.add("B. Mohammad Nafees Zakaria");

        questions.add("What was the name of the Pakistani political party that formed a coalition government in Azad Kashmir in 2020?");
        options.add("A. Pakistan Tehreek-e-Insaf, B. Pakistan Muslim League (N), C. Pakistan Peoples Party, D. Jamiat Ulema-e-Islam (F)");
        answers.add("B. Pakistan Muslim League (N)");

        questions.add("Who was the Pakistani Prime Minister who visited Turkey in 2020?");
        options.add("A. Imran Khan, B. Nawaz Sharif, C. Shahid Khaqan Abbasi, D. Yousaf Raza Gillani");
        answers.add("A. Imran Khan");


        
    }

    public static void main(String[]args){
        new ForeignPolicy_Quiz(name).setVisible(true);
    }
    
}
