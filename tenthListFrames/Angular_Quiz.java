package tenthListFrames;

import frame.Quiz;


/**
 * @author MuhammadHasnatRasool
 */
public class Angular_Quiz extends Quiz {

    public Angular_Quiz(String name) {
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

    // 
    @Override
    public final void loadQuestions() {
        questions.add("What is Angular?");
        options.add("A) A programming language, B) A framework for building client-side applications, C) A database management system, D) An operating system");
        answers.add("B) A framework for building client-side applications");

        questions.add("Which language is primarily used for Angular development?");
        options.add("A) Java, B) JavaScript, C) Python, D) C#");
        answers.add("B) JavaScript");

        questions.add("What is Angular CLI?");
        options.add("A) Command Line Interface for Angular, B) Client Library Integration, C) Continuous Learning Interface, D) Angular Command Locator");
        answers.add("A) Command Line Interface for Angular");

        questions.add("Which decorator is used to define a component in Angular?");
        options.add("A) @Component, B) @Module, C) @Directive, D) @Injectable");
        answers.add("A) @Component");

        questions.add("What is data binding in Angular?");
        options.add("A) A technique to bind data sources to templates, B) Binding of HTML elements only, C) Binding of CSS properties, D) A method to bind data to databases");
        answers.add("A) A technique to bind data sources to templates");

        questions.add("Which command is used to create a new Angular project?");
        options.add("A) ng new project-name, B) create-ng project-name, C) angular new project-name, D) ng create project-name");
        answers.add("A) ng new project-name");

        questions.add("What is NgModule in Angular?");
        options.add("A) A module for managing network requests, B) A decorator for components, C) A module for lazy loading components, D) A module for managing Angular dependencies");
        answers.add("D) A module for managing Angular dependencies");

        questions.add("What does ngIf do in Angular?");
        options.add("A) Adds an element to the DOM if a condition is true, B) Iterates over a list of items, C) Binds a property to an element, D) Initializes a new Angular project");
        answers.add("A) Adds an element to the DOM if a condition is true");

        questions.add("How do you define a route in Angular?");
        options.add("A) @Route, B) RouterModule, C) ngRoute, D) defineRoute");
        answers.add("B) RouterModule");

        questions.add("What is a service in Angular?");
        options.add("A) A component decorator, B) A module for data binding, C) A class to encapsulate reusable logic, D) A type of Angular directive");
        answers.add("C) A class to encapsulate reusable logic");

        questions.add("Which directive is used for event handling in Angular?");
        options.add("A) ngClass, B) ngStyle, C) ngModel, D) ngClick");
        answers.add("D) ngClick");

        questions.add("What is RxJS in Angular?");
        options.add("A) A library for reactive programming, B) A testing framework, C) An Angular component, D) A module for routing");
        answers.add("A) A library for reactive programming");

        questions.add("What is Angular Ivy?");
        options.add("A) A tool for testing Angular applications, B) A new Angular compiler and runtime, C) A component lifecycle hook, D) An Angular performance optimization technique");
        answers.add("B) A new Angular compiler and runtime");

        questions.add("Which CLI command is used to serve an Angular application?");
        options.add("A) ng start, B) ng serve, C) ng run, D) ng deploy");
        answers.add("B) ng serve");

        questions.add("What is Angular Material?");
        options.add("A) A UI component library, B) A data binding framework, C) A module for routing, D) An Angular testing tool");
        answers.add("A) A UI component library");

        questions.add("How do you create a form in Angular?");
        options.add("A) Using ngForm directive, B) Using ngStyle directive, C) Using ngClass directive, D) Using ngIf directive");
        answers.add("A) Using ngForm directive");

        questions.add("What is Angular HttpClient?");
        options.add("A) A tool for managing HTTP requests, B) A testing framework, C) A UI component library, D) A module for lazy loading");
        answers.add("A) A tool for managing HTTP requests");

        questions.add("What is Angular Router?");
        options.add("A) A tool for managing Angular dependencies, B) A module for handling network requests, C) A tool for creating routes in Angular applications, D) A testing framework");
        answers.add("C) A tool for creating routes in Angular applications");

        questions.add("What does ngClass do in Angular?");
        options.add("A) Adds or removes CSS classes based on a condition, B) Binds a property to an element, C) Initializes a new Angular project, D) Adds an element to the DOM if a condition is true");
        answers.add("A) Adds or removes CSS classes based on a condition");

        questions.add("What is Angular Interpolation?");
        options.add("A) A method to include JavaScript code in templates, B) A way to bind data into HTML templates, C) A type of Angular directive, D) An Angular module for localization");
        answers.add("B) A way to bind data into HTML templates");

        questions.add("What is the purpose of Angular Universal?");
        options.add("A) To build universal JavaScript applications, B) To enhance Angular CLI functionalities, C) To manage Angular dependencies, D) To optimize Angular performance");
        answers.add("A) To build universal JavaScript applications");

        questions.add("What is the difference between ngOnChanges and ngOnInit?");
        options.add("A) ngOnChanges is used for input bindings, ngOnInit is used for output bindings, B) ngOnChanges is called every time a change occurs, ngOnInit is called once after the first ngOnChanges, C) ngOnChanges is used for lifecycle hooks, ngOnInit is used for component initialization, D) There is no difference, both are used interchangeably");
        answers.add("C) ngOnChanges is used for lifecycle hooks, ngOnInit is used for component initialization");

        questions.add("How do you handle errors in Angular HTTP requests?");
        options.add("A) Using catchError operator in RxJS, B) Using try-catch block in TypeScript, C) Using Angular interceptors, D) Errors are automatically handled by Angular");
        answers.add("A) Using catchError operator in RxJS");

        questions.add("What is Angular Ivy and how does it improve performance?");
        options.add("A) It's a new Angular feature for data binding, B) It's a tool for testing Angular applications, C) It's a new Angular compiler and runtime that reduces bundle size and speeds up rendering, D) It's an Angular module for lazy loading");
        answers.add("C) It's a new Angular compiler and runtime that reduces bundle size and speeds up rendering");

        questions.add("How do you implement lazy loading in Angular?");
        options.add("A) By using lazyLoad function in Angular CLI, B) By using loadChildren property in route configuration, C) By using lazyLoading directive in templates, D) By using @LazyLoad decorator");
        answers.add("B) By using loadChildren property in route configuration");

        questions.add("What is Angular DI (Dependency Injection) and why is it used?");
        options.add("A) It's a mechanism to provide components with required dependencies, B) It's a tool for managing Angular dependencies, C) It's a new Angular compiler feature, D) It's an Angular testing framework");
        answers.add("A) It's a mechanism to provide components with required dependencies");

        questions.add("What are Angular Guards and when are they used?");
        options.add("A) They are used to protect routes, B) They are used for Angular component testing, C) They are used for Angular form validation, D) They are used to create Angular modules");
        answers.add("A) They are used to protect routes");

        questions.add("Explain the difference between structural and attribute directives in Angular.");
        options.add("A) Structural directives modify the DOM layout, attribute directives modify element attributes, B) Structural directives apply styles, attribute directives apply classes, C) There is no difference, both are used interchangeably, D) Structural directives modify element properties, attribute directives modify event bindings");
        answers.add("A) Structural directives modify the DOM layout, attribute directives modify element attributes");

        questions.add("How do you handle multiple HTTP requests sequentially in Angular?");
        options.add("A) Using forkJoin operator in RxJS, B) Using combineLatest operator in RxJS, C) Using Angular interceptors, D) By chaining multiple subscribe calls");
        answers.add("A) Using forkJoin operator in RxJS");

        questions.add("What is AOT (Ahead-of-Time) compilation in Angular?");
        options.add("A) It's a tool for optimizing Angular performance, B) It's a compiler that converts Angular HTML and TypeScript code into efficient JavaScript code during the build phase, C) It's a module for lazy loading components, D) It's a new Angular compiler feature");
        answers.add("B) It's a compiler that converts Angular HTML and TypeScript code into efficient JavaScript code during the build phase");

        questions.add("How do you share data between sibling components in Angular?");
        options.add("A) Using EventEmitter and @Output decorator, B) Using ngModel binding, C) Using Angular services, D) Data sharing is not possible between sibling components");
        answers.add("C) Using Angular services");

        questions.add("What is the purpose of Angular decorators?");
        options.add("A) To add metadata to classes and their members, B) To decorate HTML templates, C) To add styles to Angular components, D) To handle routing in Angular applications");
        answers.add("A) To add metadata to classes and their members");

        questions.add("How do you implement authentication and authorization in Angular?");
        options.add("A) Using Angular interceptors, B) Using Angular guards, C) Using Angular services, D) Authentication and authorization are automatic in Angular");
        answers.add("B) Using Angular guards");

        questions.add("Explain Angular Zones and their role in change detection.");
        options.add("A) Zones are used for routing in Angular applications, B) Zones are used for managing Angular dependencies, C) Zones are used for optimizing Angular performance, D) Zones are used to manage change detection and update the view");
        answers.add("D) Zones are used to manage change detection and update the view");

        questions.add("What is the purpose of ng-content in Angular?");
        options.add("A) To create content projection in Angular components, B) To define styles for Angular components, C) To manage routing in Angular applications, D) To handle data binding in Angular");
        answers.add("A) To create content projection in Angular components");

        questions.add("How do you handle forms with complex validation logic in Angular?");
        options.add("A) Using template-driven forms, B) Using reactive forms and custom validators, C) Using Angular guards, D) Using Angular services");
        answers.add("B) Using reactive forms and custom validators");

        questions.add("What are Angular pipes and how do you create a custom pipe?");
        options.add("A) Pipes are used for handling HTTP requests, B) Pipes are used for transforming data in templates, C) Pipes are used for component initialization, D) Pipes are used for lazy loading components");
        answers.add("B) Pipes are used for transforming data in templates");

        questions.add("What is the purpose of trackBy function in Angular ngFor directive?");
        options.add("A) To track changes in the DOM, B) To optimize performance by identifying unique items in a collection, C) To manage routing in Angular applications, D) To handle form submissions in Angular");
        answers.add("B) To optimize performance by identifying unique items in a collection");

        questions.add("How do you handle asynchronous operations in Angular tests?");
        options.add("A) Using async and fakeAsync functions in Angular testing, B) Using Angular guards, C) Using Angular interceptors, D) Asynchronous operations are not tested in Angular");
        answers.add("A) Using async and fakeAsync functions in Angular testing");

        questions.add("What are Angular animations and how do you implement them?");
        options.add("A) Animations are used for form validation, B) Animations are used for managing HTTP requests, C) Animations are used for adding visual effects to Angular applications, D) Animations are used for optimizing Angular performance");
        answers.add("C) Animations are used for adding visual effects to Angular applications");

    }


    public static void main(String[] args) {
        new Angular_Quiz(name).setVisible(true);
    }

}
