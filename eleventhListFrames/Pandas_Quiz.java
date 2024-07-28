package eleventhListFrames;

import frame.Quiz;

/**
 * @author MuhammadHasnatRasool
 */
public class Pandas_Quiz extends Quiz{
    

    public Pandas_Quiz(String name) {
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


    // questions:38
    @Override
    public final void loadQuestions() {

        questions.add("What is Pandas primarily used for in Python?");
        options.add("A) Web development, B) Data analysis and manipulation, C) Machine learning, D) Network security");
        answers.add("B) Data analysis and manipulation");

        questions.add("Which function is used to create a DataFrame in Pandas?");
        options.add("A) pd.DataFrame(), B) pd.Series(), C) pd.array(), D) pd.createDataFrame()");
        answers.add("A) pd.DataFrame()");

        questions.add("What is a DataFrame in Pandas?");
        options.add("A) A two-dimensional labeled data structure, B) A one-dimensional labeled array, C) A collection of arrays, D) A visualization tool");
        answers.add("A) A two-dimensional labeled data structure");

        questions.add("How do you read a CSV file into a Pandas DataFrame?");
        options.add("A) pd.read_excel(), B) pd.read_csv(), C) pd.read_table(), D) pd.read_json()");
        answers.add("B) pd.read_csv()");

        questions.add("Which method is used to get the first 5 rows of a DataFrame?");
        options.add("A) df.head(), B) df.tail(), C) df.sample(), D) df.first()");
        answers.add("A) df.head()");

        questions.add("How do you display basic information about a DataFrame?");
        options.add("A) df.info(), B) df.describe(), C) df.head(), D) df.summary()");
        answers.add("A) df.info()");

        questions.add("Which method provides descriptive statistics for a DataFrame?");
        options.add("A) df.info(), B) df.describe(), C) df.summary(), D) df.head()");
        answers.add("B) df.describe()");

        questions.add("How do you select a single column from a DataFrame?");
        options.add("A) df[\"column\"], B) df.column, C) Both A and B, D) Neither A nor B");
        answers.add("C) Both A and B");

        questions.add("Which function is used to drop a column from a DataFrame?");
        options.add("A) df.delete(), B) df.remove(), C) df.drop(), D) df.pop()");
        answers.add("C) df.drop()");

        questions.add("How do you check for missing values in a DataFrame?");
        options.add("A) df.isna(), B) df.isnull(), C) df.notna(), D) Both A and B");
        answers.add("D) Both A and B");

        questions.add("Which method is used to fill missing values in a DataFrame?");
        options.add("A) df.replace(), B) df.fillna(), C) df.dropna(), D) df.complete()");
        answers.add("B) df.fillna()");

        questions.add("How do you sort a DataFrame by a specific column?");
        options.add("A) df.sort_values(), B) df.sort_index(), C) df.order_by(), D) df.sort()");
        answers.add("A) df.sort_values()");

        questions.add("Which method is used to concatenate two DataFrames?");
        options.add("A) pd.concat(), B) pd.append(), C) pd.merge(), D) pd.join()");
        answers.add("A) pd.concat()");

        questions.add("How do you merge two DataFrames based on a common column?");
        options.add("A) pd.concat(), B) pd.append(), C) pd.merge(), D) pd.join()");
        answers.add("C) pd.merge()");

        questions.add("What is the purpose of the `groupby` method in Pandas?");
        options.add("A) To filter data, B) To group data for aggregation, C) To merge DataFrames, D) To sort data");
        answers.add("B) To group data for aggregation");

        questions.add("Which function is used to remove duplicate rows in a DataFrame?");
        options.add("A) df.drop_duplicates(), B) df.remove_duplicates(), C) df.delete_duplicates(), D) df.clean_duplicates()");
        answers.add("A) df.drop_duplicates()");

        questions.add("How do you reset the index of a DataFrame?");
        options.add("A) df.reset_index(), B) df.set_index(), C) df.reindex(), D) df.index_reset()");
        answers.add("A) df.reset_index()");

        questions.add("Which method is used to rename columns in a DataFrame?");
        options.add("A) df.rename(), B) df.columns(), C) df.rename_columns(), D) df.set_columns()");
        answers.add("A) df.rename()");

        questions.add("How do you filter rows in a DataFrame based on a condition?");
        options.add("A) df.filter(), B) df.query(), C) df[df['column'] > value], D) df.select()");
        answers.add("C) df[df['column'] > value]");

        questions.add("Which function is used to convert a DataFrame to a NumPy array?");
        options.add("A) df.to_numpy(), B) df.as_matrix(), C) df.to_array(), D) df.to_list()");
        answers.add("A) df.to_numpy()");

        questions.add("What is the purpose of the `pivot_table` method?");
        options.add("A) To merge DataFrames, B) To group and aggregate data, C) To reshape data, D) To filter data");
        answers.add("C) To reshape data");

        questions.add("Which method is used to apply a function to each element in a DataFrame?");
        options.add("A) df.applymap(), B) df.apply(), C) df.map(), D) df.transform()");
        answers.add("A) df.applymap()");

        questions.add("How do you read an Excel file into a Pandas DataFrame?");
        options.add("A) pd.read_csv(), B) pd.read_excel(), C) pd.read_table(), D) pd.read_json()");
        answers.add("B) pd.read_excel()");

        questions.add("Which function is used to write a DataFrame to a CSV file?");
        options.add("A) df.to_csv(), B) df.write_csv(), C) df.save_csv(), D) df.export_csv()");
        answers.add("A) df.to_csv()");

        questions.add("How do you calculate the correlation matrix of a DataFrame?");
        options.add("A) df.corr(), B) df.cov(), C) df.correlation(), D) df.covariance()");
        answers.add("A) df.corr()");

        questions.add("Which method is used to get the unique values in a column?");
        options.add("A) df.unique(), B) df.distinct(), C) df.drop_duplicates(), D) df['column'].unique()");
        answers.add("D) df['column'].unique()");

        questions.add("What is the purpose of the `pd.to_datetime` function?");
        options.add("A) To convert a DataFrame to datetime format, B) To parse dates in a DataFrame, C) To convert strings to datetime, D) To extract date components");
        answers.add("C) To convert strings to datetime");

        questions.add("Which method is used to plot data from a DataFrame?");
        options.add("A) df.plot(), B) df.graph(), C) df.chart(), D) df.visualize()");
        answers.add("A) df.plot()");

        questions.add("How do you add a new column to a DataFrame?");
        options.add("A) df.add_column(), B) df.insert(), C) df['new_column'] = values, D) df.append_column()");
        answers.add("C) df['new_column'] = values");

        questions.add("Which function is used to create a Series in Pandas?");
        options.add("A) pd.Series(), B) pd.DataFrame(), C) pd.array(), D) pd.createSeries()");
        answers.add("A) pd.Series()");

        questions.add("How do you access the index of a DataFrame?");
        options.add("A) df.index, B) df.columns, C) df.values, D) df.axes");
        answers.add("A) df.index");

        questions.add("Which method is used to change the data type of a column?");
        options.add("A) df.convert(), B) df.astype(), C) df.change_type(), D) df.transform()");
        answers.add("B) df.astype()");

        questions.add("How do you concatenate DataFrames along the columns?");
        options.add("A) pd.concat([df1, df2], axis=0), B) pd.concat([df1, df2], axis=1), C) pd.append([df1, df2]), D) pd.merge([df1, df2])");
        answers.add("B) pd.concat([df1, df2], axis=1)");

        questions.add("What is the purpose of the `pd.cut` function?");
        options.add("A) To split data into bins, B) To cut strings, C) To filter data, D) To merge data");
        answers.add("A) To split data into bins");

        questions.add("How do you iterate over rows in a DataFrame?");
        options.add("A) df.iterrows(), B) df.iterate(), C) df.loop(), D) df.forEach()");
        answers.add("A) df.iterrows()");

        questions.add("Which method is used to apply a function along an axis of the DataFrame?");
        options.add("A) df.map(), B) df.apply(), C) df.applymap(), D) df.transform()");
        answers.add("B) df.apply()");

        questions.add("How do you create a DataFrame from a dictionary?");
        options.add("A) pd.DataFrame.from_dict(), B) pd.DataFrame.from_csv(), C) pd.DataFrame.from_excel(), D) pd.DataFrame.from_table()");
        answers.add("A) pd.DataFrame.from_dict()");

        questions.add("Which method is used to remove missing values from a DataFrame?");
        options.add("A) df.dropna(), B) df.fillna(), C) df.removena(), D) df.clean()");
        answers.add("A) df.dropna()");
    }
    

    
    public static void main(String[]args){
        new Pandas_Quiz(name).setVisible(true);
    }
    
}


