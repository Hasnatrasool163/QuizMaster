package tenthListFrames;

import frame.Quiz;
/**
 * @author MuhammadHasnatRasool
 */
public class Spring_Boot_Quiz extends Quiz{
    

    public Spring_Boot_Quiz(String name) {
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


    // questions:35
    @Override
    public final void loadQuestions() {
        
        questions.add("What is Spring Boot?");
        options.add("A) A framework for building microservices, B) An extension of Spring Framework, C) A standalone Java application, D) All of the above");
        answers.add("D) All of the above");

        questions.add("Which annotation is used to enable Spring Boot auto-configuration?");
        options.add("A) @SpringBootConfig, B) @EnableAutoConfiguration, C) @SpringBootApplication, D) @EnableConfiguration");
        answers.add("B) @EnableAutoConfiguration");

        questions.add("How do you create a new Spring Boot project using Spring Initializr?");
        options.add("A) Use Spring IDE, B) Use Eclipse, C) Use IntelliJ IDEA, D) Use https://start.spring.io");
        answers.add("D) Use https://start.spring.io");

        questions.add("Which embedded server is commonly used with Spring Boot?");
        options.add("A) Apache Tomcat, B) Jetty, C) Undertow, D) All of the above");
        answers.add("D) All of the above");

        questions.add("What is the default port number for a Spring Boot application?");
        options.add("A) 8080, B) 9090, C) 8000, D) 8181");
        answers.add("A) 8080");

        questions.add("How do you override default properties in Spring Boot?");
        options.add("A) Modify application.properties, B) Use @OverrideProperties, C) Configure in XML files, D) Edit SpringApplication settings");
        answers.add("A) Modify application.properties");

        questions.add("Which annotation is used to define the main class of a Spring Boot application?");
        options.add("A) @MainClass, B) @SpringBootMain, C) @SpringBootApplication, D) @SpringApp");
        answers.add("C) @SpringBootApplication");

        questions.add("What is the purpose of @RestController annotation in Spring Boot?");
        options.add("A) To define a RESTful web service controller, B) To define a SOAP web service controller, C) To define a JDBC controller, D) To define a UI controller");
        answers.add("A) To define a RESTful web service controller");

        questions.add("How do you enable cross-origin requests (CORS) in a Spring Boot application?");
        options.add("A) Use @CrossOrigin annotation, B) Configure in application.properties, C) Use @EnableCORS annotation, D) Implement a custom filter");
        answers.add("A) Use @CrossOrigin annotation");

        questions.add("Which dependency is used to create a Spring Boot web application?");
        options.add("A) spring-boot-starter-web, B) spring-boot-starter-data, C) spring-boot-starter-logging, D) spring-boot-starter");
        answers.add("A) spring-boot-starter-web");

        questions.add("How do you run a Spring Boot application from the command line?");
        options.add("A) java -jar <application-name>.jar, B) mvn spring-boot:run, C) Both A and B, D) Only B");
        answers.add("C) Both A and B");

        questions.add("What is the purpose of @Autowired annotation in Spring Boot?");
        options.add("A) To inject dependencies automatically, B) To define bean lifecycle, C) To handle exceptions, D) To manage transactions");
        answers.add("A) To inject dependencies automatically");

        questions.add("Which Spring Boot starter is used for JPA-based data access?");
        options.add("A) spring-boot-starter-jpa, B) spring-boot-starter-data, C) spring-boot-starter-web, D) spring-boot-starter");
        answers.add("A) spring-boot-starter-jpa");

        questions.add("How do you configure logging in a Spring Boot application?");
        options.add("A) Use log4j.properties, B) Use application.properties, C) Configure in logback.xml, D) Use @EnableLogging annotation");
        answers.add("B) Use application.properties");

        questions.add("Which annotation is used for defining scheduled tasks in Spring Boot?");
        options.add("A) @Scheduled, B) @TaskScheduler, C) @ScheduleTask, D) @RunTask");
        answers.add("A) @Scheduled");

        questions.add("How do you profile Spring Boot applications?");
        options.add("A) Use @Profile annotation, B) Configure in application.properties, C) Use -Dspring.profiles.active, D) All of the above");
        answers.add("D) All of the above");

        questions.add("What is the purpose of Actuator in Spring Boot?");
        options.add("A) To monitor and manage Spring Boot applications, B) To secure REST APIs, C) To optimize database access, D) To manage transactions");
        answers.add("A) To monitor and manage Spring Boot applications");

        questions.add("Which dependency is used for testing in Spring Boot applications?");
        options.add("A) spring-boot-starter-test, B) spring-boot-starter-logging, C) spring-boot-starter-data, D) spring-boot-starter-web");
        answers.add("A) spring-boot-starter-test");

        questions.add("How do you configure database properties in a Spring Boot application?");
        options.add("A) Use application.properties, B) Use @DatabaseConfig annotation, C) Configure in pom.xml, D) Use JNDI settings");
        answers.add("A) Use application.properties");

        questions.add("What is the purpose of the @Transactional annotation in Spring Boot?");
        options.add("A) To define transaction boundaries, B) To configure REST endpoints, C) To manage asynchronous tasks, D) To configure security settings");
        answers.add("A) To define transaction boundaries");

        questions.add("Which Spring Boot starter is used for building RESTful APIs?");
        options.add("A) spring-boot-starter-rest, B) spring-boot-starter-web, C) spring-boot-starter-json, D) spring-boot-starter-data-rest");
        answers.add("B) spring-boot-starter-web");
        
        questions.add("What is Spring Framework?");
        options.add("A) A lightweight framework for Java development, B) An extension of Java Enterprise Edition (Java EE), C) A replacement for Java SE, D) A microservices framework");
        answers.add("A) A lightweight framework for Java development");

        questions.add("Which design pattern does Spring Framework primarily use?");
        options.add("A) MVC (Model-View-Controller), B) Singleton, C) Factory Method, D) Observer");
        answers.add("A) MVC (Model-View-Controller)");

        questions.add("How do you define beans in Spring Framework?");
        options.add("A) Using @Bean annotation, B) Using XML configuration, C) Both A and B, D) Using @Component annotation");
        answers.add("C) Both A and B");

        questions.add("What is dependency injection (DI) in the context of Spring Framework?");
        options.add("A) Injecting dependencies into objects, B) Injecting JavaScript dependencies, C) Managing database dependencies, D) Managing CSS dependencies");
        answers.add("A) Injecting dependencies into objects");

        questions.add("Which Spring module is used for aspect-oriented programming (AOP)?");
        options.add("A) spring-aop, B) spring-aspect, C) spring-aspectj, D) spring-core");
        answers.add("A) spring-aop");

        questions.add("How do you configure Spring MVC in a web application?");
        options.add("A) Use @EnableWebMvc annotation, B) Configure in web.xml, C) Use @EnableMvc annotation, D) Use @SpringMvcConfig annotation");
        answers.add("A) Use @EnableWebMvc annotation");

        questions.add("Which annotation is used for mapping HTTP requests to controller methods in Spring MVC?");
        options.add("A) @RequestMapping, B) @HttpMapping, C) @RequestHandler, D) @Mapping");
        answers.add("A) @RequestMapping");

        questions.add("What is the purpose of @ComponentScan annotation in Spring Framework?");
        options.add("A) To scan for Spring components, B) To enable cross-origin requests, C) To configure database settings, D) To manage transactions");
        answers.add("A) To scan for Spring components");

        questions.add("How do you enable transaction management in Spring Framework?");
        options.add("A) Use @EnableTransactionManagement annotation, B) Configure in application.properties, C) Use @Transactional annotation, D) Use @EnableTransactions annotation");
        answers.add("A) Use @EnableTransactionManagement annotation");

        questions.add("Which Spring module is used for JDBC-based data access?");
        options.add("A) spring-jdbc, B) spring-data-jdbc, C) spring-data, D) spring-data-access");
        answers.add("A) spring-jdbc");

        questions.add("How do you configure Spring Security in a Spring MVC application?");
        options.add("A) Use @EnableSecurity annotation, B) Configure in security.xml, C) Use @EnableWebSecurity annotation, D) Use @SecurityConfig annotation");
        answers.add("C) Use @EnableWebSecurity annotation");

        questions.add("What is the purpose of @Qualifier annotation in Spring Framework?");
        options.add("A) To specify a bean name, B) To qualify REST endpoints, C) To manage session attributes, D) To inject dependencies");
        answers.add("A) To specify a bean name");

        questions.add("Which Spring module is used for sending email in Spring Framework?");
        options.add("A) spring-mail, B) spring-email, C) spring-messaging, D) spring-smtp");
        answers.add("A) spring-mail");

        questions.add("How do you handle exceptions in a Spring MVC application?");
        options.add("A) Use @ExceptionHandler annotation, B) Use try-catch blocks, C) Configure in web.xml, D) Use @ExceptionHandling annotation");
        answers.add("A) Use @ExceptionHandler annotation");

    }

    
    public static void main(String[]args){
        new Spring_Boot_Quiz(name).setVisible(true);
    }
    
}