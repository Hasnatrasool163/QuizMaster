package fifthListFrames;


import frame.Quiz;

/**
 * @author MuhammadHasnatRasool
 */
public class Graphs_Quiz extends Quiz{
    

    public Graphs_Quiz(String name) {
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

// 31 mcqs
    @Override
    public final void loadQuestions() {

        questions.add("What is the purpose of a graph?");
        options.add("A) To display data in a table, B) To display data in a visual format, C) To calculate mathematical equations, D) To write code");
        answers.add("B) To display data in a visual format");

        questions.add("What is the x-axis of a graph?");
        options.add("A) The vertical axis, B) The horizontal axis, C) The diagonal axis, D) The curved axis");
        answers.add("B) The horizontal axis");

        questions.add("What is the y-axis of a graph?");
        options.add("A) The horizontal axis, B) The vertical axis, C) The diagonal axis, D) The curved axis");
        answers.add("B) The vertical axis");

        questions.add("What is the term for the points on a graph?");
        options.add("A) Nodes, B) Vertices, C) Points, D) Coordinates");
        answers.add("C) Points");

        questions.add("What is the term for the lines connecting points on a graph?");
        options.add("A) Edges, B) Lines, C) Curves, D) Axes");
        answers.add("A) Edges");

        questions.add("What is a bar graph used for?");
        options.add("A) To compare categorical data, B) To show trends over time, C) To display continuous data, D) To show relationships between variables");
        answers.add("A) To compare categorical data");

        questions.add("What is a pie chart used for?");
        options.add("A) To compare categorical data, B) To show trends over time, C) To display continuous data, D) To show proportions of a whole");
        answers.add("D) To show proportions of a whole");

        questions.add("What is a line graph used for?");
        options.add("A) To compare categorical data, B) To show trends over time, C) To display continuous data, D) To show relationships between variables");
        answers.add("B) To show trends over time");

        questions.add("What is a scatter plot used for?");
        options.add("A) To compare categorical data, B) To show trends over time, C) To display continuous data, D) To show relationships between variables");
        answers.add("D) To show relationships between variables");

        questions.add("What is the term for the study of graphs?");
        options.add("A) Graph theory, B) Chart theory, C) Diagram theory, D) Plot theory");
        answers.add("A) Graph theory");
        
        questions.add("What is the term for a graph with no edges?");
        options.add("A) Empty graph, B) Null graph, C) Disconnected graph, D) Complete graph");
        answers.add("A) Empty graph");

        questions.add("What is the term for a graph with all possible edges?");
        options.add("A) Complete graph, B) Incomplete graph, C) Connected graph, D) Disconnected graph");
        answers.add("A) Complete graph");

        questions.add("What is the term for a graph with no cycles?");
        options.add("A) Acyclic graph, B) Cyclic graph, C) Connected graph, D) Disconnected graph");
        answers.add("A) Acyclic graph");

        questions.add("What is the term for a graph with a cycle?");
        options.add("A) Acyclic graph, B) Cyclic graph, C) Connected graph, D) Disconnected graph");
        answers.add("B) Cyclic graph");

        questions.add("What is the term for a graph with a vertex of degree zero?");
        options.add("A) Isolated vertex, B) Connected vertex, C) Disconnected vertex, D) Null vertex");
        answers.add("A) Isolated vertex");

        questions.add("What is the term for a graph with a vertex of degree one?");
        options.add("A) Leaf vertex, B) Branch vertex, C) Root vertex, D) Isolated vertex");
        answers.add("A) Leaf vertex");

        questions.add("What is the term for a graph with a vertex of degree two or more?");
        options.add("A) Branch vertex, B) Leaf vertex, C) Root vertex, D) Isolated vertex");
        answers.add("A) Branch vertex");

        questions.add("What is the term for a graph with a vertex that has an edge to itself?");
        options.add("A) Loop, B) Cycle, C) Edge, D) Vertex");
        answers.add("A) Loop");

        questions.add("What is the term for a graph with two or more vertices connected by multiple edges?");
        options.add("A) Multigraph, B) Simple graph, C) Weighted graph, D) Directed graph");
        answers.add("A) Multigraph");

        questions.add("What is the term for a graph with edges that have weights or labels?");
        options.add("A) Weighted graph, B) Simple graph, C) Multigraph, D) Directed graph");
        answers.add("A) Weighted graph");

        questions.add("What is the term for a graph with edges that have direction?");
        options.add("A) Directed graph, B) Undirected graph, C) Weighted graph, D) Simple graph");
        answers.add("A) Directed graph");
      
        
        questions.add("What is the term for a graph that is not directed?");
        options.add("A) Undirected graph, B) Directed graph, C) Weighted graph, D) Simple graph");
        answers.add("A) Undirected graph");

        questions.add("What is the term for a graph that is both directed and weighted?");
        options.add("A) Directed weighted graph, B) Undirected weighted graph, C) Directed simple graph, D) Undirected simple graph");
        answers.add("A) Directed weighted graph");

        questions.add("What is the term for a graph that is connected and has no cycles?");
        options.add("A) Tree, B) Forest, C) Cycle, D) Graph");
        answers.add("A) Tree");

        questions.add("What is the term for a graph that is not connected?");
        options.add("A) Connected graph, B) Disconnected graph, C) Cycle, D) Tree");
        answers.add("B) Disconnected graph");

        questions.add("What is the term for a graph that has a path between every pair of vertices?");
        options.add("A) Connected graph, B) Disconnected graph, C) Complete graph, D) Incomplete graph");
        answers.add("A) Connected graph");

        questions.add("What is the term for a graph that has a cycle of length three?");
        options.add("A) Triangle, B) Square, C) Pentagon, D) Hexagon");
        answers.add("A) Triangle");

        questions.add("What is the term for a graph that has a vertex of degree three or more?");
        options.add("A) Branch vertex, B) Leaf vertex, C) Root vertex, D) Hub vertex");
        answers.add("D) Hub vertex");

        questions.add("What is the term for a graph that has an edge between every pair of vertices?");
        options.add("A) Complete graph, B) Incomplete graph, C) Connected graph, D) Disconnected graph");
        answers.add("A) Complete graph");

        questions.add("What is the term for a graph that has no edges?");
        options.add("A) Empty graph, B) Null graph, C) Disconnected graph, D) Complete graph");
        answers.add("A) Empty graph");

        questions.add("What is the term for a graph that has only one vertex?");
        options.add("A) Singleton graph, B) Empty graph, C) Null graph, D) Complete graph");
        answers.add("A) Singleton graph");

        
    }

    public static void main(String[]args){
        new Graphs_Quiz(name).setVisible(true);
    }
    
}
