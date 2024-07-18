package fourthListFrames;

import frame.True_False_Questions;

/**
 * @author MuhammadHasnatRasool
 */

public class DataBases_TF extends True_False_Questions {

    public DataBases_TF(String name) {
        super(name);
    }
// DataBases :49
    @Override
    public final void loadQuestions() {

        questions.add("SQL stands for Structured Query Language.");
        answers.add("True");

        questions.add("A primary key in a database table can contain duplicate values.");
        answers.add("False");

        questions.add("A foreign key is a field in a table that uniquely identifies a row in another table.");
        answers.add("True");

        questions.add("The SQL command 'SELECT * FROM table' returns all columns from the table.");
        answers.add("True");

        questions.add("Normalization is the process of organizing data to reduce redundancy.");
        answers.add("True");

        questions.add("The SQL command 'DELETE' removes all rows from a table but does not free the space occupied by the table.");
        answers.add("False");

        questions.add("A view is a virtual table based on the result-set of an SQL statement.");
        answers.add("True");

        questions.add("In SQL, the 'JOIN' clause is used to combine rows from two or more tables based on a related column between them.");
        answers.add("True");

        questions.add("An index in a database improves the speed of data retrieval operations.");
        answers.add("True");

        questions.add("The 'HAVING' clause is used to filter records in a SELECT statement after the records have been grouped.");
        answers.add("True");

        questions.add("The 'GROUP BY' clause is used to aggregate data in SQL.");
        answers.add("True");

        questions.add("A NULL value in a database means that the value is unknown or missing.");
        answers.add("True");

        questions.add("In a relational database, each table must have a unique identifier called a primary key.");
        answers.add("True");

        questions.add("The SQL command 'DROP TABLE' deletes a table and its data permanently.");
        answers.add("True");

        questions.add("The 'UPDATE' command is used to modify existing records in a table.");
        answers.add("True");

        questions.add("A composite key is a primary key composed of multiple columns.");
        answers.add("True");

        questions.add("The SQL 'INSERT INTO' statement is used to add new rows to a table.");
        answers.add("True");

        questions.add("The ACID properties in databases stand for Atomicity, Consistency, Isolation, and Durability.");
        answers.add("True");

        questions.add("A transaction in a database system is a single unit of work that is either fully completed or fully failed.");
        answers.add("True");

        questions.add("In SQL, 'TRUNCATE' removes all rows from a table without logging the individual row deletions.");
        answers.add("True");

        questions.add("A stored procedure is a prepared SQL code that can be saved and reused.");
        answers.add("True");

        questions.add("In SQL, the 'ORDER BY' clause is used to sort the result set of a query.");
        answers.add("True");

        questions.add("A database trigger is a procedural code that is automatically executed in response to certain events on a particular table or view.");
        answers.add("True");

        questions.add("The 'UNION' operator in SQL is used to combine the result sets of two or more SELECT statements.");
        answers.add("True");

        questions.add("In a relational database, tables are linked by unique identifiers known as primary keys and foreign keys.");
        answers.add("True");

        questions.add("The SQL 'DISTINCT' keyword is used to return only different values.");
        answers.add("True");

        questions.add("The 'LIKE' operator in SQL is used for pattern matching.");
        answers.add("True");

        questions.add("The 'CASE' statement in SQL is used to create conditional queries.");
        answers.add("True");

        questions.add("The 'INNER JOIN' returns only the rows that have matching values in both tables.");
        answers.add("True");

        questions.add("In SQL, the 'LEFT JOIN' returns all rows from the left table, and the matched rows from the right table.");
        answers.add("True");

        questions.add("Data redundancy is encouraged in the process of normalization.");
        answers.add("False");

        questions.add("The 'RIGHT JOIN' returns all rows from the right table, and the matched rows from the left table.");
        answers.add("True");

        questions.add("The 'FULL JOIN' returns rows when there is a match in one of the tables.");
        answers.add("True");

        questions.add("In SQL, the 'EXISTS' keyword tests for the existence of any record in a subquery.");
        answers.add("True");

        questions.add("An entity-relationship diagram (ERD) is used to visually represent the structure of a database.");
        answers.add("True");

        questions.add("The SQL 'MIN' function returns the maximum value in a set of values.");
        answers.add("False");

        questions.add("The SQL 'MAX' function returns the minimum value in a set of values.");
        answers.add("False");

        questions.add("In SQL, the 'COUNT' function returns the number of rows that match a specified criterion.");
        answers.add("True");

        questions.add("Database replication involves copying data from one database to another.");
        answers.add("True");

        questions.add("Sharding is a method of splitting and distributing data across multiple databases.");
        answers.add("True");

        questions.add("In a database, a schema defines the structure, data types, and constraints of the data.");
        answers.add("True");

        questions.add("The SQL 'ALTER TABLE' command is used to add, delete, or modify columns in an existing table.");
        answers.add("True");

        questions.add("The 'CHECK' constraint in SQL is used to limit the value range that can be placed in a column.");
        answers.add("True");

        questions.add("The 'FOREIGN KEY' constraint is used to link two tables together.");
        answers.add("True");

        questions.add("The 'NOT NULL' constraint enforces a column to not accept null values.");
        answers.add("True");

        questions.add("In SQL, the 'BETWEEN' operator selects values within a given range.");
        answers.add("True");

        questions.add("A database cursor is a database object used to retrieve, manipulate, and navigate through a result set row by row.");
        answers.add("True");

        questions.add("A relational database uses a hierarchical structure to store data.");
        answers.add("False");

        questions.add("A surrogate key is an artificial key that uniquely identifies each record in a table.");
        answers.add("True");
    }

    public static void main(String[] args) {
        new DataBases_TF(name).setVisible(true);
    }

}
