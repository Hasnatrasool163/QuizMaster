package thirdListFrames;

/**
 * @author MuhammadHasnatRasool
 */
import frame.Quiz;
import java.awt.event.ActionEvent;


public class Geology_Quiz extends Quiz{
    

    public Geology_Quiz(String name) {
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


    // questions:61
    
    @Override
    public final void loadQuestions() {
        questions.add("Which type of rock is formed by the solidification of molten magma?");
        options.add("A) Sedimentary, B) Metamorphic, C) Igneous, D) None of the above");
        answers.add("C) Igneous");

        questions.add("What is the hardest mineral on the Mohs scale of mineral hardness?");
        options.add("A) Quartz, B) Diamond, C) Feldspar, D) Topaz");
        answers.add("B) Diamond");

        questions.add("Which type of volcano is characterized by its broad, gently sloping sides and non-explosive eruptions?");
        options.add("A) Shield volcano, B) Stratovolcano, C) Cinder cone volcano, D) Caldera");
        answers.add("A) Shield volcano");

        questions.add("Which of the following geological eras is known as the 'Age of Dinosaurs'?");
        options.add("A) Paleozoic, B) Mesozoic, C) Cenozoic, D) Precambrian");
        answers.add("B) Mesozoic");

        questions.add("What type of plate boundary is associated with earthquakes, volcanic activity, and the formation of mountain ranges?");
        options.add("A) Divergent boundary, B) Convergent boundary, C) Transform boundary, D) None of the above");
        answers.add("B) Convergent boundary");
        
        questions.add("Which process involves the breakdown of rocks and minerals into smaller particles by physical, chemical, or biological means?");
        options.add("A) Erosion, B) Weathering, C) Deposition, D) Lithification");
        answers.add("B) Weathering");

        questions.add("Which type of rock forms from the compaction and cementation of loose sediments?");
        options.add("A) Igneous rock, B) Metamorphic rock, C) Sedimentary rock, D) None of the above");
        answers.add("C) Sedimentary rock");

        questions.add("What mineral is commonly referred to as 'fool's gold'?");
        options.add("A) Pyrite, B) Quartz, C) Hematite, D) Galena");
        answers.add("A) Pyrite");

        questions.add("The process by which a sedimentary rock turns into a metamorphic rock under heat and pressure is called?");
        options.add("A) Folding, B) Metamorphism, C) Melting, D) Cementation");
        answers.add("B) Metamorphism");

        questions.add("Which type of fault is characterized by vertical displacement where one block moves up and the other moves down?");
        options.add("A) Normal fault, B) Reverse fault, C) Strike-slip fault, D) Thrust fault");
        answers.add("A) Normal fault");

        questions.add("What is the hardest form of coal?");
        options.add("A) Peat, B) Lignite, C) Bituminous coal, D) Anthracite");
        answers.add("D) Anthracite");

        questions.add("Which mineral is the main component of limestone?");
        options.add("A) Quartz, B) Calcite, C) Feldspar, D) Mica");
        answers.add("B) Calcite");
        
        questions.add("Which of the following is a type of chemical weathering?");
        options.add("A) Frost wedging, B) Abrasion, C) Oxidation, D) Root wedging");
        answers.add("C) Oxidation");

        questions.add("Which layer of the Earth's interior is characterized by its solid, iron-rich composition?");
        options.add("A) Crust, B) Mantle, C) Outer core, D) Inner core");
        answers.add("D) Inner core");

        questions.add("Which process involves the movement of weathered material from one location to another by water, wind, or ice?");
        options.add("A) Erosion, B) Deposition, C) Weathering, D) Lithification");
        answers.add("A) Erosion");

        questions.add("The breaking down of rocks into smaller particles due to physical processes is known as:");
        options.add("A) Weathering, B) Erosion, C) Deposition, D) Lithification");
        answers.add("A) Weathering");

        questions.add("Which type of rock forms from the cooling and solidification of lava or magma?");
        options.add("A) Metamorphic, B) Sedimentary, C) Igneous, D) None of the above");
        answers.add("C) Igneous");

        questions.add("Which mineral is commonly used in ceramics and pottery due to its heat resistance?");
        options.add("A) Quartz, B) Feldspar, C) Talc, D) Gypsum");
        answers.add("B) Feldspar");

        questions.add("What is the term for a sudden and violent shaking of the ground, often caused by the movement of tectonic plates?");
        options.add("A) Tsunami, B) Volcano, C) Earthquake, D) Avalanche");
        answers.add("C) Earthquake");

        questions.add("Which type of rock is formed from the accumulation of organic or inorganic material?");
        options.add("A) Metamorphic, B) Igneous, C) Sedimentary, D) None of the above");
        answers.add("C) Sedimentary");

        questions.add("What type of volcano is characterized by its tall, steep sides and explosive eruptions?");
        options.add("A) Shield volcano, B) Stratovolcano, C) Cinder cone volcano, D) Caldera");
        answers.add("B) Stratovolcano");

        questions.add("Which of the following minerals is a major constituent of granite?");
        options.add("A) Quartz, B) Calcite, C) Gypsum, D) Halite");
        answers.add("A) Quartz");

        questions.add("Which process involves the transformation of sediment into solid rock by compaction and cementation?");
        options.add("A) Erosion, B) Deposition, C) Weathering, D) Lithification");
        answers.add("D) Lithification");

        questions.add("What is the term for the bending and folding of rock layers due to tectonic forces?");
        options.add("A) Erosion, B) Deposition, C) Metamorphism, D) Deformation");
        answers.add("D) Deformation");

        questions.add("Which of the following is a type of chemical sedimentary rock?");
        options.add("A) Shale, B) Sandstone, C) Limestone, D) Conglomerate");
        answers.add("C) Limestone");

        questions.add("Which mineral is commonly used in plaster and drywall?");
        options.add("A) Halite, B) Gypsum, C) Calcite, D) Quartz");
        answers.add("B) Gypsum");

        questions.add("The process by which rocks are broken down into smaller fragments due to physical or chemical processes is called:");
        options.add("A) Weathering, B) Erosion, C) Deposition, D) Lithification");
        answers.add("A) Weathering");

        questions.add("What is the term for the solidification of magma below the Earth's surface?");
        options.add("A) Weathering, B) Erosion, C) Intrusion, D) Extrusion");
        answers.add("C) Intrusion");

        questions.add("Which type of mineral is a naturally occurring, inorganic solid with a definite chemical composition and ordered atomic structure?");
        options.add("A) Ore, B) Rock, C) Crystal, D) None of the above");
        answers.add("C) Crystal");

        questions.add("What is the term for the process by which sedimentary rocks are formed from pre-existing rocks through heat and pressure?");
        options.add("A) Weathering, B) Erosion, C) Deposition, D) Metamorphism");
        answers.add("D) Metamorphism");

        questions.add("Which type of rock is formed from the accumulation and cementation of rock fragments?");
        options.add("A) Metamorphic, B) Igneous, C) Sedimentary, D) None of the above");
        answers.add("C) Sedimentary");

        questions.add("Which of the following is a type of mechanical weathering?");
        options.add("A) Oxidation, B) Acid rain, C) Frost wedging, D) Hydrolysis");
        answers.add("C) Frost wedging");

        questions.add("What is the term for the layer of loose, unconsolidated material covering the Earth's surface?");
        options.add("A) Bedrock, B) Mantle, C) Soil, D) Crust");
        answers.add("C) Soil");

        questions.add("Which mineral is commonly used in the production of aluminum?");
        options.add("A) Bauxite, B) Hematite, C) Galena, D) Magnetite");
        answers.add("A) Bauxite");

        questions.add("The process by which rocks are physically and chemically altered at or near the Earth's surface is known as:");
        options.add("A) Weathering, B) Erosion, C) Deposition, D) Lithification");
        answers.add("A) Weathering");

        questions.add("Which type of rock is formed from the alteration of existing rock types through heat and pressure?");
        options.add("A) Igneous, B) Sedimentary, C) Metamorphic, D) None of the above");
        answers.add("C) Metamorphic");

        questions.add("Which mineral is commonly used in the production of cement?");
        options.add("A) Quartz, B) Gypsum, C) Calcite, D) Feldspar");
        answers.add("C) Calcite");

        questions.add("What type of volcano is characterized by its small size, steep sides, and explosive eruptions?");
        options.add("A) Shield volcano, B) Stratovolcano, C) Cinder cone volcano, D) Caldera");
        answers.add("C) Cinder cone volcano");

        questions.add("Which of the following is a type of organic sedimentary rock?");
        options.add("A) Sandstone, B) Shale, C) Limestone, D) Conglomerate");
        answers.add("C) Limestone");

        questions.add("Which mineral is commonly used in the production of glass?");
        options.add("A) Quartz, B) Halite, C) Gypsum, D) Magnetite");
        answers.add("A) Quartz");

        questions.add("The bending or folding of rock layers due to compressional forces is known as:");
        options.add("A) Deformation, B) Erosion, C) Weathering, D) Lithification");
        answers.add("A) Deformation");

        questions.add("What is the term for the process by which minerals precipitate from water to fill the spaces between sediment grains?");
        options.add("A) Erosion, B) Deposition, C) Cementation, D) Lithification");
        answers.add("C) Cementation");

        questions.add("Which type of rock is formed from the cooling and solidification of lava?");
        options.add("A) Metamorphic, B) Sedimentary, C) Igneous, D) None of the above");
        answers.add("C) Igneous");

        questions.add("Which mineral is commonly used in the production of fertilizer?");
        options.add("A) Quartz, B) Gypsum, C) Halite, D) Feldspar");
        answers.add("C) Halite");

        questions.add("The process by which sedimentary rocks are transformed into metamorphic rocks is known as:");
        options.add("A) Deposition, B) Weathering, C) Lithification, D) Metamorphism");
        answers.add("D) Metamorphism");

        questions.add("Which of the following is a type of igneous rock with a fine-grained texture?");
        options.add("A) Granite, B) Basalt, C) Gabbro, D) Obsidian");
        answers.add("B) Basalt");

        questions.add("Which mineral is commonly used in the production of plaster?");
        options.add("A) Quartz, B) Gypsum, C) Halite, D) Feldspar");
        answers.add("B) Gypsum");

        questions.add("The process by which sediment is deposited in layers is known as:");
        options.add("A) Weathering, B) Erosion, C) Deposition, D) Lithification");
        answers.add("C) Deposition");

        questions.add("What type of rock is formed from the recrystallization of minerals due to heat and pressure?");
        options.add("A) Igneous, B) Sedimentary, C) Metamorphic, D) None of the above");
        answers.add("C) Metamorphic");

        questions.add("Which mineral is commonly used in the production of steel?");
        options.add("A) Quartz, B) Hematite, C) Gypsum, D) Magnetite");
        answers.add("B) Hematite");

        questions.add("The process by which loose sediment is transformed into solid rock through compaction and cementation is known as:");
        options.add("A) Weathering, B) Erosion, C) Deposition, D) Lithification");
        answers.add("D) Lithification");

        questions.add("Which type of mineral is composed of only one element?");
        options.add("A) Silicate, B) Sulfide, C) Native element, D) Oxide");
        answers.add("C) Native element");

        questions.add("What is the term for the breaking down of rocks into smaller fragments due to chemical processes?");
        options.add("A) Weathering, B) Erosion, C) Deposition, D) Lithification");
        answers.add("A) Weathering");

        questions.add("Which type of rock is formed from the compaction and cementation of organic material?");
        options.add("A) Igneous, B) Sedimentary, C) Metamorphic, D) None of the above");
        answers.add("B) Sedimentary");

        questions.add("Which mineral is commonly used in the production of batteries?");
        options.add("A) Quartz, B) Gypsum, C) Galena, D) Magnetite");
        answers.add("C) Galena");

        questions.add("The process by which sediment is moved from one location to another by water, wind, or ice is known as:");
        options.add("A) Erosion, B) Deposition, C) Weathering, D) Lithification");
        answers.add("A) Erosion");

        questions.add("Which type of rock is formed from the solidification of lava on the Earth's surface?");
        options.add("A) Intrusive igneous rock, B) Extrusive igneous rock, C) Metamorphic rock, D) Sedimentary rock");
        answers.add("B) Extrusive igneous rock");

        questions.add("Which mineral is commonly used in the production of toothpaste?");
        options.add("A) Quartz, B) Calcite, C) Halite, D) Gypsum");
        answers.add("B) Calcite");

        questions.add("The process by which rock fragments are moved by wind, water, or ice is known as:");
        options.add("A) Erosion, B) Weathering, C) Deposition, D) Lithification");
        answers.add("A) Erosion");

        questions.add("Which type of rock is formed from the alteration of existing rock types through heat and pressure?");
        options.add("A) Igneous, B) Sedimentary, C) Metamorphic, D) None of the above");
        answers.add("C) Metamorphic");

        questions.add("Which mineral is commonly used in the production of ceramics?");
        options.add("A) Quartz, B) Feldspar, C) Gypsum, D) Halite");
        answers.add("B) Feldspar");

        
    }
    
 
    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
    }
    
    public static void main(String[]args){
        new Geology_Quiz(name).setVisible(true);
    }
    
}
