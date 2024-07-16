package secondListFrames;

/**
 * @author MuhammadHasnatRasool
 */
import frame.Quiz;


public class Earth_Quiz extends Quiz{
    

    public Earth_Quiz(String name) {
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

// 50 questions
  
    @Override
    public final void loadQuestions() {
       
        questions.add("What is the approximate age of the Earth?");
        options.add("A) 4.6 billion years, B) 2.3 billion years, C) 10,000 years, D) 1 million years");
        answers.add("A) 4.6 billion years");

        questions.add("Which layer of the Earth is composed mostly of iron and nickel?");
        options.add("A) Crust, B) Mantle, C) Outer core, D) Inner core");
        answers.add("D) Inner core");

        questions.add("What is the name of the theory that describes the movement and interactions of Earth's lithospheric plates?");
        options.add("A) Big Bang Theory, B) Plate Tectonics Theory, C) Geothermal Theory, D) Continental Drift Theory");
        answers.add("B) Plate Tectonics Theory");

        questions.add("Which gas makes up the majority of Earth's atmosphere?");
        options.add("A) Nitrogen, B) Oxygen, C) Carbon dioxide, D) Argon");
        answers.add("A) Nitrogen");

        questions.add("What is the outermost layer of the Earth called?");
        options.add("A) Crust, B) Mantle, C) Core, D) Asthenosphere");
        answers.add("A) Crust");

        questions.add("Which layer of the Earth is responsible for generating its magnetic field?");
        options.add("A) Mantle, B) Outer core, C) Crust, D) Inner core");
        answers.add("B) Outer core");

        questions.add("What is the name of the supercontinent that existed about 200 million years ago?");
        options.add("A) Pangaea, B) Gondwana, C) Laurasia, D) Rodinia");
        answers.add("A) Pangaea");

        questions.add("Which process is responsible for the formation of mountains?");
        options.add("A) Erosion, B) Subduction, C) Volcanism, D) Orogeny");
        answers.add("D) Orogeny");

        questions.add("What is the layer of gases immediately surrounding the Earth called?");
        options.add("A) Mesosphere, B) Stratosphere, C) Troposphere, D) Atmosphere");
        answers.add("D) Atmosphere");

        questions.add("Which natural satellite orbits the Earth?");
        options.add("A) Phobos, B) Io, C) Luna, D) Titan");
        answers.add("C) Luna");

        questions.add("What is the name of the large, circular depression on the Moon's surface caused by an impact?");
        options.add("A) Crater, B) Mare, C) Valley, D) Ridge");
        answers.add("A) Crater");

        questions.add("Which layer of the Earth's atmosphere contains the ozone layer?");
        options.add("A) Troposphere, B) Mesosphere, C) Stratosphere, D) Thermosphere");
        answers.add("C) Stratosphere");

        questions.add("What is the name of the process by which water vapor changes into liquid water?");
        options.add("A) Sublimation, B) Condensation, C) Evaporation, D) Precipitation");
        answers.add("B) Condensation");

        questions.add("Which layer of the Earth's atmosphere is characterized by its extreme cold temperatures?");
        options.add("A) Stratosphere, B) Mesosphere, C) Thermosphere, D) Troposphere");
        answers.add("B) Mesosphere");

        questions.add("What is the name of the largest ocean on Earth?");
        options.add("A) Atlantic Ocean, B) Indian Ocean, C) Pacific Ocean, D) Arctic Ocean");
        answers.add("C) Pacific Ocean");

        questions.add("Which layer of the Earth's atmosphere is closest to space?");
        options.add("A) Troposphere, B) Stratosphere, C) Mesosphere, D) Thermosphere");
        answers.add("D) Thermosphere");

        questions.add("What is the process by which rocks are broken down into smaller particles by wind, water, or ice?");
        options.add("A) Subduction, B) Erosion, C) Orogeny, D) Weathering");
        answers.add("D) Weathering");

        questions.add("Which phenomenon occurs when warm air rises and cooler air sinks, causing circular motion in the atmosphere?");
        options.add("A) Tornado, B) Hurricane, C) Tidal wave, D) Convection");
        answers.add("D) Convection");

        questions.add("What is the name of the dense, hot layer of semi-solid rock beneath the Earth's crust?");
        options.add("A) Asthenosphere, B) Mantle, C) Lithosphere, D) Mesosphere");
        answers.add("A) Asthenosphere");

        questions.add("Which phenomenon is responsible for the bending of light as it passes through different mediums?");
        options.add("A) Reflection, B) Refraction, C) Dispersion, D) Diffraction");
        answers.add("B) Refraction");

        questions.add("What is the name of the process by which plants release water vapor through their leaves?");
        options.add("A) Evaporation, B) Transpiration, C) Condensation, D) Precipitation");
        answers.add("B) Transpiration");

        questions.add("Which layer of the Earth's atmosphere is home to the ozone layer?");
        options.add("A) Troposphere, B) Mesosphere, C) Stratosphere, D) Thermosphere");
        answers.add("C) Stratosphere");

        questions.add("What is the name of the process by which water seeps into the ground and becomes groundwater?");
        options.add("A) Infiltration, B) Absorption, C) Percolation, D) Evaporation");
        answers.add("A) Infiltration");

        questions.add("Which type of rock forms from the cooling and solidification of magma or lava?");
        options.add("A) Sedimentary rock, B) Metamorphic rock, C) Igneous rock, D) Crystalline rock");
        answers.add("C) Igneous rock");

        questions.add("What is the name of the layer of soil that contains organic matter and is rich in nutrients?");
        options.add("A) Topsoil, B) Subsoil, C) Bedrock, D) Horizon");
        answers.add("A) Topsoil");

        questions.add("Which layer of the Earth's atmosphere is characterized by the presence of the ionosphere?");
        options.add("A) Mesosphere, B) Stratosphere, C) Thermosphere, D) Exosphere");
        answers.add("C) Thermosphere");

        questions.add("What is the name of the process by which rocks are transformed by heat and pressure?");
        options.add("A) Erosion, B) Weathering, C) Metamorphism, D) Melting");
        answers.add("C) Metamorphism");

        questions.add("Which natural satellite of Earth has the strongest tidal influence?");
        options.add("A) Phobos, B) Io, C) Luna, D) Europa");
        answers.add("C) Luna");

        questions.add("What is the name of the layer of the Earth's atmosphere where weather occurs?");
        options.add("A) Troposphere, B) Stratosphere, C) Mesosphere, D) Thermosphere");
        answers.add("A) Troposphere");

        questions.add("Which layer of the Earth's atmosphere is the coldest?");
        options.add("A) Troposphere, B) Mesosphere, C) Stratosphere, D) Thermosphere");
        answers.add("B) Mesosphere");

        questions.add("What is the name of the process by which sediments are deposited by wind, water, or ice?");
        options.add("A) Weathering, B) Erosion, C) Deposition, D) Sublimation");
        answers.add("C) Deposition");

        questions.add("Which layer of the Earth's atmosphere is where the Northern Lights (Aurora Borealis) occur?");
        options.add("A) Thermosphere, B) Mesosphere, C) Stratosphere, D) Troposphere");
        answers.add("A) Thermosphere");

        questions.add("What is the name of the process by which carbon dioxide is taken up by plants during photosynthesis?");
        options.add("A) Respiration, B) Absorption, C) Fixation, D) Assimilation");
        answers.add("C) Fixation");

        questions.add("Which geological feature is a large depression typically formed by the collapse of a volcano?");
        options.add("A) Caldera, B) Crater, C) Fissure, D) Dome");
        answers.add("A) Caldera");

        questions.add("What is the name of the layer of soil directly below the topsoil?");
        options.add("A) Subsoil, B) Bedrock, C) Horizon, D) Regolith");
        answers.add("A) Subsoil");

        questions.add("Which layer of the Earth's atmosphere contains the ozone layer that absorbs UV radiation?");
        options.add("A) Troposphere, B) Mesosphere, C) Stratosphere, D) Thermosphere");
        answers.add("C) Stratosphere");

        questions.add("What is the name of the process by which rocks are physically broken down into smaller pieces?");
        options.add("A) Erosion, B) Weathering, C) Deposition, D) Sedimentation");
        answers.add("B) Weathering");

        questions.add("Which natural satellite of Earth is the largest relative to the size of its planet?");
        options.add("A) Luna, B) Ganymede, C) Titan, D) Callisto");
        answers.add("A) Luna");

        questions.add("What is the name of the process by which water moves over the land and back into rivers, lakes, or oceans?");
        options.add("A) Erosion, B) Evaporation, C) Runoff, D) Precipitation");
        answers.add("C) Runoff");

        questions.add("Which layer of the Earth's atmosphere is where most weather phenomena occur?");
        options.add("A) Stratosphere, B) Troposphere, C) Mesosphere, D) Thermosphere");
        answers.add("B) Troposphere");

        questions.add("What is the name of the layer of soil that consists of weathered rock fragments?");
        options.add("A) Subsoil, B) Bedrock, C) Horizon, D) Regolith");
        answers.add("D) Regolith");

        questions.add("Which layer of the Earth's atmosphere is characterized by its extremely low air pressure?");
        options.add("A) Mesosphere, B) Stratosphere, C) Thermosphere, D) Exosphere");
        answers.add("D) Exosphere");

        questions.add("What is the name of the process by which plants and animals release carbon dioxide?");
        options.add("A) Assimilation, B) Photosynthesis, C) Respiration, D) Decomposition");
        answers.add("C) Respiration");

        questions.add("Which geological feature is a long crack in the Earth's crust through which magma erupts?");
        options.add("A) Caldera, B) Crater, C) Fissure, D) Dome");
        answers.add("C) Fissure");

        questions.add("What is the name of the layer of soil that consists of weathered parent material?");
        options.add("A) Topsoil, B) Subsoil, C) Horizon, D) Regolith");
        answers.add("B) Subsoil");

        questions.add("Which layer of the Earth's atmosphere is where satellites orbit?");
        options.add("A) Troposphere, B) Mesosphere, C) Stratosphere, D) Thermosphere");
        answers.add("D) Thermosphere");

        questions.add("What is the name of the process by which water changes from a liquid to a gas?");
        options.add("A) Sublimation, B) Condensation, C) Evaporation, D) Precipitation");
        answers.add("C) Evaporation");

        questions.add("Which type of rock forms from the alteration of existing rock through heat and pressure?");
        options.add("A) Igneous rock, B) Sedimentary rock, C) Metamorphic rock, D) Crystalline rock");
        answers.add("C) Metamorphic rock");

        questions.add("What is the name of the layer of soil that consists of solid rock?");
        options.add("A) Horizon, B) Topsoil, C) Bedrock, D) Regolith");
        answers.add("C) Bedrock");

        questions.add("Which layer of the Earth's atmosphere is characterized by its extremely high temperatures?");
        options.add("A) Troposphere, B) Stratosphere, C) Thermosphere, D) Mesosphere");
        answers.add("C) Thermosphere");

    }

    
    public static void main(String[]args){
        new Earth_Quiz(name).setVisible(true);
    }
    
}
