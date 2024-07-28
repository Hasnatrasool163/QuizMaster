package eleventhListFrames;

import frame.Quiz;
/**
 * @author MuhammadHasnatRasool
 */
public class Numpy_Quiz extends Quiz{
    

    public Numpy_Quiz(String name) {
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

    // questions:37

    @Override
    public final void loadQuestions() {

        questions.add("What is NumPy primarily used for in Python?");
        options.add("A) Data visualization, B) Machine learning, C) Scientific computing, D) Web development");
        answers.add("C) Scientific computing");

        questions.add("Which module is used to import NumPy in Python?");
        options.add("A) numpy, B) np, C) num, D) py.numpy");
        answers.add("B) np");

        questions.add("What is a NumPy array?");
        options.add("A) A one-dimensional labeled array, B) A collection of arrays, C) A multi-dimensional data structure, D) A visual representation");
        answers.add("C) A multi-dimensional data structure");

        questions.add("How do you create a NumPy array from a Python list?");
        options.add("A) np.array(list), B) numpy(list), C) array(list), D) create.array(list)");
        answers.add("A) np.array(list)");

        questions.add("What is the shape of a NumPy array?");
        options.add("A) The number of elements in the array, B) The dimensions of the array, C) The size of the array, D) The data type of the array");
        answers.add("B) The dimensions of the array");

        questions.add("How do you check the data type of elements in a NumPy array?");
        options.add("A) array.dtype, B) np.data_type(array), C) np.dtype(array), D) type(array)");
        answers.add("C) np.dtype(array)");

        questions.add("Which function is used to generate an array of zeros in NumPy?");
        options.add("A) np.zeros(), B) np.ones(), C) np.empty(), D) np.full()");
        answers.add("A) np.zeros()");

        questions.add("How do you create an identity matrix using NumPy?");
        options.add("A) np.identity(), B) np.eye(), C) np.ones(), D) np.zeros()");
        answers.add("B) np.eye()");

        questions.add("What does the `np.arange` function do in NumPy?");
        options.add("A) Generates evenly spaced values within a given interval, B) Generates random values, C) Generates zeros, D) Generates identity matrices");
        answers.add("A) Generates evenly spaced values within a given interval");

        questions.add("Which function is used to reshape a NumPy array?");
        options.add("A) np.reshape(), B) array.reshape(), C) reshape.array(), D) np.array()");
        answers.add("A) np.reshape()");

        questions.add("How do you perform element-wise addition of two NumPy arrays?");
        options.add("A) array.add(), B) np.add(), C) array + array2, D) np.sum()");
        answers.add("C) array + array2");

        questions.add("What is broadcasting in NumPy?");
        options.add("A) Combining arrays with different dimensions, B) Broadcasting messages, C) Receiving data from a remote source, D) Converting data types");
        answers.add("A) Combining arrays with different dimensions");

        questions.add("How do you calculate the dot product of two NumPy arrays?");
        options.add("A) array.dot(), B) np.multiply(), C) np.dot(), D) array.product()");
        answers.add("C) np.dot()");

        questions.add("Which function is used to find the maximum value in a NumPy array?");
        options.add("A) np.max(), B) array.max(), C) max(array), D) np.maximum()");
        answers.add("A) np.max()");

        questions.add("How do you calculate the mean of elements in a NumPy array?");
        options.add("A) np.mean(), B) array.mean(), C) mean(array), D) np.average()");
        answers.add("A) np.mean()");

        questions.add("What does the `np.std` function compute?");
        options.add("A) Standard deviation, B) Variance, C) Mean, D) Median");
        answers.add("A) Standard deviation");

        questions.add("Which function is used to sort elements in a NumPy array?");
        options.add("A) np.sort(), B) array.sort(), C) sort(array), D) sorted(array)");
        answers.add("A) np.sort()");

        questions.add("How do you concatenate NumPy arrays along a specified axis?");
        options.add("A) np.concatenate(), B) array.concat(), C) concat.array(), D) np.concat()");
        answers.add("A) np.concatenate()");

        questions.add("What is the purpose of the `np.transpose` function?");
        options.add("A) To reshape an array, B) To flatten an array, C) To transpose dimensions, D) To reverse an array");
        answers.add("C) To transpose dimensions");

        questions.add("How do you find the index of the maximum value in a NumPy array?");
        options.add("A) np.max_index(), B) np.argmax(), C) max_index(array), D) array.max_index()");
        answers.add("B) np.argmax()");

        questions.add("Which function is used to calculate element-wise natural logarithm in NumPy?");
        options.add("A) np.log(), B) np.log10(), C) np.exp(), D) np.natural_log()");
        answers.add("A) np.log()");

        questions.add("How do you perform matrix multiplication using NumPy?");
        options.add("A) np.multiply(), B) array.multiply(), C) np.matmul(), D) np.dot()");
        answers.add("C) np.matmul()");

        questions.add("What does the `np.random.rand` function do?");
        options.add("A) Generates random integers, B) Generates random floats, C) Generates random values from a normal distribution, D) Generates random values from a uniform distribution");
        answers.add("B) Generates random floats");

        questions.add("Which function is used to compute the cumulative sum of elements in a NumPy array?");
        options.add("A) np.cumsum(), B) array.cumulative_sum(), C) sum(array), D) np.sum()");
        answers.add("A) np.cumsum()");

        questions.add("What is the purpose of the `np.unique` function?");
        options.add("A) To find unique elements in an array, B) To remove duplicates, C) To sort elements, D) To concatenate arrays");
        answers.add("A) To find unique elements in an array");

        questions.add("Which method is used to extract diagonal elements from a NumPy array?");
        options.add("A) np.diag(), B) array.diagonal(), C) diag(array), D) array.diag()");
        answers.add("A) np.diag()");

        questions.add("How do you calculate the element-wise square root of elements in a NumPy array?");
        options.add("A) np.sqrt(), B) array.sqrt(), C) sqrt(array), D) np.square()");
        answers.add("A) np.sqrt()");

        questions.add("Which function is used to calculate the element-wise absolute value in NumPy?");
        options.add("A) np.abs(), B) array.abs(), C) abs(array), D) np.absolute()");
        answers.add("A) np.abs()");

        questions.add("What does the `np.clip` function do in NumPy?");
        options.add("A) Clips values to a specified range, B) Reshapes arrays, C) Rounds values, D) Transposes arrays");
        answers.add("A) Clips values to a specified range");

        questions.add("How do you find the intersection of two NumPy arrays?");
        options.add("A) np.intersect(), B) np.intersection(), C) np.intersect1d(), D) array.intersection()");
        answers.add("C) np.intersect1d()");

        questions.add("What is the purpose of the `np.meshgrid` function?");
        options.add("A) To create a grid of values, B) To calculate mesh coordinates, C) To visualize arrays, D) To flatten arrays");
        answers.add("A) To create a grid of values");

        questions.add("How do you perform element-wise comparison of two NumPy arrays?");
        options.add("A) array.compare(), B) np.compare(), C) np.equal(), D) array.equal()");
        answers.add("C) np.equal()");

        questions.add("Which function is used to calculate the element-wise exponentiation in NumPy?");
        options.add("A) np.pow(), B) np.exponent(), C) np.exp(), D) np.power()");
        answers.add("D) np.power()");

        questions.add("How do you compute the element-wise sine of elements in a NumPy array?");
        options.add("A) np.sin(), B) array.sin(), C) sin(array), D) np.sine()");
        answers.add("A) np.sin()");

        questions.add("What does the `np.where` function do in NumPy?");
        options.add("A) Finds elements meeting a condition, B) Replaces elements based on a condition, C) Concatenates arrays, D) Searches for elements");
        answers.add("A) Finds elements meeting a condition");

        questions.add("Which method is used to round elements in a NumPy array to the nearest integer?");
        options.add("A) np.round(), B) array.round(), C) round(array), D) np.around()");
        answers.add("A) np.round()");

        questions.add("How do you calculate the element-wise cumulative product in a NumPy array?");
        options.add("A) np.product(), B) array.cumprod(), C) np.cumulative_product(), D) array.product()");
        answers.add("B) array.cumprod()");

    }
    

    public static void main(String[]args){
        new Numpy_Quiz(name).setVisible(true);
    }
    
}


