package thirdListFrames;

/**
 * @author MuhammadHasnatRasool
 */
import frame.Quiz;
import java.awt.event.ActionEvent;


public class Engineering_Quiz extends Quiz{
    

    public Engineering_Quiz(String name) {
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

// questions:35
    @Override
    public final void loadQuestions() {
        
        questions.add("Which engineering discipline focuses on the design and construction of buildings, roads, bridges, and infrastructure?");
        options.add("A) Civil engineering, B) Mechanical engineering, C) Electrical engineering, D) Biomedical engineering");
        answers.add("A) Civil engineering");

        questions.add("What is the SI unit of force?");
        options.add("A) Newton, B) Joule, C) Watt, D) Pascal");
        answers.add("A) Newton");

        questions.add("Which engineering field primarily deals with the generation, distribution, and use of electrical power?");
        options.add("A) Electrical engineering, B) Chemical engineering, C) Aerospace engineering, D) Environmental engineering");
        answers.add("A) Electrical engineering");

        questions.add("Which law of thermodynamics states that energy cannot be created or destroyed, only transformed or transferred?");
        options.add("A) First law, B) Second law, C) Third law, D) Zeroth law");
        answers.add("A) First law");

        questions.add("Which engineering discipline involves the design and manufacturing of mechanical systems, machines, and tools?");
        options.add("A) Mechanical engineering, B) Civil engineering, C) Biomedical engineering, D) Aerospace engineering");
        answers.add("A) Mechanical engineering");

        questions.add("What is the SI unit of power?");
        options.add("A) Watt, B) Volt, C) Joule, D) Ohm");
        answers.add("A) Watt");

        questions.add("Which type of material has a stress-strain curve that exhibits a distinct yield point?");
        options.add("A) Ductile, B) Brittle, C) Elastic, D) Plastic");
        answers.add("A) Ductile");

        questions.add("In electrical engineering, what does 'AC' stand for?");
        options.add("A) Alternating Current, B) Active Circuit, C) Alternating Capacitor, D) Automated Control");
        answers.add("A) Alternating Current");

        questions.add("Which branch of engineering involves the study of fluid dynamics and its application to design and operate machines?");
        options.add("A) Fluid mechanics, B) Robotics, C) Biomechanics, D) Nanotechnology");
        answers.add("A) Fluid mechanics");

        questions.add("What does 'CAD' stand for in engineering?");
        options.add("A) Computer-Aided Design, B) Computer-Aided Drafting, C) Computer-Aided Development, D) Computer Algorithm Design");
        answers.add("A) Computer-Aided Design");

        questions.add("Which type of engineering involves the application of engineering principles to biology and medicine?");
        options.add("A) Biomedical engineering, B) Chemical engineering, C) Environmental engineering, D) Industrial engineering");
        answers.add("A) Biomedical engineering");

        questions.add("What is the SI unit of electric charge?");
        options.add("A) Coulomb, B) Ampere, C) Volt, D) Ohm");
        answers.add("A) Coulomb");

        questions.add("Which engineering discipline focuses on the design and operation of aircraft and spacecraft?");
        options.add("A) Aerospace engineering, B) Nuclear engineering, C) Marine engineering, D) Environmental engineering");
        answers.add("A) Aerospace engineering");

        questions.add("What does 'DC' stand for in electrical engineering?");
        options.add("A) Direct Current, B) Distributed Circuit, C) Digital Control, D) Dual Capacitance");
        answers.add("A) Direct Current");

        questions.add("Which type of engineering involves the study of interactions between living organisms and their environment?");
        options.add("A) Environmental engineering, B) Materials engineering, C) Petroleum engineering, D) Software engineering");
        answers.add("A) Environmental engineering");

        questions.add("In mechanical engineering, what is the term for a device that transmits mechanical energy?");
        options.add("A) Machine, B) Motor, C) Transmission, D) Gear");
        answers.add("C) Transmission");

        questions.add("Which engineering field involves the study of chemical processes and the design of chemical plants and equipment?");
        options.add("A) Chemical engineering, B) Agricultural engineering, C) Mining engineering, D) Structural engineering");
        answers.add("A) Chemical engineering");

        questions.add("What is the SI unit of frequency?");
        options.add("A) Hertz, B) Watt, C) Pascal, D) Newton");
        answers.add("A) Hertz");

        questions.add("Which type of material can return to its original shape after deformation?");
        options.add("A) Elastic, B) Plastic, C) Ductile, D) Brittle");
        answers.add("A) Elastic");

        questions.add("In civil engineering, what is the term for a structure that carries vehicular or pedestrian traffic over a river, ravine, road, or other obstacle?");
        options.add("A) Bridge, B) Tunnel, C) Dam, D) Tower");
        answers.add("A) Bridge");

        questions.add("Which engineering discipline involves the study and design of computer systems and networks?");
        options.add("A) Computer engineering, B) Software engineering, C) Data engineering, D) Network engineering");
        answers.add("A) Computer engineering");

        questions.add("What does 'LED' stand for in electrical engineering?");
        options.add("A) Light Emitting Diode, B) Low Energy Device, C) Light Enhancing Device, D) Linear Energy Displacement");
        answers.add("A) Light Emitting Diode");

        questions.add("Which engineering field involves the study of the mechanical properties of materials?");
        options.add("A) Materials engineering, B) Nuclear engineering, C) Robotics engineering, D) Aerospace engineering");
        answers.add("A) Materials engineering");

        questions.add("In biomedical engineering, what is the term for a device that substitutes a biological function?");
        options.add("A) Prosthesis, B) Implant, C) Pacemaker, D) Sensor");
        answers.add("A) Prosthesis");

        questions.add("Which type of engineering involves the study of heat transfer and its applications?");
        options.add("A) Thermodynamics, B) Heat engineering, C) Fluid dynamics, D) Thermal engineering");
        answers.add("D) Thermal engineering");

        questions.add("What is the SI unit of pressure?");
        options.add("A) Pascal, B) Newton, C) Joule, D) Watt");
        answers.add("A) Pascal");

        questions.add("Which engineering discipline involves the study and application of principles of physics for the design and analysis of mechanical systems?");
        options.add("A) Mechanical engineering, B) Electrical engineering, C) Civil engineering, D) Industrial engineering");
        answers.add("A) Mechanical engineering");

        questions.add("What does 'IoT' stand for in engineering?");
        options.add("A) Internet of Things, B) Integrated Technology, C) Intelligent Technology, D) Internet of Tools");
        answers.add("A) Internet of Things");

        questions.add("Which type of material exhibits high electrical conductivity?");
        options.add("A) Conductor, B) Insulator, C) Semiconductor, D) Superconductor");
        answers.add("A) Conductor");

        questions.add("In chemical engineering, what is the term for a substance that speeds up a chemical reaction without being consumed in the process?");
        options.add("A) Catalyst, B) Reactant, C) Solvent, D) Inhibitor");
        answers.add("A) Catalyst");

        questions.add("Which engineering field involves the study of fluid behavior and its application in engineering?");
        options.add("A) Fluid dynamics, B) Thermodynamics, C) Robotics, D) Aerospace engineering");
        answers.add("A) Fluid dynamics");

        questions.add("What is the SI unit of energy?");
        options.add("A) Joule, B) Watt, C) Volt, D) Ampere");
        answers.add("A) Joule");

        questions.add("Which type of engineering involves the design and operation of machinery used in industrial processes?");
        options.add("A) Industrial engineering, B) Mechanical engineering, C) Chemical engineering, D) Electrical engineering");
        answers.add("A) Industrial engineering");

        questions.add("What does 'RTOS' stand for in engineering?");
        options.add("A) Real-Time Operating System, B) Robotic Technology Operating System, C) Rapid Transport Operating System, D) Remote Telecommunication Operating System");
        answers.add("A) Real-Time Operating System");

        questions.add("Which engineering discipline involves the study and application of principles of motion, energy, and force?");
        options.add("A) Engineering mechanics, B) Aerospace engineering, C) Nuclear engineering, D) Software engineering");
        answers.add("A) Engineering mechanics");

    }
    
 
    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
    }
    
    public static void main(String[]args){
        new Engineering_Quiz(name).setVisible(true);
    }
    
}
