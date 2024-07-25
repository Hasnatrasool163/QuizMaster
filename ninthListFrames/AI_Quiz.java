package ninthListFrames;

import frame.Quiz;
/**
 * @author MuhammadHasnatRasool
 */
public class AI_Quiz extends Quiz{
    

    public AI_Quiz(String name) {
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


    // questions:47
    @Override
    public final void loadQuestions() {

        questions.add("What is the term used for a machine's ability to imitate human behavior?");
        options.add("A) Artificial Intelligence, B) Machine Learning, C) Deep Learning, D) Neural Networks");
        answers.add("A) Artificial Intelligence");

        questions.add("Which algorithm is often used for classification and regression tasks?");
        options.add("A) Decision Trees, B) K-Means, C) Apriori, D) Q-Learning");
        answers.add("A) Decision Trees");

        questions.add("Which of the following is a popular library for deep learning?");
        options.add("A) TensorFlow, B) NumPy, C) SciPy, D) Pandas");
        answers.add("A) TensorFlow");

        questions.add("What type of learning uses labeled data to train models?");
        options.add("A) Supervised Learning, B) Unsupervised Learning, C) Reinforcement Learning, D) Semi-Supervised Learning");
        answers.add("A) Supervised Learning");

        questions.add("Which neural network is most commonly used for image recognition tasks?");
        options.add("A) Convolutional Neural Network, B) Recurrent Neural Network, C) Feedforward Neural Network, D) Generative Adversarial Network");
        answers.add("A) Convolutional Neural Network");

        questions.add("What is a common method for reducing overfitting in neural networks?");
        options.add("A) Dropout, B) Batch Normalization, C) Data Augmentation, D) All of the above");
        answers.add("D) All of the above");

        questions.add("Which AI technique involves learning through rewards and punishments?");
        options.add("A) Reinforcement Learning, B) Supervised Learning, C) Unsupervised Learning, D) Semi-Supervised Learning");
        answers.add("A) Reinforcement Learning");

        questions.add("What is the main goal of unsupervised learning?");
        options.add("A) Discovering hidden patterns in data, B) Predicting outcomes, C) Maximizing rewards, D) Minimizing errors");
        answers.add("A) Discovering hidden patterns in data");

        questions.add("Which activation function is commonly used in neural networks?");
        options.add("A) ReLU, B) Sigmoid, C) Tanh, D) All of the above");
        answers.add("D) All of the above");

        questions.add("What does 'NLP' stand for in the context of AI?");
        options.add("A) Natural Language Processing, B) Neural Language Programming, C) Nonlinear Programming, D) Network Layer Processing");
        answers.add("A) Natural Language Processing");

        questions.add("Which AI technique is used to generate new data similar to existing data?");
        options.add("A) Generative Adversarial Networks, B) Convolutional Neural Networks, C) Recurrent Neural Networks, D) Autoencoders");
        answers.add("A) Generative Adversarial Networks");

        questions.add("What is the term for a network that contains loops, allowing information to persist?");
        options.add("A) Recurrent Neural Network, B) Convolutional Neural Network, C) Feedforward Neural Network, D) Generative Adversarial Network");
        answers.add("A) Recurrent Neural Network");

        questions.add("Which AI field involves making machines capable of reasoning and learning?");
        options.add("A) Artificial Intelligence, B) Data Science, C) Software Engineering, D) Information Technology");
        answers.add("A) Artificial Intelligence");

        questions.add("Which of the following is a commonly used algorithm for classification in machine learning?");
        options.add("A) Linear Regression, B) Decision Tree, C) K-Means, D) Apriori");
        answers.add("B) Decision Tree");

        questions.add("What is the purpose of a confusion matrix in machine learning?");
        options.add("A) To measure the accuracy of a regression model, B) To evaluate the performance of a classification model, C) To optimize hyperparameters, D) To reduce dimensionality");
        answers.add("B) To evaluate the performance of a classification model");

        questions.add("Which of the following is an unsupervised learning algorithm?");
        options.add("A) Support Vector Machine, B) Linear Regression, C) K-Means, D) Decision Tree");
        answers.add("C) K-Means");

        questions.add("What is the primary goal of reinforcement learning?");
        options.add("A) To classify data, B) To predict continuous values, C) To find patterns in data, D) To learn optimal actions through rewards and penalties");
        answers.add("D) To learn optimal actions through rewards and penalties");

        questions.add("Which of the following is a loss function commonly used in neural networks?");
        options.add("A) Mean Absolute Error, B) Cross-Entropy, C) R-squared, D) Silhouette Score");
        answers.add("B) Cross-Entropy");

        questions.add("What is overfitting in the context of machine learning?");
        options.add("A) When the model performs well on training data but poorly on test data, B) When the model performs well on both training and test data, C) When the model performs poorly on both training and test data, D) When the model has too few features");
        answers.add("A) When the model performs well on training data but poorly on test data");

        questions.add("Which technique is used to reduce overfitting in neural networks?");
        options.add("A) Increasing learning rate, B) Adding dropout layers, C) Using larger batch sizes, D) Decreasing the number of epochs");
        answers.add("B) Adding dropout layers");

        questions.add("What is the function of an activation function in a neural network?");
        options.add("A) To update the weights during backpropagation, B) To introduce non-linearity into the model, C) To normalize input data, D) To initialize weights");
        answers.add("B) To introduce non-linearity into the model");
        
        questions.add("What is the purpose of the ReLU activation function in neural networks?");
        options.add("A) To handle negative values, B) To speed up training, C) To prevent vanishing gradients, D) To perform normalization");
        answers.add("C) To prevent vanishing gradients");

        questions.add("Which of the following algorithms is typically used for anomaly detection?");
        options.add("A) K-Nearest Neighbors, B) Linear Regression, C) Principal Component Analysis, D) Isolation Forest");
        answers.add("D) Isolation Forest");

        questions.add("What is transfer learning in the context of deep learning?");
        options.add("A) Training a model on multiple datasets, B) Using pre-trained models and fine-tuning on a new task, C) Using multiple models for a single task, D) Training a model from scratch on a large dataset");
        answers.add("B) Using pre-trained models and fine-tuning on a new task");

        questions.add("Which metric is commonly used to evaluate the performance of a regression model?");
        options.add("A) Accuracy, B) Precision, C) Recall, D) Mean Squared Error");
        answers.add("D) Mean Squared Error");

        questions.add("What is the role of a convolutional layer in a Convolutional Neural Network (CNN)?");
        options.add("A) To reduce the dimensionality of the input, B) To detect features in the input data, C) To prevent overfitting, D) To perform normalization");
        answers.add("B) To detect features in the input data");

        questions.add("Which type of neural network is commonly used for sequence data such as text or time series?");
        options.add("A) Convolutional Neural Network (CNN), B) Recurrent Neural Network (RNN), C) Feedforward Neural Network, D) Generative Adversarial Network (GAN)");
        answers.add("B) Recurrent Neural Network (RNN)");

        questions.add("What is the main advantage of using ensemble methods in machine learning?");
        options.add("A) Faster training time, B) Higher model interpretability, C) Improved model performance, D) Reduced need for feature engineering");
        answers.add("C) Improved model performance");

        questions.add("Which of the following is a generative model in machine learning?");
        options.add("A) Support Vector Machine, B) K-Means, C) Autoencoder, D) Random Forest");
        answers.add("C) Autoencoder");

        questions.add("What is a hyperparameter in the context of machine learning?");
        options.add("A) A parameter that is learned during training, B) A parameter that is set before the training process, C) A parameter that measures model performance, D) A parameter that reduces dimensionality");
        answers.add("B) A parameter that is set before the training process");

        questions.add("Which algorithm is used to reduce the dimensionality of data?");
        options.add("A) Decision Tree, B) Principal Component Analysis (PCA), C) K-Nearest Neighbors, D) Gradient Boosting");
        answers.add("B) Principal Component Analysis (PCA)");

        questions.add("What is the main goal of clustering in machine learning?");
        options.add("A) To classify data into predefined categories, B) To find patterns in data, C) To group similar data points together, D) To predict future values");
        answers.add("C) To group similar data points together");

        questions.add("Which of the following is a type of reinforcement learning algorithm?");
        options.add("A) Q-Learning, B) Linear Regression, C) K-Means, D) Naive Bayes");
        answers.add("A) Q-Learning");

        questions.add("What is the purpose of dropout in a neural network?");
        options.add("A) To speed up training, B) To introduce non-linearity, C) To prevent overfitting, D) To increase learning rate");
        answers.add("C) To prevent overfitting");

        questions.add("Which library is commonly used for natural language processing?");
        options.add("A) TensorFlow, B) scikit-learn, C) NLTK, D) Matplotlib");
        answers.add("C) NLTK");

        questions.add("What is a common technique used for image augmentation in deep learning?");
        options.add("A) Scaling, B) Rotation, C) Translation, D) All of the above");
        answers.add("D) All of the above");

        questions.add("What is the primary advantage of using a Generative Adversarial Network (GAN)?");
        options.add("A) Improved accuracy on classification tasks, B) Ability to generate realistic synthetic data, C) Faster training time, D) Simplified model architecture");
        answers.add("B) Ability to generate realistic synthetic data");

        questions.add("Which of the following is an evaluation metric for binary classification?");
        options.add("A) Confusion Matrix, B) R-squared, C) Silhouette Score, D) Mean Squared Error");
        answers.add("A) Confusion Matrix");

        questions.add("What is the purpose of a validation set in machine learning?");
        options.add("A) To train the model, B) To test the model, C) To tune hyperparameters, D) To reduce dimensionality");
        answers.add("C) To tune hyperparameters");

        questions.add("Which technique is used to handle imbalanced datasets?");
        options.add("A) Feature Scaling, B) Data Augmentation, C) SMOTE, D) Cross-Validation");
        answers.add("C) SMOTE");

        questions.add("What is a perceptron in the context of neural networks?");
        options.add("A) A type of activation function, B) A single-layer neural network, C) A loss function, D) A regularization technique");
        answers.add("B) A single-layer neural network");

        questions.add("Which algorithm is used for association rule mining?");
        options.add("A) Apriori, B) K-Means, C) Decision Tree, D) Linear Regression");
        answers.add("A) Apriori");

        questions.add("What is the purpose of LSTM units in RNNs?");
        options.add("A) To handle vanishing gradient problem, B) To introduce non-linearity, C) To reduce dimensionality, D) To perform batch normalization");
        answers.add("A) To handle vanishing gradient problem");
        
        questions.add("Which of the following is a type of deep learning architecture?");
        options.add("A) Random Forest, B) K-Means, C) Convolutional Neural Network, D) Decision Tree");
        answers.add("C) Convolutional Neural Network");

        questions.add("What is the purpose of the softmax function in a neural network?");
        options.add("A) To normalize the input data, B) To convert logits to probabilities, C) To initialize weights, D) To prevent overfitting");
        answers.add("B) To convert logits to probabilities");

        questions.add("Which metric is commonly used to evaluate clustering algorithms?");
        options.add("A) Accuracy, B) Silhouette Score, C) Mean Absolute Error, D) R-squared");
        answers.add("B) Silhouette Score");

        questions.add("What is the main goal of feature selection in machine learning?");
        options.add("A) To improve model performance, B) To reduce the number of features, C) To increase model complexity, D) To normalize the data");
        answers.add("A) To improve model performance");


    }
    
    public static void main(String[]args){
        new AI_Quiz(name).setVisible(true);
    }
    
}


