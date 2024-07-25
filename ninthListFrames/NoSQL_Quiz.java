
package ninthListFrames;

import frame.Quiz;

/**
 * @author MuhammadHasnatRasool
 */
public class NoSQL_Quiz extends Quiz{
    

    public NoSQL_Quiz(String name) {
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

// questions:49
    @Override
    public final void loadQuestions() {

     

questions.add(" Which types of indexes are available in CosmosDB?");
options.add("A)range and spatial, B)secondary and primary key, C)secondary and spatial, D)range and primary key");
answers.add("A)range and spatial");

questions.add(" You want to connect a DynamoDB stream to AWS Lambda function. Which one of these object do you create?");
options.add("A)DynamoDB table, B)DynamoDB trigger, C)DynamoDB item, D)DynamoDB index");
answers.add("B)DynamoDB trigger");

questions.add(" To index a field that holds an array value in MongoDB, which index type do you create?");
options.add("A)partial, B)sparse, C)compound, D)multikey");
answers.add("D)multikey");

questions.add(" You want to test HBASE on your laptop using the fewest number of steps. What do you do?");
options.add("A)Set up Hadoop in pseudo-distributed mode., B)Set up HBASE in local mode., C)Set up HBASE in pseudo-distributed mode., D)Set up Hadoop in local mode.");
answers.add("B)Set up HBASE in local mode.");

questions.add(" You need to create a document database that supports database triggers. Which NoSQL database should you use?");
options.add("A)DynamoDB, B)BigTable, C)Redis, D)MongoDB");
answers.add("A)DynamoDB");

questions.add(" What is recommended size for Redis keys?");
options.add("A)medium, B)short, C)single bit, D)long");
answers.add("B)short");

questions.add(" What does Redis use to sort the elements of a sorted set?");
options.add("A)Scores, B)Ids, C)Values, D)Keys");
answers.add("A)Scores");

questions.add(" You need to change the shard key of an existing MongoDB collection. What do you do?");
options.add("A)Dump the collection data drop the collection create a new collection and shard key import the data., B)Add second shard key and drop the first shard key., C)Dump the collection data drop the collection presplit the data create a new collection and shard key import the data., D)Drop and recreate the shard key.");
answers.add("C)Dump the collection data, drop the collection, presplit the data, create a new collection and shard key, import the data.");

questions.add(" Polyglot storage means using multiple types of what in the same application?");
options.add("A)Security systems, B)Database systems, C)Storage systems, D)Query systems");
answers.add("C)Storage systems");

questions.add(" You need to implement the simplest possible scalable, in-memory cache for your AWS application. Which service do you select?");
options.add("A)Elasticache using Memcached., B)DynamoDB., C)DynamoDB Accelerator (DAX)., D)Elasticache using Redis.");
answers.add("D)Elasticache using Redis.");

questions.add(" You are doing data modelling for Google BigTable. Which statement expresses if and when you should split entities across multiple rows?");
options.add("A)Keep all information for an entity in a single row. Store related entities in adjacent rows., B)Keep all information for an entity in a single row., C)Split entities across multiple rows if the entity data is over thousands of MBs or if it does not need atomic updates and reads., D)Split entities across multiple rows if the entity data is over hundreds of MBs or if it does not need atomic updates and reads.");
answers.add("C)Split entities across multiple rows if the entity data is over hundreds of MBs, or if it does not need atomic updates and reads.");

questions.add(" Which two characteristics define Amazon Quantum Ledger Database?");
options.add("A)Key-value data model; transactionally consistent with ACID semantics., B)Document data model; transactionally consistent with ACID semantics., C)Key-value data model; transactions with tunable consistency., D)Document data model; transactions with tunable consistency.");
answers.add("B)Document data model; transactionally consistent with ACID semantics.");

questions.add(" You need to design the primary key for DynamoDB based on three attributes. What do you do?");
options.add("A)Designate all three fields as the primary key., B)Concatenate all three fields into one new field then designate that new field as the primary key., C)Designate two fields of the three fields as the primary key., D)Concatenate two fields into one new field then designate that new field and the remaining field as the primary key.");
answers.add("B)Concatenate all three fields into one new field then designate that new field as the primary key.");

questions.add(" Which of these data types should you avoid in designing a Google Bigtable row key?");
options.add("A)multi-valued identifiers, B)string identifiers, C)timestamps, D)frequently updated identifiers");
answers.add("D)frequently updated identifiers");

questions.add(" Your startup is building a prototype that has an evolving schema. Your data will be eventually consistent. Your application is hosted in AWS. Which database do you choose?");
options.add("A)Neptune, B)DocumentDB, C)DynamoDB, D)Amazon Aurora");
answers.add("C)DynamoDB");

questions.add(" You need to create a scalable database that allows you to share documents across authorized mobile clients in real time. What Google NoSQL database should you use?");
options.add("A)Memorystore, B)Datastore, C)Firebase, D)Bigtable");
answers.add("C)Firebase");

questions.add(" You need to design security for DynamoDB to allow users read-only access to certain items and attributes in a table. What do you do?");
options.add("A)Use IAM roles., B)Use IAM policy conditions., C)Use a VPC endpoint., D)Use IAM policies.");
answers.add("B)Use IAM policy conditions.");

questions.add(" Which statement is preferred Cypher code for Neo4j?");
options.add("A)MATCH (:Person)-->(:Card)-->(:Company) RETURN count(vehicle), B)Match (:Person)-->(:Car):(vehicle:Car)-->(:Company) RETURN count(vehicle), C)MATCH (:Person)-->(vehicle:Car)-->(:Company) RETURN count(vehicle), D)MATCH (:Person)-->(:Card) (vehicle:Car)-->(:Company) RETURN count(vehicle)");
answers.add("B)MATCH (:Person)-->(vehicle:Car)-->(:Company) RETURN count(vehicle)");

questions.add(" You need multi-item ACID transactions with snapshot isolation within a partition for your cloud-based application. Which NoSQL databse do you choose?");
options.add("A)Bigtable, B)GraphDB, C)DynamoDB, D)Cosmos DB");
answers.add("D)Cosmos DB");

questions.add(" You need to control your application's batch updates destination for your Bigtable multinode cluster. Which action do you take?");
options.add("A)Create a custom app profile to route batch updates., B)Create a custom app profile to route the batch update from that client., C)Update the default app profile to route the natch update from that client., D)Use the default app profile to route batch updates.");
answers.add("C)Update the default app profile to route the natch update from that client.");

questions.add(" Your query to verify that your Redis key is configured to support expiring user information on a defined interval returns -2, What does this value indicate?");
options.add("A)The queried key value expired in the last two seconds., B)The queried key value exists but has no associated expire value., C)The queried key value does not exist., D)There are two expired keys with this value.");
answers.add("C)The queried key value does not exist.");

questions.add(" You are designing a MongoDB schema to support queries that will include lookups. What should you do?");
options.add("A)Create an index on the key value used as the primary key., B)Create an index on the key value used as the foreign key., C)Create a multicolumn index on the key value used as the foreign key and the most unique column in the document., D)Create a multicolumn index on the key value used as the primary and also the foreign key.");
answers.add("C)Create a multicolumn index on the key value used as the foreign key and the most unique column in the document.");

questions.add(" What is the aggregation operator for a join concept in MongoDB?");
options.add("A)$group, B)$match, C)$lookup, D)$project");
answers.add("C)$lookup");

questions.add(" For your mobile application, you need to select a Google cloud database that can support compound, filtered document queries. Which do you choose?");
options.add("A)Cloud SQL, B)Cloud Spanner, C)Cloud Firestore, D)Cloud Firebase");
answers.add("D)Cloud Firestore");

questions.add(" To bulk load data into Amazon Neptune, what do you do?");
options.add("A)Upload data to S3 VPC endpoint Use the Neptune loader to load from s3 into your Neptune instance, B)Ad data to a Kinesis stream and use the Neptune loader to load from S# into your Neptune instance., C)Add data to a Kinesis stream and create a Kinesis stream VPC endpoint. Use the Neptune loader to load from S3 into your Neptune instance., D)Upload data to S Use the Neptune loader to load from S3 into your Neptune instance.");
answers.add("A)Upload data to S3 VPC endpoint, Use the Neptune loader to load from s3 into your Neptune instance");

questions.add(" You need to create a pub/sub server. Which database do you use?");
options.add("A)Neo4j, B)Cassandra, C)Redis, D)MySQL");
answers.add("C)Redis");

questions.add(" SQL databases and NoSQL are which types of scalable?");
options.add("A)horizontally infinitely, B)vertically  horizontally, C)vertically infinitely, D)horizontally  vertically");
answers.add("B)vertically  horizontally");

questions.add(" You need to create a scalable database that allows you to query data nodes and edges efficiently. What do you use?");
options.add("A)a relational database, B)a columnstore database, C)a document database, D)a graph database");
answers.add("D)a graph database");

questions.add(" You are developing a model for a graph database. Your data will be moved from a relational database into Neo4j. Which of these transformations apply?");
options.add("A)Rows become labels: bales become nodes., B)Tables become labels: rows become nodes., C)Tables become collections: rows become items., D)Rows become collections: tables become items.");
answers.add("B)Tables become labels: rows become nodes.");

questions.add(" You need to execute a command for MongoDB that does NOT load values from the `.mongorc.js` file. What do you do ?");
options.add("A)Delete the .monorc.js file and restart mongo shell., B)Use the mongo shell to create a command with --norc option, C)Rem all lines in the .mongorc.js file ad restart mongo shell., D)Use the mongo shell to create a command with --nodedefault option.");
answers.add("D)Use the mongo shell to create a command with --nodedefault option.");

questions.add(" You need to store an unordered collection of name-value pairs with differing data types in DynamoDB. Which data type should you choose?");
options.add("A)map, B)set, C)list, D)stack");
answers.add("A)map");

questions.add(" Which statement retrieves an item from the MusicCollection table in DynamoDB?");
options.add("A)aws dynamodb query --table-name MusicCollection --key file://key.json, B)aws dynamodb get-item --table-name MusicCollection --key file://key.json, C)aws dynamodb select --table-name MusicCollection --key file://key.json, D)aws dynamodb put-item --table-name MusicCollection --key file://key.json");
answers.add("B)aws dynamodb get-item --table-name MusicCollection --key file://key.json");

questions.add(" Database availability is measured by which metric?");
options.add("A)the amount of service calls, B)the number of minutes, C)the amount of service costs, D)the number of nines");
answers.add("D)the number of nines");

questions.add(" You need to encrypt data at rest in DynamoDB. Which action do you take?");
options.add("A)You assign a default AWS encryption key to your table to encrypt data., B)You create an AWS encryption key and assign it to your table to encrypt data., C)None. Data is encrypted by default., D)You create an AWS encryption key and assign it to your database to encrypt data.");
answers.add("C)None. Data is encrypted by default.");

questions.add(" You need to generate a unique, sequential identifier for each value stored in a Redis cluster. What do you do?");
options.add("A)Implement a SortedSet object to generate a value., B)Use the GUID keyword to generate a value., C)Implement a List object to generate a value., D)Use the INCR keyword to generate a value");
answers.add("D)Use the INCR keyword to generate a value");

questions.add(" You want to return a list of all elements in two Redis sets. Which keyword do you use?");
options.add("A)smembers, B)returnall, C)sunion, D)sismember");
answers.add("A)smembers");

questions.add(" Which method shows you whether MongoDB uses any indexes when running a query, and how the indexes are used?");
options.add("A)detailQueryExecution(), B)showPlan(), C)explain(), D)describe()");
answers.add("C)explain()");

questions.add(" Which statement accurately describes global secondary indexes in DynamoDB?");
options.add("A)The global secondary indexes in DynamoDB are consistent and are not guaranteed to return correct results., B)The global secondary indexes in DynamoDB are transactionally consistent and are guaranteed to return correct results., C)The global secondary indexes in DynamoDB are partially consistent and are not guaranteed to return correct results., D)The global secondary indexes in DynamoDB are eventually consistent and are not guaranteed to return correct results.");
answers.add("D)The global secondary indexes in DynamoDB are eventually consistent, and are not guaranteed to return correct results.");

questions.add(" Which command do you use to add a value to a Redis stream named mystream?");
options.add("A)ADD mystream * sensor-id 1234 temperature 19.8 1518951480106-1, B)UPDATE mystream * sensor-id 1234 temperature 19.8 1518951480106-3, C)XADD mystream * sensor-id 1234 temperature 9.8 1518951480106-0, D)INSERT mystream * sensor-d 1234 temperature 19.8 15181480106-2");
answers.add("C)XADD mystream * sensor-id 1234 temperature 9.8 1518951480106-0");

questions.add(" You need to create a scalable database that supports immutable writes. What do you use?");
options.add("A)A ledger database, B)A graph database, C)A key-value database, D)A columnstore database");
answers.add("A)A ledger database");

questions.add(" You need to create a data store for the catalog for your new ecommerce application. Your company is a startup, so the catalog schema may evolve. Which do you choose?");
options.add("A)Neo4j, B)Redis, C)MySQL, D)MongoDB");
answers.add("D)MongoDB");

questions.add(" You need to select a NoSQL database for heavy aggregate query workloads. Which type do you choose?");
options.add("A)graph, B)key-value, C)document, D)columnstore");
answers.add("D)columnstore");

questions.add(" You need to select a columnstore database that enforce built-in data types. You want to add indexes to improve performance for known workloads. Which do you choose?");
options.add("A)Cassandra, B)Bigtable, C)Redis, D)HBase");
answers.add("C)Redis");

questions.add(" In DynamoDB, the partition key and sort key are also known as which type of attributes?");
options.add("A)range hash, B)primary range, C)hash range, D)range secondary");
answers.add("C)hash, range");

questions.add(" What is a popular, open-source key-value store database?");
options.add("A)MongoDB, B)Redis, C)MySQL, D)Cassandra");
answers.add("B)Redis");

questions.add(" You need to create a scalable database to store and query JSON data. What do you use?");
options.add("A)a relational database, B)a document database, C)a graph database, D)a ledger database");
answers.add("B)a document database");

questions.add(" Which command gets all documents in a MongoDB datastore where the status equals A or the quantity is less than 30?");
options.add("A)db.inventory.find( { status: (a) qty: { $lt: 30 } } ), B)db.inventory.find( { $or: [ { status: (A) } { qty: { $lt: 30 } } ] } ), C)db.inventory.find( { status: (A) qty: { $lt: 30 } } ), D)db.inventory.find( { $or: [ { status: (a) } { qty: { $lt: 30 } } ] } )");
answers.add("ABdb.inventory.find( { $or: [ { status: (A) }, { qty: { $lt: 30 } } ] } )");

questions.add(" Benefit of using NoSQL database?");
options.add("A)Strict data modeling, B)Limited scalability, C)Easy schema evolution, D)Limited data storage capacity");
answers.add("C)Easy schema evolution");

questions.add(" NoSQL databases are most often referred to as?");
options.add("A)Relational, B)Distributed, C)Object-oriented, D)Network");
answers.add("B)Distributed");

    }

    
    public static void main(String[]args){
        new NoSQL_Quiz(name).setVisible(true);
    }
    
}
