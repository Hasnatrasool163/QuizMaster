package sixthListFrames;


import frame.Quiz;
/**
 * @author MuhammadHasnatRasool
 */
public class Pakistan_Quiz extends Quiz{
    

    public Pakistan_Quiz(String name) {
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
  
    // questions:167
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

        questions.add("Who was the first President of the Constituent Assembly of Pakistan?");
        options.add("A) Liaquat Ali Khan, B) Quaid-e-Azam, C) Moulvi Tameez-ud-Din, D) Sardar-Abdur-Rab-Nishtar");
        answers.add("B) Quaid-e-Azam");
        
        questions.add("What age was prescribed for President in 1956 constitution?");
        options.add("A) 40 years, B) 45 years, C) 50 years, D) 55 years");
        answers.add("A) 40 years");
        
        questions.add("Which kind of system of Government was introduced in 1973 constitution?");
        options.add("A) Parliamentary, B) Presidential, C) Basic Democracy, D) Autonomous");
        answers.add("A) Parliamentary");
        
        questions.add("How many articles are there in 1973 constitution?");
        options.add("A) 220 Articles, B) 240 Articles, C) 260 Articles, D) 280 Articles");
        answers.add("D) 280 Articles");
        
        questions.add("Who started the Faraizi Movement?");
        options.add("A) Haji Shariat Ullah, B) Allama Muhammad Iqbal, C) Maulana Muhammad Ali Jauhar, D) Sir Aga Khan");
        answers.add("A) Haji Shariat Ullah");
        
        questions.add("In which year the Kashmiris started their freedom movement against Dogra rule before the partition of the sub-continent?");
        options.add("A) 1940, B) 1930, C) 1920, D) 1928");
        answers.add("B) 1930");
        
        questions.add("Which mountain range is located in Sindh Province?");
        options.add("A) Himalaya, B) Karakoram Range, C) Kirthar Range, D) Salt Range");
        answers.add("C) Kirthar Range");
        
        questions.add("First Charter of Human Rights is?");
        options.add("A) International Charter, B) U.N. Charter, C) Khutba-Hajjat-ul-Vida, D) French Constitution");
        answers.add("C) Khutba-Hajjat-ul-Vida");
        
        questions.add("The area between rivers Jhelum and Chenab is called?");
        options.add("A) Gandhara, B) Chaj, C) Taxila, D) Harrapa");
        answers.add("B) Chaj");
        
        questions.add("Which is the first book of Pushto language?");
        options.add("A) Pata Khazana, B) Tazkra-tul-Aulia, C) Jat di Kartut, D) Aasar-ul-Sanadeed");
        answers.add("A) Pata Khazana");
        
        questions.add("Shakarparrian is situated in?");
        options.add("A) Islamabad, B) Rawalpindi, C) Murree, D) Peshawar");
        answers.add("A) Islamabad");
        
        questions.add("What is the total area of Balochistan Province?");
        options.add("A) 74,521 Sq Km, B) 40,914 Sq Km, C) 347,190 Sq Km, D) 205,344 Sq Km");
        answers.add("C) 347,190 Sq Km");
        
        questions.add("The first Chief of Staff of Pak Army was ____?");
        options.add("A) General Takka Khan, B) General Ziaul Haq, C) General Sharif, D) General Ayub Khan");
        answers.add("A) General Takka Khan");
        
        questions.add("The range if Hatf-3 is ____?");
        options.add("A) 400km, B) 290km, C) 600km, D) 750km");
        answers.add("B) 290km");
        
        questions.add("At the time of 1965 War the C-in-C of Pakistan Army was ___?");
        options.add("A) General Muhammad Musa Khan, B) General Muhammad Ayub Khan, C) General Muhammad Zia-ul-Haq, D) None of them");
        answers.add("A) General Muhammad Musa Khan");
        
        questions.add("In which of the following city the Pakistan Navel Staff College is located?");
        options.add("A) Karachi, B) Lahore, C) Multan, D) Rawalpindi");
        answers.add("A) Karachi");
        
        questions.add("Who was first Muslim Governor of KPK after Independence of Pakistan?");
        options.add("A) Sahibzada Muhammad Khursheed, B) Sahibzada Abdul Qayum Khan, C) Arbab Sikandar Khan Khalil, D) None of them");
        answers.add("A) Sahibzada Muhammad Khursheed");

        questions.add("The largest city of KPK is _____?");
        options.add("A) D.I. Khan, B) Abbottabad, C) Kohat, D) Peshawar");
        answers.add("D) Peshawar");

        questions.add("Where is the National Museum of Pakistan located?");
        options.add("A) Jamshoro, B) Karachi, C) Hyderabad, D) Larkana");
        answers.add("B) Karachi");

        questions.add("The Sindh Provincial Museum is located in ____?");
        options.add("A) Jamshoro, B) Karachi, C) Larkana, D) Hyderabad");
        answers.add("D) Hyderabad");

        questions.add("Moenjodaro is located at the west bank of the Indus in the ____?");
        options.add("A) Upper Sindh, B) Lower Sindh, C) Central Sindh, D) Southern Sindh");
        answers.add("A) Upper Sindh");

        questions.add("First Capital of Pakistan was ____?");
        options.add("A) Hyderabad, B) Karachi, C) Lahore, D) Rawalpindi");
        answers.add("B) Karachi");

        questions.add("K-2 peak is the ___ Highest peak of the World?");
        options.add("A) First, B) Second, C) Third, D) Fourth");
        answers.add("B) Second");

        questions.add("How many peaks above 8,000 meters are found in Pakistan?");
        options.add("A) 7, B) 5, C) 9, D) 3");
        answers.add("B) 5");

        questions.add("What is the Total Height of K-2 Peak?");
        options.add("A) 8210 meter, B) 8410 meter, C) 8611 meter, D) 8511 meter");
        answers.add("C) 8611 meter");

        questions.add("The height of Potwar Plateau is?");
        options.add("A) 300-600 meters, B) 200-500 meters, C) 320-550 meters, D) 380-650 meters");
        answers.add("A) 300-600 meters");

        questions.add("What is the Meaning of Nanga Parbat?");
        options.add("A) Killer Mountain, B) Naked Mountain, C) Dead Place, D) Seven Mountains");
        answers.add("B) Naked Mountain");

        questions.add("Ayub National park is situated in?");
        options.add("A) Rawalpindi, B) Nurree, C) ICT, D) None of them");
        answers.add("A) Rawalpindi");

        questions.add("The total area of FATA is ____?");
        options.add("A) 29,220sq, km, B) 28,220sq, km, C) 27,220sq, km, D) 30,220sq, km");
        answers.add("C) 27,220sq, km");
        
        questions.add("The capital of Azad Jammu & Kashmir is _____?");
        options.add("A) Muzzafar Abad, B) Bhimber, C) Mirpur, D) Bagh");
        answers.add("A) Muzzafar Abad");

        questions.add("Baltistan is called ___?");
        options.add("A) Little Tibet, B) Paradise, C) Beauty of Earth, D) Land of Fairies");
        answers.add("A) Little Tibet");

        questions.add("When was the first Pakistani Postal Stamp issued?");
        options.add("A) August 1948, B) December 1947, C) February 1948, D) July 1948");
        answers.add("D) July 1948");

        questions.add("22nd Amendment in 1973 Constitution of Pakistan is related to______?");
        options.add("A) Pak Army Trail Courts, B) Powers of Election Commission Members, C) Related to NRO, D) Not made yet");
        answers.add("B) Powers of Election Commission Members");

        questions.add("Name the special task force, which is established in December 2016 by Pakistan Navy to safeguard and protect the China-Pakistan Economic Corridor as well as Gwadar port?");
        options.add("A) Task Force 21, B) Task Force 44, C) Task Force 88, D) Task Force 2");
        answers.add("C) Task Force 88");

        questions.add("Benazir Bhutto was born in Which City of Pakistan?");
        options.add("A) Karachi, B) Lahore, C) Larkana, D) Islamabad");
        answers.add("A) Karachi");

        questions.add("After how many years Pakistan got its first constitution?");
        options.add("A) 5 years, B) 7 years, C) 9 years, D) 11 years");
        answers.add("C) 9 years");

        questions.add("In respect of religion what term was set for President and Prime Minister in 1956 constitution?");
        options.add("A) He may be a Muslim, B) He must not be Hindu, C) He must not be Christian, D) He must be a Muslim ( this condition applicable only on president. pm may be non-muslim)");
        answers.add("D) He must be a Muslim ( this condition applicable only on president. pm may be non-muslim)");

        questions.add("Who elects the President according to 1973 constitution?");
        options.add("A) National Assembly, B) Senate, C) Provincial Assemblies, D) All of them");
        answers.add("D) All of them");

        questions.add("In constitution of 1973 who were declared none Muslims?");
        options.add("A) Qadiyanis, B) Hindus, C) Christians, D) Jews");
        answers.add("A) Qadiyanis");

        questions.add("The ‘Kashaf-ul-Mahjub’ was written by?");
        options.add("A) Hazrat Data Gunj Buksh (R.A), B) Maulana Altaf Hussain Hali, C) Maulana Shibli Nomani, D) Maulana Zakaullah");
        answers.add("A) Hazrat Data Gunj Buksh (R.A)");

        questions.add("In which of the following cities Indian National Congress was found?");
        options.add("A) Delhi, B) Bombay, C) Kanpur, D) Allahabad");
        answers.add("B) Bombay");

        questions.add("Pakistan conducted nuclear tests on May 28, 1998 at?");
        options.add("A) Kohe-e-Sufaid, B) Chaghi Hills, C) Toba Kakar, D) Raskoh");
        answers.add("B) Chaghi Hills");

        questions.add("The members of Punjab Assembly are?");
        options.add("A) 275, B) 371, C) 237, D) 100");
        answers.add("B) 371");

        questions.add("The largest Railway workshop Mughalpura is situated in?");
        options.add("A) Gujranwala, B) Multan, C) Karachi, D) Lahore");
        answers.add("D) Lahore");

        questions.add("Urdu is a word of Turkish language, it means?");
        options.add("A) Wth, B) Arms, C) Army, D) Literature");
        answers.add("C) Army");

        questions.add("Identify the largest cantonment of Pakistan?");
        options.add("A) Kharian Cantt, B) Quetta Cantt, C) Okara Cantt, D) Karachi Cantt");
        answers.add("A) Kharian Cantt");

        questions.add("What is the total area of Sindh Province?");
        options.add("A) 74,521 Sq Km, B) 140,914 Sq Km, C) 347,190 Sq Km, D) 205,344 Sq Km");
        answers.add("B) 140,914 Sq Km");
        
        questions.add("Zafar Ahmed Chaudhry was the first Chief of Air Staff of ___.");
        options.add("A) Pak Army, B) Air Force, C) Navy, D) None of them");
        answers.add("B) Air Force");

        questions.add("The range if Hatf-4 is ___?");
        options.add("A) 400km, B) 390km, C) 600km, D) 750km");
        answers.add("D) 750km");

        questions.add("At the time of 1971 War the C-in-C of Pak Army was ____?");
        options.add("A) General Ayyub Khan, B) Lt. General Gul Hassan, C) General Tikka Khan, D) General Agha Muhammad Yahya Khan");
        answers.add("D) General Agha Muhammad Yahya Khan");

        questions.add("In which of the following city the Pakistan Navel War College is located?");
        options.add("A) Karachi, B) Lahore, C) Islamabad, D) Multan");
        answers.add("A) Karachi");

        questions.add("How many Police ranges are in KPK?");
        options.add("A) 7, B) 4, C) 8, D) 3");
        answers.add("C) 8");

        questions.add("The Chowk Yadgar is located in ____?");
        options.add("A) Peshawar, B) D I Khan, C) Dir, D) Chitral");
        answers.add("A) Peshawar");

        questions.add("Tarbela dam is situated in ___?");
        options.add("A) Kashmir, B) KPK, C) FATA, D) Gilgit");
        answers.add("B) KPK");

        questions.add("Gaddani is famous for _____?");
        options.add("A) Ship Breaking, B) Ship making, C) Fishing, D) None of them");
        answers.add("A) Ship Breaking");

        questions.add("Who was King Umar?");
        options.add("A) First King of the Sumarh Dynas, B) Second King of the Sumarh Dynasty, C) Third King of the Sumarh Dynasty, D) Fourth King of the Sumarh Dynasty");
        answers.add("A) First King of the Sumarh Dynas");

        questions.add("The hot place in Pakistan is _____?");
        options.add("A) Bahawalpur, B) Multan, C) Turbat, D) None of them");
        answers.add("C) Turbat");
        
        questions.add("The length of Siachen Glacier is _____?");
        options.add("A) 60km, B) 76km, C) 50km, D) 80km");
        answers.add("B) 76km");

        questions.add("“The place where heaven and earth meet” these words are said about which place?");
        options.add("A) Chitral, B) Kalash, C) Punial, D) Swat");
        answers.add("C) Punial");

        questions.add("What is the average height of Chaghi range?");
        options.add("A) 3500 meters, B) 2500 meters, C) 4000 meters, D) 3000 meters");
        answers.add("D) 3000 meters");

        questions.add("Who was the first Pakistani to clumb the K-2?");
        options.add("A) Mohsan Razvi, B) Ashraf Aman, C) Nasir Hussain, D) Zahid ALi");
        answers.add("B) Ashraf Aman");

        questions.add("The largest mosque of Pakistan located in Lahore is called ___?");
        options.add("A) Shah Faisal Mosque, B) Badshahi Mosque, C) Garrison Mosque, D) Bahria Grand Mosque");
        answers.add("D) Bahria Grand Mosque");

        questions.add("Major languages of FATA are ____?");
        options.add("A) Pashto, B) Urdu, C) both A & B, D) None of them");
        answers.add("A) Pashto");

        questions.add("River Neelum is situated in ___?");
        options.add("A) AJ&K, B) KPK, C) FATA, D) Panjab");
        answers.add("A) AJ&K");

        questions.add("Which Pakistani area is sandwiched between China and Indian-held Kashmir?");
        options.add("A) Astor, B) Baltistan, C) Chitral, D) Kalash");
        answers.add("B) Baltistan");

        questions.add("Who was the first President of Pakistan?");
        options.add("A) Malik Ghulam Muhammad, B) Iskander Mirza, C) Muhammad Ali Jinnah, D) Sir Khawaja Nazimuddin");
        answers.add("B) Iskander Mirza");

        questions.add("Jinnah the only film on the life of Quaid-e-Azam was produced by?");
        options.add("A) Jamil Dehlavi, B) Akbar S. Ahmed, C) Pervaiz iqbal cheema, D) Shabab dhlvl");
        answers.add("A) Jamil Dehlavi");

        questions.add("Pakistan fired its first submarine launched cruise missile Babur-III on 9 January 2017, has the range of_____ kilometres?");
        options.add("A) 450 kilometres, B) 550 kilometres, C) 650 kilometres, D) 700 kilometres");
        answers.add("A) 450 kilometres");

        questions.add("Benazir Bhutto was the ____ ever female Prime Minister of Pakistan?");
        options.add("A) First, B) Fourth, C) Third, D) Second");
        answers.add("A) First");

        questions.add("What document was firstly drafted to give pace to constitution making process?");
        options.add("A) Representative Act, B) Pakistan Act, C) Independence Act, D) Objective Resolution");
        answers.add("D) Objective Resolution");

        questions.add("What was the official language declared in 1956 constitution?");
        options.add("A) Urdu, B) Bengali, C) Hindi, D) Both a & b");
        answers.add("D) Both a & b");

        questions.add("According to 1973 constitution who elects Prime Minister?");
        options.add("A) Senate, B) National Assembly, C) President, D) Provincial Assemblies");
        answers.add("B) National Assembly");

        questions.add("When did Fatima Jinnah joined All India Muslim league?");
        options.add("A) 1939, B) 1927, C) 1947, D) 1949");
        answers.add("A) 1939");

        questions.add("Who Reviewed the famous book “The Indian Musalmans” in 1872?");
        options.add("A) Sir Syed Ahmed Khan, B) Sir William Wilson Hunter, C) M Delwar Hussain, D) John King Fairbank");
        answers.add("A) Sir Syed Ahmed Khan");

        questions.add("In which of the following cities All India Muslim League was found?");
        options.add("A) Delhi, B) Lahore, C) Dhaka, D) Allahabad");
        answers.add("C) Dhaka");
        
        questions.add("The ruins of Harrapa are situated in district?");
        options.add("A) Multan, B) Okara, C) Lahore, D) Sahiwal");
        answers.add("D) Sahiwal");

        questions.add("Who wrote “Mauj-e-Kausar”?");
        options.add("A) Amir Khusro, B) Shaikh Muhammad Ikram, C) Mir Taqi Mir, D) Khawaja Mir Dard");
        answers.add("B) Shaikh Muhammad Ikram");

        questions.add("Which city of Pakistan held the OIC Conference in 1997?");
        options.add("A) Lahore, B) Islamabad, C) Karachi, D) Peshawar");
        answers.add("B) Islamabad");

        questions.add("What is the total area of Khyber Pakhtoon Khawah Province?");
        options.add("A) 74,521 Sq Km, B) 40,914 Sq Km, C) 347,190 Sq Km, D) 205,344 Sq Km");
        answers.add("A) 74,521 Sq Km");

        questions.add("Defence day is observed on _____?");
        options.add("A) 6th September, B) 11th September, C) 7th September, D) None of them");
        answers.add("A) 6th September");

        questions.add("The la version of Hatf-5 is ____?");
        options.add("A) Ghauri-1, B) Hataf, C) Abdali, D) Shaheen-1");
        answers.add("A) Ghauri-1");

        questions.add("At the time of Kargil in 1999 the Chief of Army Staff was ___?");
        options.add("A) General Jahangir Karamat, B) General Aslam Baig, C) General Parvez Musharaf, D) General Waheed Kakar");
        answers.add("C) General Parvez Musharaf");

        questions.add("In which of the following city Pakistan Command & Staff College is located?");
        options.add("A) Karachi, B) Quetta, C) Islamabad, D) Multan");
        answers.add("B) Quetta");

        questions.add("World’s largest tribal society is ____?");
        options.add("A) Pashtun, B) Baloch, C) Noro, D) Afridi");
        answers.add("A) Pashtun");

        questions.add("Peshawar means ____?");
        options.add("A) City of flowers, B) City of tombs, C) City of gardens, D) None of them");
        answers.add("A) City of flowers");

        questions.add("The area of Sindh is ___?");
        options.add("A) 140,(link unavailable), B) 130,(link unavailable), C) 140,(link unavailable), D) 120,(link unavailable)");
        answers.add("A) 140,(link unavailable)");

        questions.add("The Largest Cotton Exchange Building of Pakistan is situated in ___?");
        options.add("A) Karachi, B) Lahore, C) Faisalabad, D) Multan");
        answers.add("A) Karachi");

        questions.add("Marvi is a folk story of ____?");
        options.add("A) Sindh, B) Thar, C) Seraiki, D) Thal");
        answers.add("A) Sindh");

        questions.add("The shrine of Shah Abdul Latif Bhitai is located in ___?");
        options.add("A) Sibbi, B) Bhit Shah, C) Jacobabad, D) Hala");
        answers.add("B) Bhit Shah");

        questions.add("Pakistan day is observed on?");
        options.add("A) 5th February, B) 8th March, C) 21st March, D) 23rd March");
        answers.add("D) 23rd March");

        questions.add("Which is the youngest mountain range on the earth?");
        options.add("A) Hindu kush, B) Korakoram, C) Himalayas, D) Alps");
        answers.add("C) Himalayas");

        questions.add("The length of Baltur Glacier is ____?");
        options.add("A) 60km, B) 62km, C) 65km, D) 70km");
        answers.add("B) 62km");

        questions.add("Which is the highest peak of the koh-e-Sufaid Range?");
        options.add("A) Sakasar, B) Skaram, C) Broad Peak, D) Nanga Parbat");
        answers.add("A) Sakasar");

        questions.add("Which of the following areas from potwar Plateau?");
        options.add("A) Rawalpindi, B) Jhelum, C) Mianwali, D) All of above");
        answers.add("D) All of above");
        
        questions.add("How many peaks in the Pakistan are Higher than 8000 meters?");
        options.add("A) 4, B) 3, C) 5, D) 8");
        answers.add("C) 5");

        questions.add("The ruins of Harrapa are situated in district?");
        options.add("A) Multan, B) Okara, C) Lahore, D) Sahiwal");
        answers.add("D) Sahiwal");

        questions.add("Who wrote “Mauj-e-Kausar”?");
        options.add("A) Amir Khusro, B) Shaikh Muhammad Ikram, C) Mir Taqi Mir, D) Khawaja Mir Dard");
        answers.add("B) Shaikh Muhammad Ikram");

        questions.add("Which city of Pakistan held the OIC Conference in 1997?");
        options.add("A) Lahore, B) Islamabad, C) Karachi, D) Peshawar");
        answers.add("B) Islamabad");

        questions.add("What is the total area of Khyber Pakhtoon Khawah Province?");
        options.add("A) 74,521 Sq Km, B) 40,914 Sq Km, C) 347,190 Sq Km, D) 205,344 Sq Km");
        answers.add("A) 74,521 Sq Km");

        questions.add("Defence day is observed on _____?");
        options.add("A) 6th September, B) 11th September, C) 7th September, D) None of them");
        answers.add("A) 6th September");

        questions.add("The la version of Hatf-5 is ____?");
        options.add("A) Ghauri-1, B) Hataf, C) Abdali, D) Shaheen-1");
        answers.add("A) Ghauri-1");

        questions.add("At the time of Kargil in 1999 the Chief of Army Staff was ___?");
        options.add("A) General Jahangir Karamat, B) General Aslam Baig, C) General Parvez Musharaf, D) General Waheed Kakar");
        answers.add("C) General Parvez Musharaf");

        questions.add("In which of the following city Pakistan Command & Staff College is located?");
        options.add("A) Karachi, B) Quetta, C) Islamabad, D) Multan");
        answers.add("B) Quetta");

        questions.add("World’s largest tribal society is ____?");
        options.add("A) Pashtun, B) Baloch, C) Noro, D) Afridi");
        answers.add("A) Pashtun");

        questions.add("Peshawar means ____?");
        options.add("A) City of flowers, B) City of tombs, C) City of gardens, D) None of them");
        answers.add("A) City of flowers");

        questions.add("The area of Sindh is ___?");
        options.add("A) 140,(link unavailable), B) 130,(link unavailable), C) 140,(link unavailable), D) 120,(link unavailable)");
        answers.add("A) 140,(link unavailable)");

        questions.add("The Largest Cotton Exchange Building of Pakistan is situated in ___?");
        options.add("A) Karachi, B) Lahore, C) Faisalabad, D) Multan");
        answers.add("A) Karachi");

        questions.add("Marvi is a folk story of ____?");
        options.add("A) Sindh, B) Thar, C) Seraiki, D) Thal");
        answers.add("A) Sindh");

        questions.add("The shrine of Shah Abdul Latif Bhitai is located in ___?");
        options.add("A) Sibbi, B) Bhit Shah, C) Jacobabad, D) Hala");
        answers.add("B) Bhit Shah");

        questions.add("Pakistan day is observed on?");
        options.add("A) 5th February, B) 8th March, C) 21st March, D) 23rd March");
        answers.add("D) 23rd March");

        questions.add("Which is the youngest mountain range on the earth?");
        options.add("A) Hindu kush, B) Korakoram, C) Himalayas, D) Alps");
        answers.add("C) Himalayas");

        questions.add("The length of Baltur Glacier is ____?");
        options.add("A) km, B) 62km, C) 65km, D) 70km");
        answers.add("B) 62km");

        questions.add("Which is the highest peak of the koh-e-Sufaid Range?");
        options.add("A) Sakasar, B) Skaram, C) Broad Peak, D) Nanga Parbat");
        answers.add("A) Sakasar");
        
        questions.add("The headquarters of Air Force is located in ___?");
        options.add("A) Islamabad, B) Rawalpindi, C) Peshawar, D) Karachi");
        answers.add("A) Islamabad");

        questions.add("The Range of Ghari-1 is ____?");
        options.add("A) 1200- 1500km, B) 1200- 1300km, C) 1500- 2000km, D) 1500- 1800km");
        answers.add("A) 1200- 1500km");

        questions.add("Tell the name of Chief of Staff of Pak Army who died in uniform?");
        options.add("A) General Mohammad Zia-ul-Haq, B) General Asif Nawaz, C) A & B, D) None of them");
        answers.add("C)  A & B");

        questions.add("In which of the following city National Defence University is located?");
        options.add("A) Rawalpindi, B) Quetta, C) Islamabad, D) Multan");
        answers.add("C) Islamabad");

        questions.add("Lords of the Khyber is written by ___?");
        options.add("A) Andre Joseph, B) Kipling, C) Yousuf Khan, D) Andre Singer");
        answers.add("D) Andre Singer");

        questions.add("Chowk Yadgar Peshawar commemorates the heroes of the ___?");
        options.add("A) Kashmir War, B) 1965 Indo-Pakistan War, C) 1971 War, D) None of them");
        answers.add("B) 1965 Indo-Pakistan War");

        questions.add("How many divisions are there in Sindh?");
        options.add("A) 9, B) 4, C) 7, D) 3");
        answers.add("C) 7");

        questions.add("Clifton Beach is located in ___?");
        options.add("A) Hyderabad, B) Karachi, C) Jamshoro, D) Kotri");
        answers.add("B). Karachi");

        questions.add("How many Barragas are there in Sindh?");
        options.add("A) 3, B) 4, C) 5, D) 7");
        answers.add("A) 3");
        
        questions.add("Largest city of Pakistan is ____?");
        options.add("A) Karachi, B) Sukkar, C) Hyderabad, D) Lahore");
        answers.add("A) Karachi");

        questions.add("Pakistan Air Force Day is celebrated on _____?");
        options.add("A) 21st February, B) 8th March, C) 21st March, D) 7th September");
        answers.add("D) 7th September");

        questions.add("K-2 is present in which mountains range?");
        options.add("A) Pamir, B) Hindu kush, C) Karakoram, D) Himalayas");
        answers.add("C) Karakoram");

        questions.add("Baltura Glacier is located in _____?");
        options.add("A) Punjab, B) Gilgit Baltistan, C) Sindh, D) KPK");
        answers.add("B) Gilgit Baltistan");

        questions.add("The Hindu kush range starts at the?");
        options.add("A) China Border, B) Pamir Platean, C) Afghan border, D) Karakoram");
        answers.add("C) Afghan border");

        questions.add("Which is the Highest peak of Himalayas range in Pakistan?");
        options.add("A) Nanga Parbat, B) K-2, C) Tirichmir, D) Sakasar");
        answers.add("A) Nanga Parbat");

        questions.add("What is the Height of Broad Peak?");
        options.add("A) 8126 meters, B) 8092 meters, C) 8075 meters, D) 8051 meters");
        answers.add("D) 8051 meters");

        questions.add("The Naval Headquarters is located in ___?");
        options.add("A) Rawalpindi, B) Islamabad, C) Lahore, D) None of them");
        answers.add("B) Islamabad");

        questions.add("In FATA the tribal laws and judiciary function is looked by the ___?");
        options.add("A) Jirgha, B) Federal Govt, C) Tribes Council, D) All of them");
        answers.add("D) All of them");

        questions.add("Kotli is famous city of ____?");
        options.add("A) AJ&K, B) KPK, C) FATA, D) ICT");
        answers.add("A) AJ&K");

        questions.add("Polo game originated from ____?");
        options.add("A) Gilgit Baltistan, B) Iran, C) USA, D) Subcontinent");
        answers.add("B) Iran");
        
        questions.add("The Indian Councils Act (Minto-Morley Reforms) was enacted into law in ____?");
        options.add("A) 1909, B) 1910, C) 1911, D) 1912");
        answers.add("A) 1909");

        questions.add("Who is the Current Chief of Army Staff (COAS), Pakistan?");
        options.add("A) Gen Raheel Sharif, B) Gen Ashfaq Parvaz kayani, C) Gen Qamar Javed Bajwa, D) Gen Asif Munir");
        answers.add("D) Gen Asif Munir");

        questions.add("Name the Pakistan’s surface-to-surface ballistic missile, which is capable of delivering multiple warheads using Multiple Independent Re-entry Vehicle (MIRV) technology?");
        options.add("A) Shaheen-II, B) Ababeel, C) Nasr, D) Ghauri");
        answers.add("B) Ababeel");

        questions.add("Where did Benazir Bhutto die?");
        options.add("A) Karachi, B) Lahore, C) Rawalpindi, D) London");
        answers.add("C) Rawalpindi");

        questions.add("Who was Mohammad Ali Bogra?");
        options.add("A) Prime Minister, B) Foreign Minister, C) Law Minister, D) Parliament Minister");
        answers.add("A) Prime Minister");

        questions.add("When Ayub Khan enforced new constitution in Pakistan?");
        options.add("A) 9th January 1962, B) 6th February 1962, C) 13th March 1962, D) 8th June 1962");
        answers.add("D) 8th June 1962");

        questions.add("In constitution 1973 what number of seats in Senate was set?");
        options.add("A) 120 Seats, B) 115 Seats, C) 110 Seats, D) 100 Seats");
        answers.add("D) 100 Seats");

        questions.add("Pakistan’s first coin was issued on?");
        options.add("A) 3rd june 1948, B) 6th june 1949, C) 3rd January 1948, D) none of these");
        answers.add("C) 3rd January 1948");

        questions.add("Indian Independence Act’ was enforced on?");
        options.add("A) 13th August 1947, B) 14th August 1947, C) 15th August 1947, D) 16th August 1947");
        answers.add("C) 15th August 1947");

        questions.add("In which year Ali Garh Trusteeship bill was passed?");
        options.add("A) 1886, B) 1887, C) 1888, D) 1889");
        answers.add("D) 1889");

        questions.add("Pakistan Steel Mills is located in?");
        options.add("A) Lahore, B) Gwadar, C) Karachi, D) None of them");
        answers.add("C) Karachi");

        questions.add("SNGPL stands for?");
        options.add("A) Sui Northern Gas Pipelines Lahore, B) Sui Northern Gas Pipelines limited, C) Sui Northern Gas Pakistan limited, D) Sui Northern Gas Punjab limited");
        answers.add("B) Sui Northern Gas Pipelines limited");

        questions.add("Thal desert is located in?");
        options.add("A) Sindh, B) Gilgit, C) KPK, D) Punjab");
        answers.add("D) Punjab");

        questions.add("Ahmad Shah Pitras Bukhari was a famous writer of __ language.");
        options.add("A) English, B) Hindi, C) Urdu, D) Punjabi");
        answers.add("C) Urdu");

        questions.add("The Kargil incident happened in?");
        options.add("A) 1998, B) 1997, C) 1999, D) 2000");
        answers.add("C) 1999");

        questions.add("GHQ Stands for:");
        options.add("A) General Head Quarters, B) General High Quarters, C) General High Quartermaster, D) None of them");
        answers.add("A) General Head Quarters");
        
        questions.add("The highest non-operational Military Award is ___?");
        options.add("A) Tamgha-e-Basalat, B) Tamgha-e-Imtiaz, C) Tamgha-e-Khidmat, D) Sitara-e-Basalat");
        answers.add("D) Sitara-e-Basalat");

        questions.add("Who was the first Muslim C-in-C of Pakistan Army?");
        options.add("A) Admiral Muhammad Siddiq, B) Field Marshal Muhammad Ayoub, C) General Muhammad Zia-ul-Haq, D) General Tikka Khan");
        answers.add("B) Field Marshal Muhammad Ayoub");

        questions.add("The name of first Pakistani Aircraft is ___?");
        options.add("A) JF-17 Thunder, B) JF-8 Thunder, C) JF-9 Thunder, D) JF-11 Thunder");
        answers.add("A) JF-17 Thunder");

        questions.add("In which of the following city Military College of Engineering is located?");
        options.add("A) Risalpur, B) Islamabad, C) Gujranwala, D) Sargodha");
        answers.add("A) Risalpur");

        questions.add("Masjid Mahabat Khan is located in ___?");
        options.add("A) Mardan, B) Kohat, C) Hangu, D) Peshawar");
        answers.add("D) Peshawar");

        questions.add("Kalam and Behrin are important tourist points of _____?");
        options.add("A) Chitral valley, B) Hunza Valley, C) Kalam Valley, D) Swat Valley");
        answers.add("D) Swat Valley");

        questions.add("The Indus River falls into the ____?");
        options.add("A) Arabian Sea, B) Cape Monze, C) Makran Coast, D) None of them");
        answers.add("A) Arabian Sea");

        questions.add("Shah Jahan Mosque is located in ____?");
        options.add("A) Thatta, B) Jacobabad, C) Sibi, D) Larkana");
        answers.add("A) Thatta");

        questions.add("The Shrine of Lal Shahbaz Qalander is situated in _____?");
        options.add("A) Shahbaz Nagar, B) Uch Sharif, C) Sehwan Sharif, D) Karachi");
        answers.add("C) Sehwan Sharif");

        questions.add("Risalo is the best known collection of romantic poetry in the ____ Language.");
        options.add("A) Urdu, B) Sindhi, C) Arabic, D) Persian");
        answers.add("B) Sindhi");

        questions.add("On which date is Death Anniversary of Quaid e Azam observed?");
        options.add("A) 9th November, B) 11th September, C) 21st March, D) 11th October");
        answers.add("B) 11th September");

        questions.add("Which Range is called Roof of the World?");
        options.add("A) Karakoram, B) Hindu kush Range, C) Pamir Plataau, D) Himalayas Range");
        answers.add("C) Pamir Plataau");

        questions.add("Identify the second highest Glacier of the world?");
        options.add("A) Baltora Glacier, B) Batura Glacier, C) Siachin Glacier, D) None of them");
        answers.add("C) Siachin Glacier");

        questions.add("What is the average height of Koh-e Sufaid?");
        options.add("A) 3200 meters, B) 3500 meters, C) 3000 meters, D) 5560 meters");
        answers.add("C) 3000 meters");

        questions.add("Which is the highest peak of Salt range?");
        options.add("A) Tirichmir, B) K-2, C) Nanga parbat, D) Sakasar");
        answers.add("D) Sakasar");
        
        questions.add("In which year the Broad Peak was first climbed?");
        options.add("A) 1953, B) 1955, C) 1954, D) 1957");
        answers.add("D) 1957");

        questions.add("The largest source of drinking water for Islamabad is _____?");
        options.add("A) Khanpur Dam, B) Rawal Dam, C) Ghazi Dam, D) Haru Dam");
        answers.add("A) Khanpur Dam");

        questions.add("Who was the first President of Azad Kashmir?");
        options.add("A) Sardar Muhammad Ibrahim Khan, B) Sardar Muhammad Abdul Qayyum Khan, C) Sardar Sikandar Hayat Khan, D) Moulana Muhammad Yousaf");
        answers.add("A) Sardar Muhammad Ibrahim Khan");

        
    }
    
    
    public static void main(String[]args){
        new Pakistan_Quiz(name).setVisible(true);
    }
    
}



