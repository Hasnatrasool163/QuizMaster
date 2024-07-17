package thirdListFrames;

import frame.True_False_Questions;
public class Astrology_TF extends True_False_Questions {

    public Astrology_TF(String name) {
        super(name);
    }

 
// astrology
    @Override
    public final void loadQuestions() {
questions.add("Astrology is a scientific study based on empirical evidence and experimentation.");
answers.add("False");
questions.add("The zodiac sign Pisces is represented by the fish.");
answers.add("True");
questions.add("Astrology is primarily concerned with the positions of celestial bodies relative to Earth and their influence on human affairs.");
answers.add("True");
questions.add("Capricorn is an Earth sign in the zodiac.");
answers.add("True");
questions.add("Astrologers use the positions of planets at the time of a person's birth to interpret personality traits and predict future events.");
answers.add("True");
questions.add("The zodiac sign Libra is represented by a lion.");
answers.add("False");
questions.add("The astrological symbol for Aries is a ram.");
answers.add("True");
questions.add("Astrology has a scientific basis and is widely accepted in the scientific community.");
answers.add("False");
questions.add("Scorpio is a fire sign in the zodiac.");
answers.add("False");
questions.add("The zodiac sign Cancer is represented by a crab.");
answers.add("True");
questions.add("Astrology and astronomy are essentially the same discipline.");
answers.add("False");
questions.add("Gemini is an air sign in the zodiac.");
answers.add("True");
questions.add("Astrologers believe that the position of the Sun, Moon, and planets at the time of a person's birth can influence their personality and life events.");
answers.add("True");
questions.add("The zodiac sign Virgo is represented by scales.");
answers.add("False");
questions.add("Astrology is based on the idea that celestial phenomena directly influence human affairs and natural events.");
answers.add("True");
questions.add("Aquarius is a water sign in the zodiac.");
answers.add("False");
questions.add("Astrology is considered a pseudoscience by the scientific community.");
answers.add("True");
questions.add("The zodiac sign Taurus is represented by a bull.");
answers.add("True");
questions.add("Astrological predictions are always accurate and can foretell specific events in a person's life.");
answers.add("False");
questions.add("Sagittarius is a fire sign in the zodiac.");
answers.add("True");
questions.add("Astrology is practiced in many cultures around the world, each with its own variations and interpretations.");
answers.add("True");
questions.add("The zodiac sign Leo is represented by the archer.");
answers.add("False");
questions.add("Astrology categorically denies the existence of free will.");
answers.add("False");
questions.add("Pisces is a water sign in the zodiac.");
answers.add("True");
questions.add("Astrology uses the concept of houses to divide the sky into twelve segments, each representing different areas of life.");
answers.add("True");
questions.add("The zodiac sign Capricorn is represented by a goat.");
answers.add("True");
    }

    public static void main(String[] args) {
        new Astrology_TF(name).setVisible(true);
    }

}
