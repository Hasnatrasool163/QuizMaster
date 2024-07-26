package tenthListFrames;

import frame.Quiz;
/**
 * @author MuhammadHasnatRasool
 */
public class TensorFlow_Quiz extends Quiz{
    

    public TensorFlow_Quiz(String name) {
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

// questions:36
    @Override
    public final void loadQuestions() {

        questions.add("What is TensorFlow primarily used for?");
        options.add("A) Web development, B) Data visualization, C) Machine learning and deep learning, D) Network security");
        answers.add("C) Machine learning and deep learning");

        questions.add("Which company developed TensorFlow?");
        options.add("A) Microsoft, B) IBM, C) Google, D) Amazon");
        answers.add("C) Google");

        questions.add("What is a tensor in TensorFlow?");
        options.add("A) A type of neural network, B) A multi-dimensional array, C) A machine learning model, D) A programming language");
        answers.add("B) A multi-dimensional array");

        questions.add("Which function is used to create a constant tensor in TensorFlow?");
        options.add("A) tf.Variable, B) tf.constant, C) tf.placeholder, D) tf.tensor");
        answers.add("B) tf.constant");

        questions.add("What is the purpose of the `tf.placeholder` function in TensorFlow?");
        options.add("A) To initialize variables, B) To create placeholders for feeding data, C) To build computational graphs, D) To perform backpropagation");
        answers.add("B) To create placeholders for feeding data");

        questions.add("Which TensorFlow function is used to perform matrix multiplication?");
        options.add("A) tf.add, B) tf.multiply, C) tf.matmul, D) tf.dot");
        answers.add("C) tf.matmul");

        questions.add("What is the primary benefit of using GPUs with TensorFlow?");
        options.add("A) Increased memory, B) Faster computations, C) Better visualization, D) Easier debugging");
        answers.add("B) Faster computations");

        questions.add("Which of the following is a high-level API for building and training models in TensorFlow?");
        options.add("A) Keras, B) NumPy, C) Matplotlib, D) Pandas");
        answers.add("A) Keras");

        questions.add("What is the use of the `tf.Session` class in TensorFlow?");
        options.add("A) To create tensors, B) To initialize variables, C) To execute computational graphs, D) To perform matrix operations");
        answers.add("C) To execute computational graphs");

        questions.add("How do you initialize all global variables in a TensorFlow session?");
        options.add("A) tf.initialize_all_variables(), B) tf.global_variables_initializer(), C) tf.initialize_variables(), D) tf.init_variables()");
        answers.add("B) tf.global_variables_initializer()");

        questions.add("Which function is used to create a variable tensor in TensorFlow?");
        options.add("A) tf.constant, B) tf.Variable, C) tf.placeholder, D) tf.tensor");
        answers.add("B) tf.Variable");

        questions.add("What is the purpose of the `tf.reduce_mean` function?");
        options.add("A) To calculate the sum of elements, B) To calculate the mean of elements, C) To calculate the product of elements, D) To calculate the variance of elements");
        answers.add("B) To calculate the mean of elements");

        questions.add("Which of the following is a TensorFlow optimizer?");
        options.add("A) tf.train.AdamOptimizer, B) tf.train.GradientDescentOptimizer, C) tf.train.RMSPropOptimizer, D) All of the above");
        answers.add("D) All of the above");

        questions.add("What is the purpose of the `tf.data.Dataset` API?");
        options.add("A) To create computational graphs, B) To build neural network layers, C) To load and preprocess data, D) To visualize data");
        answers.add("C) To load and preprocess data");

        questions.add("Which TensorFlow function is used to compute the softmax of a tensor?");
        options.add("A) tf.sigmoid, B) tf.softmax, C) tf.tanh, D) tf.relu");
        answers.add("B) tf.softmax");

        questions.add("What is the purpose of the `tf.nn.dropout` function?");
        options.add("A) To prevent overfitting by randomly dropping units, B) To initialize weights, C) To perform activation, D) To normalize data");
        answers.add("A) To prevent overfitting by randomly dropping units");

        questions.add("How do you save a trained TensorFlow model?");
        options.add("A) tf.train.save, B) tf.save_model, C) tf.keras.models.save_model, D) tf.save");
        answers.add("C) tf.keras.models.save_model");

        questions.add("Which function is used to load a saved TensorFlow model?");
        options.add("A) tf.load_model, B) tf.train.load, C) tf.keras.models.load_model, D) tf.load");
        answers.add("C) tf.keras.models.load_model");

        questions.add("What is the purpose of the `tf.train.Saver` class?");
        options.add("A) To save and restore variables, B) To create tensors, C) To perform matrix operations, D) To initialize variables");
        answers.add("A) To save and restore variables");

        questions.add("Which function is used to apply gradients to variables in TensorFlow?");
        options.add("A) tf.apply_gradients, B) tf.train.GradientDescentOptimizer.apply_gradients, C) tf.train.AdamOptimizer.apply_gradients, D) tf.apply_optimizer");
        answers.add("B) tf.train.GradientDescentOptimizer.apply_gradients");

        questions.add("What is the purpose of the `tf.one_hot` function?");
        options.add("A) To create one-hot encoded vectors, B) To perform matrix multiplication, C) To initialize variables, D) To calculate loss");
        answers.add("A) To create one-hot encoded vectors");

        questions.add("Which function is used to compute the sigmoid of a tensor?");
        options.add("A) tf.relu, B) tf.softmax, C) tf.sigmoid, D) tf.tanh");
        answers.add("C) tf.sigmoid");

        questions.add("What is the role of the `tf.summary` module?");
        options.add("A) To create tensors, B) To initialize variables, C) To visualize data in TensorBoard, D) To perform matrix operations");
        answers.add("C) To visualize data in TensorBoard");

        questions.add("Which TensorFlow function is used to compute the ReLU of a tensor?");
        options.add("A) tf.sigmoid, B) tf.softmax, C) tf.tanh, D) tf.nn.relu");
        answers.add("D) tf.nn.relu");

        questions.add("What is the purpose of the `tf.layers` module?");
        options.add("A) To perform data augmentation, B) To build neural network layers, C) To optimize models, D) To visualize data");
        answers.add("B) To build neural network layers");

        questions.add("Which function is used to apply batch normalization in TensorFlow?");
        options.add("A) tf.layers.batch_normalization, B) tf.nn.batch_normalization, C) tf.batch_norm, D) tf.batch_normalization");
        answers.add("A) tf.layers.batch_normalization");

        questions.add("What is the purpose of the `tf.reshape` function?");
        options.add("A) To initialize variables, B) To change the shape of a tensor, C) To perform matrix multiplication, D) To create tensors");
        answers.add("B) To change the shape of a tensor");

        questions.add("Which optimizer is known for combining the advantages of both AdaGrad and RMSProp?");
        options.add("A) Gradient Descent, B) Adam, C) RMSProp, D) AdaGrad");
        answers.add("B) Adam");

        questions.add("What is the function of `tf.image.resize`?");
        options.add("A) To crop images, B) To rotate images, C) To resize images, D) To normalize images");
        answers.add("C) To resize images");

        questions.add("Which method is used to add a layer to a Sequential model in TensorFlow?");
        options.add("A) model.add_layer, B) model.add, C) model.insert, D) model.append");
        answers.add("B) model.add");

        questions.add("What is the purpose of `tf.nn.sigmoid_cross_entropy_with_logits`?");
        options.add("A) To calculate the sigmoid of logits, B) To compute the cross-entropy loss for binary classification, C) To initialize variables, D) To perform matrix multiplication");
        answers.add("B) To compute the cross-entropy loss for binary classification");

        questions.add("Which function is used to split a tensor into sub-tensors in TensorFlow?");
        options.add("A) tf.concat, B) tf.split, C) tf.tile, D) tf.stack");
        answers.add("B) tf.split");

        questions.add("What is the purpose of the `tf.gather` function?");
        options.add("A) To gather slices from a tensor, B) To initialize variables, C) To perform matrix multiplication, D) To create tensors");
        answers.add("A) To gather slices from a tensor");

        questions.add("Which TensorFlow function is used to apply the tanh activation function?");
        options.add("A) tf.relu, B) tf.softmax, C) tf.sigmoid, D) tf.nn.tanh");
        answers.add("D) tf.nn.tanh");

        questions.add("What is the purpose of `tf.argmax`?");
        options.add("A) To find the maximum value in a tensor, B) To find the index of the maximum value along an axis, C) To calculate the sum of elements, D) To perform matrix multiplication");
        answers.add("B) To find the index of the maximum value along an axis");

        questions.add("Which function is used to perform element-wise multiplication of two tensors?");
        options.add("A) tf.matmul, B) tf.add, C) tf.multiply, D) tf.divide");
        answers.add("C) tf.multiply");

    }
    
    public static void main(String[]args){
        new TensorFlow_Quiz(name).setVisible(true);
    }
    
}


