package thirdListFrames;

/**
 * @author MuhammadHasnatRasool
 */
import frame.Quiz;
import java.awt.event.ActionEvent;



public class Chemistry_Quiz extends Quiz{
    

    public Chemistry_Quiz(String name) {
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


  // questions:50
    @Override
    public final void loadQuestions() {
       
        questions.add("What is the chemical symbol for gold?");
        options.add("A) Au, B) Ag, C) Pt, D) Hg");
        answers.add("A) Au");

        questions.add("What is the atomic number of oxygen?");
        options.add("A) 6, B) 7, C) 8, D) 9");
        answers.add("C) 8");

        questions.add("Which gas is produced when hydrochloric acid reacts with zinc?");
        options.add("A) Hydrogen, B) Oxygen, C) Chlorine, D) Nitrogen");
        answers.add("A) Hydrogen");

        questions.add("What is the chemical formula for methane?");
        options.add("A) CH4, B) CO2, C) H2O, D) NH3");
        answers.add("A) CH4");

        questions.add("Which element is a halogen?");
        options.add("A) Fluorine, B) Iron, C) Sodium, D) Calcium");
        answers.add("A) Fluorine");

        questions.add("What is the pH of a solution with a hydrogen ion concentration of 1 x 10^-3 M?");
        options.add("A) 1, B) 3, C) 7, D) 9");
        answers.add("B) 3");

        questions.add("What is the chemical formula for sodium chloride?");
        options.add("A) NaCl, B) NaOH, C) HCl, D) Na2CO3");
        answers.add("A) NaCl");

        questions.add("Which gas is essential for respiration in humans?");
        options.add("A) Nitrogen, B) Oxygen, C) Carbon dioxide, D) Hydrogen");
        answers.add("B) Oxygen");

        questions.add("What type of bond is formed between sodium and chlorine in sodium chloride?");
        options.add("A) Covalent bond, B) Ionic bond, C) Metallic bond, D) Hydrogen bond");
        answers.add("B) Ionic bond");

        questions.add("What is the chemical formula for sulfuric acid?");
        options.add("A) H2SO4, B) HCl, C) HNO3, D) H3PO4");
        answers.add("A) H2SO4");

        questions.add("Which element is present in all organic compounds?");
        options.add("A) Oxygen, B) Carbon, C) Nitrogen, D) Hydrogen");
        answers.add("B) Carbon");

        questions.add("What is the chemical formula for water?");
        options.add("A) H2O, B) CO2, C) NaCl, D) NH3");
        answers.add("A) H2O");

        questions.add("Which type of bond involves the sharing of electrons between atoms?");
        options.add("A) Ionic bond, B) Covalent bond, C) Metallic bond, D) Hydrogen bond");
        answers.add("B) Covalent bond");

        questions.add("What is the chemical symbol for iron?");
        options.add("A) Fe, B) Ir, C) In, D) Io");
        answers.add("A) Fe");

        questions.add("Which gas is produced during photosynthesis?");
        options.add("A) Oxygen, B) Carbon dioxide, C) Hydrogen, D) Nitrogen");
        answers.add("A) Oxygen");

        questions.add("What is the chemical formula for ammonia?");
        options.add("A) NH3, B) N2, C) NO2, D) N2O");
        answers.add("A) NH3");

        questions.add("What is the process of converting a solid directly to a gas called?");
        options.add("A) Sublimation, B) Evaporation, C) Condensation, D) Deposition");
        answers.add("A) Sublimation");

        questions.add("What is the chemical formula for hydrogen peroxide?");
        options.add("A) H2O, B) H2O2, C) HO, D) H2CO3");
        answers.add("B) H2O2");

        questions.add("Which element is commonly added to steel to make it stainless?");
        options.add("A) Nickel, B) Chromium, C) Zinc, D) Copper");
        answers.add("B) Chromium");

        questions.add("What is the chemical formula for carbon dioxide?");
        options.add("A) CO, B) CO2, C) CH4, D) C6H12O6");
        answers.add("B) CO2");

        questions.add("Which gas gives vinegar its characteristic odor?");
        options.add("A) Oxygen, B) Nitrogen, C) Hydrogen, D) Carbon dioxide");
        answers.add("C) Hydrogen");

        questions.add("What is the main component of natural gas?");
        options.add("A) Methane, B) Ethane, C) Propane, D) Butane");
        answers.add("A) Methane");

        questions.add("What is the chemical formula for table salt?");
        options.add("A) NaCl, B) HCl, C) NaOH, D) Na2CO3");
        answers.add("A) NaCl");

        questions.add("Which type of reaction releases energy?");
        options.add("A) Endothermic, B) Exothermic, C) Redox, D) Acid-base");
        answers.add("B) Exothermic");

        questions.add("Which type of bond is formed when electrons are completely transferred from one atom to another?");
        options.add("A) Covalent bond, B) Ionic bond, C) Metallic bond, D) Hydrogen bond");
        answers.add("B) Ionic bond");

        questions.add("Which element is commonly found in proteins?");
        options.add("A) Iron, B) Carbon, C) Nitrogen, D) Oxygen");
        answers.add("C) Nitrogen");

        questions.add("What is the chemical formula for hydrogen chloride gas?");
        options.add("A) H2SO4, B) HCl, C) HNO3, D) H3PO4");
        answers.add("B) HCl");

        questions.add("Which gas is used in the manufacture of ammonia?");
        options.add("A) Oxygen, B) Nitrogen, C) Hydrogen, D) Carbon dioxide");
        answers.add("C) Hydrogen");

        questions.add("What is the chemical formula for sulfur dioxide?");
        options.add("A) SO2, B) SO3, C) H2SO4, D) H2S");
        answers.add("A) SO2");

        questions.add("What is the chemical formula for acetic acid?");
        options.add("A) H2SO4, B) HCl, C) CH3COOH, D) NaOH");
        answers.add("C) CH3COOH");

        questions.add("Which gas is used in soda drinks to give them fizz?");
        options.add("A) Nitrogen, B) Oxygen, C) Carbon dioxide, D) Helium");
        answers.add("C) Carbon dioxide");

        questions.add("What is the chemical formula for nitric acid?");
        options.add("A) H2SO4, B) HCl, C) HNO3, D) H3PO4");
        answers.add("C) HNO3");

        questions.add("Which element is used in fluorescent light bulbs?");
        options.add("A) Neon, B) Mercury, C) Argon, D) Krypton");
        answers.add("B) Mercury");

        questions.add("What is the chemical formula for sodium hydroxide?");
        options.add("A) NaOH, B) Na2CO3, C) NaCl, D) Na2SO4");
        answers.add("A) NaOH");

        questions.add("Which type of reaction absorbs energy?");
        options.add("A) Exothermic, B) Endothermic, C) Redox, D) Acid-base");
        answers.add("B) Endothermic");

        questions.add("What is the chemical formula for calcium carbonate?");
        options.add("A) CaCO3, B) CaCl2, C) Ca(OH)2, D) CaSO4");
        answers.add("A) CaCO3");

        questions.add("Which gas is used in welding to shield the weld area from atmospheric gases?");
        options.add("A) Oxygen, B) Nitrogen, C) Argon, D) Carbon dioxide");
        answers.add("C) Argon");

        questions.add("What is the chemical formula for hydrogen sulfide?");
        options.add("A) H2SO4, B) HCl, C) H2S, D) H3PO4");
        answers.add("C) H2S");

        questions.add("Which gas is responsible for the brown color of photochemical smog?");
        options.add("A) Nitrogen dioxide, B) Carbon dioxide, C) Sulfur dioxide, D) Ozone");
        answers.add("A) Nitrogen dioxide");

        questions.add("What is the chemical formula for phosphoric acid?");
        options.add("A) H2SO4, B) HCl, C) HNO3, D) H3PO4");
        answers.add("D) H3PO4");

        questions.add("Which element is added to gasoline to boost its octane rating?");
        options.add("A) Lead, B) Carbon, C) Oxygen, D) Nitrogen");
        answers.add("A) Lead");

        questions.add("What is the chemical formula for hydrogen cyanide?");
        options.add("A) H2SO4, B) HCl, C) HCN, D) H3PO4");
        answers.add("C) HCN");

        questions.add("Which gas is produced during the reaction of an acid with a metal?");
        options.add("A) Oxygen, B) Carbon dioxide, C) Hydrogen, D) Nitrogen");
        answers.add("C) Hydrogen");

        questions.add("What is the chemical formula for ammonia?");
        options.add("A) NH3, B) N2, C) NO2, D) N2O");
        answers.add("A) NH3");

        questions.add("Which gas is used in the manufacture of margarine?");
        options.add("A) Oxygen, B) Nitrogen, C) Hydrogen, D) Carbon dioxide");
        answers.add("C) Hydrogen");

        questions.add("What is the chemical formula for benzene?");
        options.add("A) C6H12O6, B) CH4, C) C6H6, D) C2H5OH");
        answers.add("C) C6H6");

        questions.add("Which gas is produced during the fermentation of sugar?");
        options.add("A) Oxygen, B) Carbon dioxide, C) Hydrogen, D) Nitrogen");
        answers.add("B) Carbon dioxide");

        questions.add("What is the chemical formula for potassium permanganate?");
        options.add("A) KMnO4, B) K2Cr2O7, C) KCl, D) KNO3");
        answers.add("A) KMnO4");

        questions.add("Which element is a noble gas?");
        options.add("A) Helium, B) Hydrogen, C) Nitrogen, D) Oxygen");
        answers.add("A) Helium");

        questions.add("What is the chemical formula for calcium hydroxide?");
        options.add("A) CaCO3, B) CaCl2, C) Ca(OH)2, D) CaSO4");
        answers.add("C) Ca(OH)2");
    }
    
 
    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
    }
    
    public static void main(String[]args){
        new Chemistry_Quiz(name).setVisible(true);
    }
    
}
