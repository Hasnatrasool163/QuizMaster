package eighthListFrames;

import frame.Quiz;

/**
 * @author MuhammadHasnatRasool
 */
public class SqlLite_Quiz extends Quiz {

    public SqlLite_Quiz(String name) {
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

    // questions:30
    @Override
    public final void loadQuestions() {

        questions.add("Which of the following is used to create a database in SQLite?");
        options.add("A) CREATE DATABASE, B) NEW DATABASE, C) ATTACH DATABASE, D) OPEN DATABASE");
        answers.add("C) ATTACH DATABASE");

        questions.add("How do you select all columns from a table named 'customers'?");
        options.add("A) SELECT * FROM customers;, B) GET ALL FROM customers;, C) SELECT ALL FROM customers;, D) FETCH * FROM customers;");
        answers.add("A) SELECT * FROM customers;");

        questions.add("Which SQL statement is used to insert a new record into a table?");
        options.add("A) ADD RECORD, B) INSERT INTO, C) INSERT NEW, D) ADD INTO");
        answers.add("B) INSERT INTO");

        questions.add("How do you update the 'price' column for all products to 100?");
        options.add("A) UPDATE products SET price = 100;, B) MODIFY products SET price = 100;, C) CHANGE products SET price = 100;, D) SET price = 100 FOR products;");
        answers.add("A) UPDATE products SET price = 100;");

        questions.add("Which SQL clause is used to filter records?");
        options.add("A) WHERE, B) FILTER, C) HAVING, D) SELECT");
        answers.add("A) WHERE");

        questions.add("How do you delete all records from the 'orders' table?");
        options.add("A) DELETE FROM orders;, B) REMOVE FROM orders;, C) ERASE FROM orders;, D) CLEAR FROM orders;");
        answers.add("A) DELETE FROM orders;");

        questions.add("Which SQL keyword is used to sort the result-set?");
        options.add("A) ORDER BY, B) SORT BY, C) ARRANGE BY, D) GROUP BY");
        answers.add("A) ORDER BY");

        questions.add("What is the SQL statement to create a new table called 'employees'?");
        options.add("A) CREATE TABLE employees;, B) MAKE TABLE employees;, C) ADD TABLE employees;, D) NEW TABLE employees;");
        answers.add("A) CREATE TABLE employees;");

        questions.add("Which function is used to get the current date and time in SQLite?");
        options.add("A) datetime(), B) CURRENT_DATE(), C) NOW(), D) SYSDATE()");
        answers.add("A) datetime()");

        questions.add("How do you retrieve unique values from a column in SQLite?");
        options.add("A) SELECT DISTINCT, B) SELECT UNIQUE, C) SELECT DIFFERENT, D) SELECT SEPARATE");
        answers.add("A) SELECT DISTINCT");

        questions.add("Which of the following is used to join two tables based on a related column?");
        options.add("A) JOIN, B) UNION, C) LINK, D) MERGE");
        answers.add("A) JOIN");

        questions.add("What is the command to rename a table in SQLite?");
        options.add("A) ALTER TABLE RENAME TO, B) RENAME TABLE, C) ALTER TABLE RENAME, D) RENAME TO");
        answers.add("A) ALTER TABLE RENAME TO");

        questions.add("How do you add a new column 'email' to the 'users' table?");
        options.add("A) ALTER TABLE users ADD COLUMN email TEXT;, B) MODIFY TABLE users ADD COLUMN email TEXT;, C) CHANGE TABLE users ADD COLUMN email TEXT;, D) UPDATE TABLE users ADD COLUMN email TEXT;");
        answers.add("A) ALTER TABLE users ADD COLUMN email TEXT;");

        questions.add("Which SQL statement is used to remove a column from a table?");
        options.add("A) ALTER TABLE DROP COLUMN, B) MODIFY TABLE DROP COLUMN, C) DELETE COLUMN FROM TABLE, D) REMOVE COLUMN FROM TABLE");
        answers.add("A) ALTER TABLE DROP COLUMN");

        questions.add("What is the command to create a primary key on the 'id' column in SQLite?");
        options.add("A) CREATE TABLE users (id INTEGER PRIMARY KEY);, B) MODIFY TABLE users ADD PRIMARY KEY (id);, C) CREATE PRIMARY KEY ON id;, D) ADD PRIMARY KEY TO users (id);");
        answers.add("A) CREATE TABLE users (id INTEGER PRIMARY KEY);");

        questions.add("How do you combine the results of two SELECT queries in SQLite?");
        options.add("A) UNION, B) JOIN, C) COMBINE, D) MERGE");
        answers.add("A) UNION");

        questions.add("Which SQL clause is used to group rows that have the same values in specified columns?");
        options.add("A) GROUP BY, B) ORDER BY, C) SORT BY, D) FILTER BY");
        answers.add("A) GROUP BY");

        questions.add("What is the SQL statement to create an index on the 'lastname' column in the 'employees' table?");
        options.add("A) CREATE INDEX idx_lastname ON employees(lastname);, B) ADD INDEX idx_lastname ON employees(lastname);, C) CREATE INDEX ON employees(lastname);, D) MAKE INDEX ON employees(lastname);");
        answers.add("A) CREATE INDEX idx_lastname ON employees(lastname);");

        questions.add("How do you remove duplicates from a result set in SQLite?");
        options.add("A) SELECT DISTINCT, B) REMOVE DUPLICATES, C) SELECT UNIQUE, D) DELETE DUPLICATES");
        answers.add("A) SELECT DISTINCT");

        questions.add("Which of the following is used to count the number of rows in a table?");
        options.add("A) COUNT(), B) SUM(), C) TOTAL(), D) NUMBER()");
        answers.add("A) COUNT(*)");

        questions.add("What is the SQL command to create a view named 'view1'?");
        options.add("A) CREATE VIEW view1 AS ..., B) MAKE VIEW view1 AS ..., C) ADD VIEW view1 AS ..., D) NEW VIEW view1 AS ...");
        answers.add("A) CREATE VIEW view1 AS ...");

        questions.add("How do you limit the number of rows returned by a query in SQLite?");
        options.add("A) SELECT * FROM customers LIMIT 10;, B) SELECT * FROM customers TOP 10;, C) SELECT * FROM customers FIRST 10;, D) SELECT * FROM customers FETCH 10;");
        answers.add("A) SELECT * FROM customers LIMIT 10;");

        questions.add("Which command is used to delete a table from a database?");
        options.add("A) DROP TABLE, B) DELETE TABLE, C) REMOVE TABLE, D) CLEAR TABLE");
        answers.add("A) DROP TABLE");

        questions.add("What is the SQL keyword to set a default value for a column?");
        options.add("A) DEFAULT, B) SET DEFAULT, C) DEFAULT VALUE, D) SET VALUE");
        answers.add("A) DEFAULT");

        questions.add("How do you get the maximum value of a column in SQLite?");
        options.add("A) MAX(), B) HIGHEST(), C) TOP(), D) BIGGEST()");
        answers.add("A) MAX()");

        questions.add("Which SQL function is used to return the number of characters in a string?");
        options.add("A) LENGTH(), B) LEN(), C) CHARCOUNT(), D) CHARLEN()");
        answers.add("A) LENGTH()");

        questions.add("What is the SQL command to modify an existing record in a table?");
        options.add("A) UPDATE, B) MODIFY, C) CHANGE, D) EDIT");
        answers.add("A) UPDATE");

        questions.add("How do you select records from the 'customers' table where the 'age' is greater than 30?");
        options.add("A) SELECT * FROM customers WHERE age > 30;, B) SELECT * FROM customers WHERE age >= 30;, C) SELECT * FROM customers WHERE age IS GREATER THAN 30;, D) SELECT * FROM customers WHERE age OVER 30;");
        answers.add("A) SELECT * FROM customers WHERE age > 30;");

        questions.add("Which SQL clause is used to specify a condition while fetching data from a table?");
        options.add("A) WHERE, B) IF, C) CONDITION, D) FILTER");
        answers.add("A) WHERE");

        questions.add("How do you add a foreign key constraint in SQLite?");
        options.add("A) CREATE TABLE orders (order_id INTEGER, user_id INTEGER, FOREIGN KEY (user_id) REFERENCES users(id));, B) MODIFY TABLE ADD FOREIGN KEY, C) CHANGE TABLE ADD FOREIGN KEY, D) SET TABLE ADD FOREIGN KEY");
        answers.add("A) CREATE TABLE orders (order_id INTEGER, user_id INTEGER, FOREIGN KEY (user_id) REFERENCES users(id));");
    }


    public static void main(String[] args) {
        new SqlLite_Quiz(name).setVisible(true);
    }
}
