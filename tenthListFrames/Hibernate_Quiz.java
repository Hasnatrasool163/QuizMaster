package tenthListFrames;

import frame.Quiz;
/**
 * @author MuhammadHasnatRasool
 */
public class Hibernate_Quiz extends Quiz {

    public Hibernate_Quiz(String name) {
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

        questions.add("What is Hibernate?");
        options.add("A) A programming language, B) A framework for object-relational mapping in Java, C) A database management system, D) An operating system");
        answers.add("B) A framework for object-relational mapping in Java");

        questions.add("Which of the following statements is true about Hibernate?");
        options.add("A) It is used for front-end web development, B) It simplifies the persistence layer in Java applications, C) It is primarily used for server-side scripting, D) It is a relational database management system");
        answers.add("B) It simplifies the persistence layer in Java applications");

        questions.add("What is ORM (Object-Relational Mapping)?");
        options.add("A) Object-Refactoring Method, B) Object-Relational Model, C) Object-Rational Mapping, D) Object-Relational Mapping");
        answers.add("D) Object-Relational Mapping");

        questions.add("Which file is used to configure Hibernate?");
        options.add("A) hibernate.cfg.xml, B) hibernate.properties, C) hibernate.config, D) hibernate.xml");
        answers.add("A) hibernate.cfg.xml");

        questions.add("What does Hibernate Session represent?");
        options.add("A) A connection to the database, B) A user session in the application, C) A Hibernate configuration file, D) A SQL query");
        answers.add("A) A connection to the database");

        questions.add("What is the purpose of Hibernate Query Language (HQL)?");
        options.add("A) To define the structure of tables in Hibernate, B) To execute native SQL queries, C) To define mappings between objects and database tables, D) To perform database operations using object-oriented queries");
        answers.add("D) To perform database operations using object-oriented queries");

        questions.add("Which annotation is used to mark a class as an entity in Hibernate?");
        options.add("A) @Entity, B) @Table, C) @Persistent, D) @Model");
        answers.add("A) @Entity");

        questions.add("What is lazy loading in Hibernate?");
        options.add("A) Loading data from the database eagerly, B) Loading data from the database lazily, C) Loading data from a remote server, D) Loading data asynchronously");
        answers.add("B) Loading data from the database lazily");

        questions.add("What is the role of Hibernate SessionFactory?");
        options.add("A) To load data from the database, B) To manage Hibernate configurations, C) To manage Hibernate transactions, D) To create Hibernate Session instances");
        answers.add("D) To create Hibernate Session instances");

        questions.add("How can you map a Java class to a database table in Hibernate?");
        options.add("A) Using annotations, B) Using XML configuration, C) Using both annotations and XML configuration, D) By creating a custom mapping file");
        answers.add("C) Using both annotations and XML configuration");

        questions.add("What is the purpose of the hbm.xml file in Hibernate?");
        options.add("A) To define Hibernate queries, B) To configure database connection settings, C) To map Java classes to database tables, D) To define Hibernate entity relationships");
        answers.add("C) To map Java classes to database tables");

        questions.add("What is a primary key in Hibernate?");
        options.add("A) A unique identifier for a Hibernate Session, B) A unique identifier for a database table, C) A foreign key in a database table, D) An index on a database column");
        answers.add("B) A unique identifier for a database table");

        questions.add("How does Hibernate handle transactions?");
        options.add("A) Using JDBC API, B) Using JTA (Java Transaction API), C) Using Hibernate-specific transaction management, D) By directly manipulating the database");
        answers.add("C) Using Hibernate-specific transaction management");

        questions.add("Which method is used to save an object into the database using Hibernate?");
        options.add("A) save(), B) persist(), C) update(), D) merge()");
        answers.add("A) save()");

        questions.add("What is the purpose of Hibernate Criteria API?");
        options.add("A) To define database schema, B) To perform object-oriented queries, C) To configure Hibernate settings, D) To manage Hibernate sessions");
        answers.add("B) To perform object-oriented queries");

        questions.add("How does Hibernate manage database connections?");
        options.add("A) Using a connection pool, B) Opening a new connection for each query, C) Using a separate thread for each connection, D) Using a singleton connection object");
        answers.add("A) Using a connection pool");

        questions.add("What is the default fetch type in Hibernate?");
        options.add("A) FetchType.EAGER, B) FetchType.LAZY, C) FetchType.DEFAULT, D) FetchType.AUTO");
        answers.add("A) FetchType.EAGER");

        questions.add("Which caching strategy is suitable for read-only data in Hibernate?");
        options.add("A) Read-write, B) Read-only, C) Transactional, D) None");
        answers.add("B) Read-only");

        questions.add("How can you configure Hibernate to log SQL statements?");
        options.add("A) Using hibernate.show_sql property, B) Using logging configuration in hibernate.xml, C) Using Hibernate Console, D) By enabling debugging mode");
        answers.add("A) Using hibernate.show_sql property");

        questions.add("What is the purpose of Hibernate Interceptors?");
        options.add("A) To intercept HTTP requests, B) To intercept SQL queries, C) To intercept Hibernate Session events, D) To intercept Java method calls");
        answers.add("C) To intercept Hibernate Session events");

        questions.add("How does Hibernate handle database schema changes?");
        options.add("A) Automatically updates the schema, B) Requires manual schema changes, C) Drops and recreates the schema, D) Ignores schema changes");
        answers.add("B) Requires manual schema changes");

        questions.add("What is the purpose of Hibernate Validator?");
        options.add("A) To validate database connections, B) To validate Hibernate session objects, C) To validate JavaBean properties, D) To validate SQL queries");
        answers.add("C) To validate JavaBean properties");

        questions.add("How can you perform native SQL queries in Hibernate?");
        options.add("A) Using Hibernate Criteria API, B) Using Hibernate Query Language (HQL), C) Using JDBC API, D) Using @NamedQuery annotation");
        answers.add("C) Using JDBC API");

        questions.add("What is the difference between transient, persistent, and detached objects in Hibernate?");
        options.add("A) Transient - not associated with a Hibernate Session; Persistent - associated with a Hibernate Session; Detached - disconnected from a Hibernate Session, B) Transient - disconnected from a Hibernate Session; Persistent - not associated with a Hibernate Session; Detached - associated with a Hibernate Session, C) Transient - associated with a Hibernate Session; Persistent - disconnected from a Hibernate Session; Detached - not associated with a Hibernate Session, D) Transient - not associated with a Hibernate Session; Persistent - connected to a database; Detached - disconnected from a database");
        answers.add("A) Transient - not associated with a Hibernate Session; Persistent - associated with a Hibernate Session; Detached - disconnected from a Hibernate Session");

        questions.add("How can you enable second-level caching in Hibernate?");
        options.add("A) By setting hibernate.cache.use_second_level_cache=true, B) By annotating classes with @Cacheable, C) By configuring cache providers like Ehcache, D) All of the above");
        answers.add("D) All of the above");

        questions.add("What is the purpose of Hibernate Tools?");
        options.add("A) To debug Hibernate applications, B) To generate Java classes from database schema, C) To manage Hibernate configurations, D) To optimize Hibernate queries");
        answers.add("B) To generate Java classes from database schema");

        questions.add("How does Hibernate support inheritance mapping?");
        options.add("A) Using @Inheritance annotation, B) Using table-per-class hierarchy strategy, C) Using single-table strategy, D) All of the above");
        answers.add("D) All of the above");

        questions.add("What is the purpose of CascadeType in Hibernate relationships?");
        options.add("A) To define the fetch type, B) To define the cascade type, C) To configure lazy loading, D) To configure fetching strategies");
        answers.add("B) To define the cascade type");

        questions.add("How can you handle transactions in Hibernate?");
        options.add("A) Using @Transaction annotation, B) Using Session.beginTransaction(), C) Using HibernateTransactionManager, D) All of the above");
        answers.add("D) All of the above");

        questions.add("What is the purpose of @NamedQuery in Hibernate?");
        options.add("A) To define a named query using HQL, B) To define a native SQL query, C) To configure SQL logging, D) To configure caching");
        answers.add("A) To define a named query using HQL");

        questions.add("What is the purpose of Hibernate Envers?");
        options.add("A) To audit changes in entities, B) To manage Hibernate transactions, C) To validate Hibernate configurations, D) To optimize Hibernate queries");
        answers.add("A) To audit changes in entities");

        questions.add("How can you handle exceptions in Hibernate?");
        options.add("A) By using try-catch blocks, B) By configuring HibernateException in hibernate.cfg.xml, C) By using Hibernate specific exception classes, D) All of the above");
        answers.add("C) By using Hibernate specific exception classes");

        questions.add("What is the purpose of FetchType.AUTO in Hibernate?");
        options.add("A) To automatically fetch all associations eagerly, B) To automatically select the fetch strategy based on the mapping, C) To manually configure fetch strategies, D) To disable lazy loading");
        answers.add("B) To automatically select the fetch strategy based on the mapping");

    }


    public static void main(String[] args) {
        new Hibernate_Quiz(name).setVisible(true);
    }

}
