package secondListFrames;

import frame.Quiz;

/**
 * @author MuhammadHasnatRasool
 */

public class History_Quiz extends Quiz{
    

    public History_Quiz(String name) {
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


  // questions:
    @Override
    public final void loadQuestions() {
       
        questions.add("Which ancient civilization built the pyramids at Giza?");
        options.add("A) Mesopotamians, B) Egyptians, C) Greeks, D) Romans");
        answers.add("B) Egyptians");

        questions.add("Who was the first emperor of Rome?");
        options.add("A) Julius Caesar, B) Augustus, C) Nero, D) Constantine");
        answers.add("B) Augustus");

        questions.add("Which battle in 1066 marked the Norman conquest of England?");
        options.add("A) Battle of Hastings, B) Battle of Stamford Bridge, C) Battle of Agincourt, D) Battle of Bosworth Field");
        answers.add("A) Battle of Hastings");

        questions.add("Who wrote 'The Prince', a famous political treatise from the Renaissance?");
        options.add("A) Leonardo da Vinci, B) Michelangelo, C) Niccolò Machiavelli, D) Galileo Galilei");
        answers.add("C) Niccolò Machiavelli");

        questions.add("Which event is often considered the beginning of World War I?");
        options.add("A) Assassination of Archduke Franz Ferdinand, B) Treaty of Versailles, C) Battle of the Somme, D) Bombing of Pearl Harbor");
        answers.add("A) Assassination of Archduke Franz Ferdinand");

        questions.add("Which Roman general is known for crossing the Alps with elephants?");
        options.add("A) Julius Caesar, B) Mark Antony, C) Scipio Africanus, D) Hannibal");
        answers.add("D) Hannibal");

        questions.add("Who was the first President of the United States?");
        options.add("A) Benjamin Franklin, B) Thomas Jefferson, C) George Washington, D) John Adams");
        answers.add("C) George Washington");

        questions.add("Which ancient Greek historian is often called the 'Father of History'?");
        options.add("A) Plato, B) Herodotus, C) Aristotle, D) Thucydides");
        answers.add("B) Herodotus");

        questions.add("Which European explorer is credited with discovering the sea route to India?");
        options.add("A) Vasco da Gama, B) Christopher Columbus, C) Ferdinand Magellan, D) Marco Polo");
        answers.add("A) Vasco da Gama");

        questions.add("Which famous queen ruled England during the Elizabethan Era?");
        options.add("A) Mary I, B) Queen Victoria, C) Elizabeth I, D) Anne Boleyn");
        answers.add("C) Elizabeth I");

        questions.add("Who was the first emperor of China, known for unifying the country?");
        options.add("A) Qin Shi Huang, B) Han Wudi, C) Liu Bang, D) Sun Yat-sen");
        answers.add("A) Qin Shi Huang");

        questions.add("Which war is often referred to as the 'War to End All Wars'?");
        options.add("A) World War I, B) American Civil War, C) World War II, D) Korean War");
        answers.add("A) World War I");

        questions.add("Which ancient civilization is credited with inventing writing?");
        options.add("A) Mesopotamians, B) Egyptians, C) Greeks, D) Chinese");
        answers.add("A) Mesopotamians");

        questions.add("Who was the founder of Buddhism?");
        options.add("A) Confucius, B) Buddha, C) Laozi, D) Mahavira");
        answers.add("B) Buddha");

        questions.add("Which city was the capital of the Byzantine Empire?");
        options.add("A) Constantinople, B) Athens, C) Rome, D) Alexandria");
        answers.add("A) Constantinople");

        questions.add("Which European city was divided by the Berlin Wall during the Cold War?");
        options.add("A) Paris, B) London, C) Berlin, D) Moscow");
        answers.add("C) Berlin");

        questions.add("Which document established the separation of the American colonies from Great Britain?");
        options.add("A) Declaration of Independence, B) Emancipation Proclamation, C) Magna Carta, D) Articles of Confederation");
        answers.add("A) Declaration of Independence");

        questions.add("Which Russian ruler is known as 'Ivan the Terrible'?");
        options.add("A) Ivan III, B) Ivan IV, C) Peter the Great, D) Catherine the Great");
        answers.add("B) Ivan IV");

        questions.add("Who painted the ceiling of the Sistine Chapel?");
        options.add("A) Raphael, B) Leonardo da Vinci, C) Michelangelo, D) Donatello");
        answers.add("C) Michelangelo");

        questions.add("Which war was fought between the North and South regions of the United States?");
        options.add("A) American Revolution, B) Civil War, C) War of 1812, D) Vietnam War");
        answers.add("B) Civil War");

        questions.add("Who was the first female Prime Minister of the United Kingdom?");
        options.add("A) Margaret Thatcher, B) Queen Elizabeth I, C) Theresa May, D) Angela Merkel");
        answers.add("A) Margaret Thatcher");

        questions.add("Which French military leader became Emperor of France?");
        options.add("A) Louis XIV, B) Napoleon Bonaparte, C) Charles de Gaulle, D) Joan of Arc");
        answers.add("B) Napoleon Bonaparte");

        questions.add("Which ancient civilization built the city of Machu Picchu?");
        options.add("A) Aztecs, B) Incas, C) Maya, D) Olmecs");
        answers.add("B) Incas");

        questions.add("Who was the first emperor of Japan?");
        options.add("A) Hirohito, B) Meiji, C) Oda Nobunaga, D) Emperor Jimmu");
        answers.add("D) Emperor Jimmu");

        questions.add("Which American President is known for the New Deal policies during the Great Depression?");
        options.add("A) Franklin D. Roosevelt, B) Herbert Hoover, C) Woodrow Wilson, D) Dwight D. Eisenhower");
        answers.add("A) Franklin D. Roosevelt");

        questions.add("Which explorer led the first expedition to circumnavigate the globe?");
        options.add("A) Ferdinand Magellan, B) Christopher Columbus, C) Vasco da Gama, D) Marco Polo");
        answers.add("A) Ferdinand Magellan");

        questions.add("Who wrote 'The Communist Manifesto' with Friedrich Engels?");
        options.add("A) Karl Marx, B) Vladimir Lenin, C) Leon Trotsky, D) Joseph Stalin");
        answers.add("A) Karl Marx");

        questions.add("Which European country was ruled by Queen Victoria during the Victorian Era?");
        options.add("A) France, B) United Kingdom, C) Spain, D) Germany");
        answers.add("B) United Kingdom");

        questions.add("Who was the leader of the Bolshevik Revolution in Russia?");
        options.add("A) Vladimir Lenin, B) Joseph Stalin, C) Leon Trotsky, D) Mikhail Gorbachev");
        answers.add("A) Vladimir Lenin");

        questions.add("Which European city was divided into East and West during the Cold War?");
        options.add("A) London, B) Paris, C) Berlin, D) Rome");
        answers.add("C) Berlin");

        questions.add("Who was the longest-reigning monarch in British history?");
        options.add("A) Queen Elizabeth II, B) Queen Victoria, C) King George III, D) King Henry VIII");
        answers.add("B) Queen Victoria");

        questions.add("Which city was the center of the Renaissance?");
        options.add("A) Rome, B) Athens, C) Florence, D) Venice");
        answers.add("C) Florence");

        questions.add("Who was the first female pharaoh of ancient Egypt?");
        options.add("A) Nefertiti, B) Cleopatra, C) Hatshepsut, D) Ankhesenamun");
        answers.add("C) Hatshepsut");

        questions.add("Which U.S. President is known for issuing the Emancipation Proclamation?");
        options.add("A) Abraham Lincoln, B) Andrew Jackson, C) Thomas Jefferson, D) Ulysses S. Grant");
        answers.add("A) Abraham Lincoln");

        questions.add("Who was the founder of the Mongol Empire?");
        options.add("A) Genghis Khan, B) Kublai Khan, C) Attila the Hun, D) Tamerlane");
        answers.add("A) Genghis Khan");

        questions.add("Which ancient civilization developed the concept of democracy?");
        options.add("A) Romans, B) Egyptians, C) Greeks, D) Persians");
        answers.add("C) Greeks");

        questions.add("Who was the first person to orbit the Earth?");
        options.add("A) Yuri Gagarin, B) Neil Armstrong, C) John Glenn, D) Buzz Aldrin");
        answers.add("A) Yuri Gagarin");

        questions.add("Which war was fought between North Korea and South Korea?");
        options.add("A) World War I, B) Vietnam War, C) Korean War, D) Gulf War");
        answers.add("C) Korean War");

        questions.add("Who was the author of 'The Wealth of Nations', a foundational work in economics?");
        options.add("A) Karl Marx, B) Adam Smith, C) John Maynard Keynes, D) Milton Friedman");
        answers.add("B) Adam Smith");

        questions.add("Which queen is known for her support of the arts during England's Elizabethan Era?");
        options.add("A) Queen Victoria, B) Mary I, C) Anne Boleyn, D) Elizabeth I");
        answers.add("D) Elizabeth I");

        questions.add("Who was the author of 'The Art of War', an ancient Chinese military treatise?");
        options.add("A) Sun Tzu, B) Confucius, C) Laozi, D) Mao Zedong");
        answers.add("A) Sun Tzu");

        questions.add("Which Roman emperor famously 'fiddled while Rome burned'?");
        options.add("A) Augustus, B) Nero, C) Caligula, D) Marcus Aurelius");
        answers.add("B) Nero");

        questions.add("Who was the first African-American President of the United States?");
        options.add("A) Joe Biden, B) Barack Obama, C) Bill Clinton, D) George W. Bush");
        answers.add("B) Barack Obama");

        questions.add("Which ancient civilization is known for building the city of Teotihuacan in Mexico?");
        options.add("A) Aztecs, B) Maya, C) Olmecs, D) Toltecs");
        answers.add("B) Maya");

        questions.add("Who led the Salt March in India as a form of peaceful protest against British rule?");
        options.add("A) Jawaharlal Nehru, B) Mahatma Gandhi, C) Subhas Chandra Bose, D) Indira Gandhi");
        answers.add("B) Mahatma Gandhi");

        questions.add("Which U.S. President signed the Civil Rights Act of 1964 into law?");
        options.add("A) John F. Kennedy, B) Lyndon B. Johnson, C) Richard Nixon, D) Gerald Ford");
        answers.add("B) Lyndon B. Johnson");

        questions.add("Who wrote 'The Odyssey', an ancient Greek epic poem?");
        options.add("A) Homer, B) Sophocles, C) Euripides, D) Aeschylus");
        answers.add("A) Homer");

        questions.add("Which American inventor is known for the electric light bulb?");
        options.add("A) Alexander Graham Bell, B) Thomas Edison, C) Nikola Tesla, D) George Westinghouse");
        answers.add("B) Thomas Edison");

        questions.add("Who was the first person to reach the South Pole?");
        options.add("A) Roald Amundsen, B) Robert F. Scott, C) Ernest Shackleton, D) Edmund Hillary");
        answers.add("A) Roald Amundsen");

        questions.add("Which ancient civilization is known for building the Parthenon in Athens?");
        options.add("A) Romans, B) Egyptians, C) Greeks, D) Persians");
        answers.add("C) Greeks");

        questions.add("Who was the first European explorer to reach India by sea?");
        options.add("A) Vasco da Gama, B) Christopher Columbus, C) Ferdinand Magellan, D) Marco Polo");
        answers.add("A) Vasco da Gama");

        questions.add("Which French queen was executed during the French Revolution?");
        options.add("A) Marie Antoinette, B) Catherine de' Medici, C) Joan of Arc, D) Charlotte Corday");
        answers.add("A) Marie Antoinette");

        questions.add("Who was the leader of the Soviet Union during World War II?");
        options.add("A) Joseph Stalin, B) Leon Trotsky, C) Nikita Khrushchev, D) Mikhail Gorbachev");
        answers.add("A) Joseph Stalin");

        questions.add("Which European country was ruled by Queen Isabella I during the Age of Exploration?");
        options.add("A) France, B) Spain, C) Portugal, D) England");
        answers.add("B) Spain");

        questions.add("Who was the first person to step on the Moon?");
        options.add("A) Neil Armstrong, B) Buzz Aldrin, C) Alan Shepard, D) John Glenn");
        answers.add("A) Neil Armstrong");

        questions.add("Which Russian ruler expanded the Russian Empire and is known as 'Peter the Great'?");
        options.add("A) Ivan the Terrible, B) Peter I, C) Catherine the Great, D) Alexander II");
        answers.add("B) Peter I");

        questions.add("Who was the first female Prime Minister of India?");
        options.add("A) Sonia Gandhi, B) Indira Gandhi, C) Margaret Thatcher, D) Golda Meir");
        answers.add("B) Indira Gandhi");

        questions.add("Which ancient civilization is known for the creation of the Code of Hammurabi?");
        options.add("A) Sumerians, B) Babylonians, C) Assyrians, D) Hittites");
        answers.add("B) Babylonians");

        questions.add("Who was the first President of the Russian Federation after the collapse of the Soviet Union?");
        options.add("A) Vladimir Putin, B) Boris Yeltsin, C) Mikhail Gorbachev, D) Leonid Brezhnev");
        answers.add("B) Boris Yeltsin");

        questions.add("Which American President is known for his role in the establishment of the United Nations?");
        options.add("A) Franklin D. Roosevelt, B) Woodrow Wilson, C) Harry S. Truman, D) Dwight D. Eisenhower");
        answers.add("A) Franklin D. Roosevelt");

        questions.add("Who was the founder of the Roman Empire?");
        options.add("A) Julius Caesar, B) Augustus, C) Marcus Aurelius, D) Romulus");
        answers.add("B) Augustus");

        questions.add("Which European explorer is known for reaching the Americas in 1492?");
        options.add("A) Vasco da Gama, B) Ferdinand Magellan, C) Christopher Columbus, D) Marco Polo");
        answers.add("C) Christopher Columbus");

        questions.add("Who was the last pharaoh of ancient Egypt?");
        options.add("A) Cleopatra, B) Ramses II, C) Tutankhamun, D) Akhenaten");
        answers.add("A) Cleopatra");

        questions.add("Which Chinese philosopher is known for his teachings on ethics and morality?");
        options.add("A) Confucius, B) Laozi, C) Sun Tzu, D) Mencius");
        answers.add("A) Confucius");


    }

    
    public static void main(String[]args){
        new History_Quiz(name).setVisible(true);
    }
    
}
