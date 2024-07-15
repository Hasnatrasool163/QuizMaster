package firstListFrames;

import frame.Quiz;


/**
 * @author MuhammadHasnatRasool
 */

public class R_Quiz extends Quiz{
    

    public R_Quiz(String name) {
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


  
    // quiz :31
    @Override
    public final void loadQuestions() {
 
        questions.add("What is the function used to print output in R?");
        options.add("A) cat(), B) print(), C) display(), D) show()");
        answers.add("B) print()");

        questions.add("Which function is used to create a vector in R?");
        options.add("A) vector(), B) c(), C) create_vector(), D) vec()");
        answers.add("B) c()");

        questions.add("How do you create a data frame in R?");
        options.add("A) dataframe(), B) data.frame(), C) create_dataframe(), D) df()");
        answers.add("B) data.frame()");

        questions.add("Which of the following is used to install a package in R?");
        options.add("A) install.package(), B) install.packages(), C) install(), D) package.install()");
        answers.add("B) install.packages()");

        questions.add("How do you access help documentation for a function in R?");
        options.add("A) help(function_name), B) ?function_name, C) info(function_name), D) doc(function_name)");
        answers.add("B) ?function_name");

        questions.add("What is the function used to read a CSV file in R?");
        options.add("A) read.csv(), B) read_csv(), C) readfile.csv(), D) readfile()");
        answers.add("A) read.csv()");

        questions.add("Which operator is used for assignment in R?");
        options.add("A) =, B) <-, C) :=, D) =>");
        answers.add("B) <-");

        questions.add("How do you check the structure of an R object?");
        options.add("A) str(), B) structure(), C) info(), D) type()");
        answers.add("A) str()");

        questions.add("What function is used to create a sequence of numbers in R?");
        options.add("A) seq(), B) sequence(), C) create_seq(), D) range()");
        answers.add("A) seq()");

        questions.add("Which function is used to combine vectors by rows in R?");
        options.add("A) rbind(), B) cbind(), C) combine(), D) bind_rows()");
        answers.add("A) rbind()");

        questions.add("How do you find the mean of a vector in R?");
        options.add("A) mean(), B) avg(), C) average(), D) mean_value()");
        answers.add("A) mean()");

        questions.add("Which function is used to create a plot in R?");
        options.add("A) plot(), B) graph(), C) create_plot(), D) draw()");
        answers.add("A) plot()");

        questions.add("How do you remove NA values from a vector in R?");
        options.add("A) na.rm=TRUE, B) remove_na(), C) na.omit(), D) omit_na()");
        answers.add("A) na.rm=TRUE");

        questions.add("Which function is used to create a histogram in R?");
        options.add("A) histogram(), B) hist(), C) create_hist(), D) plot_hist()");
        answers.add("B) hist()");

        questions.add("What is the function used to create a matrix in R?");
        options.add("A) matrix(), B) mat(), C) create_matrix(), D) matrix_create()");
        answers.add("A) matrix()");

        questions.add("How do you find the length of a vector in R?");
        options.add("A) len(), B) length(), C) size(), D) dim()");
        answers.add("B) length()");

        questions.add("Which function is used to apply a function to each element of a list in R?");
        options.add("A) apply(), B) lapply(), C) sapply(), D) tapply()");
        answers.add("B) lapply()");

        questions.add("What is the function used to concatenate strings in R?");
        options.add("A) paste(), B) concat(), C) join(), D) cat()");
        answers.add("A) paste()");

        questions.add("How do you calculate the standard deviation in R?");
        options.add("A) sd(), B) std(), C) stdev(), D) deviation()");
        answers.add("A) sd()");

        questions.add("Which function is used to get the current working directory in R?");
        options.add("A) getwd(), B) cwd(), C) currentdir(), D) wd()");
        answers.add("A) getwd()");

        questions.add("How do you set a seed for random number generation in R?");
        options.add("A) set.seed(), B) seed(), C) random.seed(), D) set_random()");
        answers.add("A) set.seed()");

        questions.add("Which function is used to summarize a data frame in R?");
        options.add("A) summary(), B) summarize(), C) describe(), D) sum_data()");
        answers.add("A) summary()");

        questions.add("What is the function to merge two data frames in R?");
        options.add("A) merge(), B) join(), C) combine(), D) union()");
        answers.add("A) merge()");

        questions.add("How do you filter rows in a data frame in R?");
        options.add("A) filter(), B) subset(), C) select(), D) rows()");
        answers.add("B) subset()");

        questions.add("Which function is used to create a boxplot in R?");
        options.add("A) boxplot(), B) plot_box(), C) create_boxplot(), D) box()");
        answers.add("A) boxplot()");

        questions.add("What is the function used to calculate the variance in R?");
        options.add("A) var(), B) variance(), C) calc_var(), D) var_calc()");
        answers.add("A) var()");

        questions.add("How do you remove duplicate elements from a vector in R?");
        options.add("A) unique(), B) remove_duplicates(), C) distinct(), D) rm_dup()");
        answers.add("A) unique()");

        questions.add("Which function is used to create a bar plot in R?");
        options.add("A) barplot(), B) bar_plot(), C) create_barplot(), D) plot_bar()");
        answers.add("A) barplot()");

        questions.add("How do you create a factor in R?");
        options.add("A) factor(), B) create_factor(), C) as.factor(), D) factorize()");
        answers.add("A) factor()");

        questions.add("Which function is used to apply a function to the margins of an array in R?");
        options.add("A) apply(), B) lapply(), C) sapply(), D) tapply()");
        answers.add("A) apply()");

        questions.add("How do you concatenate vectors in R?");
        options.add("A) c(), B) concat(), C) combine(), D) join()");
        answers.add("A) c()");

        
    }

    
    public static void main(String[]args){
        new R_Quiz(name).setVisible(true);
    }
    
}


