package thirdListFrames;

/**
 * @author MuhammadHasnatRasool
 */
import frame.Quiz;
import java.awt.event.ActionEvent;


public class Astrology_Quiz extends Quiz{
    

    public Astrology_Quiz(String name) {
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


    // questions:76
    @Override
    public final void loadQuestions() {
        
        questions.add("Which zodiac sign is symbolized by the Twins?");
        options.add("A) Virgo, B) Gemini, C) Cancer, D) Pisces");
        answers.add("B) Gemini");

        questions.add("What does a person's 'rising sign' in astrology represent?");
        options.add("A) Their deepest desires, B) Their outward personality, C) Their emotional needs, D) Their career prospects");
        answers.add("B) Their outward personality");

        questions.add("In astrology, which planet rules over emotions, nurturing, and home life?");
        options.add("A) Venus, B) Mars, C) Jupiter, D) Moon");
        answers.add("D) Moon");

        questions.add("Which astrological sign is known for being practical, patient, and reliable?");
        options.add("A) Virgo, B) Libra, C) Capricorn, D) Aquarius");
        answers.add("C) Capricorn");

        questions.add("What does the Sun sign represent in astrology?");
        options.add("A) Inner desires, B) Conscious self and ego, C) Subconscious mind, D) Communication style");
        answers.add("B) Conscious self and ego");

        questions.add("Which planet is considered the ruler of dreams, illusions, and spirituality?");
        options.add("A) Neptune, B) Saturn, C) Mars, D) Venus");
        answers.add("A) Neptune");

        questions.add("In astrology, which house rules over partnerships, marriage, and close relationships?");
        options.add("A) 1st House, B) 5th House, C) 7th House, D) 10th House");
        answers.add("C) 7th House");

        questions.add("Which zodiac sign is known for its dual nature and adaptability?");
        options.add("A) Pisces, B) Cancer, C) Gemini, D) Sagittarius");
        answers.add("C) Gemini");

        questions.add("What is the ruling planet of Scorpio?");
        options.add("A) Pluto, B) Neptune, C) Uranus, D) Saturn");
        answers.add("A) Pluto");

        questions.add("Which astrological sign is associated with balance, harmony, and justice?");
        options.add("A) Libra, B) Leo, C) Taurus, D) Pisces");
        answers.add("A) Libra");

        questions.add("Which zodiac sign is known for its intense passion, loyalty, and resourcefulness?");
        options.add("A) Scorpio, B) Sagittarius, C) Capricorn, D) Aries");
        answers.add("A) Scorpio");

        questions.add("In astrology, which house represents creativity, romance, and self-expression?");
        options.add("A) 3rd House, B) 5th House, C) 7th House, D) 9th House");
        answers.add("B) 5th House");

        questions.add("Which astrological sign is symbolized by the Crab?");
        options.add("A) Cancer, B) Leo, C) Gemini, D) Sagittarius");
        answers.add("A) Cancer");

        questions.add("What is the ruling planet of Aquarius?");
        options.add("A) Uranus, B) Pluto, C) Saturn, D) Jupiter");
        answers.add("A) Uranus");

        questions.add("Which zodiac sign is known for its practicality, loyalty, and earthy nature?");
        options.add("A) Taurus, B) Libra, C) Leo, D) Aquarius");
        answers.add("A) Taurus");

        questions.add("In astrology, which house represents routines, health habits, and daily work life?");
        options.add("A) 2nd House, B) 6th House, C) 10th House, D) 11th House");
        answers.add("B) 6th House");

        questions.add("Which astrological sign is symbolized by the Bull?");
        options.add("A) Taurus, B) Aries, C) Gemini, D) Capricorn");
        answers.add("A) Taurus");

        questions.add("Which planet rules over love, beauty, and relationships in astrology?");
        options.add("A) Mars, B) Venus, C) Mercury, D) Jupiter");
        answers.add("B) Venus");

        questions.add("In astrology, which house represents spirituality, compassion, and self-undoing?");
        options.add("A) 6th House, B) 8th House, C) 9th House, D) 12th House");
        answers.add("D) 12th House");

        questions.add("Which zodiac sign is known for its optimism, enthusiasm, and adventurous spirit?");
        options.add("A) Aquarius, B) Pisces, C) Sagittarius, D) Libra");
        answers.add("C) Sagittarius");

        questions.add("What is the ruling planet of Virgo?");
        options.add("A) Mercury, B) Mars, C) Venus, D) Moon");
        answers.add("A) Mercury");

        questions.add("Which planet rules over luck, expansion, and higher knowledge in astrology?");
        options.add("A) Mars, B) Mercury, C) Venus, D) Jupiter");
        answers.add("D) Jupiter");

        questions.add("In astrology, which house represents friendships, social networks, and goals?");
        options.add("A) 2nd House, B) 6th House, C) 10th House, D) 11th House");
        answers.add("D) 11th House");

        questions.add("Which zodiac sign is known for its diplomatic, fair-minded, and cooperative nature?");
        options.add("A) Libra, B) Scorpio, C) Sagittarius, D) Capricorn");
        answers.add("A) Libra");

        questions.add("What is the ruling planet of Pisces?");
        options.add("A) Neptune, B) Jupiter, C) Mercury, D) Mars");
        answers.add("A) Neptune");

        questions.add("In astrology, which planet rules over rebellion, innovation, and sudden changes?");
        options.add("A) Uranus, B) Pluto, C) Saturn, D) Mars");
        answers.add("A) Uranus");

        questions.add("What is the ruling planet of Aries?");
        options.add("A) Mars, B) Mercury, C) Venus, D) Sun");
        answers.add("A) Mars");

        questions.add("Which zodiac sign is known for its sensitivity, empathy, and imagination?");
        options.add("A) Cancer, B) Taurus, C) Gemini, D) Virgo");
        answers.add("A) Cancer");

        questions.add("Which astrological sign is symbolized by the Fish?");
        options.add("A) Scorpio, B) Pisces, C) Capricorn, D) Aquarius");
        answers.add("B) Pisces");

        questions.add("In astrology, which house represents higher education, travel, and philosophy?");
        options.add("A) 4th House, B) 6th House, C) 9th House, D) 11th House");
        answers.add("C) 9th House");

        questions.add("Which planet is associated with power, transformation, and regeneration in astrology?");
        options.add("A) Pluto, B) Uranus, C) Neptune, D) Saturn");
        answers.add("A) Pluto");

        questions.add("What is the ruling planet of Leo?");
        options.add("A) Sun, B) Mercury, C) Venus, D) Mars");
        answers.add("A) Sun");

        questions.add("Which zodiac sign is known for its analytical, detail-oriented, and perfectionist nature?");
        options.add("A) Scorpio, B) Virgo, C) Pisces, D) Libra");
        answers.add("B) Virgo");

        questions.add("In astrology, which house represents transformation, intimacy, and shared resources?");
        options.add("A) 4th House, B) 6th House, C) 8th House, D) 10th House");
        answers.add("C) 8th House");

        questions.add("Which astrological sign is symbolized by the Archer?");
        options.add("A) Sagittarius, B) Capricorn, C) Aquarius, D) Aries");
        answers.add("A) Sagittarius");

        questions.add("What is the ruling planet of Cancer?");
        options.add("A) Moon, B) Mercury, C) Venus, D) Mars");
        answers.add("A) Moon");

        questions.add("In astrology, which planet rules over discipline, responsibility, and authority?");
        options.add("A) Saturn, B) Jupiter, C) Mars, D) Venus");
        answers.add("A) Saturn");

        questions.add("Which zodiac sign is known for its independent, original, and humanitarian nature?");
        options.add("A) Aquarius, B) Pisces, C) Leo, D) Taurus");
        answers.add("A) Aquarius");

        questions.add("What does the 10th House represent in astrology?");
        options.add("A) Higher education, B) Career and public image, C) Travel and philosophy, D) Family relationships");
        answers.add("B) Career and public image");

        questions.add("Which astrological sign is symbolized by the Ram?");
        options.add("A) Taurus, B) Aries, C) Leo, D) Scorpio");
        answers.add("B) Aries");

        questions.add("What is the ruling planet of Gemini?");
        options.add("A) Mercury, B) Mars, C) Venus, D) Moon");
        answers.add("A) Mercury");

        questions.add("In astrology, which house represents wealth, possessions, and material resources?");
        options.add("A) 2nd House, B) 6th House, C) 8th House, D) 10th House");
        answers.add("A) 2nd House");

        questions.add("Which zodiac sign is known for its intense drive, ambition, and leadership qualities?");
        options.add("A) Scorpio, B) Sagittarius, C) Capricorn, D) Aries");
        answers.add("C) Capricorn");

        questions.add("What is the ruling planet of Libra?");
        options.add("A) Venus, B) Mars, C) Mercury, D) Moon");
        answers.add("A) Venus");

        questions.add("In astrology, which planet rules over communication, intellect, and adaptability?");
        options.add("A) Mars, B) Mercury, C) Venus, D) Jupiter");
        answers.add("B) Mercury");

        questions.add("Which astrological sign is known for its generosity, warmth, and optimism?");
        options.add("A) Leo, B) Pisces, C) Sagittarius, D) Virgo");
        answers.add("A) Leo");

        questions.add("What does a person's Moon sign in astrology signify?");
        options.add("A) Career prospects, B) Emotional nature, C) Relationships with siblings, D) Physical health");
        answers.add("B) Emotional nature");

        questions.add("In astrology, which house represents family, home life, and emotional foundations?");
        options.add("A) 2nd House, B) 4th House, C) 6th House, D) 8th House");
        answers.add("B) 4th House");

        questions.add("Which planet rules over desire, passion, and instincts in astrology?");
        options.add("A) Mars, B) Mercury, C) Venus, D) Jupiter");
        answers.add("A) Mars");

        questions.add("What is the ruling planet of Capricorn?");
        options.add("A) Saturn, B) Jupiter, C) Uranus, D) Neptune");
        answers.add("A) Saturn");

        questions.add("Which zodiac sign is known for its deep, mysterious, and transformative nature?");
        options.add("A) Scorpio, B) Sagittarius, C) Aquarius, D) Gemini");
        answers.add("A) Scorpio");

        questions.add("In astrology, which house represents creativity, entertainment, and self-expression?");
        options.add("A) 3rd House, B) 5th House, C) 7th House, D) 9th House");
        answers.add("B) 5th House");

        questions.add("Which astrological sign is symbolized by the Lion?");
        options.add("A) Leo, B) Libra, C) Aries, D) Cancer");
        answers.add("A) Leo");

        questions.add("What is the ruling planet of Sagittarius?");
        options.add("A) Neptune, B) Uranus, C) Jupiter, D) Saturn");
        answers.add("C) Jupiter");

        questions.add("In astrology, which planet rules over self-expression, creativity, and romance?");
        options.add("A) Mars, B) Mercury, C) Venus, D) Jupiter");
        answers.add("C) Venus");

        questions.add("Which zodiac sign is known for its humanitarian efforts, innovation, and unpredictability?");
        options.add("A) Aquarius, B) Pisces, C) Taurus, D) Gemini");
        answers.add("A) Aquarius");

        questions.add("What does the 11th House represent in astrology?");
        options.add("A) Home and family life, B) Friendships, social networks, and goals, C) Work environment and colleagues, D) Health and well-being");
        answers.add("B) Friendships, social networks, and goals");

        questions.add("In astrology, which house represents communication, learning, and daily interactions?");
        options.add("A) 2nd House, B) 3rd House, C) 5th House, D) 7th House");
        answers.add("B) 3rd House");

        questions.add("Which planet is associated with sudden changes, innovation, and revolution in astrology?");
        options.add("A) Uranus, B) Pluto, C) Saturn, D) Mars");
        answers.add("A) Uranus");

        questions.add("What is the ruling planet of Virgo?");
        options.add("A) Mercury, B) Mars, C) Venus, D) Moon");
        answers.add("A) Mercury");

        questions.add("Which zodiac sign is known for its balanced, harmonious, and fair-minded nature?");
        options.add("A) Libra, B) Scorpio, C) Sagittarius, D) Capricorn");
        answers.add("A) Libra");

        questions.add("In astrology, which house represents career, ambition, and public reputation?");
        options.add("A) 6th House, B) 8th House, C) 10th House, D) 12th House");
        answers.add("C) 10th House");

        questions.add("Which astrological sign is symbolized by the Scales?");
        options.add("A) Libra, B) Gemini, C) Taurus, D) Virgo");
        answers.add("A) Libra");

        questions.add("What is the ruling planet of Cancer?");
        options.add("A) Moon, B) Mercury, C) Venus, D) Mars");
        answers.add("A) Moon");

        questions.add("In astrology, which planet rules over boundaries, responsibilities, and structure?");
        options.add("A) Saturn, B) Jupiter, C) Mars, D) Venus");
        answers.add("A) Saturn");

        questions.add("Which zodiac sign is known for its adaptive, compassionate, and imaginative nature?");
        options.add("A) Pisces, B) Aquarius, C) Aries, D) Leo");
        answers.add("A) Pisces");

        questions.add("What does the 9th House represent in astrology?");
        options.add("A) Personal finances, B) Career and public image, C) Travel, higher education, and philosophy, D) Family relationships");
        answers.add("C) Travel, higher education, and philosophy");

        questions.add("In astrology, which house represents intimacy, transformation, and shared resources?");
        options.add("A) 5th House, B) 7th House, C) 8th House, D) 10th House");
        answers.add("C) 8th House");

        questions.add("Which astrological sign is symbolized by the Water Bearer?");
        options.add("A) Aquarius, B) Pisces, C) Capricorn, D) Scorpio");
        answers.add("A) Aquarius");

        questions.add("What is the ruling planet of Taurus?");
        options.add("A) Venus, B) Mars, C) Mercury, D) Moon");
        answers.add("A) Venus");

        questions.add("Which zodiac sign is known for its analytical, observant, and strategic nature?");
        options.add("A) Scorpio, B) Virgo, C) Capricorn, D) Libra");
        answers.add("C) Capricorn");

        questions.add("In astrology, which planet rules over desire, motivation, and vitality?");
        options.add("A) Mars, B) Mercury, C) Venus, D) Jupiter");
        answers.add("A) Mars");

        questions.add("What is the ruling planet of Gemini?");
        options.add("A) Mercury, B) Mars, C) Venus, D) Moon");
        answers.add("A) Mercury");

        questions.add("Which astrological sign is symbolized by the Fish?");
        options.add("A) Scorpio, B) Pisces, C) Capricorn, D) Aquarius");
        answers.add("B) Pisces");

        questions.add("In astrology, which house represents partnerships, marriage, and significant relationships?");
        options.add("A) 3rd House, B) 5th House, C) 7th House, D) 9th House");
        answers.add("C) 7th House");

        questions.add("Which zodiac sign is known for its compassionate, imaginative, and empathetic nature?");
        options.add("A) Cancer, B) Taurus, C) Gemini, D) Leo");
        answers.add("A) Cancer");
        
    }
    
 
    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
    }
    
    public static void main(String[]args){
        new Astrology_Quiz(name).setVisible(true);
    }
    
}
