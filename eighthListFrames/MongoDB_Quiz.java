package eighthListFrames;

import frame.Quiz;
/**
 * @author MuhammadHasnatRasool
 */
public class MongoDB_Quiz extends Quiz {
    
    public MongoDB_Quiz(String name) {
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
    
    // questions:37
    @Override
    public final void loadQuestions() {
        
        questions.add("Which command is used to insert a document into a MongoDB collection?");
        options.add("A) insertOne(), B) add(), C) insertDocument(), D) create()");
        answers.add("A) insertOne()");
        
        questions.add("How do you create a new database in MongoDB?");
        options.add("A) CREATE DATABASE dbname;, B) new Database(dbname);, C) use dbname;, D) db.createDatabase(dbname);");
        answers.add("C) use dbname;");
        
        questions.add("Which method is used to find all documents in a MongoDB collection?");
        options.add("A) findAll(), B) find(), C) getAll(), D) fetchAll()");
        answers.add("B) find()");
        
        questions.add("How do you update a single document in MongoDB?");
        options.add("A) updateOne(), B) updateDocument(), C) modifyOne(), D) changeOne()");
        answers.add("A) updateOne()");
        
        questions.add("Which of the following is NOT a valid MongoDB data type?");
        options.add("A) String, B) Boolean, C) Integer, D) Double");
        answers.add("C) Integer");
        
        questions.add("How do you delete a document from a MongoDB collection?");
        options.add("A) remove(), B) deleteOne(), C) erase(), D) drop()");
        answers.add("B) deleteOne()");
        
        questions.add("What is the primary key field name in MongoDB by default?");
        options.add("A) id, B) _id, C) primary_key, D) key_id");
        answers.add("B) _id");
        
        questions.add("Which command is used to create an index in MongoDB?");
        options.add("A) createIndex(), B) addIndex(), C) index(), D) makeIndex()");
        answers.add("A) createIndex()");
        
        questions.add("How do you retrieve only the name and age fields from documents in a MongoDB collection?");
        options.add("A) db.collection.find({} {name: 1 age: 1}), B) db.collection.find({} {fields: ['name' 'age']}), C) db.collection.find({} {name: true age: true}), D) db.collection.find({name age})");
        answers.add("A) db.collection.find({} {name: 1 age: 1})");
        
        questions.add("Which operator is used for pattern matching in MongoDB?");
        options.add("A) $match, B) $pattern, C) $regex, D) $like");
        answers.add("C) $regex");
        
        questions.add("How do you count the number of documents in a MongoDB collection?");
        options.add("A) countDocuments(), B) countAll(), C) getCount(), D) totalDocuments()");
        answers.add("A) countDocuments()");
        
        questions.add("Which method is used to drop a collection in MongoDB?");
        options.add("A) dropCollection(), B) removeCollection(), C) deleteCollection(), D) drop()");
        answers.add("D) drop()");
        
        questions.add("How do you rename a collection in MongoDB?");
        options.add("A) renameCollection(), B) rename(), C) changeCollectionName(), D) alterCollection()");
        answers.add("A) renameCollection()");
        
        questions.add("Which of the following is used to aggregate data in MongoDB?");
        options.add("A) aggregate(), B) groupBy(), C) collect(), D) aggregateData()");
        answers.add("A) aggregate()");
        
        questions.add("Which MongoDB shell command is used to show all databases?");
        options.add("A) show dbs, B) list databases, C) display dbs, D) get dbs");
        answers.add("A) show dbs");
        
        questions.add("What is the command to check the current database in MongoDB?");
        options.add("A) db.current(), B) db.getName(), C) db, D) currentDb()");
        answers.add("B) db.getName()");
        
        questions.add("How do you limit the number of documents returned by a query in MongoDB?");
        options.add("A) limitDocuments(), B) limit(), C) restrict(), D) max()");
        answers.add("B) limit()");
        
        questions.add("Which operator is used to check for the existence of a field in MongoDB?");
        options.add("A) $exists, B) $hasField, C) $contains, D) $present");
        answers.add("A) $exists");
        
        questions.add("How do you sort the results of a query in MongoDB?");
        options.add("A) orderBy(), B) sort(), C) arrange(), D) order()");
        answers.add("B) sort()");
        
        questions.add("What is the default port for MongoDB?");
        options.add("A) 3306, B) 27017, C) 5432, D) 8080");
        answers.add("B) 27017");
        
        questions.add("Which of the following is used to perform a full-text search in MongoDB?");
        options.add("A) $text, B) $search, C) $find, D) $matchText");
        answers.add("A) $text");
        
        questions.add("How do you add an element to an array field in a MongoDB document?");
        options.add("A) $addToSet, B) $push, C) $append, D) $insert");
        answers.add("B) $push");
        
        questions.add("Which method is used to remove an element from an array field in a MongoDB document?");
        options.add("A) $pull, B) $pop, C) $remove, D) $delete");
        answers.add("A) $pull");
        
        questions.add("How do you update multiple documents in MongoDB?");
        options.add("A) updateMany(), B) updateAll(), C) modifyMany(), D) changeMany()");
        answers.add("A) updateMany()");
        
        questions.add("What type of database is MongoDB?");
        options.add("A) Relational, B) Graph, C) Key-Value, D) Document");
        answers.add("D) Document");
        
        questions.add("Which of the following is used to backup a MongoDB database?");
        options.add("A) mongodump, B) mongodbbackup, C) mongosave, D) mongobackup");
        answers.add("A) mongodump");
        
        questions.add("How do you restore a MongoDB database from a backup?");
        options.add("A) mongorestore, B) mongodbrestore, C) mongoload, D) mongorecover");
        answers.add("A) mongorestore");
        
        questions.add("Which method is used to create a capped collection in MongoDB?");
        options.add("A) createCapped(), B) createCappedCollection(), C) create(), D) createCollection()");
        answers.add("D) createCollection()");
        
        questions.add("How do you set a time-to-live (TTL) index in MongoDB?");
        options.add("A) db.collection.createIndex({field: 1} {expireAfterSeconds: 3600}), B) db.collection.setTTL({field: 1} {expireAfterSeconds: 3600}), C) db.collection.addTTL({field: 1} {expireAfterSeconds: 3600}), D) db.collection.indexTTL({field: 1} {expireAfterSeconds: 3600})");
        answers.add("A) db.collection.createIndex({field: 1} {expireAfterSeconds: 3600})");
        
        questions.add("What is the command to switch to a different database in MongoDB?");
        options.add("A) switch dbname, B) use dbname, C) change dbname, D) select dbname");
        answers.add("B) use dbname");
        
        questions.add("You need to find all documents in the 'orders' collection where the 'status' field is 'shipped' and sort them by 'date' in descending order. Which query would you use?");
        options.add("A) db.orders.find({status: 'shipped'}).sort({date: -1}), B) db.orders.find({status: 'shipped'}).orderBy({date: 'desc'}), C) db.orders.find({status: 'shipped'}).arrange({date: -1}), D) db.orders.find({status: 'shipped'}).sortBy({date: 'desc'})");
        answers.add("A) db.orders.find({status: 'shipped'}).sort({date: -1})");
        
        questions.add("You have a collection named 'products' with documents that have a 'price' field. You need to update the price of all products to be increased by 10%. Which query would you use?");
        options.add("A) db.products.updateMany({} {$mul: {price: 1.1}}), B) db.products.updateMany({} {$inc: {price: 0.1}}), C) db.products.updateMany({} {$set: {price: price * 1.1}}), D) db.products.updateMany({} {$inc: {price: price * 0.1}})");
        answers.add("A) db.products.updateMany({} {$mul: {price: 1.1}})");
        
        questions.add("You need to create a new user 'reportUser' with read-only access to the 'sales' database. Which command would you use?");
        options.add("A) db.createUser({user: 'reportUser' pwd: 'password' roles: [{role: 'read' db: 'sales'}]}), B) db.createUser({user: 'reportUser', pwd: 'password', roles: [{role: 'readWrite', db: 'sales'}]}), C) db.createUser({user: 'reportUser' pwd: 'password', roles: [{role: 'readOnly' db: 'sales'}]}), D) db.createUser({user: 'reportUser' pwd: 'password' roles: [{role: 'read' db: 'admin'}]})");
        answers.add("A) db.createUser({user: 'reportUser' pwd: 'password' roles: [{role: 'read' db: 'sales'}]})");
        
        questions.add("You want to ensure that the 'username' field in the 'users' collection is unique. How would you create this index?");
        options.add("A) db.users.createIndex({username: 1} {unique: true}), B) db.users.createUniqueIndex({username: 1}), C) db.users.ensureIndex({username: 1}, {unique: true}), D) db.users.addIndex({username: 1}, {unique: true})");
        answers.add("A) db.users.createIndex({username: 1} {unique: true})");
        
        questions.add("You need to find all documents in the 'employees' collection where the 'salary' is greater than 50000 and the 'department' is 'HR'. Which query would you use?");
        options.add("A) db.employees.find({salary: {$gt: 50000} department: 'HR'}), B) db.employees.find({$and: [{salary: {$gt: 50000}} {department: 'HR'}]}), C) db.employees.find({$where: 'this.salary > 50000 && this.department == \"HR\"'}), D) db.employees.find({salary: {$greater: 50000} department: 'HR'})");
        answers.add("A) db.employees.find({salary: {$gt: 50000} department: 'HR'})");
        
        questions.add("You have a collection 'logs' that grows very large quickly. You want to automatically delete documents older than 30 days. How would you set this up?");
        options.add("A) db.logs.createIndex({createdAt: 1} {expireAfterSeconds: 2592000}), B) db.logs.setTTL({createdAt: 1} {expireAfterSeconds: 2592000}), C) db.logs.addTTLIndex({createdAt: 1} {expireAfterSeconds: 2592000}), D) db.logs.createTTLIndex({createdAt: 1} {expireAfterSeconds: 2592000})");
        answers.add("A) db.logs.createIndex({createdAt: 1} {expireAfterSeconds: 2592000})");
        
        questions.add("You need to import a large dataset from a JSON file into a MongoDB collection named 'data'. Which command would you use?");
        options.add("A) mongoimport --db mydb --collection data --file data.json, B) mongoload --db mydb --collection data --file data.json, C) mongorestore --db mydb --collection data --file data.json, D) mongoinsert --db mydb --collection data --file data.json");
        answers.add("A) mongoimport --db mydb --collection data --file data.json");
    }

    
    public static void main(String[] args) {
        new MongoDB_Quiz(name).setVisible(true);
    }
}
