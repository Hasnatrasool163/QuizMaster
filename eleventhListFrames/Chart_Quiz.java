package eleventhListFrames;

import frame.Quiz;

/**
 * @author MuhammadHasnatRasool
 */
public class Chart_Quiz extends Quiz{
    

    public Chart_Quiz(String name) {
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

// questions:   19
    @Override
    public final void loadQuestions() {

        questions.add("What is the main purpose of Chart.js?");
        options.add("A) To create charts and graphs, B) To handle data analysis, C) To perform statistical calculations, D) To create tables and grids");
        answers.add("A) To create charts and graphs");

        questions.add("How do you create a chart using Chart.js?");
        options.add("A) new Chart(), B) chart(), C) createChart(), D) Chart.create()");
        answers.add("A) new Chart()");

        questions.add("What is the default chart type in Chart.js?");
        options.add("A) Line chart, B) Bar chart, C) Pie chart, D) Radar chart");
        answers.add("A) Line chart");

        questions.add("How do you add data to a chart in Chart.js?");
        options.add("A) data(), B) setData(), C) addData(), D) pushData()");
        answers.add("B) setData()");

        questions.add("What is the purpose of the options object in Chart.js?");
        options.add("A) To customize the chart appearance, B) To add data to the chart, C) To create a new chart, D) To destroy the chart");
        answers.add("A) To customize the chart appearance");

        questions.add("How do you update a chart in Chart.js?");
        options.add("A) update(), B) refresh(), C) redraw(), D) render()");
        answers.add("A) update()");

        questions.add("What is the purpose of the scales object in Chart.js?");
        options.add("A) To customize the chart scales, B) To add data to the chart, C) To create a new chart, D) To destroy the chart");
        answers.add("A) To customize the chart scales");

        questions.add("How do you add a legend to a chart in Chart.js?");
        options.add("A) legend(), B) addLegend(), C) createLegend(), D) showLegend()");
        answers.add("A) legend()");

        questions.add("What is the purpose of the plugins object in Chart.js?");
        options.add("A) To add custom functionality to the chart, B) To customize the chart appearance, C) To add data to the chart, D) To create a new chart");
        answers.add("A) To add custom functionality to the chart");
        
        questions.add("How do you create a bar chart in Chart.js?");
        options.add("A) new Chart(type: 'bar'), B) new Chart(type: 'line'), C) new Chart(type: 'pie'), D) new Chart(type: 'radar')");
        answers.add("A) new Chart(type: 'bar')");

        questions.add("What is the purpose of the datasets object in Chart.js?");
        options.add("A) To add data to the chart, B) To customize the chart appearance, C) To create a new chart, D) To destroy the chart");
        answers.add("A) To add data to the chart");

        questions.add("How do you add a title to a chart in Chart.js?");
        options.add("A) title(), B) addTitle(), C) createTitle(), D) showTitle()");
        answers.add("A) title()");

        questions.add("What is the purpose of the axes object in Chart.js?");
        options.add("A) To customize the chart axes, B) To add data to the chart, C) To create a new chart, D) To destroy the chart");
        answers.add("A) To customize the chart axes");

        questions.add("How do you create a pie chart in Chart.js?");
        options.add("A) new Chart(type: 'pie'), B) new Chart(type: 'line'), C) new Chart(type: 'bar'), D) new Chart(type: 'radar')");
        answers.add("A) new Chart(type: 'pie')");

        questions.add("What is the purpose of the animation object in Chart.js?");
        options.add("A) To customize the chart animation, B) To add data to the chart, C) To create a new chart, D) To destroy the chart");
        answers.add("A) To customize the chart animation");

        questions.add("How do you update the data in a chart in Chart.js?");
        options.add("A) update(), B) refresh(), C) redraw(), D) render()");
        answers.add("A) update()");

        questions.add("What is the purpose of the events object in Chart.js?");
        options.add("A) To handle chart events, B) To add data to the chart, C) To create a new chart, D) To destroy the chart");
        answers.add("A) To handle chart events");

        questions.add("How do you create a radar chart in Chart.js?");
        options.add("A) new Chart(type: 'radar'), B) new Chart(type: 'line'), C) new Chart(type: 'bar'), D) new Chart(type: 'pie')");
        answers.add("A) new Chart(type: 'radar')");

        questions.add("What is the purpose of the legendCallback function in Chart.js?");
        options.add("A) To customize the legend, B) To add data to the chart, C) To create a new chart, D) To destroy the chart");
        answers.add("A) To customize the legend");



    }
    

    public static void main(String[]args){
        new Chart_Quiz(name).setVisible(true);
    }
    
}


