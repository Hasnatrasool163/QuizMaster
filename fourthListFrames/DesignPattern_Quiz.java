package fourthListFrames;

/**
 * @author MuhammadHasnatRasool
 */
import frame.Quiz;

public class DesignPattern_Quiz extends Quiz {
    // 17

    public DesignPattern_Quiz(String name) {
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

    // 32 questions
    @Override
    public final void loadQuestions() {

        questions.add("What is the purpose of the Singleton pattern?");
        options.add("A) To create a new instance of a class every time it's requested, B) To ensure only one instance of a class is created, C) To allow multiple instances of a class to be created, D) To restrict access to a class");
        answers.add("B) To ensure only one instance of a class is created");

        questions.add("Which pattern is used to decouple an abstraction from its implementation?");
        options.add("A) Bridge, B) Adapter, C) Composite, D) Decorator");
        answers.add("A) Bridge");

        questions.add("What is the main benefit of using the Factory pattern?");
        options.add("A) To reduce code duplication, B) To increase code complexity, C) To improve code readability, D) To encapsulate object creation");
        answers.add("D) To encapsulate object creation");

        questions.add("Which pattern is used to implement a recursive data structure?");
        options.add("A) Composite, B) Decorator, C) Flyweight, D) Proxy");
        answers.add("A) Composite");

        questions.add("What is the purpose of the Observer pattern?");
        options.add("A) To notify objects of changes to other objects, B) To create a new instance of a class every time it's requested, C) To ensure only one instance of a class is created, D) To restrict access to a class");
        answers.add("A) To notify objects of changes to other objects");

        questions.add("Which pattern is used to provide a unified interface to a set of interfaces?");
        options.add("A) Adapter, B) Bridge, C) Composite, D) Facade");
        answers.add("D) Facade");

        questions.add("What is the main benefit of using the Command pattern?");
        options.add("A) To reduce code duplication, B) To increase code complexity, C) To improve code readability, D) To encapsulate requests as objects");
        answers.add("D) To encapsulate requests as objects");

        questions.add("Which pattern is used to implement a shared instance of a class?");
        options.add("A) Singleton, B) Factory, C) Prototype, D) Multiton");
        answers.add("A) Singleton");

        questions.add("What is the purpose of the State pattern?");
        options.add("A) To manage the state of an object, B) To create a new instance of a class every time it's requested, C) To ensure only one instance of a class is created, D) To restrict access to a class");
        answers.add("A) To manage the state of an object");

        questions.add("Which pattern is used to provide a way to access the elements of a collection without exposing its underlying implementation?");
        options.add("A) Iterator, B) Generator, C) Visitor, D) Enumeration");
        answers.add("A) Iterator");

        questions.add("What is the main benefit of using the Template Method pattern?");
        options.add("A) To reduce code duplication, B) To increase code complexity, C) To improve code readability, D) To provide a way to reuse code");
        answers.add("D) To provide a way to reuse code");

        questions.add("Which pattern is used to implement a caching mechanism?");
        options.add("A) Singleton, B) Factory, C) Prototype, D) Flyweight");
        answers.add("D) Flyweight");

        questions.add("What is the purpose of the Mediator pattern?");
        options.add("A) To reduce coupling between objects, B) To increase coupling between objects, C) To improve code readability, D) To restrict access to a class");
        answers.add("A) To reduce coupling between objects");

        questions.add("Which pattern is used to provide a way to create objects without specifying their concrete classes?");
        options.add("A) Factory, B) Abstract Factory, C) Builder, D) Prototype");
        answers.add("A) Factory");

        questions.add("What is the main benefit of using the Chain of Responsibility pattern?");
        options.add("A) To reduce code duplication, B) To increase code complexity, C) To improve code readability, D) To provide a way to handle requests in a flexible way");
        answers.add("D) To provide a way to handle requests in a flexible way");

        questions.add("Which pattern is used to implement a logging mechanism?");
        options.add("A) Singleton, B) Factory, C) Prototype, D) Observer");
        answers.add("D) Observer");

        questions.add("What is the purpose of the Memento pattern?");
        options.add("A) To provide a way to restore the state of an object, B) To create a new instance of a class every time it's requested, C) To ensure only one instance of a class is created, D) To restrict access to a class");
        answers.add("A) To provide a way to restore the state of an object");

        questions.add("Which pattern is used to implement a flexible and extensible way to handle requests?");
        options.add("A) Chain of Responsibility, B) Command, C) Interpreter, D) Iterator");
        answers.add("A) Chain of Responsibility");

        questions.add("What is the main benefit of using the Abstract Factory pattern?");
        options.add("A) To reduce code duplication, B) To increase code complexity, C) To improve code readability, D) To provide a way to create families of related objects");
        answers.add("D) To provide a way to create families of related objects");

        questions.add("Which pattern is used to implement a way to access the elements of a collection without exposing its underlying implementation?");
        options.add("A) Iterator, B) Generator, C) Visitor, D) Enumeration");
        answers.add("A) Iterator");

        questions.add("What is the purpose of the Strategy pattern?");
        options.add("A) To define a family of algorithms, B) To encapsulate a request as an object, C) To implement a caching mechanism, D) To provide a way to restore the state of an object");
        answers.add("A) To define a family of algorithms");

        questions.add("Which pattern is used to implement a way to create objects without specifying their concrete classes?");
        options.add("A) Factory, B) Abstract Factory, C) Builder, D) Prototype");
        answers.add("A) Factory");

        questions.add("What is the main benefit of using the Adapter pattern?");
        options.add("A) To reduce code duplication, B) To increase code complexity, C) To improve code readability, D) To provide a way to use an existing class with a different interface");
        answers.add("D) To provide a way to use an existing class with a different interface");

        questions.add("Which pattern is used to implement a way to manage the state of an object?");
        options.add("A) State, B) Singleton, C) Factory, D) Prototype");
        answers.add("A) State");

        questions.add("What is the purpose of the Bridge pattern?");
        options.add("A) To decouple an abstraction from its implementation, B) To encapsulate a request as an object, C) To implement a caching mechanism, D) To provide a way to restore the state of an object");
        answers.add("A) To decouple an abstraction from its implementation");

        questions.add("Which pattern is used to implement a way to provide a unified interface to a set of interfaces?");
        options.add("A) Adapter, B) Bridge, C) Composite, D) Facade");
        answers.add("D) Facade");

        questions.add("What is the main benefit of using the Command pattern?");
        options.add("A) To reduce code duplication, B) To increase code complexity, C) To improve code readability, D) To encapsulate requests as objects");
        answers.add("D) To encapsulate requests as objects");

        questions.add("Which pattern is used to implement a way to create a copy of an object?");
        options.add("A) Prototype, B) Singleton, C) Factory, D) Builder");
        answers.add("A) Prototype");

        questions.add("What is the purpose of the Interpreter pattern?");
        options.add("A) To define a grammar for a language, B) To encapsulate a request as an object, C) To implement a caching mechanism, D) To provide a way to restore the state of an object");
        answers.add("A) To define a grammar for a language");

        questions.add("Which pattern is used to implement a way to provide a way to access the elements of a collection without exposing its underlying implementation?");
        options.add("A) Iterator, B) Generator, C) Visitor, D) Enumeration");
        answers.add("A) Iterator");

        questions.add("What is the main benefit of using the Mediator pattern?");
        options.add("A) To reduce code duplication, B) To increase code complexity, C) To improve code readability, D) To provide a way to reduce coupling between objects");
        answers.add("D) To provide a way to reduce coupling between objects");

        questions.add("Which pattern is used to implement a way to implement a logging mechanism?");
        options.add("A) Singleton, B) Factory, C) Prototype, D) Observer");
        answers.add("D) Observer");
    }



    public static void main(String[] args) {
        new DesignPattern_Quiz(name).setVisible(true);
    }

}
