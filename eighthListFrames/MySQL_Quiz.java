package eighthListFrames;

import frame.Quiz;

/**
 * @author MuhammadHasnatRasool
 */
public class MySQL_Quiz extends Quiz{
    

    public MySQL_Quiz(String name) {
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
        questions.add("Which of the following is used to create a database in MySQL?");
        options.add("A) CREATE DATABASE, B) NEW DATABASE, C) MAKE DATABASE, D) ADD DATABASE");
        answers.add("A) CREATE DATABASE");

        questions.add("How do you select all columns from a table named 'users'?");
        options.add("A) SELECT * FROM users;, B) GET ALL FROM users;, C) SELECT ALL FROM users;, D) FETCH * FROM users;");
        answers.add("A) SELECT * FROM users;");

        questions.add("Which command is used to delete a table in MySQL?");
        options.add("A) DELETE TABLE, B) DROP TABLE, C) REMOVE TABLE, D) CLEAR TABLE");
        answers.add("B) DROP TABLE");

        questions.add("How do you add a new column 'age' to an existing table 'employees'?");
        options.add("A) ALTER TABLE employees ADD age INT;, B) MODIFY TABLE employees ADD age INT;, C) CHANGE TABLE employees ADD age INT;, D) UPDATE TABLE employees ADD age INT;");
        answers.add("A) ALTER TABLE employees ADD age INT;");

        questions.add("Which function is used to return the current date and time in MySQL?");
        options.add("A) CURRENT_DATE(), B) GETDATE(), C) NOW(), D) SYSDATE()");
        answers.add("C) NOW()");

        questions.add("How do you remove duplicate records from a result set in MySQL?");
        options.add("A) SELECT UNIQUE, B) SELECT DISTINCT, C) SELECT DIFFERENT, D) SELECT NON-REPEAT");
        answers.add("B) SELECT DISTINCT");

        questions.add("Which statement is used to update data in a MySQL table?");
        options.add("A) CHANGE, B) MODIFY, C) UPDATE, D) ALTER");
        answers.add("C) UPDATE");

        questions.add("How do you add a primary key to an existing table?");
        options.add("A) ALTER TABLE ADD PRIMARY KEY, B) MODIFY TABLE ADD PRIMARY KEY, C) CHANGE TABLE ADD PRIMARY KEY, D) UPDATE TABLE ADD PRIMARY KEY");
        answers.add("A) ALTER TABLE ADD PRIMARY KEY");

        questions.add("Which clause is used to sort the result set in MySQL?");
        options.add("A) ORDER BY, B) SORT BY, C) ARRANGE BY, D) GROUP BY");
        answers.add("A) ORDER BY");

        questions.add("How do you retrieve the first 5 records from a table named 'products'?");
        options.add("A) SELECT TOP 5 * FROM products;, B) SELECT * FROM products LIMIT 5;, C) SELECT * FROM products FETCH FIRST 5 ROWS;, D) SELECT * FROM products WHERE ROWNUM <= 5;");
        answers.add("B) SELECT * FROM products LIMIT 5;");

        questions.add("Which function is used to count the number of rows in a result set?");
        options.add("A) COUNT(), B) SUM(), C) TOTAL(), D) NUMBER()");
        answers.add("A) COUNT()");

        questions.add("How do you create an index on the 'name' column in the 'customers' table?");
        options.add("A) CREATE INDEX idx_name ON customers(name);, B) ADD INDEX idx_name ON customers(name);, C) MAKE INDEX idx_name ON customers(name);, D) BUILD INDEX idx_name ON customers(name);");
        answers.add("A) CREATE INDEX idx_name ON customers(name);");

        questions.add("Which keyword is used to remove a row from a table in MySQL?");
        options.add("A) DELETE, B) REMOVE, C) DROP, D) ERASE");
        answers.add("A) DELETE");

        questions.add("How do you add a foreign key to a table in MySQL?");
        options.add("A) ALTER TABLE ADD FOREIGN KEY, B) MODIFY TABLE ADD FOREIGN KEY, C) CHANGE TABLE ADD FOREIGN KEY, D) UPDATE TABLE ADD FOREIGN KEY");
        answers.add("A) ALTER TABLE ADD FOREIGN KEY");

        questions.add("Which function returns the length of a string in MySQL?");
        options.add("A) LENGTH(), B) LEN(), C) SIZE(), D) STRING_LENGTH()");
        answers.add("A) LENGTH()");

        questions.add("How do you combine the results of two SELECT queries in MySQL?");
        options.add("A) COMBINE, B) JOIN, C) UNION, D) MERGE");
        answers.add("C) UNION");

        questions.add("Which command is used to delete all records from a table without deleting the table itself?");
        options.add("A) DELETE, B) TRUNCATE, C) CLEAR, D) REMOVE");
        answers.add("B) TRUNCATE");

        questions.add("How do you find the maximum value in a column 'salary' of a table 'employees'?");
        options.add("A) SELECT MAX(salary) FROM employees;, B) SELECT GREATEST(salary) FROM employees;, C) SELECT HIGHEST(salary) FROM employees;, D) SELECT TOP(salary) FROM employees;");
        answers.add("A) SELECT MAX(salary) FROM employees;");

        questions.add("Which clause is used to filter records in a SELECT statement?");
        options.add("A) WHERE, B) FILTER, C) HAVING, D) LIMIT");
        answers.add("A) WHERE");

        questions.add("How do you rename a table in MySQL?");
        options.add("A) ALTER TABLE RENAME TO, B) RENAME TABLE, C) CHANGE TABLE NAME, D) UPDATE TABLE NAME");
        answers.add("B) RENAME TABLE");

        questions.add("Which MySQL function is used to calculate the average value of a numeric column?");
        options.add("A) AVG(), B) MEAN(), C) MEDIAN(), D) AVERAGE()");
        answers.add("A) AVG()");

        questions.add("What is the correct syntax to create a new user in MySQL?");
        options.add("A) CREATE USER 'username'@'host' IDENTIFIED BY 'password';, B) ADD USER 'username'@'host' IDENTIFIED BY 'password';, C) NEW USER 'username'@'host' IDENTIFIED BY 'password';, D) MAKE USER 'username'@'host' IDENTIFIED BY 'password';");
        answers.add("A) CREATE USER 'username'@'host' IDENTIFIED BY 'password';");

        questions.add("How do you display the structure of a table 'orders'?");
        options.add("A) SHOW TABLE orders;, B) DESCRIBE orders;, C) EXPLAIN orders;, D) DISPLAY orders;");
        answers.add("B) DESCRIBE orders;");

        questions.add("Which statement is used to grant privileges to a user in MySQL?");
        options.add("A) GRANT, B) ALLOW, C) GIVE, D) PERMIT");
        answers.add("A) GRANT");

        questions.add("How do you change the data type of a column 'price' to DECIMAL in the 'products' table?");
        options.add("A) ALTER TABLE products MODIFY price DECIMAL;, B) CHANGE TABLE products MODIFY price DECIMAL;, C) UPDATE TABLE products MODIFY price DECIMAL;, D) MODIFY TABLE products CHANGE price DECIMAL;");
        answers.add("A) ALTER TABLE products MODIFY price DECIMAL;");

        questions.add("Which keyword is used to create a view in MySQL?");
        options.add("A) CREATE VIEW, B) MAKE VIEW, C) ADD VIEW, D) BUILD VIEW");
        answers.add("A) CREATE VIEW");

        questions.add("How do you get the current user in MySQL?");
        options.add("A) SELECT CURRENT_USER();, B) SELECT USER();, C) SELECT SESSION_USER();, D) SELECT SYSTEM_USER();");
        answers.add("B) SELECT USER();");

        questions.add("Which clause is used with the GROUP BY clause to filter groups in MySQL?");
        options.add("A) HAVING, B) WHERE, C) FILTER, D) LIMIT");
        answers.add("A) HAVING");

        questions.add("What is the default port number for MySQL?");
        options.add("A) 3306, B) 5432, C) 1521, D) 8080");
        answers.add("A) 3306");

        questions.add("Which command is used to create a backup of a MySQL database?");
        options.add("A) mysqldump, B) mysqlbackup, C) backupdb, D) dumpdb");
        answers.add("A) mysqldump");

  }
    
 
    
    public static void main(String[]args){
        new MySQL_Quiz(name).setVisible(true);
    }
}

