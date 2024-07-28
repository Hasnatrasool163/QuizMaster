
package eleventhListFrames;

import frame.Quiz;

/**
 * @author MuhammadHasnatRasool
 */
public class MatPlotLib_Quiz extends Quiz{
    

    public MatPlotLib_Quiz(String name) {
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

   

    // questions:38
    @Override
    public void setQuestionTextAndOptions() {
        qno.setText("Question #: " + currentQno);
        question.setText(questions.get(currentQuestionIndex));
        opt1.setText(options.get(currentQuestionIndex).split(", ")[0]);
        opt2.setText(options.get(currentQuestionIndex).split(", ")[1]);
        opt3.setText(options.get(currentQuestionIndex).split(", ")[2]);
        opt4.setText(options.get(currentQuestionIndex).split(", ")[3]);
    }


    @Override
    public final void loadQuestions() {


        questions.add("What is Matplotlib used for in Python?");
        options.add("A) Data manipulation, B) Machine learning, C) Data visualization, D) Web development");
        answers.add("C) Data visualization");

        questions.add("Which module needs to be imported to use Matplotlib?");
        options.add("A) import pyplot, B) import mpl, C) import plot, D) import matplotlib.pyplot as plt");
        answers.add("D) import matplotlib.pyplot as plt");

        questions.add("How do you create a basic line plot using Matplotlib?");
        options.add("A) plot.line(), B) plt.lineplot(), C) plt.plot(), D) plot()");
        answers.add("C) plt.plot()");

        questions.add("Which method is used to display a plot in Matplotlib?");
        options.add("A) plt.display(), B) plt.show(), C) plot.display(), D) plt.plot()");
        answers.add("B) plt.show()");

        questions.add("How do you set the title of a plot in Matplotlib?");
        options.add("A) plt.title(), B) plt.set_title(), C) plot.set_title(), D) plt.plot_title()");
        answers.add("A) plt.title()");

        questions.add("Which method is used to set labels for x-axis and y-axis in Matplotlib?");
        options.add("A) plt.xlabel(), plt.ylabel(), B) plt.set_labels(), C) plt.set_xlabel(), plt.set_ylabel(), D) plot.xlabel(), plot.ylabel()");
        answers.add("A) plt.xlabel(), plt.ylabel()");

        questions.add("What is the purpose of plt.figure() in Matplotlib?");
        options.add("A) Create a figure or subplot, B) Set figure size, C) Add plots to figure, D) Show the figure");
        answers.add("A) Create a figure or subplot");

        questions.add("How do you save a Matplotlib plot to a file?");
        options.add("A) plt.save(), B) plt.saveplot(), C) plt.savefig(), D) save.plot()");
        answers.add("C) plt.savefig()");

        questions.add("Which method is used to create a scatter plot in Matplotlib?");
        options.add("A) plt.scatterplot(), B) plt.scatter(), C) plt.plot.scatter(), D) plot.scatter()");
        answers.add("B) plt.scatter()");

        questions.add("How do you customize the color of a plot in Matplotlib?");
        options.add("A) plt.set_color(), B) plot.color(), C) plt.color(), D) plt.plot(color='red')");
        answers.add("D) plt.plot(color='red')");

        questions.add("Which method is used to create a histogram in Matplotlib?");
        options.add("A) plt.hist(), B) plt.plot.hist(), C) plot.histogram(), D) plt.histogram()");
        answers.add("A) plt.hist()");

        questions.add("How do you add grid lines to a plot in Matplotlib?");
        options.add("A) plt.grid(True), B) plt.set_grid(True), C) plot.grid(True), D) grid.plot(True)");
        answers.add("A) plt.grid(True)");

        questions.add("What is the purpose of plt.legend() in Matplotlib?");
        options.add("A) Add legends to plots, B) Set legend position, C) Customize legend font, D) Show legend");
        answers.add("A) Add legends to plots");

        questions.add("How do you create subplots in Matplotlib?");
        options.add("A) plt.subplot(), B) plot.subplot(), C) plt.subplots(), D) plt.add_subplot()");
        answers.add("C) plt.subplots()");

        questions.add("Which method is used to set the size of markers in a scatter plot in Matplotlib?");
        options.add("A) plt.marker_size(), B) plt.scatter(size=), C) plt.scatter(s=), D) plt.scatter(markersize=)");
        answers.add("D) plt.scatter(markersize=)");

        questions.add("How do you set the linestyle of a plot in Matplotlib?");
        options.add("A) plt.linestyle(), B) plot.style(), C) plt.set_linestyle(), D) plt.plot(linestyle='--')");
        answers.add("D) plt.plot(linestyle='--')");

        questions.add("Which method is used to annotate text in a Matplotlib plot?");
        options.add("A) plt.text(), B) plt.annotate(), C) plot.annotate(), D) text.plot()");
        answers.add("B) plt.annotate()");

        questions.add("How do you create a bar plot in Matplotlib?");
        options.add("A) plt.barplot(), B) plt.plot.bar(), C) plt.bar(), D) plot.barplot()");
        answers.add("C) plt.bar()");

        questions.add("Which parameter is used to set transparency in Matplotlib?");
        options.add("A) alpha, B) opacity, C) trans, D) plt.transparent()");
        answers.add("A) alpha");

        questions.add("What does plt.tight_layout() do in Matplotlib?");
        options.add("A) Adjust plot layout, B) Set plot title, C) Set plot size, D) Add padding");
        answers.add("A) Adjust plot layout");

        questions.add("How do you plot a 3D surface plot in Matplotlib?");
        options.add("A) plt.plot_surface(), B) plt.surfaceplot(), C) plot.surface(), D) plot.plot_surface()");
        answers.add("A) plt.plot_surface()");

        questions.add("Which method is used to set the colormap in Matplotlib?");
        options.add("A) plt.colormap(), B) plt.set_cmap(), C) plot.cmap(), D) plt.set_colormap()");
        answers.add("B) plt.set_cmap()");

        questions.add("How do you create a box plot in Matplotlib?");
        options.add("A) plt.boxplot(), B) plt.plot.box(), C) plot.box(), D) box.plot()");
        answers.add("A) plt.boxplot()");

        questions.add("Which method is used to plot a pie chart in Matplotlib?");
        options.add("A) plt.pie(), B) plt.plot.pie(), C) plot.pie(), D) pie.plot()");
        answers.add("A) plt.pie()");

        questions.add("How do you set the aspect ratio of axes in Matplotlib?");
        options.add("A) plt.set_aspect(), B) plt.aspect(), C) plot.aspect(), D) plt.axes().set_aspect()");
        answers.add("D) plt.axes().set_aspect()");

        questions.add("What is the purpose of plt.subplot2grid() in Matplotlib?");
        options.add("A) Create multiple subplots, B) Customize subplot grid, C) Add grids to plots, D) Set subplot size");
        answers.add("A) Create multiple subplots");

        questions.add("How do you create a filled contour plot in Matplotlib?");
        options.add("A) plt.contourf(), B) plt.fill_contour(), C) plot.fill_contour(), D) contour.plot()");
        answers.add("A) plt.contourf()");

        questions.add("Which method is used to set the figure size in Matplotlib?");
        options.add("A) plt.set_figure_size(), B) plt.figure_size(), C) plt.figsize(), D) plt.figure(figsize=())");
        answers.add("D) plt.figure(figsize=())");

        questions.add("How do you create a polar plot in Matplotlib?");
        options.add("A) plt.polar(), B) plt.plot.polar(), C) plot.polar(), D) polar.plot()");
        answers.add("A) plt.polar()");

        questions.add("Which parameter is used to set line width in Matplotlib?");
        options.add("A) linewidth, B) line_width, C) width, D) plt.line_width()");
        answers.add("A) linewidth");

        questions.add("What is the purpose of plt.imshow() in Matplotlib?");
        options.add("A) Plot images, B) Show plot, C) Set image size, D) Add labels to image");
        answers.add("A) Plot images");

        questions.add("How do you create a quiver plot in Matplotlib?");
        options.add("A) plt.quiverplot(), B) plt.plot.quiver(), C) plt.quiver(), D) plot.quiverplot()");
        answers.add("C) plt.quiver()");

        questions.add("Which method is used to create a streamplot in Matplotlib?");
        options.add("A) plt.streamplot(), B) plt.plot.stream(), C) plot.stream(), D) stream.plot()");
        answers.add("A) plt.streamplot()");

        questions.add("How do you add a colorbar to a plot in Matplotlib?");
        options.add("A) plt.colorbar(), B) plt.plot.colorbar(), C) colorbar.plot(), D) plot.colorbar()");
        answers.add("A) plt.colorbar()");

        questions.add("What is the purpose of plt.subplots_adjust() in Matplotlib?");
        options.add("A) Adjust subplot layout, B) Set subplot size, C) Add padding to subplot, D) Adjust subplot spacing");
        answers.add("A) Adjust subplot layout");

        questions.add("How do you create a log-scaled plot in Matplotlib?");
        options.add("A) plt.logscale(), B) plt.plot.logscale(), C) plt.log(), D) plt.yscale('log')");
        answers.add("D) plt.yscale('log')");

        questions.add("Which method is used to set tick labels in Matplotlib?");
        options.add("A) plt.set_ticks(), B) plt.set_ticklabels(), C) plt.xticks(), plt.yticks(), D) ticks.plot()");
        answers.add("C) plt.xticks(), plt.yticks()");

        questions.add("How do you add a text box to a plot in Matplotlib?");
        options.add("A) plt.add_textbox(), B) plt.textbox(), C) plt.text(), D) plot.textbox()");
        answers.add("C) plt.text()");
    }
    
 
    
    public static void main(String[]args){
        new MatPlotLib_Quiz(name).setVisible(true);
    }
    
}


