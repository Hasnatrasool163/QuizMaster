package thirdListFrames;

/**
 * @author MuhammadHasnatRasool
 */
import frame.Quiz;
import java.awt.event.ActionEvent;

public class Biology_Quiz extends Quiz{
    

    public Biology_Quiz(String name) {
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
       questions.add("Which organelle is known as the powerhouse of the cell?");
        options.add("A) Nucleus, B) Golgi apparatus, C) Mitochondrion, D) Endoplasmic reticulum");
        answers.add("C) Mitochondrion");

        questions.add("What is the process by which green plants make their own food?");
        options.add("A) Respiration, B) Digestion, C) Photosynthesis, D) Fermentation");
        answers.add("C) Photosynthesis");

        questions.add("Which gas do plants absorb from the atmosphere during photosynthesis?");
        options.add("A) Oxygen, B) Carbon dioxide, C) Nitrogen, D) Hydrogen");
        answers.add("B) Carbon dioxide");

        questions.add("What is the basic unit of structure and function in an organism?");
        options.add("A) Cell, B) Tissue, C) Organ, D) Organism");
        answers.add("A) Cell");

        questions.add("Which part of the plant conducts water and nutrients from the roots to other parts of the plant?");
        options.add("A) Stamen, B) Petal, C) Stem, D) Leaf");
        answers.add("C) Stem");

        questions.add("What is the pigment responsible for the green color of plants?");
        options.add("A) Chlorophyll, B) Carotenoid, C) Melanin, D) Hemoglobin");
        answers.add("A) Chlorophyll");

        questions.add("Which type of blood vessel carries blood away from the heart?");
        options.add("A) Artery, B) Vein, C) Capillary, D) Venuole");
        answers.add("A) Artery");

        questions.add("Which part of the digestive system is primarily responsible for water absorption?");
        options.add("A) Stomach, B) Small intestine, C) Large intestine, D) Liver");
        answers.add("C) Large intestine");

        questions.add("Which human body system is responsible for protecting against pathogens?");
        options.add("A) Muscular system, B) Nervous system, C) Immune system, D) Endocrine system");
        answers.add("C) Immune system");

        questions.add("What is the process by which cells divide to produce new cells?");
        options.add("A) Fertilization, B) Meiosis, C) Mitosis, D) Apoptosis");
        answers.add("C) Mitosis");

        questions.add("Which type of cell lacks a nucleus?");
        options.add("A) Eukaryotic cell, B) Prokaryotic cell, C) Plant cell, D) Animal cell");
        answers.add("B) Prokaryotic cell");

        questions.add("Which molecule stores genetic information in cells?");
        options.add("A) DNA, B) RNA, C) ATP, D) Protein");
        answers.add("A) DNA");

        questions.add("Which organ is responsible for filtering blood and producing urine?");
        options.add("A) Liver, B) Kidney, C) Lung, D) Pancreas");
        answers.add("B) Kidney");

        questions.add("What is the longest bone in the human body?");
        options.add("A) Femur, B) Tibia, C) Humerus, D) Radius");
        answers.add("A) Femur");

        questions.add("Which type of joint allows for the greatest range of motion?");
        options.add("A) Ball and socket joint, B) Hinge joint, C) Pivot joint, D) Fixed joint");
        answers.add("A) Ball and socket joint");

        questions.add("What is the main function of red blood cells?");
        options.add("A) Transporting oxygen, B) Fighting infections, C) Producing hormones, D) Storing energy");
        answers.add("A) Transporting oxygen");

        questions.add("Which part of the brain controls balance and coordination?");
        options.add("A) Cerebrum, B) Cerebellum, C) Medulla oblongata, D) Hypothalamus");
        answers.add("B) Cerebellum");

        questions.add("What is the name of the process by which cells convert glucose into energy?");
        options.add("A) Photosynthesis, B) Respiration, C) Fermentation, D) Synthesis");
        answers.add("B) Respiration");

        questions.add("Which type of muscle is striated and under voluntary control?");
        options.add("A) Cardiac muscle, B) Smooth muscle, C) Skeletal muscle, D) Involuntary muscle");
        answers.add("C) Skeletal muscle");

        questions.add("What is the name of the sac that surrounds and protects the heart?");
        options.add("A) Peritoneum, B) Pericardium, C) Pleura, D) Epithelium");
        answers.add("B) Pericardium");

        questions.add("Which hormone is responsible for regulating blood sugar levels in the body?");
        options.add("A) Insulin, B) Glucagon, C) Thyroxine, D) Estrogen");
        answers.add("A) Insulin");

        questions.add("What is the largest organ of the human body?");
        options.add("A) Liver, B) Skin, C) Brain, D) Heart");
        answers.add("B) Skin");

        questions.add("Which part of the eye controls the amount of light entering the eye?");
        options.add("A) Retina, B) Lens, C) Cornea, D) Iris");
        answers.add("D) Iris");

        questions.add("What is the name of the process by which plants release water vapor through their leaves?");
        options.add("A) Photosynthesis, B) Transpiration, C) Respiration, D) Evaporation");
        answers.add("B) Transpiration");

        questions.add("Which type of plant tissue transports water and nutrients from the roots to the rest of the plant?");
        options.add("A) Dermal tissue, B) Vascular tissue, C) Ground tissue, D) Epidermal tissue");
        answers.add("B) Vascular tissue");

        questions.add("What is the name of the fluid that fills the spaces in the brain and spinal cord?");
        options.add("A) Cerebrospinal fluid, B) Synovial fluid, C) Lymph, D) Mucus");
        answers.add("A) Cerebrospinal fluid");

        questions.add("Which structure in the respiratory system prevents food from entering the trachea?");
        options.add("A) Pharynx, B) Epiglottis, C) Larynx, D) Bronchus");
        answers.add("B) Epiglottis");

        questions.add("What is the name of the process by which an organism develops from a fertilized egg?");
        options.add("A) Fertilization, B) Meiosis, C) Mitosis, D) Embryogenesis");
        answers.add("D) Embryogenesis");

        questions.add("Which type of biomolecule is used by the body as a source of quick energy?");
        options.add("A) Protein, B) Lipid, C) Carbohydrate, D) Nucleic acid");
        answers.add("C) Carbohydrate");

        questions.add("What is the name of the part of the neuron that transmits signals to other cells?");
        options.add("A) Axon, B) Dendrite, C) Cell body, D) Synapse");
        answers.add("A) Axon");

        questions.add("Which part of the flower contains the pollen grains?");
        options.add("A) Pistil, B) Sepal, C) Stamen, D) Petal");
        answers.add("C) Stamen");

        questions.add("What is the name of the hormone that regulates the sleep-wake cycle?");
        options.add("A) Melatonin, B) Adrenaline, C) Serotonin, D) Dopamine");
        answers.add("A) Melatonin");

        questions.add("Which human body system includes the kidneys and bladder?");
        options.add("A) Digestive system, B) Respiratory system, C) Urinary system, D) Endocrine system");
        answers.add("C) Urinary system");

        questions.add("What is the name of the process by which plants convert light energy into chemical energy?");
        options.add("A) Respiration, B) Fermentation, C) Photosynthesis, D) Synthesis");
        answers.add("C) Photosynthesis");

        questions.add("Which blood type is known as the universal donor?");
        options.add("A) A, B) B, C) AB, D) O");
        answers.add("D) O");

        questions.add("What is the name of the bone located in the upper arm?");
        options.add("A) Femur, B) Humerus, C) Radius, D) Ulna");
        answers.add("B) Humerus");

        questions.add("Which gland in the human body regulates metabolism?");
        options.add("A) Thyroid gland, B) Pituitary gland, C) Adrenal gland, D) Pancreas");
        answers.add("A) Thyroid gland");

        questions.add("What is the name of the process by which green plants respire?");
        options.add("A) Aerobic respiration, B) Anaerobic respiration, C) Photorespiration, D) Photolysis");
        answers.add("A) Aerobic respiration");

        questions.add("Which part of the human brain controls voluntary movements and coordination?");
        options.add("A) Cerebrum, B) Cerebellum, C) Medulla oblongata, D) Hypothalamus");
        answers.add("A) Cerebrum");

        questions.add("What is the name of the protein responsible for oxygen transport in red blood cells?");
        options.add("A) Hemoglobin, B) Insulin, C) Collagen, D) Keratin");
        answers.add("A) Hemoglobin");

        questions.add("Which type of cell is specialized for detecting light?");
        options.add("A) Rod cell, B) Cone cell, C) Ganglion cell, D) Bipolar cell");
        answers.add("B) Cone cell");

        questions.add("What is the name of the fluid that lubricates the joints?");
        options.add("A) Cerebrospinal fluid, B) Synovial fluid, C) Lymph, D) Mucus");
        answers.add("B) Synovial fluid");

        questions.add("Which type of blood vessel carries blood towards the heart?");
        options.add("A) Artery, B) Vein, C) Capillary, D) Venule");
        answers.add("B) Vein");

        questions.add("What is the name of the structure that connects the muscles to bones?");
        options.add("A) Tendon, B) Ligament, C) Cartilage, D) Synapse");
        answers.add("A) Tendon");

        questions.add("Which type of cell is responsible for producing antibodies?");
        options.add("A) T cell, B) B cell, C) Neutrophil, D) Eosinophil");
        answers.add("B) B cell");

        questions.add("What is the name of the process by which plants absorb water through their roots?");
        options.add("A) Osmosis, B) Diffusion, C) Active transport, D) Transpiration");
        answers.add("C) Active transport");

        questions.add("Which part of the human eye changes shape to focus light?");
        options.add("A) Cornea, B) Lens, C) Retina, D) Iris");
        answers.add("B) Lens");

        questions.add("What is the name of the process by which a caterpillar transforms into a butterfly?");
        options.add("A) Metamorphosis, B) Photosynthesis, C) Respiration, D) Fermentation");
        answers.add("A) Metamorphosis");

        questions.add("Which structure in the human ear detects sound vibrations?");
        options.add("A) Cochlea, B) Eustachian tube, C) Tympanic membrane, D) Auditory nerve");
        answers.add("A) Cochlea");

        questions.add("What is the name of the process by which DNA makes an RNA copy?");
        options.add("A) Translation, B) Replication, C) Transcription, D) Mutation");
        answers.add("C) Transcription");
    }
    
 
    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
    }
    
    public static void main(String[]args){
        new Biology_Quiz(name).setVisible(true);
    }
    
}
