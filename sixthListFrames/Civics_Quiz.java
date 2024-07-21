package sixthListFrames;

import frame.Quiz;
/**
 * @author MuhammadHasnatRasool
 */
public class Civics_Quiz extends Quiz {

    public Civics_Quiz(String name) {
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

    // questions:90
    @Override
    public final void loadQuestions() {
        questions.add("According to Aristotle, man has been born a ____.");
        options.add("A) Social Animal, B) Political Being, C) Economic Creature, D) Biological Organism");
        answers.add("A) Social Animal");

        questions.add("The English word Civics Derived from the two Latin Words ___ and ___.");
        options.add("A) CIVITAS, CIVIS, B) CIVILIS, CIVITAS, C) CIVIS, CIVILIS, D) CIVITAS, CIVILIS");
        answers.add("A) CIVITAS, CIVIS");

        questions.add("Ethics is related to High human ____.");
        options.add("A) Moral Values, B) Ethics Principles, C) Values Beliefs, D) Principles Rules");
        answers.add("A) Moral Values");

        questions.add("Civics create sentiments of ___ in ____.");
        options.add("A) Unity Society, B) Diversity Community, C) Conflict Politics, D) Harmony Family");
        answers.add("A) Unity Society");

        questions.add("An individual and ___ are ___ to each other.");
        options.add("A) Society Inter-dependent, B) Community Dependent, C) Family Independent, D) State Opposed");
        answers.add("A) Society Inter-dependent");

        questions.add("Civics is the study of ___ and community engagement.");
        options.add("A) Government, B) Politics, C) Economics, D) History");
        answers.add("A) Government");

        questions.add("Community engagement refers to the process of ___ with the community to address social issues.");
        options.add("A) Working, B) Interacting, C) Cooperating, D) Confronting");
        answers.add("A) Working");

        questions.add("The main objective of civics and community engagement is to ___ responsible citizens.");
        options.add("A) Produce, B) Educate, C) Train, D) Inspire");
        answers.add("A) Produce");

        questions.add("The Constitution of Pakistan guarantees ___ rights to its citizens.");
        options.add("A) Fundamental rights, B) Human rights, C) Civil rights, D) Political rights");
        answers.add("A) Fundamental rights");

        questions.add("The right to life and liberty is enshrined in Article ___ of the Constitution.");
        options.add("A) 9, B) 19, C) 20, D) 21");
        answers.add("A) 9");

        questions.add("Freedom of speech and expression is protected under Article ___ of the Constitution.");
        options.add("A) 19, B) 20, C) 21, D) 22");
        answers.add("A) 19");

        questions.add("Paying taxes is a civic ___ of every citizen.");
        options.add("A) Duty, B) Right, C) Responsibility, D) Privilege");
        answers.add("A) Duty");

        questions.add("Voting is a fundamental ___ of every citizen in a democratic country.");
        options.add("A) Right, B) Duty, C) Responsibility, D) Privilege");
        answers.add("A) Right");

        questions.add("Respecting the national flag and anthem is a civic ___ of every citizen.");
        options.add("A) Duty, B) Right, C) Responsibility, D) Privilege");
        answers.add("A) Duty");

        questions.add("Pakistan's foreign policy is guided by the principle of ___.");
        options.add("A) Peace, B) War, C) Neutrality, D) Aggression");
        answers.add("A) Peace");

        questions.add("The second phase (1958-1971) was characterized by ___ with the Soviet Union.");
        options.add("A) Non-alignment, B) Alignment, C) Neutrality, D) Confrontation");
        answers.add("A) Non-alignment");

        questions.add("The ____ level of analysis guide’s how a state’s internal politics and economics impact its international behavior.");
        options.add("A) Domestic, B) International, C) Global, D) Regional");
        answers.add("A) Domestic");

        questions.add("The ____ principle does not reply on self-interest and its roots lie in family, extended family, and the kinship group.");
        options.add("A) Identity, B) Interest, C) Ideology, D) Institution");
        answers.add("A) Identity");

        questions.add("The interstate level of analysis focuses on the interactions between ___ and the global system.");
        options.add("A) States, B) Nations, C) Governments, D) Organizations");
        answers.add("A) States");

        questions.add("The principle of ___ is essential in conflict resolution.");
        options.add("A) Empathy, B) Respect, C) Trust, D) Harmony");
        answers.add("B) Respect");

        questions.add("Active listening is a key principle of ___ in conflict resolution.");
        options.add("A) Communication, B) Empathy, C) Multiculturalism, D) Leadership");
        answers.add("A) Communication");

        questions.add("Empathy is a critical principle of ___ in conflict resolution.");
        options.add("A) Multiculturalism, B) Communication, C) Respect, D) Empathy");
        answers.add("C) Respect");

        questions.add("Cyber ethics refers to the principles and values that guide our behavior in the ___.");
        options.add("A) Digital World, B) Cyber Space, C) Online Community, D) Virtual Reality");
        answers.add("A) Digital World");

        questions.add("The responsible use of digital platforms requires ___ and respect for others' privacy.");
        options.add("A) Etiquette, B) Empathy, C) Thoughtfulness, D) Honesty");
        answers.add("C) Thoughtfulness");

        questions.add("Cyberbullying is a violation of ___ and can have serious consequences.");
        options.add("A) Privacy, B) Dignity, C) Respect, D) Empathy");
        answers.add("B) Dignity");

        questions.add("Poverty is a major social ___ in Pakistan.");
        options.add("A) Concern, B) Issue, C) Problem, D) Challenge");
        answers.add("B) Issue");

        questions.add("Gender inequality is a significant ___ problem in Pakistan.");
        options.add("A) Social, B) Economic, C) Political, D) Cultural");
        answers.add("A) Social");

        questions.add("Corruption is a pervasive social ___ in Pakistan.");
        options.add("A) Menace, B) Ill, C) Evil, D) Problem");
        answers.add("B) Ill");

        questions.add("The concept of civics is closely related to the idea of ___.");
        options.add("A) Community, B) Society, C) Politics, D) Government");
        answers.add("A) Community");

        questions.add("The word 'citizen' is derived from the Latin word ___.");
        options.add("A) Civis, B) Civitas, C) Civilis, D) Civicus");
        answers.add("A) Civis");

        questions.add("Ethics is the branch of philosophy that deals with ___.");
        options.add("A) Morality, B) Ethics, C) Values, D) Principles");
        answers.add("A) Morality");

        questions.add("Civics teaches us to respect the ___ of others.");
        options.add("A) Rights, B) Freedoms, C) Privileges, D) Dignity");
        answers.add("A) Rights");

        questions.add("Community engagement is essential for building a strong ___.");
        options.add("A) Society, B) Community, C) Nation, D) State");
        answers.add("A) Society");

        questions.add("The main objective of civics and community engagement is to promote ___.");
        options.add("A) Social Responsibility, B) Community Service, C) Civic Engagement, D) Political Awareness");
        answers.add("A) Social Responsibility");

        questions.add("Paying taxes is a civic duty because it helps fund ___.");
        options.add("A) Public Goods and Services, B) Private Enterprises, C) Government Programs, D) Personal Projects");
        answers.add("A) Public Goods and Services");

        questions.add("Voting is a fundamental right because it allows citizens to choose their ___.");
        options.add("A) Leaders, B) Representatives, C) Officials, D) Politicians");
        answers.add("A) Leaders");

        questions.add("Respecting the national flag and anthem is a civic duty because it shows loyalty to the ___.");
        options.add("A) State, B) Nation, C) Country, D) Government");
        answers.add("A) State");

        questions.add("Pakistan's foreign policy is guided by the principle of ___.");
        options.add("A) National Interest, B) International Cooperation, C) Global Governance, D) Regional Security");
        answers.add("A) National Interest");

        questions.add("The first phase of Pakistan's foreign policy was marked by alignment with the ___.");
        options.add("A) West, B) East, C) North, D) South");
        answers.add("A) West");

        questions.add("The second phase of Pakistan's foreign policy was characterized by non-alignment with the ___.");
        options.add("A) Soviet Union, B) United States, C) China, D) India");
        answers.add("A) Soviet Union");

        questions.add("The individual level of analysis focuses on the role of ___ in international relations.");
        options.add("A) Individuals, B) States, C) Organizations, D) Systems");
        answers.add("A) Individuals");

        questions.add("The __ level of analysis is traditionally the most important of the levels of analysis.");
        options.add("A) Interstate, B) Individual, C) Domestic, D) Global");
        answers.add("A) Interstate");

        questions.add("____ is an economic system that emphasizes private ownership of resources.");
        options.add("A) Capitalism, B) Socialism, C) Communism, D) Fascism");
        answers.add("A) Capitalism");

        questions.add("Communism aims to create a ___ society.");
        options.add("A) Classless, B) Stateless, C) Borderless, D) Leaderless");
        answers.add("A) Classless");

        questions.add("Capitalism is often associated with a ___ economic system.");
        options.add("A) Free Market, B) Command Economy, C) Mixed Economy, D) Traditional Economy");
        answers.add("A) Free Market");

        questions.add("In a Capitalist System the primary goal is to generate ___.");
        options.add("A) Profit, B) Employment, C) Growth, D) Stability");
        answers.add("A) Profit");

        questions.add("Cyber ethics refers to the principles and values that guide our behavior in the ___.");
        options.add("A) Digital World, B) Cyber Space, C) Online Community, D) Virtual Reality");
        answers.add("A) Digital World");

        questions.add("The responsible use of digital platforms requires etiquette and respect for others' ___.");
        options.add("A) Privacy, B) Security, C) Freedom, D) Rights");
        answers.add("A) Privacy");

        questions.add("State Attributes are Sovereignty, autonomy, ___ and ___.");
        options.add("A) Territorial Boundaries Functional Government, B) Sovereignty Autonomy, C) Independence Democracy, D) Security Stability");
        answers.add("A) Territorial Boundaries Functional Government");

        questions.add("Which principle states place of birth determines citizenship of a person ___.");
        options.add("A) Jus Soli, B) Jus Sanguinis, C) Jus Populi, D) Jus Civitatis");
        answers.add("A) Jus Soli");

        questions.add("Some nations allow individuals to hold citizenship in two countries simultaneously, known as ___.");
        options.add("A) Dual Citizenship, B) Multiple Citizenship, C) Shared Citizenship, D) Joint Citizenship");
        answers.add("A) Dual Citizenship");

        questions.add("Crime like ___ can take away individual’s citizenship.");
        options.add("A) Treason, B) Murder, C) Theft, D) Fraud");
        answers.add("A) Treason");

        questions.add("Rights created and approved by state are called ____rights.");
        options.add("A) Legal, B) Moral, C) Social, D) Political");
        answers.add("A) Legal");

        questions.add("The press is the voice of the ___.");
        options.add("A) People Common Man, B) Government State, C) Media Journalists, D) Society Community");
        answers.add("A) People Common Man");

        questions.add("Fundamental rights are divine rights guaranteed by every ____ of the World.");
        options.add("A) Religion, B) State, C) Government, D) Constitution");
        answers.add("A) Religion");

        questions.add("____ types of rights not guaranteed by the State.");
        options.add("A) Moral rights, B) Legal rights, C) Social rights, D) Political rights");
        answers.add("A) Moral rights");

        questions.add("Legal rights are divided into two types ___ and ___.");
        options.add("A) Social Political, B) Economic Cultural, C) Civil Political, D) Individual Collective");
        answers.add("A) Social Political");

        questions.add("Right to trade is an example of ___.");
        options.add("A) Social Right, B) Political Right, C) Economic Right, D) Legal Right");
        answers.add("C) Economic Right");

        questions.add("Aliens are deprived of ___ rights.");
        options.add("A) Political Rights, B) Social Rights, C) Economic Rights, D) Legal Rights");
        answers.add("A) Political Rights");

        questions.add("Rights of Muslim citizens include social, ___ and political rights.");
        options.add("A) Economic, B) Cultural, C) Religious, D) Legal");
        answers.add("A) Economic");

        questions.add("Pakistan's foreign policy has evolved through three phases, with the first phase (1947-1953) focused on ___ and friendship with all.");
        options.add("A) Exploration and Friendship, B) Alignment and Cooperation, C) Conflict and Resolution, D) Diplomacy and Mediation");
        answers.add("A) Exploration and Friendship");

        questions.add("The second phase (1953-1962) was marked by alignment with the ___.");
        options.add("A) West, B) East, C) North, D) South");
        answers.add("A) West");

        questions.add("In the third phase (1990-2001), Pakistan's foreign policy was characterized by a focus on ___ and counterterrorism.");
        options.add("A) Globalization and Trade, B) Regionalism and Security, C) Multilateralism and Diplomacy, D) Counterterrorism and Non-proliferation");
        answers.add("D) Counterterrorism and Non-proliferation");

        questions.add("Globalization is the process of increasing connectivity and interdependence among countries, leading to a more ___ world.");
        options.add("A) Interconnected, B) Interdependent, C) Globalized, D) Universal");
        answers.add("A) Interconnected");

        questions.add("One of the key characteristics of globalization is the free flow of ___ across borders.");
        options.add("A) Ideas Goods and Services, B) People Products and Ideas, C) Capital Labor and Technology, D) Culture Language and Values");
        answers.add("A) Ideas Goods and Services");

        questions.add("Cultural pluralism is a condition in which minority groups participate fully in the dominant society yet maintain their own ___.");
        options.add("A) Cultural Differences, B) Social Norms, C) Political Views, D) Economic Interests");
        answers.add("A) Cultural Differences");

        questions.add("____ is the belief that one's own culture is superior to all others and should serve as the standard frame of reference.");
        options.add("A) Ethnocentrism, B) Cultural Relativism, C) Xenocentrism, D) Multiculturalism");
        answers.add("A) Ethnocentrism");

        questions.add("Xenocentrism is the belief that another culture is superior to one's own and can lead to a rejection of one's own cultural ___.");
        options.add("A) Heritage, B) Values, C) Beliefs, D) Practices");
        answers.add("A) Heritage");

        questions.add("The impact of globalization on local cultures and identity has been a subject of debate, with some arguing that it leads to cultural ___.");
        options.add("A) Homogenization, B) Heterogenization, C) Cultural Exchange, D) Cultural Evolution");
        answers.add("A) Homogenization");

        questions.add("Pakistan's foreign policy has been shaped by its relations with neighboring countries, including India and Afghanistan, as well as its membership in international organizations such as the ___.");
        options.add("A) United Nations, B) European Union, C) Association of Southeast Asian Nations, D) Organization of Islamic Cooperation");
        answers.add("A) United Nations");

        questions.add("____ is the process of learning civic responsibility that involves problem-solving and learning about issues and interacting with community.");
        options.add("A) Service-Learning, B) Community Service, C) Volunteerism, D) Activism");
        answers.add("A) Service-Learning");

        questions.add("The word civic means ___ or ___.");
        options.add("A) City Town, B) Community Society, C) Citizen Civilian, D) Public Private");
        answers.add("A) City Town");

        questions.add("Culture is defined as the symbols, language, beliefs, values, and ___ that are part of any society.");
        options.add("A) Artifact, B) Heritage, C) Traditions, D) Customs");
        answers.add("A) Artifact");

        questions.add("Types of Culture includes material Culture and ___ culture.");
        options.add("A) Symbolic, B) Non-material, C) Intangible, D) Immaterial");
        answers.add("A) Symbolic");

        questions.add("Culture is connected to our ___.");
        options.add("A) Ancestry Heritage, B) Language Religion, C) Customs Traditions, D) Values Beliefs");
        answers.add("A) Ancestry Heritage");

        questions.add("Culture is ___, meaning it doesn't stay the same and changes over time.");
        options.add("A) Dynamic, B) Static, C) Constant, D) Unchanging");
        answers.add("A) Dynamic");

        questions.add("Cultural pluralism encourages people to bring their culture's own ___ and values to society.");
        options.add("A) Uniqueness, B) Similarities, C) Differences, D) Traditions");
        answers.add("A) Uniqueness");

        questions.add("A school program that combines students from different cultural backgrounds to work together on projects is an example of ___.");
        options.add("A) Multiculturalism, B) Cultural Pluralism, C) Diversity Education, D) Inclusive Learning");
        answers.add("A) Multiculturalism");

        questions.add("Community is a group of people living in a ___ geographic area.");
        options.add("A) Contiguous, B) Adjacent, C) Proximate, D) Nearby");
        answers.add("A) Contiguous");

        questions.add("Word Community derived from two Latin words namely, com which means ____ and munis which means ____.");
        options.add("A) Together Serve, B) Common Unity, C) Share Care, D) Join Unite");
        answers.add("A) Together Serve");

        questions.add("Two major types of Community are ___ and ___.");
        options.add("A) Urban Rural, B) Local Global, C) Small Large, D) Traditional Modern");
        answers.add("A) Urban Rural");

        questions.add("A society is ___ as diversity exist among the members of a society.");
        options.add("A) Heterogeneous, B) Homogeneous, C) Diverse, D) Uniform");
        answers.add("A) Heterogeneous");

        questions.add("____ makes the world more accessible to the people.");
        options.add("A) Globalization, B) Localization, C) Urbanization, D) Modernization");
        answers.add("A) Globalization");

        questions.add("Types of Globalization includes Political, Cultural, Economic and ___ Globalization.");
        options.add("A) Technological, B) Social, C) Environmental, D) Educational");
        answers.add("A) Technological");

        questions.add("The benefits of Globalization are not ___ because of Uneven Wealth distribution.");
        options.add("A) Universal, B) Equal, C) Fair, D) Just");
        answers.add("A) Universal");

        questions.add("US attacked __ in 2nd phase of war against terrorism as a blame for development of mass destruction weapons.");
        options.add("A) Iraq, B) Afghanistan, C) Pakistan, D) Iran");
        answers.add("A) Iraq");

        questions.add("Pakistan was created based on ___ ideology.");
        options.add("A) Religious, B) Secular, C) Political, D) Cultural");
        answers.add("A) Religious");

        questions.add("Pakistan govt handed over Amil Kansi and ____ to USA.");
        options.add("A) Ramzi Yusuf, B) Osama bin Laden, C) Khalid Sheikh Mohammed, D) Ayman al-Zawahiri");
        answers.add("A) Ramzi Yusuf");

        questions.add("Pakistan can get $__ to $__ by proving transit route for gas pipeline to India from Turkmenistan.");
        options.add("A) 600 to 800, B) 800 to 1000, C) 1000 to 1200, D) 1200 to 1500");
        answers.add("A) 600 to 800");

        questions.add("At the ___ level of analysis, we examine how cultural dominance is reinforced through social structures and institutions.");
        options.add("A) Macro, B) Meso, C) Micro, D) Global");
        answers.add("A) Macro");

    }


    public static void main(String[] args) {
        new Civics_Quiz(name).setVisible(true);
    }

}
