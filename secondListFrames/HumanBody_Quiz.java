package secondListFrames;

import frame.Quiz;

/**
 * @author MuhammadHasnatRasool
 */

public class HumanBody_Quiz extends Quiz{
    

    public HumanBody_Quiz(String name) {
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

// questions: 50
    @Override
    public final void loadQuestions() {
        questions.add("Which organ is responsible for pumping blood throughout the body?");
        options.add("A) Liver, B) Heart, C) Kidney, D) Brain");
        answers.add("B) Heart");

        questions.add("What is the hardest substance in the human body?");
        options.add("A) Enamel, B) Bone, C) Cartilage, D) Dentin");
        answers.add("A) Enamel");

        questions.add("Which type of muscle is found in the walls of blood vessels?");
        options.add("A) Skeletal muscle, B) Smooth muscle, C) Cardiac muscle, D) Striated muscle");
        answers.add("B) Smooth muscle");

        questions.add("What is the largest organ in the human body?");
        options.add("A) Liver, B) Brain, C) Skin, D) Heart");
        answers.add("C) Skin");

        questions.add("Which hormone is responsible for regulating blood sugar levels?");
        options.add("A) Insulin, B) Estrogen, C) Testosterone, D) Thyroxine");
        answers.add("A) Insulin");

        questions.add("Which part of the brain controls balance and coordination?");
        options.add("A) Cerebrum, B) Cerebellum, C) Medulla oblongata, D) Hypothalamus");
        answers.add("B) Cerebellum");

        questions.add("What is the name of the process by which food is broken down in the stomach?");
        options.add("A) Absorption, B) Digestion, C) Assimilation, D) Peristalsis");
        answers.add("B) Digestion");

        questions.add("Which bone articulates with the humerus to form the elbow joint?");
        options.add("A) Radius, B) Ulna, C) Femur, D) Tibia");
        answers.add("B) Ulna");

        questions.add("What is the name of the tiny air sacs in the lungs where gas exchange occurs?");
        options.add("A) Alveoli, B) Bronchioles, C) Trachea, D) Diaphragm");
        answers.add("A) Alveoli");

        questions.add("Which part of the eye controls the amount of light entering?");
        options.add("A) Retina, B) Lens, C) Cornea, D) Iris");
        answers.add("D) Iris");

        questions.add("What is the name of the fluid that lubricates the joints?");
        options.add("A) Synovial fluid, B) Cerebrospinal fluid, C) Lymph, D) Mucus");
        answers.add("A) Synovial fluid");

        questions.add("Which organ produces bile to aid in digestion?");
        options.add("A) Liver, B) Pancreas, C) Gallbladder, D) Stomach");
        answers.add("A) Liver");

        questions.add("What is the name of the muscle that separates the chest cavity from the abdominal cavity?");
        options.add("A) Diaphragm, B) Pectoralis major, C) Rectus abdominis, D) Trapezius");
        answers.add("A) Diaphragm");

        questions.add("Which gland in the neck regulates metabolism?");
        options.add("A) Thyroid gland, B) Pituitary gland, C) Adrenal gland, D) Parathyroid gland");
        answers.add("A) Thyroid gland");

        questions.add("What is the name of the process by which blood cells are formed?");
        options.add("A) Osmosis, B) Hematopoiesis, C) Filtration, D) Perfusion");
        answers.add("B) Hematopoiesis");

        questions.add("Which type of blood vessel carries blood away from the heart?");
        options.add("A) Artery, B) Vein, C) Capillary, D) Venuole");
        answers.add("A) Artery");

        questions.add("What is the medical term for the voice box?");
        options.add("A) Larynx, B) Trachea, C) Pharynx, D) Epiglottis");
        answers.add("A) Larynx");

        questions.add("Which part of the digestive system is responsible for absorbing nutrients into the bloodstream?");
        options.add("A) Stomach, B) Small intestine, C) Large intestine, D) Esophagus");
        answers.add("B) Small intestine");

        questions.add("What is the name of the pigment that gives skin its color?");
        options.add("A) Melanin, B) Hemoglobin, C) Carotene, D) Collagen");
        answers.add("A) Melanin");

        questions.add("Which structure connects muscles to bones?");
        options.add("A) Ligament, B) Tendon, C) Cartilage, D) Synapse");
        answers.add("B) Tendon");

        questions.add("What is the name of the small, bean-shaped organs that filter lymph?");
        options.add("A) Kidneys, B) Spleen, C) Lymph nodes, D) Thymus");
        answers.add("C) Lymph nodes");

        questions.add("Which part of the brain regulates body temperature and hunger?");
        options.add("A) Cerebrum, B) Hypothalamus, C) Cerebellum, D) Medulla oblongata");
        answers.add("B) Hypothalamus");

        questions.add("What is the name of the process by which bones are connected to each other?");
        options.add("A) Ossification, B) Articulation, C) Contraction, D) Suturing");
        answers.add("B) Articulation");

        questions.add("Which organ is responsible for filtering blood and producing urine?");
        options.add("A) Liver, B) Kidney, C) Lung, D) Pancreas");
        answers.add("B) Kidney");

        questions.add("What is the name of the fluid that surrounds the brain and spinal cord?");
        options.add("A) Synovial fluid, B) Cerebrospinal fluid, C) Lymph, D) Mucus");
        answers.add("B) Cerebrospinal fluid");

        questions.add("Which part of the respiratory system prevents food from entering the airway?");
        options.add("A) Pharynx, B) Epiglottis, C) Larynx, D) Trachea");
        answers.add("B) Epiglottis");

        questions.add("What is the name of the hormone that regulates calcium levels in the blood?");
        options.add("A) Insulin, B) Cortisol, C) Calcitonin, D) Testosterone");
        answers.add("C) Calcitonin");

        questions.add("Which bone forms the forehead and upper eye sockets?");
        options.add("A) Mandible, B) Maxilla, C) Frontal bone, D) Occipital bone");
        answers.add("C) Frontal bone");

        questions.add("What is the name of the process by which the body breaks down food molecules to release energy?");
        options.add("A) Respiration, B) Fermentation, C) Digestion, D) Metabolism");
        answers.add("C) Digestion");

        questions.add("Which part of the eye contains light-sensitive cells?");
        options.add("A) Cornea, B) Retina, C) Lens, D) Pupil");
        answers.add("B) Retina");

        questions.add("What is the name of the membrane that covers the lungs?");
        options.add("A) Pericardium, B) Peritoneum, C) Pleura, D) Epithelium");
        answers.add("C) Pleura");

        questions.add("Which part of the brain controls involuntary functions like breathing and heartbeat?");
        options.add("A) Cerebrum, B) Cerebellum, C) Medulla oblongata, D) Hypothalamus");
        answers.add("C) Medulla oblongata");

        questions.add("What is the name of the tube that carries urine from the kidney to the bladder?");
        options.add("A) Ureter, B) Urethra, C) Fallopian tube, D) Vas deferens");
        answers.add("A) Ureter");

        questions.add("Which gland in the brain regulates sleep patterns and wakefulness?");
        options.add("A) Pituitary gland, B) Pineal gland, C) Adrenal gland, D) Hypothalamus");
        answers.add("B) Pineal gland");

        questions.add("What is the name of the fluid that carries oxygen and nutrients to cells?");
        options.add("A) Lymph, B) Plasma, C) Serum, D) Blood");
        answers.add("D) Blood");

        questions.add("Which bone connects the shoulder blade to the arm bone?");
        options.add("A) Clavicle, B) Scapula, C) Humerus, D) Radius");
        answers.add("C) Humerus");

        questions.add("What is the name of the process by which food is moved through the digestive tract?");
        options.add("A) Peristalsis, B) Absorption, C) Digestion, D) Assimilation");
        answers.add("A) Peristalsis");

        questions.add("Which part of the brain is responsible for processing sensory information?");
        options.add("A) Cerebrum, B) Cerebellum, C) Medulla oblongata, D) Parietal lobe");
        answers.add("D) Parietal lobe");

        questions.add("What is the name of the structure that connects muscle to bone?");
        options.add("A) Ligament, B) Tendon, C) Cartilage, D) Joint");
        answers.add("B) Tendon");

        questions.add("Which part of the nervous system controls voluntary movements?");
        options.add("A) Autonomic nervous system, B) Sympathetic nervous system, C) Parasympathetic nervous system, D) Somatic nervous system");
        answers.add("D) Somatic nervous system");

        questions.add("What is the name of the tube that carries air from the throat to the lungs?");
        options.add("A) Trachea, B) Bronchus, C) Esophagus, D) Diaphragm");
        answers.add("A) Trachea");

        questions.add("Which organ stores bile produced by the liver?");
        options.add("A) Stomach, B) Gallbladder, C) Pancreas, D) Small intestine");
        answers.add("B) Gallbladder");

        questions.add("What is the name of the structure that carries urine from the bladder out of the body?");
        options.add("A) Urethra, B) Ureter, C) Vas deferens, D) Fallopian tube");
        answers.add("A) Urethra");

        questions.add("Which part of the brain controls speech and language?");
        options.add("A) Cerebrum, B) Cerebellum, C) Broca's area, D) Medulla oblongata");
        answers.add("C) Broca's area");

        questions.add("What is the name of the hormone that regulates blood calcium levels?");
        options.add("A) Insulin, B) Thyroxine, C) Parathyroid hormone, D) Cortisol");
        answers.add("C) Parathyroid hormone");

        questions.add("Which part of the eye gives it its color?");
        options.add("A) Pupil, B) Cornea, C) Lens, D) Iris");
        answers.add("D) Iris");

        questions.add("What is the name of the process by which the body maintains a stable internal environment?");
        options.add("A) Homeostasis, B) Metabolism, C) Respiration, D) Synthesis");
        answers.add("A) Homeostasis");

        questions.add("Which bone forms the lower jaw?");
        options.add("A) Mandible, B) Maxilla, C) Zygomatic bone, D) Temporal bone");
        answers.add("A) Mandible");

        questions.add("What is the name of the fluid that cushions and protects the brain and spinal cord?");
        options.add("A) Synovial fluid, B) Cerebrospinal fluid, C) Lymph, D) Mucus");
        answers.add("B) Cerebrospinal fluid");

        questions.add("Which part of the nervous system controls involuntary functions like breathing and heartbeat?");
        options.add("A) Somatic nervous system, B) Autonomic nervous system, C) Sympathetic nervous system, D) Parasympathetic nervous system");
        answers.add("B) Autonomic nervous system");
    }
    

    public static void main(String[]args){
        new HumanBody_Quiz(name).setVisible(true);
    }
    
}
