package thirdListFrames;

/**
 * @author MuhammadHasnatRasool
 */
import frame.Quiz;
import java.awt.event.ActionEvent;


public class Physics_Quiz extends Quiz{
    

    public Physics_Quiz(String name) {
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
        
        questions.add("What is the SI unit of electric current?");
        options.add("A) Volt, B) Ampere, C) Ohm, D) Watt");
        answers.add("B) Ampere");

        questions.add("Which law states that the force between two point charges is directly proportional to the product of their charges and inversely proportional to the square of the distance between them?");
        options.add("A) Ohm's Law, B) Coulomb's Law, C) Newton's First Law, D) Kepler's Law");
        answers.add("B) Coulomb's Law");

        questions.add("What is the SI unit of power?");
        options.add("A) Watt, B) Joule, C) Newton, D) Volt");
        answers.add("A) Watt");

        questions.add("Which physical quantity is measured in hertz (Hz)?");
        options.add("A) Force, B) Frequency, C) Pressure, D) Velocity");
        answers.add("B) Frequency");

        questions.add("What is the acceleration due to gravity on the surface of the Earth?");
        options.add("A) 9.8 m/s^2, B) 6.7 m/s^2, C) 5.0 m/s^2, D) 12.0 m/s^2");
        answers.add("A) 9.8 m/s^2");

        questions.add("Which law states that the pressure exerted by a fixed mass of gas is directly proportional to its temperature, provided its volume remains constant?");
        options.add("A) Boyle's Law, B) Charles's Law, C) Gay-Lussac's Law, D) Avogadro's Law");
        answers.add("B) Charles's Law");

        questions.add("What is the SI unit of force?");
        options.add("A) Newton, B) Watt, C) Joule, D) Pascal");
        answers.add("A) Newton");

        questions.add("Which type of mirror always forms a virtual image?");
        options.add("A) Concave mirror, B) Convex mirror, C) Plane mirror, D) Spherical mirror");
        answers.add("C) Plane mirror");

        questions.add("What is the SI unit of electric charge?");
        options.add("A) Ampere, B) Coulomb, C) Volt, D) Ohm");
        answers.add("B) Coulomb");

        questions.add("Which law states that energy cannot be created or destroyed, only transformed from one form to another?");
        options.add("A) Newton's First Law, B) Boyle's Law, C) Law of Conservation of Energy, D) Kepler's Law");
        answers.add("C) Law of Conservation of Energy");

        questions.add("What is the unit of measure of electric potential difference?");
        options.add("A) Ampere, B) Ohm, C) Volt, D) Watt");
        answers.add("C) Volt");

        questions.add("Which law states that the total pressure exerted by a mixture of gases is equal to the sum of the partial pressures of the gases in the mixture?");
        options.add("A) Boyle's Law, B) Charles's Law, C) Dalton's Law, D) Avogadro's Law");
        answers.add("C) Dalton's Law");

        questions.add("What is the SI unit of magnetic flux?");
        options.add("A) Weber, B) Tesla, C) Henry, D) Coulomb");
        answers.add("A) Weber");

        questions.add("Which phenomenon explains why a straw appears broken when placed in a glass of water?");
        options.add("A) Reflection, B) Refraction, C) Diffraction, D) Interference");
        answers.add("B) Refraction");

        questions.add("What is the SI unit of capacitance?");
        options.add("A) Ohm, B) Farad, C) Weber, D) Volt");
        answers.add("B) Farad");

        questions.add("Which law states that for every action, there is an equal and opposite reaction?");
        options.add("A) Newton's First Law, B) Newton's Second Law, C) Newton's Third Law, D) Kepler's Law");
        answers.add("C) Newton's Third Law");

        questions.add("What is the SI unit of magnetic field strength?");
        options.add("A) Ampere, B) Weber, C) Tesla, D) Henry");
        answers.add("C) Tesla");

        questions.add("Which type of lens is thicker at the center than at the edges?");
        options.add("A) Convex lens, B) Concave lens, C) Biconcave lens, D) Plano-convex lens");
        answers.add("A) Convex lens");

        questions.add("What is the SI unit of inductance?");
        options.add("A) Farad, B) Weber, C) Tesla, D) Henry");
        answers.add("D) Henry");

        questions.add("Which law states that the volume of a given mass of gas is inversely proportional to its pressure, provided its temperature remains constant?");
        options.add("A) Boyle's Law, B) Charles's Law, C) Gay-Lussac's Law, D) Avogadro's Law");
        answers.add("A) Boyle's Law");

        questions.add("What is the SI unit of momentum?");
        options.add("A) Newton-second, B) Joule, C) Watt, D) Pascal");
        answers.add("A) Newton-second");

        questions.add("Which phenomenon causes the colors observed in soap bubbles?");
        options.add("A) Reflection, B) Refraction, C) Diffraction, D) Interference");
        answers.add("D) Interference");

        questions.add("What is the SI unit of frequency?");
        options.add("A) Hertz, B) Newton, C) Pascal, D) Volt");
        answers.add("A) Hertz");

        questions.add("Which law states that the pressure of a gas is directly proportional to its absolute temperature, provided its volume remains constant?");
        options.add("A) Boyle's Law, B) Charles's Law, C) Gay-Lussac's Law, D) Avogadro's Law");
        answers.add("B) Charles's Law");

        questions.add("What is the SI unit of magnetic flux density?");
        options.add("A) Ampere, B) Weber, C) Tesla, D) Henry");
        answers.add("C) Tesla");

        questions.add("Which type of wave does not require a medium to propagate?");
        options.add("A) Transverse wave, B) Longitudinal wave, C) Electromagnetic wave, D) Sound wave");
        answers.add("C) Electromagnetic wave");

        questions.add("What is the SI unit of resistance?");
        options.add("A) Ohm, B) Volt, C) Ampere, D) Watt");
        answers.add("A) Ohm");

        questions.add("Which law states that the total electric flux through a closed surface is equal to the net electric charge enclosed by the surface divided by the permittivity of free space?");
        options.add("A) Gauss's Law, B) Coulomb's Law, C) Faraday's Law, D) Ohm's Law");
        answers.add("A) Gauss's Law");

        questions.add("What is the SI unit of work and energy?");
        options.add("A) Watt, B) Joule, C) Newton, D) Volt");
        answers.add("B) Joule");

        questions.add("Which law states that the force between two parallel current-carrying conductors is directly proportional to the product of their currents and inversely proportional to the distance between them?");
        options.add("A) Ampere's Law, B) Coulomb's Law, C) Faraday's Law, D) Ohm's Law");
        answers.add("A) Ampere's Law");

        questions.add("What is the SI unit of temperature?");
        options.add("A) Kelvin, B) Celsius, C) Fahrenheit, D) Joule");
        answers.add("A) Kelvin");

        questions.add("Which phenomenon explains why stars twinkle?");
        options.add("A) Reflection, B) Refraction, C) Diffraction, D) Interference");
        answers.add("B) Refraction");

        questions.add("What is the SI unit of pressure?");
        options.add("A) Pascal, B) Newton, C) Joule, D) Watt");
        answers.add("A) Pascal");

        questions.add("Which law states that the rate of effusion of a gas through a small hole is inversely proportional to the square root of its molar mass?");
        options.add("A) Graham's Law, B) Boyle's Law, C) Charles's Law, D) Avogadro's Law");
        answers.add("A) Graham's Law");

        questions.add("What is the SI unit of electric field strength?");
        options.add("A) Volt, B) Ampere, C) Coulomb, D) Newton per coulomb");
        answers.add("D) Newton per coulomb");

        questions.add("Which type of mirror is used by dentists to see a magnified image of the teeth?");
        options.add("A) Concave mirror, B) Convex mirror, C) Plane mirror, D) Spherical mirror");
        answers.add("A) Concave mirror");

        questions.add("What is the SI unit of magnetic pole strength?");
        options.add("A) Ampere, B) Weber, C) Tesla, D) Ampere-meter");
        answers.add("A) Ampere");

        questions.add("Which law states that the total electric charge within a closed system remains constant over time?");
        options.add("A) Gauss's Law, B) Coulomb's Law, C) Faraday's Law, D) Law of Conservation of Charge");
        answers.add("D) Law of Conservation of Charge");

        questions.add("What is the SI unit of angular velocity?");
        options.add("A) Hertz, B) Radian per second, C) Newton, D) Pascal");
        answers.add("B) Radian per second");

        questions.add("Which law states that the force of attraction or repulsion between two point charges is directly proportional to the product of their charges and inversely proportional to the square of the distance between them?");
        options.add("A) Ohm's Law, B) Coulomb's Law, C) Newton's First Law, D) Kepler's Law");
        answers.add("B) Coulomb's Law");

        questions.add("What is the SI unit of angular momentum?");
        options.add("A) Joule-second, B) Newton-meter, C) Pascal-second, D) Joule");
        answers.add("A) Joule-second");

        questions.add("Which phenomenon causes the bending of light waves around obstacles?");
        options.add("A) Reflection, B) Refraction, C) Diffraction, D) Interference");
        answers.add("C) Diffraction");

        questions.add("What is the SI unit of magnetic moment?");
        options.add("A) Ampere, B) Weber, C) Tesla, D) Ampere-meter squared");
        answers.add("D) Ampere-meter squared");

        questions.add("Which type of lens is thinner at the center than at the edges?");
        options.add("A) Concave lens, B) Convex lens, C) Biconcave lens, D) Plano-convex lens");
        answers.add("A) Concave lens");

        questions.add("What is the SI unit of electric potential?");
        options.add("A) Ampere, B) Ohm, C) Volt, D) Watt");
        answers.add("C) Volt");

        questions.add("Which law states that the current flowing through a conductor is directly proportional to the potential difference across its ends, provided its temperature remains constant?");
        options.add("A) Boyle's Law, B) Charles's Law, C) Ohm's Law, D) Avogadro's Law");
        answers.add("C) Ohm's Law");

        questions.add("What is the SI unit of magnetic susceptibility?");
        options.add("A) Tesla, B) Henry, C) Weber, D) Dimensionless");
        answers.add("D) Dimensionless");

        questions.add("Which law states that the angle of incidence is equal to the angle of reflection?");
        options.add("A) Newton's First Law, B) Coulomb's Law, C) Snell's Law, D) Law of Reflection");
        answers.add("D) Law of Reflection");

        questions.add("What is the SI unit of electric conductance?");
        options.add("A) Ohm, B) Farad, C) Siemens, D) Coulomb");
        answers.add("C) Siemens");

        questions.add("Which phenomenon occurs when two or more waves overlap and combine to form a new wave pattern?");
        options.add("A) Reflection, B) Refraction, C) Diffraction, D) Interference");
        answers.add("D) Interference");

}
    
 
    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
    }
    
    public static void main(String[]args){
        new Physics_Quiz(name).setVisible(true);
    }
    
}