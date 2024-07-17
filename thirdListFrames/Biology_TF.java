package thirdListFrames;

import frame.True_False_Questions;


public class Biology_TF extends True_False_Questions{

    public Biology_TF(String name) {
        super(name);
    }
   
// biology
    @Override
    public final void loadQuestions() {
questions.add("The cell is the basic unit of life.");
answers.add("True");

questions.add("Plants produce oxygen during photosynthesis.");
answers.add("True");

questions.add("Mitochondria are known as the powerhouses of the cell.");
answers.add("True");

questions.add("DNA stands for Deoxyribonucleic Acid.");
answers.add("True");

questions.add("Humans have 32 pairs of chromosomes.");
answers.add("False");

questions.add("Bacteria are prokaryotic cells.");
answers.add("True");

questions.add("The nucleus is the control center of the cell.");
answers.add("True");

questions.add("Fungi are a type of prokaryote.");
answers.add("False");

questions.add("Red blood cells carry oxygen throughout the body.");
answers.add("True");

questions.add("Photosynthesis occurs in the mitochondria.");
answers.add("False");

questions.add("Enzymes are proteins that speed up chemical reactions.");
answers.add("True");

questions.add("The process of cell division in eukaryotes is called mitosis.");
answers.add("True");
questions.add("RNA stands for Ribonucleic Acid.");
answers.add("True");

questions.add("Amino acids are the building blocks of proteins.");
answers.add("True");

questions.add("Chlorophyll is the pigment that gives plants their green color.");
answers.add("True");

questions.add("Evolution is the change in the characteristics of a species over several generations.");
answers.add("True");

questions.add("The human body has 4 different types of blood cells.");
answers.add("False");

questions.add("Hemoglobin is a protein in red blood cells that carries oxygen.");
answers.add("True");

questions.add("The main function of white blood cells is to fight infection.");
answers.add("True");

questions.add("The cell wall is found in animal cells.");
answers.add("False");

questions.add("Homeostasis is the process of maintaining a stable internal environment.");
answers.add("True");

questions.add("Insects are classified as vertebrates.");
answers.add("False");

questions.add("Genetics is the study of heredity and variation in organisms.");
answers.add("True");

questions.add("The heart is an organ in the circulatory system.");
answers.add("True");

questions.add("ATP stands for Adenosine Triphosphate.");
answers.add("True");

questions.add("Meiosis results in four daughter cells each with half the number of chromosomes of the parent cell.");
answers.add("True");

questions.add("Photosynthesis produces glucose and oxygen as end products.");
answers.add("True");



    }
    
    public static void main(String[]args){
        new Biology_TF(name).setVisible(true);
    }
    
}

