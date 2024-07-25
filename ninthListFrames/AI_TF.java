package ninthListFrames;

import frame.True_False_Questions;

public class AI_TF extends True_False_Questions {

    public AI_TF(String name) {
        super(name);
    }
// AI 68
    @Override
    public final void loadQuestions() {
        questions.add("Supervised learning requires labeled data for training.");
        answers.add("True");

        questions.add("Unsupervised learning algorithms do not need labeled data.");
        answers.add("True");

        questions.add("Reinforcement learning is based on the concept of rewards and punishments.");
        answers.add("True");

        questions.add("A neural network can only have one hidden layer.");
        answers.add("False");

        questions.add("Overfitting occurs when a model performs well on training data but poorly on new, unseen data.");
        answers.add("True");

        questions.add("Underfitting occurs when a model is too simple to capture the underlying pattern of the data.");
        answers.add("True");

        questions.add("A decision tree is a type of supervised learning algorithm.");
        answers.add("True");

        questions.add("The activation function in a neural network introduces non-linearity into the model.");
        answers.add("True");

        questions.add("Gradient descent is an optimization algorithm used to minimize the loss function.");
        answers.add("True");

        questions.add("In k-means clustering, the value of k represents the number of clusters.");
        answers.add("True");

        questions.add("Principal Component Analysis (PCA) is a technique used for dimensionality reduction.");
        answers.add("True");

        questions.add("Feature scaling is a process that transforms features into the same range to improve model performance.");
        answers.add("True");

        questions.add("The F1 score is the harmonic mean of precision and recall.");
        answers.add("True");

        questions.add("An ensemble method combines the predictions of multiple models to improve accuracy.");
        answers.add("True");

        questions.add("Bagging and boosting are both ensemble learning techniques.");
        answers.add("True");

        questions.add("A convolutional neural network (CNN) is primarily used for natural language processing.");
        answers.add("False");

        questions.add("Recurrent neural networks (RNNs) are well-suited for sequential data tasks.");
        answers.add("True");

        questions.add("A hyperparameter is a parameter whose value is set before the learning process begins.");
        answers.add("True");

        questions.add("Regularization techniques such as L1 and L2 are used to prevent overfitting.");
        answers.add("True");

        questions.add("The sigmoid activation function outputs values between 0 and 1.");
        answers.add("True");

        questions.add("The Rectified Linear Unit (ReLU) activation function is often used in deep learning models.");
        answers.add("True");

        questions.add("Batch normalization helps to accelerate training and improve model stability.");
        answers.add("True");

        questions.add("Transfer learning involves using a pre-trained model on a new, related task.");
        answers.add("True");

        questions.add("The curse of dimensionality refers to the exponential increase in data required to support an increase in dimensionality.");
        answers.add("True");

        questions.add("The confusion matrix is a tool used to evaluate the performance of classification algorithms.");
        answers.add("True");

        questions.add("Stochastic gradient descent updates the model parameters using the entire dataset.");
        answers.add("False");

        questions.add("Cross-validation is a technique for assessing how well a model generalizes to new data.");
        answers.add("True");

        questions.add("The bias-variance tradeoff describes the balance between a model's ability to minimize bias and variance.");
        answers.add("True");

        questions.add("An autoencoder is a type of neural network used for unsupervised learning.");
        answers.add("True");

        questions.add("The softmax function is used in the output layer of a neural network for multi-class classification.");
        answers.add("True");

        questions.add("Generative Adversarial Networks (GANs) consist of a generator and a discriminator.");
        answers.add("True");

        questions.add("In reinforcement learning, the agent learns by interacting with the environment.");
        answers.add("True");

        questions.add("An epoch is one complete pass through the training dataset.");
        answers.add("True");

        questions.add("Backpropagation is an algorithm used to update the weights of a neural network.");
        answers.add("True");

        questions.add("A high learning rate can cause a model to converge quickly but may miss the optimal solution.");
        answers.add("True");

        questions.add("The k-nearest neighbors (k-NN) algorithm is a type of supervised learning algorithm.");
        answers.add("True");

        questions.add("Support Vector Machines (SVM) can be used for both classification and regression tasks.");
        answers.add("True");

        questions.add("In a random forest, each tree is trained on a random subset of the data.");
        answers.add("True");

        questions.add("A confusion matrix is used to assess the performance of clustering algorithms.");
        answers.add("False");

        questions.add("The precision of a model is the ratio of true positive predictions to the total number of positive predictions.");
        answers.add("True");

        questions.add("Recall is also known as sensitivity or the true positive rate.");
        answers.add("True");

        questions.add("The AUC-ROC curve is used to evaluate the performance of classification models.");
        answers.add("True");

        questions.add("A high precision model always has high recall.");
        answers.add("False");

        questions.add("The learning rate controls how much the model's weights are adjusted with respect to the loss gradient.");
        answers.add("True");

        questions.add("Dropout is a regularization technique used to prevent overfitting in neural networks.");
        answers.add("True");

        questions.add("A linear regression model assumes a linear relationship between the input and output variables.");
        answers.add("True");

        questions.add("LSTM (Long Short-Term Memory) networks are a type of RNN used for handling long-term dependencies.");
        answers.add("True");

        questions.add("A hyperparameter tuning process is used to find the best hyperparameters for a model.");
        answers.add("True");

        questions.add("The term 'epoch' refers to the process of dividing a dataset into multiple smaller datasets.");
        answers.add("False");

        questions.add("In machine learning, a feature is an individual measurable property or characteristic of a phenomenon being observed.");
        answers.add("True");

        questions.add("Deep learning models are a subset of machine learning models.");
        answers.add("True");

        questions.add("An activation function is used in neural networks to introduce non-linearity.");
        answers.add("True");

        questions.add("ReLU activation function can cause the 'dying ReLU' problem where neurons output zero for all inputs.");
        answers.add("True");

        questions.add("Normalization and standardization are techniques to scale input features to a similar range.");
        answers.add("True");

        questions.add("A confusion matrix for a binary classification problem has four cells.");
        answers.add("True");

        questions.add("AdaBoost is a boosting algorithm that adjusts the weights of incorrectly classified instances.");
        answers.add("True");

        questions.add("A higher F1 score indicates a better model performance when precision and recall are important.");
        answers.add("True");

        questions.add("Anomaly detection can be performed using unsupervised learning techniques.");
        answers.add("True");

        questions.add("A sigmoid function is typically used in the output layer of binary classification models.");
        answers.add("True");

        questions.add("A Markov decision process is used to model decision-making in reinforcement learning.");
        answers.add("True");

        questions.add("Feature selection is the process of selecting the most important features for a model.");
        answers.add("True");

        questions.add("Ensemble learning typically results in better model performance compared to single models.");
        answers.add("True");

        questions.add("A generative model learns the joint probability distribution of the input and output data.");
        answers.add("True");

        questions.add("Cross-entropy loss is often used for classification problems.");
        answers.add("True");

        questions.add("A high bias model tends to underfit the data.");
        answers.add("True");

        questions.add("Grid search is a technique used for hyperparameter tuning by exhaustively searching through a specified subset of hyperparameters.");
        answers.add("True");

        questions.add("Data augmentation is a technique used to artificially increase the size of a training dataset.");
        answers.add("True");

        questions.add("In machine learning, a model is an algorithm that has been trained on a dataset.");
        answers.add("True");
    }

    public static void main(String[] args) {
        new AI_TF(name).setVisible(true);
    }

}
