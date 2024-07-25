package ninthListFrames;

import frame.Quiz;
/**
 * @author MuhammadHasnatRasool
 */
public class OOP_Quiz extends Quiz {

    public OOP_Quiz(String name) {
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

    // questions:111
    @Override
    public final void loadQuestions() {

        questions.add(" What is an example of dynamic binding?");
        options.add("A)any method, B)method overloading, C)method overriding, D)compiling");
        answers.add("C)method overriding");

        questions.add(" For which case would the use of a static attribute be appropriate?");
        options.add("A)the number of people in each house in a small neighborhood, B)the lot size for each house in a small neighborhood, C)the color of each house in a small neighborhood, D)the weather conditions for each house in a small neighborhood");
        answers.add("D)the weather conditions for each house in a small neighborhood");

        questions.add(" 1 Why would you create an abstract class, if it can have no real instances?");
        options.add("A)to avoid redundant coding in children, B)to explore a hypothetical class, C)to prevent unwanted method implementation, D)to reserve memory for an unspecified class type");
        answers.add("A)to avoid redundant coding in children");

        questions.add(" 2 Why would you create an abstract class, if it can have no real instances?");
        options.add("A)to have common behavior in derived classes, B)to explore a hypothetical class, C)to prevent unwanted method implementation, D)to reserve memory for an unspecified class type");
        answers.add("A)to have common behavior in derived classes");

        questions.add(" When does static binding happen?");
        options.add("A)only when you export, B)both at compile time and runtime, C)at compile time, D)at runtime");
        answers.add("C)at compile time");

        questions.add(" What is the best reason to use a design pattern?");
        options.add("A)It will result in code that is more extensible and maintainable, B)It will result in a more compact product., C)It will speed initial development., D)It will allow you to add that design pattern to your resume.");
        answers.add("A)It will result in code that is more extensible and maintainable");

        questions.add(" What is encapsulation?");
        options.add("A)defining classes by focusing on what is important for a purpose, B)hiding the data and implementation details within a class, C)making all methods private, D)using words to define classes");
        answers.add("B)hiding the data and implementation details within a class");

        questions.add(" What is an IS-A relationship?");
        options.add("A)It implies encapsulation., B)A superclass object has an IS-A relationship with its subclass., C)It implies a virtual method., D)A subclass object has an IS-A relationship with its superclass or interface");
        answers.add("D)A subclass object has an IS-A relationship with its superclass or interface");

        questions.add(" You want a method with behavior similar to a virtual method--it is meant to be overridden --expect that it does not have a method body. It just has a method signature. What kind of method should you use?");
        options.add("A)an abstract method, B)a public internal method, C)an internal method, D)a protected internal method");
        answers.add("A)an abstract method");

        questions.add(" Which code creates a new object from the Employee class?");
        options.add("A)Employee currentEmployee = Employee.Create();, B)Employee currentEmployee = new Employee();, C)Employee currentEmployee;, D)Employee currentEmployee = Employee.New();");
        answers.add("B)Employee currentEmployee = new Employee();");

        questions.add(" Which type of constructor cannot have a return type?");
        options.add("A)default, B)copy, C)parameterized, D)Constructors do not have a return type");
        answers.add("D)Constructors do not have a return type");

        questions.add(" When is a constructor executed?");
        options.add("A)when an object is created from a class using the new keyword, B)when an class is defined using the class keyword, C)every time an object is referenced, D)when an object is created from a class using the create keyword");
        answers.add("A)when an object is created from a class using the new keyword");

        questions.add(" When is a constructor executed?");
        options.add("A)when an object is created from a class, B)when an class is defined using the class keyword, C)every time an object is referenced, D)when an object is created from a class using the create keyword");
        answers.add("A)when an object is created from a class");

        questions.add(" If a local class is defined in a function, what is true for an object of that class?");
        options.add("A)The object can be accessed declared and used locally in that function., B)The object must be declared inside any other function., C)The object is temporarily accessible outside the function., D)The object can call all the other class members anywhere in the program.");
        answers.add("A)The object can be accessed declared, and used locally in that function.");

        questions.add(" Which two blocks are used to handle and check errors?");
        options.add("A)do and check, B)catching and trying, C)try and catch, D)do and while");
        answers.add("C)try and catch");

        questions.add(" Why would you implement composition using an id instead of a reference?");
        options.add("A)It makes it easier to save the entity., B)all of these answers, C)It can make the entity retrieval more efficient, D)It minimizes coupling.");
        answers.add("B)all of these answers");

        questions.add(" Which statement best describes the method of inheritance in OOP?");
        options.add("A)Inheritance describes the ability to create new classes based on an existing class., B)Inheritance means that a group of related properties methods and other members are treated as a single unit or object., C)Inheritance forces a class to have a single responsibility from only one parent., D)Inheritance means that you will never have multiple classes that can be used interchangeably even though each class implements the same properties or methods in different ways.");
        answers.add("A)Inheritance describes the ability to create new classes based on an existing class.");

        questions.add(" Which type of inheritance ,when done continuously, is similar to a tree structure?");
        options.add("A)multilevel, B)hierarchical and multiple, C)hierarchical, D)multiple");
        answers.add("C)hierarchical");

        questions.add(" Which statement is true?");
        options.add("A)A default parameter's constructor is not equivalent to the default constructor, B)A default constructor is inherited from a parent class, C)A default constructor can be called explicitly, D)A default constructor cannot be defined by the coder");
        answers.add("C)A default constructor can be called explicitly");

        questions.add(" Which of the following is NOT an advantage of using getters and setters?");
        options.add("A)Getters and setters can speed up compilation., B)Getters and setters provide encapsulation of behavior., C)Getters and setters provide a debugging point for when a property changes at runtime., D)Getters and setters permit different access levels.");
        answers.add("A)Getters and setters can speed up compilation.");

        questions.add(" In context of OOP, what is association?");
        options.add("A)Association is a relationship where all objects have their own life cycle and there is no owner., B)Association is the process where model elements cooperate to provide higher-level behavior., C)Association is whole/part relationship where one object is composed of one or more other objects each of which is considered a part of the whole., D)Association is where all objects have their own life cycle but there is ownerhip and child objects can not belong to another parent object.");
        answers.add("A)Association is a relationship where all objects have their own life cycle and there is no owner.");

        questions.add(" How are user stories different from use cases?");
        options.add("A)User Stories are shorter and less detailed., B)User stories are more accurate., C)User stories are more detailed and structured., D)User storised are more anecdotal and personal.");
        answers.add("A)User Stories are shorter and less detailed.");

        questions.add(" Which type of inheritance must be used so that the resultant is hybrid?");
        options.add("A)multiple, B)any type of inheritance, C)multilevel, D)hierarchical");
        answers.add("A)multiple");

        questions.add(" A language that does not support polymorphism but supports classes is considered what?");
        options.add("A)an object-based language, B)a class-based language, C)a procedure-oriented language, D)if classes are supported polymorphism will be supported");
        answers.add("A)an object-based language");

        questions.add(" Two classes combine private data members and provide public member functions to access and manipulate those data members. Where is abstraction used?");
        options.add("A)Abstraction is using a private access specifier for the data members., B)Abstraction is using public member functions to access and manipulate the data members., C)Abstraction is using the class concept with both data members and member functions., D)There is insufficient information to decide where abstraction is being used.");
        answers.add("B)Abstraction is using public member functions to access and manipulate the data members.");

        questions.add(" In multilevel inheritance, one class inherits how many classes?");
        options.add("A)one class only, B)two classes, C)as many classes as required, D)at least two classes");
        answers.add("A)one class only");

        questions.add(" if an object is passed by reference, the changes made in the function are reflected _____.");
        options.add("A)to the main object of the caller function too, B)on the caller function object and also the called function object, C)on the copy of the object that is made during the pass, D)only in the local scope of the called function");
        answers.add("A)to the main object of the caller function too");

        questions.add(" What is a method?");
        options.add("A)a set of instructions designed to perform a frequently used operation within a program and return no values, B)the exact same thing as a function and subroutine, C)a set of variables that can change over time, D)They are functions attached to specific classes (or instances) in object-oriented programming.");
        answers.add("D)They are functions attached to specific classes (or instances) in object-oriented programming.");

        questions.add(" A mobile phone is made up of components such as a motherboard, camera, and sensors. The motherboard represents all the functions of a phone, the display shows the display only, and the phone is represented as a whole. Which of the following has the highest level of abstraction?");
        options.add("A)camera, B)display, C)motherboard, D)mobile phone");
        answers.add("D)mobile phone");

        questions.add(" Which class has the highest degree of abstraction in a multilevel inheritance relationship of five levels?");
        options.add("A)the class at the third level, B)the class at the first level, C)All have the same degree of abstraction., D)the class at the second level");
        answers.add("B)the class at the first level");

        questions.add(" Which is NOT one of the basic types of inheritance?");
        options.add("A)multilevel inheritance, B)double inheritance, C)single inheritance, D)hierarchical inheritance");
        answers.add("B)double inheritance");

        questions.add(" Why is code duplication so insidious?");
        options.add("A)The duplication uses unnecessary space., B)One has to maintain all the duplicates., C)Duplication can cause intellectual property concerns., D)Duplication is easy to hide.");
        answers.add("B)One has to maintain all the duplicates.");

        questions.add(" When and how often is a static constructor called?");
        options.add("A)It is called initially when an object is created and called with every new object instance., B)It is called when an object is destroyed and only one time., C)It is called initially when an object is created and only one time., D)It is created at time when the object is discarded.");
        answers.add("A)It is called initially when an object is created and only one time.");

        questions.add(" What is the usage of static constructor?");
        options.add("A)to initialize all the members with static value, B)to delete the static members when not required, C)to initialize the static members of class, D)to clear all the static members' initialized values");
        answers.add("C)to initialize the static members of class");

        questions.add(" What are CRC Cards?");
        options.add("A)Code Responsibility Collection cards are a brainstorming tool used in the design of procedural software, B)Class Responsibility collaboration cards are a brainstorming tool used in the design of oop software, C)Code Responsibility Correction cards are tools used for debugging, D)Code Responsibility Correction cards are tools for modeling");
        answers.add("B)Class Responsibility collaboration cards are a brainstorming tool used in the design of oop software");

        questions.add("  How are contents of a composition different from those of aggregation?");
        options.add("A)if one element of an aggregation is dereferenced all its elements are eligible for garbage collection, B)if a composition dies the contents die, C)the contents of a composition are all siblings, D)an aggregation contains only abstract classes");
        answers.add("B)if a composition dies the contents die");

        questions.add("  Which statement about compositions and aggregations is true?");
        options.add("A)if one element of an aggregation is dereferenced all its elements are eligible for garbage collection, B)if a composition dies the contents die, C)the contents of a composition are all siblings, D)an aggregation contains only abstract classes");
        answers.add("B)if a composition dies the contents die");

        questions.add(" What is the result of using more abstraction?");
        options.add("A)it can increase code vulnerability, B)it can make code unsafe, C)it can limit code readability, D)it can be safer for coding");
        answers.add("C)it can limit code readability");

        questions.add(" Which is false for a member function of a class?");
        options.add("A)Member functions can be defined only inside or outside the class body., B)Member functions can be made to be friends of another class., C)Member functions do not need to be declared inside the class definition., D)All member functions need to be defined.");
        answers.add("C)Member functions do not need to be declared inside the class definition.");

        questions.add(" Why is inheritance used when creating a new class?");
        options.add("A)to protect attributes from unwanted changes, B)to delegate coding responsibility more efficiently, C)to conserve memory, D)to separate class behavior from the more general to more specific");
        answers.add("D)to separate class behavior from the more general to more specific");

        questions.add(" In addition to attributes and behaviours, what quality must a class possess?");
        options.add("A)a name, B)a state, C)a color, D)an object");
        answers.add("A)a name");

        questions.add(" Which type of function among the following shows polymorphism?");
        options.add("A)inline function, B)undefined function, C)virtual function, D)class member function");
        answers.add("C)virtual function");

        questions.add(" Which words in the following list are candidates for objects: trumpet, clean, enrage, leaf, tree, collapse, active, and lively?");
        options.add("A)leaf and tree, B)clean enrage and collapse, C)clean active and lively, D)leaf tree and trumpet");
        answers.add("D)leaf tree and trumpet");

        questions.add(" What best describes what object-oriented programming does?");
        options.add("A)It focuses on objects that interact cleanly with one another., B)It programs exclusively to interfaces., C)It programs exclusively to classes., D)It creates one class for all business logic.");
        answers.add("A)It focuses on objects that interact cleanly with one another.");

        questions.add(" Can abstract classes be used in multilevel inheritance?");
        options.add("A)No abstract classes can be used only in single-level inheritance since they must be immediately implemented., B)yes always, C)yes but with only one abstract class, D)No abstract classes do not have constructors.");
        answers.add("B)yes, always");

        questions.add(" What type of inheritance may lead to the diamond problem?");
        options.add("A)single level, B)multilevel, C)hierarchical, D)multiple");
        answers.add("D)multiple");

        questions.add(" What is the relationship between abstraction and encapsulation?");
        options.add("A)Abstraction is about making relevant information visible while encapsulation enables a programmer to implement the desired level of abstraction., B)Abstraction and encapsulation are essentially the same., C)Abstraction and encapsulation are unrelated., D)Encapsulation is about making relevant information visible while abstraction enables a programmer to implement the desired level of encapsulation.");
        answers.add("A)Abstraction is about making relevant information visible, while encapsulation enables a programmer to implement the desired level of abstraction.");

        questions.add(" Which of these keywords are access specifiers?");
        options.add("A)abstract and public, B)public and private, C)this and final, D)final and abstract");
        answers.add("B)public and private");

        questions.add(" What is a reference to an object?");
        options.add("A)It is the address of variable only -not the method of an object., B)It is a shallow pointer that contains address of an object., C)It is the physical address of an object., D)It is the address where the variables and methods of an object are stored.");
        answers.add("D)It is the address where the variables and methods of an object are stored.");

        questions.add(" Why is unit testing harder in OOP than functional programming?");
        options.add("A)Objects may maintain internal state which is not easily accessible by the tests., B)The quality of unit testing frameworks for functional languages is better., C)OOP promotes code reuse which means that your tests have to consider more use cases., D)Object-oriented languages tend to rely on frameworks such as Spring or Hibernate which make them difficult to test.");
        answers.add("A)Objects may maintain internal state which is not easily accessible by the tests.");

        questions.add(" What is the function of a user diagram?");
        options.add("A)It connects actors to use cases., B)It links actors to roles played in all use cases., C)It lists all actors for each use case., D)It minimizes the number of actors required.");
        answers.add("A)It connects actors to use cases.");

        questions.add(" How do object behaviors and attributes differ?");
        options.add("A)Behavior describe dynamic properties; attributes are static., B)Attributes describe a state; behaviors describe a change., C)Attributes apply only to a specified object; behavior apply to other linked objects., D)Behaviors are vector quantities; attributes are scalars.");
        answers.add("B)Attributes describe a state; behaviors describe a change.");

        questions.add(" The open/closed principle states that classes should be open for ___  but closed for ____   .");
        options.add("A)refactoring; duplication, B)modification; duplication, C)extension; modification, D)reuse; encapsulation");
        answers.add("C)extension; modification");

        questions.add(" Why would you override a method of a base class?");
        options.add("A)to define a method that must be implemented in a derived class, B)to define a custom implementation of an inherited member, C)to define a method that must be implemented in a superclass only, D)to define a class that can be inherited from");
        answers.add("B)to define a custom implementation of an inherited member");

        questions.add(" What is a copy constructor?");
        options.add("A)It is a unique constructor for creating a new object as a copy of an object that already exists. There will always be only one copy constructor that can be either defined by the user or the system., B)It is a constructor that duplicates itself when requested on demand., C)It is a common constructor for preventing the creation of a new object as a copy of an object that already exists. There will always be multiple standard constructors that can be either defined by the user or the system., D)It is a constructor that duplicates itself on its own based on memory available.");
        answers.add("A)It is a unique constructor for creating a new object as a copy of an object that already exists. There will always be only one copy constructor that can be either defined by the user or the system.");

        questions.add(" What defines the catch block most accurately?");
        options.add("A)The catch block that will be executed is the one that best matches the type of exception thrown., B)Multiple catch blocks can never be associated with a single try block., C)Multiple catch blocks are mandatory for each try block., D)Multiple catch blocks will all be executed in the case of an exception.");
        answers.add("A)The catch block that will be executed is the one that best matches the type of exception thrown.");

        questions.add(" There are five classes. Class E is derived from class D, D from C, C from B, and B from A. Which class constructor(s) will be called first if the object of E or D is created?");
        options.add("A)A, B)B, C)C, D)C and B");
        answers.add("A)A");

        questions.add(" You have modules that are dependent on each other. If you change one module, you have to make changes in the dependent modules. What term is used to describe this problem, and what is a potential solution?");
        options.add("A)Cohesion. A solution is to show that each module has certain responsibilities and to use an anticohesive design pattern., B)Encapsulation. A solution is to implement one of the SOLID principles to ensure the modules do not encapsulate with each other., C)Coupling. A solution is to refactor the code to be loosely coupled by using inversion of control and dependency injection., D)Dependency. A solution is to implement polymorphism and abstraction to change and extract dependent elements of a module so that it functions on its own.");
        answers.add("C)Coupling. A solution is to refactor the code to be loosely coupled by using inversion of control and dependency injection.");

        questions.add(" **__________** describes an aggregation");
        options.add("A)A class of resources, B)A group of methods, C)A collection of objects, D)A list of children");
        answers.add("C)A collection of objects");

        questions.add(" Which type of function can be used for polymorphism?");
        options.add("A)virtual function, B)inline function, C)undefined function, D)private function");
        answers.add("A)virtual function");

        questions.add(" Which choice is a benefit of using dependency injection?");
        options.add("A)loose coupling, B)code reusability, C)lazy initialization, D)data abstraction");
        answers.add("A)loose coupling");

        questions.add(" Are you required to return an object if it was passed by reference to a function, and why or why not?");
        options.add("A)Yes the caller function needs to reflect the changes., B)No you should use a global variable instead., C)No changes will be automatically reflected in the calling function., D)Yes the object must be the same in the caller function.");
        answers.add("C)No, changes will be automatically reflected in the calling function.");

        questions.add(" What is the best example of a superclass and subclass relationship?");
        options.add("A)car:toyota, B)ducks:pond, C)toes:feet, D)rock:stone");
        answers.add("A)car:toyota");

        questions.add(" Which statements best describe the Gang of Four design patterns called Memento and Observer?");
        options.add("A)Memento notifies multiple classes of changes. Observer captures and restores an object's internal state., B)Memento defers the exact steps of an algorithm to a subclass. Observer defines a new operation to a class without change., C)Memento alters an object's behavior when its state changes. Observer encapsulates an algorithm inside a class., D)Memento captures and restores an object's internal state. Observer notifies multiple classes of changes.");
        answers.add("D)Memento captures and restores an object's internal state. Observer notifies multiple classes of changes.");

        questions.add(" What does the value (0.5,0.5,0.5) indicate in the class diagram specification position: Coordinate = (0.5,0.5,0.5)?");
        options.add("A)a default value of the Coordinate attribute, B)the size of the position array, C)an increment of the position attribute value, D)a default value of the position attribute");
        answers.add("D)a default value of the position attribute");

        questions.add(" What is the difference between a parameter and an argument?");
        options.add("A)An argument can have many values while a parameter can have only one value., B)An argument is the variable used for input values in a method. A parameter is the specific input value passed to the method., C)A parameter is a variable in the declaration of a function. An argument is the value of this variable that gets passed to the function., D)Parameters and arguments are the same");
        answers.add("C)A parameter is a variable in the declaration of a function. An argument is the value of this variable that gets passed to the function.");

        questions.add(" What is the scope of a class nested inside another class?");
        options.add("A)Protected scope, B)Private scope, C)Global scope, D)Depends on access specifier and inheritance used");
        answers.add("D)Depends on access specifier and inheritance used");

        questions.add(" Methods and attributes that define an object are a kind of blueprint called what?");
        options.add("A)a collection, B)a variable, C)a class, D)a procedure");
        answers.add("C)a class");

        questions.add(" Assume single inheritance is used with classes A and B while A is the base class. Then assume classes C, D, and E, where C is a base class and D is derived from C, then E is derived from D. Class C is made to inherit from class B. Which type of inheritance is reflected?");
        options.add("A)Multilevel, B)Hybrid, C)Single level, D)Multiple");
        answers.add("A)Multilevel");

        questions.add(" What is the main idea behind separation of concerns?");
        options.add("A)All of these answers, B)Applications are decomposed into parts, C)Parts are defined with minimal overlap, D)Each part is responsible for a separate concern");
        answers.add("A)All of these answers");

        questions.add(" What is the purpose of the finally block?");
        options.add("A)To always run the finally block of code when the try block exits, B)To run code when an exception has not occurred, C)To run the block if an exception occurred, D)To run code whenever garbage collection requires it");
        answers.add("A)To always run the finally block of code when the try block exits");

        questions.add(" Which choice is not an OOP language?");
        options.add("A)C#, B)Java, C)C, D)Python");
        answers.add("A)C");

        questions.add(" What is the function of a finalizer or destructor?");
        options.add("A)To relinquish resources that are no longer needed, B)To delete a variable name, C)To reset an attribute value, D)To hold space even after an object is no longer being used");
        answers.add("A)To relinquish resources that are no longer needed");

        questions.add(" An instance of which type of class cannot be created?");
        options.add("A)Protected class, B)Base class, C)Anonymous class, D)Abstract class");
        answers.add("D)Abstract class");

        questions.add(" In the context of OOP, what is composition?");
        options.add("A)Composition is the act of one object passing to another object an operation to be performed on behalf of the initial object., B)Composition is a part/whole relationship where an object is composed of one or more other objects each of which is considered a part of the whole., C)Composition is a binding where the class/name association is not made until the object designated by the name is created at execution time, D)Composition is a process of collecting classes that provide a set of services for a particular domain");
        answers.add("B)Composition is a part/whole relationship where an object is composed of one or more other objects, each of which is considered a part of the whole.");

        questions.add(" Static polymorphism uses method _______ ?");
        options.add("A)overloading, B)inheritance, C)abstraction, D)overriding");
        answers.add("A)overloading");

        questions.add(" What does a concrete class not have?");
        options.add("A)parents, B)pure virtual functions, C)attributes, D)purposes");
        answers.add("B)pure virtual functions");

        questions.add(" How does dynamic typing complicate troubleshooting?");
        options.add("A)It can be difficult to identify variables that are incorrectly typed, B)The dynamic variables can assume only limited values, C)Storage is fixed for dynamic variables, D)Static variables are more flexible than dynamic variables");
        answers.add("A)It can be difficult to identify variables that are incorrectly typed");

        questions.add(" What is the difference between early binding and late binding?");
        options.add("A)Early binding is when a variable is assigned a value when a scope is created. Late binding is when a variable is assigned a value after a scope is exited, B)Early binding is when a variable is assigned a value when the program starts. Late binding is when a variable is assigned after the program is running, C)There is no difference. In both cases variables are assigned values when a program has completed startup and is running, D)Early binding is when a variable is assigned its value at compile time. Late binding is when a variable is assigned a value at run time");
        answers.add("D)Early binding is when a variable is assigned its value at compile time. Late binding is when a variable is assigned a value at run time");

        questions.add(" What parameters are required to be passed to a class constructor?");
        options.add("A)reference to subclass // References to subclass are never required as you can simply Initialize subclass & use their object., B)reference to base class // References to the base class are not required in Java Javascript & Python, C)reference to this pointer // While Python & Javascript may require passing this or self in the constructor It is not passed in Java constructor., D)none // Above 3 are incorrect so (none) is the answer");
        answers.add("D)none // Above 3 are incorrect so (none) is the answer");

        questions.add(" What are the four principles of object-oriented programming?");
        options.add("A)manipulation encapsulation inheritance and dependency inversion, B)dependency inversion open/closed principle encapsulation and inheritance, C)interface segregation abstraction dependency inversion and inheritance, D)abstraction encapsulation inheritance and polymorphism");
        answers.add("D)abstraction encapsulation inheritance and polymorphism");

        questions.add(" In addition to responsibilities, what should be listed on Class-responsability-collaboration (CRC) cards?");
        options.add("A)which programming language will be used., B)the programmer responsible for implementation., C)interacting classes., D)attributes.");
        answers.add("C)interacting classes.");

        questions.add(" What is the best name for the function that corrects this assessment?");
        options.add("A)makeResult(), B)questionScore(), C)calculateScore(), D)getAnswers()");
        answers.add("C)calculateScore()");

        questions.add(" Which relationship best illustrates an abstract-concrete class relationship?");
        options.add("A)cat : kitten, B)color : red, C)planet : moon, D)truck : window");
        answers.add("C)planet : moon");

        questions.add(" What cannot be used for polymorphism?");
        options.add("A)overloading constructors, B)overloading member functions, C)static member functions, D)overloading predefined operator");
        answers.add("C)static member functions");

        questions.add(" How many levels does multilevel inheritance allow in a program?");
        options.add("A)only 10 levels of inheritance, B)as many levels of inheritance as required within 10 minutes, C)as many levels of inheritance as required, D)only the amount of levels memory permits divided by processor speed");
        answers.add("C)as many levels of inheritance as required");

        questions.add(" What is a virtual Method?");
        options.add("A)a method that you expect may be redefined in derived classes, B)a method that you do not expect to be redefined in derived classes, C)a private method that you do not expect to be redefined in derived public classes, D)a method that exists temporarily once used it ceases to be used by any caller");
        answers.add("A)a method that you expect may be redefined in derived classes");

        questions.add(" Which of these is not a basic principle of Object Oriented Programming?");
        options.add("A)Encapsulation, B)Compilation, C)Inheritance, D)Polymorphism");
        answers.add("B)Compilation");

        questions.add(" How do object behaviours and attributes differ?");
        options.add("A)Behaviour describe dynamic properties; attributes are static., B)Attributes describe a state; behaviours describe a change., C)Attributes apply only to a specified object; behaviour apply to other linked objects., D)Behaviours are vector quantities; attributes are scalars.");
        answers.add("B)Attributes describe a state; behaviours describe a change.");

        questions.add(" How coupled should your classes be and why?");
        options.add("A)You should increase coupling to improve dependencies between classes., B)You should limit coupling to reduce dependencies between classes., C)You should increase coupling so that class members relate to the class purpose., D)You should limit coupling so that class members relate to the class objective.");
        answers.add("B)You should limit coupling to reduce dependencies between classes.");

        questions.add(" Which statement best describes a friend class?");
        options.add("A)Friend classes support base class when necessary., B)A friend class can access the private and protected members of the class in which it is declared as a friend., C)Friend classes do not have any implementation., D)A friend class can access only protected members of the class of which it is a friend.");
        answers.add("B)A friend class can access the private and protected members of the class in which it is declared as a friend.");

        questions.add(" Which code sample demonstrates multiple inheritance?");
        options.add("A)`class employee{ }; class stream{ }; class topper{ };`, B)`class employee{int rating;}; class stream:public employee{ };`, C)`class employee{int rating;}; class stream{int total;}; class topper: employee stream{ };`, D)`class employeef{int rating};}: class stream{ }: class topper: public employee{ }:`");
        answers.add("C)`class employee{int rating;}; class stream{int total;}; class topper: employee, stream{ };`");
//check
        questions.add(" What is multilevel inheritance?");
        options.add("A)a class that does not have more than one parent., B)a class not derived from another derived obiect., C)not doubling single-level inheritance., D)classes derived from other derived classes.");
        answers.add("D)classes derived from other derived classes.");

        questions.add(" Can you have two classes with the same name in the same project?");
        options.add("A)No you cannot., B)Yes as long as their constructors are different., C)Yes as long as their methods are different., D)Yes as long as they are in different namespaces.");
        answers.add("D)Yes, as long as they are in different namespaces.");

        questions.add(" Objects are passed by **_____**");
        options.add("A)value or reference depending on the programming language used, B)value, C)value or reference depending on program, D)reference");
        answers.add("D)reference");

        questions.add(" If a language just implements pass-by-value parameters to functions, can the objects passed as parameters be set to new instances inside the function and their new value will return to the caller?");
        options.add("A)Yes but only if it is a reference and not a primitive class., B)Yes since the value is a reference even though it is passed by value it can be done., C)No you will get a compilation error., D)No a local copy will be initialized and will be lost as soon as it is out of scope.");
        answers.add("D)No, a local copy will be initialized and will be lost as soon as it is out of scope.");

        questions.add(" What is encapsulation?");
        options.add("A)defining classes by focusing on what is important for a purpose, B)defining data and relevant methods together in the same class, C)making all methods private, D)using words to define classes");
        answers.add("B)defining data and relevant methods together in the same class");

        questions.add(" What is a method?");
        options.add("A)a function associated with data and behavior, B)the exact same thing as a function and subroutine, C)a set of variables that can change over time, D)a set of instructions designed to perform a frequently used operation within a program and return no values");
        answers.add("A)a function associated with data and behavior");

// CHECKED 
        questions.add("106 what describes an agrregation");
        options.add("A)A class of resources, B)A group of methods, C)A collection of objects, D)A list of children");
        answers.add("C)A collection of objects");

        questions.add(" What cannot be used for polymorphism?");
        options.add("A)overloading constructors, B)overloading member functions, C)static member functions, D)overloading predefined operator");
        answers.add("C)static member functions");

        questions.add(" An instance of which type of class cannot be created?");
        options.add("A)Protected class, B)Base class, C)Anonymous class, D)Abstract class");
        answers.add("ADAbstract class");

        questions.add(" What are the five Creational Design patterns by the Gang of Four ?");
        options.add("A)Observer State Strategy Template Method and Visitor., B)Composite Visitor State Prototype and Singleton., C)Composite Builder Factory Method Prototype and Singleton., D)Abstract Factory Builder Factory Method Prototype and Singleton.");
        answers.add("D)Abstract Factory Builder Factory Method Prototype and Singleton.");

        questions.add(" What is the difference between an interface and an abstract class?");
        options.add("A)Interfaces contain code or data But no Abstract classes and A class can inherit from more than one abstract class but can implement only one interface., B)Interfaces can contain code or data but abstract classes dont and A class can inherit from only one abstract class but can implement an unlimited number of interfaces., C)Abstract classes can contain code or data but interfaces don't and  A class can inherit from only one abstract class but can implement an unlimited number of interfaces., D)Abstract classes can contain code or data. Interfaces do not contain code or data. A class can inherit from more than one abstract class but can implement only one interface.");
        answers.add("C)Abstract classes can contain code or data but interfaces don't and  A class can inherit from only one abstract class but can implement an unlimited number of interfaces.");

        questions.add(" Which relationship best illustrates an abstract-concrete class relationship?");
        options.add("A)cat : kitten, B)color : red, C)planet : moon, D)truck : window");
        answers.add("C)planet : moon");

        questions.add(" Which choice is a benefit of using dependency injection?");
        options.add("A)loose coupling, B)code reusability, C)lazy initialization, D)data abstraction");
        answers.add("A)loose coupling");

        questions.add(" **______** describes an aggregation");
        options.add("A)A class of resources, B)A group of methods, C)A collection of objects, D)A list of children");
        answers.add("C)A collection of objects");

        questions.add(" Which type of function can be used for polymorphism?");
        options.add("A)virtual function, B)inline function, C)undefined function, D)private function");
        answers.add("A)virtual function");

        questions.add(" Are you required to return an object if it was passed by reference to a function, and why or why not?");
        options.add("A)Yes the caller function needs to reflect the changes., B)No you should use a global variable instead., C)No changes will be automatically reflected in the calling function., D)Yes the object must be the same in the caller function.");
        answers.add("C)No, changes will be automatically reflected in the calling function.");

        questions.add(" In addition to responsibilities, what should be listed on Class-responsability-collaboration (CRC) cards?");
        options.add("A)which programming language will be used., B)the programmer responsible for implementation., C)interacting classes., D)attributes.");
        answers.add("C)interacting classes.");

        questions.add(" What is the best name for the function that corrects this assessment?");
        options.add("A)makeResult(), B)questionScore(), C)calculateScore(), D)getAnswers()");
        answers.add("C)calculateScore()");

        questions.add(" Who invented OOP?");
        options.add("A)Andrea Ferro, B)Adele Goldberg, C)Alan Kay, D)Dennis Ritchie");
        answers.add("A)Alan Kay");

    }

    public static void main(String[] args) {
        new OOP_Quiz(name).setVisible(true);
    }

}
