package eighthListFrames;

import frame.Quiz;

/**
 * @author MuhammadHasnatRasool
 */
public class PostgreSQL_Quiz extends Quiz{
    

    public PostgreSQL_Quiz(String name) {
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

// questions:32
    @Override
    public final void loadQuestions() {
       
        questions.add("Which of the following is used to create a database in PostgreSQL?");
        options.add("A) CREATE DATABASE, B) NEW DATABASE, C) MAKE DATABASE, D) ADD DATABASE");
        answers.add("A) CREATE DATABASE");

        questions.add("How do you select all columns from a table named 'users'?");
        options.add("A) SELECT * FROM users;, B) GET ALL FROM users;, C) SELECT ALL FROM users;, D) FETCH * FROM users;");
        answers.add("A) SELECT * FROM users;");

        questions.add("Which command is used to delete a table in PostgreSQL?");
        options.add("A) DELETE TABLE, B) DROP TABLE, C) REMOVE TABLE, D) CLEAR TABLE");
        answers.add("B) DROP TABLE");

        questions.add("What is the command to insert data into a table named 'employees' in PostgreSQL?");
        options.add("A) INSERT INTO employees VALUES (...), B) ADD TO employees VALUES (...), C) PUT INTO employees VALUES (...), D) INSERT DATA INTO employees VALUES (...)");
        answers.add("A) INSERT INTO employees VALUES (...)");

        questions.add("Which function is used to get the current date and time in PostgreSQL?");
        options.add("A) CURRENT_DATE, B) GETDATE(), C) NOW(), D) TODAY()");
        answers.add("C) NOW()");

        questions.add("How do you add a new column to an existing table in PostgreSQL?");
        options.add("A) ALTER TABLE table_name ADD COLUMN column_name datatype;, B) MODIFY TABLE table_name ADD COLUMN column_name datatype;, C) UPDATE TABLE table_name ADD COLUMN column_name datatype;, D) CHANGE TABLE table_name ADD COLUMN column_name datatype;");
        answers.add("A) ALTER TABLE table_name ADD COLUMN column_name datatype;");

        questions.add("Which data type is used to store binary data in PostgreSQL?");
        options.add("A) BINARY, B) VARBINARY, C) BYTEA, D) BLOB");
        answers.add("C) BYTEA");

        questions.add("How do you rename an existing table in PostgreSQL?");
        options.add("A) ALTER TABLE table_name RENAME TO new_table_name;, B) CHANGE TABLE table_name RENAME TO new_table_name;, C) MODIFY TABLE table_name RENAME TO new_table_name;, D) RENAME TABLE table_name TO new_table_name;");
        answers.add("A) ALTER TABLE table_name RENAME TO new_table_name;");

        questions.add("Which command is used to create an index on a table in PostgreSQL?");
        options.add("A) CREATE INDEX, B) ADD INDEX, C) BUILD INDEX, D) MAKE INDEX");
        answers.add("A) CREATE INDEX");

        questions.add("What is the purpose of the EXPLAIN command in PostgreSQL?");
        options.add("A) To describe the structure of a table, B) To show the query execution plan, C) To display the list of databases, D) To output the result of a query");
        answers.add("B) To show the query execution plan");

        questions.add("How do you remove a database in PostgreSQL?");
        options.add("A) DELETE DATABASE, B) DROP DATABASE, C) REMOVE DATABASE, D) CLEAR DATABASE");
        answers.add("B) DROP DATABASE");

        questions.add("Which PostgreSQL feature is used for full-text search?");
        options.add("A) TSEARCH, B) FULLTEXT, C) FTS, D) TEXTSEARCH");
        answers.add("A) TSEARCH");
        
        questions.add("What is the correct way to create a new user in PostgreSQL?");
        options.add("A) CREATE USER username;, B) NEW USER username;, C) ADD USER username;, D) MAKE USER username;");
        answers.add("A) CREATE USER username;");

        questions.add("Which command is used to change the structure of an existing table in PostgreSQL?");
        options.add("A) MODIFY TABLE, B) ALTER TABLE, C) CHANGE TABLE, D) UPDATE TABLE");
        answers.add("B) ALTER TABLE");

        questions.add("What is the correct way to join two tables in PostgreSQL?");
        options.add("A) JOIN table1 AND table2, B) MERGE table1 WITH table2, C) SELECT * FROM table1 JOIN table2, D) SELECT * FROM table1 INNER JOIN table2");
        answers.add("D) SELECT * FROM table1 INNER JOIN table2");

        questions.add("How do you remove a column from an existing table in PostgreSQL?");
        options.add("A) ALTER TABLE table_name DROP COLUMN column_name;, B) REMOVE COLUMN column_name FROM table_name;, C) DELETE COLUMN column_name FROM table_name;, D) ERASE COLUMN column_name FROM table_name;");
        answers.add("A) ALTER TABLE table_name DROP COLUMN column_name;");

        questions.add("Which of the following is used to create a new table in PostgreSQL?");
        options.add("A) NEW TABLE table_name (...);, B) MAKE TABLE table_name (...);, C) CREATE TABLE table_name (...);, D) ADD TABLE table_name (...);");
        answers.add("C) CREATE TABLE table_name (...);");

        questions.add("Which SQL statement is used to add a new record to a table in PostgreSQL?");
        options.add("A) ADD INTO table_name (...);, B) INSERT INTO table_name (...);, C) PUSH INTO table_name (...);, D) INCLUDE INTO table_name (...);");
        answers.add("B) INSERT INTO table_name (...);");

        questions.add("How do you select only the first 10 records from a table in PostgreSQL?");
        options.add("A) SELECT TOP 10 * FROM table_name;, B) SELECT FIRST 10 * FROM table_name;, C) SELECT LIMIT 10 * FROM table_name;, D) SELECT * FROM table_name LIMIT 10;");
        answers.add("D) SELECT * FROM table_name LIMIT 10;");

        questions.add("Which clause is used to filter records in PostgreSQL?");
        options.add("A) WHERE, B) FILTER, C) SEARCH, D) FIND");
        answers.add("A) WHERE");

        questions.add("What is the correct way to create an index in PostgreSQL?");
        options.add("A) CREATE INDEX index_name ON table_name (column_name);, B) NEW INDEX index_name ON table_name (column_name);, C) ADD INDEX index_name ON table_name (column_name);, D) MAKE INDEX index_name ON table_name (column_name);");
        answers.add("A) CREATE INDEX index_name ON table_name (column_name);");

        questions.add("Which SQL statement is used to create a view in PostgreSQL?");
        options.add("A) CREATE VIEW view_name AS SELECT ...;, B) NEW VIEW view_name AS SELECT ...;, C) ADD VIEW view_name AS SELECT ...;, D) MAKE VIEW view_name AS SELECT ...;");
        answers.add("A) CREATE VIEW view_name AS SELECT ...;");

        questions.add("How do you delete a database in PostgreSQL?");
        options.add("A) DELETE DATABASE database_name;, B) DROP DATABASE database_name;, C) REMOVE DATABASE database_name;, D) ERASE DATABASE database_name;");
        answers.add("B) DROP DATABASE database_name;");

        questions.add("Which of the following is used to grant privileges in PostgreSQL?");
        options.add("A) GIVE PERMISSION TO, B) GRANT, C) ALLOW, D) ENABLE");
        answers.add("B) GRANT");

        questions.add("How do you add a primary key to an existing table in PostgreSQL?");
        options.add("A) ALTER TABLE table_name ADD PRIMARY KEY (column_name);, B) MODIFY TABLE table_name ADD PRIMARY KEY (column_name);, C) UPDATE TABLE table_name ADD PRIMARY KEY (column_name);, D) CHANGE TABLE table_name ADD PRIMARY KEY (column_name);");
        answers.add("A) ALTER TABLE table_name ADD PRIMARY KEY (column_name);");

        questions.add("Which function is used to count the number of rows in a table in PostgreSQL?");
        options.add("A) TOTAL(), B) SUM(), C) COUNT(), D) NUMBER()");
        answers.add("C) COUNT()");

        questions.add("What is the correct way to create a foreign key in PostgreSQL?");
        options.add("A) ALTER TABLE table_name ADD FOREIGN KEY (column_name) REFERENCES other_table (other_column);, B) MODIFY TABLE table_name ADD FOREIGN KEY (column_name) REFERENCES other_table (other_column);, C) UPDATE TABLE table_name ADD FOREIGN KEY (column_name) REFERENCES other_table (other_column);, D) CHANGE TABLE table_name ADD FOREIGN KEY (column_name) REFERENCES other_table (other_column);");
        answers.add("A) ALTER TABLE table_name ADD FOREIGN KEY (column_name) REFERENCES other_table (other_column);");

        questions.add("Which SQL statement is used to create a schema in PostgreSQL?");
        options.add("A) CREATE SCHEMA schema_name;, B) NEW SCHEMA schema_name;, C) ADD SCHEMA schema_name;, D) MAKE SCHEMA schema_name;");
        answers.add("A) CREATE SCHEMA schema_name;");

        questions.add("How do you rename a table in PostgreSQL?");
        options.add("A) ALTER TABLE table_name RENAME TO new_table_name;, B) MODIFY TABLE table_name RENAME TO new_table_name;, C) UPDATE TABLE table_name RENAME TO new_table_name;, D) CHANGE TABLE table_name RENAME TO new_table_name;");
        answers.add("A) ALTER TABLE table_name RENAME TO new_table_name;");

        questions.add("Which of the following is used to terminate a session in PostgreSQL?");
        options.add("A) END SESSION, B) CLOSE SESSION, C) TERMINATE SESSION, D) DISCONNECT");
        answers.add("D) DISCONNECT");

        questions.add("What is the correct way to create a stored procedure in PostgreSQL?");
        options.add("A) CREATE PROCEDURE procedure_name AS ...;, B) NEW PROCEDURE procedure_name AS ...;, C) ADD PROCEDURE procedure_name AS ...;, D) MAKE PROCEDURE procedure_name AS ...;");
        answers.add("A) CREATE PROCEDURE procedure_name AS ...;");

        questions.add("Which function is used to calculate the average value of a numeric column in PostgreSQL?");
        options.add("A) MEAN(), B) AVG(), C) AVERAGE(), D) MEANVALUE()");
        answers.add("B) AVG()");
        
        
       
  }

    public static void main(String[]args){
        new PostgreSQL_Quiz(name).setVisible(true);
    }
}

