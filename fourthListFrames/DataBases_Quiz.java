package fourthListFrames;


import frame.Quiz;

/**
 * @author MuhammadHasnatRasool
 */

public class DataBases_Quiz extends Quiz{
    

    public DataBases_Quiz(String name) {
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

// questions :36
    @Override
    public final void loadQuestions() {
  
        questions.add("Which of the following is NOT a type of database model?");
        options.add("A) Hierarchical, B) Network, C) Relational, D) Linear");
        answers.add("D) Linear");

        questions.add("In a relational database, what is a tuple?");
        options.add("A) A row of data representing a single entity, B) A column of data, C) A key attribute, D) A type of join operation");
        answers.add("A) A row of data representing a single entity");

        questions.add("Which SQL command is used to retrieve data from a database?");
        options.add("A) SELECT, B) RETRIEVE, C) OPEN, D) GET");
        answers.add("A) SELECT");

        questions.add("What does the acronym 'SQL' stand for?");
        options.add("A) Secure Query Language, B) Simple Query Language, C) Structured Query Language, D) Systematic Query Language");
        answers.add("C) Structured Query Language");

        questions.add("Which of the following is NOT a NoSQL database?");
        options.add("A) MongoDB, B) Cassandra, C) MySQL, D) Redis");
        answers.add("C) MySQL");

        questions.add("What is the primary key in a database table?");
        options.add("A) A key used for encryption, B) A key used for foreign key constraints, C) A unique identifier for each row, D) A primary access point for the database");
        answers.add("C) A unique identifier for each row");

        questions.add("Which type of database is optimized for read-heavy applications?");
        options.add("A) OLTP database, B) OLAP database, C) NoSQL database, D) Relational database");
        answers.add("C) NoSQL database");

        questions.add("What is ACID in the context of database transactions?");
        options.add("A) A coding standard, B) A transactional property, C) A database security feature, D) A data compression algorithm");
        answers.add("B) A transactional property");

        questions.add("Which normalization form ensures that there are no repeating groups?");
        options.add("A) First Normal Form (1NF), B) Second Normal Form (2NF), C) Third Normal Form (3NF), D) Boyce-Codd Normal Form (BCNF)");
        answers.add("A) First Normal Form (1NF)");

        questions.add("Which of the following is an example of a DDL statement?");
        options.add("A) SELECT, B) INSERT, C) CREATE, D) UPDATE");
        answers.add("C) CREATE");

        questions.add("What does 'OLAP' stand for in the context of databases?");
        options.add("A) Online Analytical Processing, B) Online Application Programming, C) Overlooked Application Processing, D) Overloaded Algorithmic Processing");
        answers.add("A) Online Analytical Processing");

        questions.add("Which type of join returns all rows from both tables, joining them where conditions are met?");
        options.add("A) INNER JOIN, B) LEFT JOIN, C) RIGHT JOIN, D) FULL JOIN");
        answers.add("D) FULL JOIN");

        questions.add("In database terminology, what does CRUD stand for?");
        options.add("A) Create, Read, Update, Delete, B) Control, Read, Undo, Delete, C) Compute, Retrieve, Update, Delete, D) Copy, Replace, Update, Delete");
        answers.add("A) Create, Read, Update, Delete");

        questions.add("Which type of index allows for rapid lookup of data based on a given column?");
        options.add("A) Primary index, B) Secondary index, C) Clustered index, D) Hash index");
        answers.add("C) Clustered index");

        questions.add("What is the purpose of a foreign key in a relational database?");
        options.add("A) To uniquely identify each row in a table, B) To ensure referential integrity between related tables, C) To speed up query performance, D) To store encrypted data");
        answers.add("B) To ensure referential integrity between related tables");

        questions.add("Which SQL clause is used to filter records based on a specified condition?");
        options.add("A) GROUP BY, B) ORDER BY, C) WHERE, D) HAVING");
        answers.add("C) WHERE");

        questions.add("Which of the following is an advantage of using stored procedures in a database?");
        options.add("A) Increased security, B) Faster execution, C) Portability across different database systems, D) Reduced memory usage");
        answers.add("B) Faster execution");

        questions.add("Which of the following is NOT a valid data type in SQL?");
        options.add("A) VARCHAR, B) BOOLEAN, C) DECIMAL, D) BLOB");
        answers.add("B) BOOLEAN");

        questions.add("What does the term 'Normalization' refer to in databases?");
        options.add("A) The process of reducing data redundancy and improving data integrity, B) The process of optimizing queries, C) The process of encrypting data, D) The process of creating backup copies");
        answers.add("A) The process of reducing data redundancy and improving data integrity");

        questions.add("Which SQL command is used to make permanent changes to the data in a database?");
        options.add("A) COMMIT, B) ROLLBACK, C) ALTER, D) UPDATE");
        answers.add("D) UPDATE");

        questions.add("Which of the following statements about MongoDB is true?");
        options.add("A) It uses a schemaless data model, B) It is based on the SQL language, C) It is a relational database management system, D) It supports only single-node configurations");
        answers.add("A) It uses a schemaless data model");

        questions.add("What is the purpose of an index in a database?");
        options.add("A) To enforce data integrity, B) To store large binary objects, C) To improve query performance, D) To group related records together");
        answers.add("C) To improve query performance");

        questions.add("Which of the following is a key feature of a distributed database?");
        options.add("A) Centralized data storage, B) Limited scalability, C) Single point of failure, D) High availability");
        answers.add("D) High availability");

        questions.add("Which SQL command is used to remove a table from the database?");
        options.add("A) DELETE, B) DROP, C) REMOVE, D) ERASE");
        answers.add("B) DROP");

        questions.add("In a relational database, what is a foreign key?");
        options.add("A) A key used for encryption, B) A key used for indexing, C) A key used to link two tables together, D) A primary access point for the database");
        answers.add("C) A key used to link two tables together");

        questions.add("Which of the following statements about ACID properties is true?");
        options.add("A) They ensure that a transaction is completed as fast as possible, B) They guarantee that all transactions are logged, C) They ensure data consistency in transactions, D) They are applicable only in NoSQL databases");
        answers.add("C) They ensure data consistency in transactions");

        questions.add("Which of the following is NOT a valid NoSQL database type?");
        options.add("A) Document store, B) Column store, C) Relational store, D) Graph store");
        answers.add("C) Relational store");

        questions.add("Which type of NoSQL database is optimized for hierarchical, tree-like data structures?");
        options.add("A) Document store, B) Key-value store, C) Graph store, D) Column store");
        answers.add("C) Graph store");

        questions.add("Which type of join returns only the rows that have matching values in both tables?");
        options.add("A) INNER JOIN, B) LEFT JOIN, C) RIGHT JOIN, D) FULL JOIN");
        answers.add("A) INNER JOIN");

        questions.add("Which SQL command is used to add new rows of data to a table?");
        options.add("A) ADD, B) INSERT INTO, C) CREATE, D) UPDATE");
        answers.add("B) INSERT INTO");

        questions.add("In the context of databases, what is a deadlock?");
        options.add("A) A type of encryption algorithm, B) A situation where two or more transactions are unable to proceed due to mutual dependency, C) A hardware failure, D) A type of index corruption");
        answers.add("B) A situation where two or more transactions are unable to proceed due to mutual dependency");

        questions.add("Which type of database is typically used for handling transactions in banking systems?");
        options.add("A) Data warehouse, B) OLTP database, C) NoSQL database, D) Relational database");
        answers.add("B) OLTP database");

        questions.add("Which SQL command is used to delete data from a database?");
        options.add("A) REMOVE, B) DELETE, C) DROP, D) ERASE");
        answers.add("B) DELETE");

        questions.add("What is a 'view' in the context of databases?");
        options.add("A) A temporary table, B) A stored procedure, C) A subset of a database that meets certain criteria, D) An index on a virtual column");
        answers.add("C) A subset of a database that meets certain criteria");

        questions.add("Which of the following is a benefit of using transactions in a database?");
        options.add("A) Improved data modeling, B) Reduced query complexity, C) Enhanced data security, D) Decreased disk space usage");
        answers.add("C) Enhanced data security");

        questions.add("Which SQL command is used to change the structure of a table in a database?");
        options.add("A) ALTER, B) MODIFY, C) CHANGE, D) ADJUST");
        answers.add("A) ALTER");

    }
    

    
    public static void main(String[]args){
        new DataBases_Quiz(name).setVisible(true);
    }
    
}


