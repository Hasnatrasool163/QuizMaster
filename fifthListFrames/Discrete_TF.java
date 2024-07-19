package fifthListFrames;

import frame.True_False_Questions;

public class Discrete_TF extends True_False_Questions {

    public Discrete_TF(String name) {
        super(name);
    }
//  42
    @Override
    public final void loadQuestions() {

        questions.add("A graph with no edges is called a null graph.");
        answers.add("True");
        questions.add("In a simple graph, there can be multiple edges between the same pair of vertices.");
        answers.add("False");
        questions.add("A Hamiltonian path visits every vertex exactly once.");
        answers.add("True");
        questions.add("The sum of degrees of all vertices in a graph is twice the number of edges.");
        answers.add("True");
        questions.add("In set theory, the union of two sets is the set of elements that are in either set or both.");
        answers.add("True");
        questions.add("The intersection of two disjoint sets is an empty set.");
        answers.add("True");
        questions.add("A bijection is a function that is both injective and surjective.");
        answers.add("True");
        questions.add("The complement of a set contains all elements not in the set.");
        answers.add("True");
        questions.add("In logic, a tautology is a statement that is always false.");
        answers.add("False");
        questions.add("A bipartite graph can be colored with two colors.");
        answers.add("True");
        questions.add("A relation that is reflexive, symmetric, and transitive is called an equivalence relation.");
        answers.add("True");
        questions.add("In modular arithmetic, the equation 7 ≡ 2 (mod 5) is true.");
        answers.add("True");
        questions.add("An Eulerian circuit visits every edge of a graph exactly once.");
        answers.add("True");
        questions.add("The principle of mathematical induction can be used to prove statements about natural numbers.");
        answers.add("True");
        questions.add("The power set of a set with n elements contains 2^n elements.");
        answers.add("True");
        questions.add("A graph is planar if it can be drawn on a plane without any edges crossing.");
        answers.add("True");
        questions.add("In Boolean algebra, the expression A + A' (A complement) is equal to 1.");
        answers.add("True");
        questions.add("The chromatic number of a graph is the minimum number of colors needed to color its vertices.");
        answers.add("True");
        questions.add("A spanning tree of a graph contains all the vertices of the graph.");
        answers.add("True");
        questions.add("An isomorphism between two graphs implies they are structurally identical.");
        answers.add("True");
        questions.add("In a directed graph, each edge has a direction associated with it.");
        answers.add("True");
        questions.add("A tree is a connected acyclic graph.");
        answers.add("True");
        questions.add("A complete graph is a graph in which there is a unique edge connecting every pair of vertices.");
        answers.add("True");
        questions.add("The Cartesian product of two sets A and B is the set of all ordered pairs (a, b) where a is in A and b is in B.");
        answers.add("True");
        questions.add("A permutation of a set is an arrangement of its elements in a particular order.");
        answers.add("True");
        questions.add("A combination is a selection of items from a larger set where order does matter.");
        answers.add("False");
        questions.add("In graph theory, a cut is a partition of the vertices of a graph into two disjoint subsets.");
        answers.add("True");
        questions.add("A minimum spanning tree is a spanning tree of a weighted graph having the least weight.");
        answers.add("True");
        questions.add("In propositional logic, the disjunction of two propositions is true if at least one of the propositions is true.");
        answers.add("True");
        questions.add("The contrapositive of an implication statement is logically equivalent to the original statement.");
        answers.add("True");
        questions.add("A multigraph is a graph which is permitted to have multiple edges, i.e., edges that have the same end nodes.");
        answers.add("True");
        questions.add("The degree of a vertex in a graph is the number of edges incident to the vertex.");
        answers.add("True");
        questions.add("In combinatorics, the Pigeonhole Principle states that if n items are put into m containers, with n > m, then at least one container must contain more than one item.");
        answers.add("True");
        questions.add("A self-loop is an edge that connects a vertex to itself.");
        answers.add("True");
        questions.add("The adjacency matrix of a graph is a square matrix used to represent a finite graph.");
        answers.add("True");
        questions.add("The chromatic polynomial of a graph counts the number of ways to color the graph using at most a given number of colors.");
        answers.add("True");
        questions.add("A directed acyclic graph (DAG) is a directed graph with no directed cycles.");
        answers.add("True");
        questions.add("Two graphs are isomorphic if there is a one-to-one correspondence between their vertices and edges that preserves incidence.");
        answers.add("True");
        questions.add("The domination number of a graph is the minimum number of vertices such that every vertex is either in this set or adjacent to a vertex in this set.");
        answers.add("True");
        questions.add("In set theory, the cardinality of a set is a measure of the 'number of elements' of the set.");
        answers.add("True");
        questions.add("In number theory, two integers are said to be coprime if their greatest common divisor (gcd) is 1.");
        answers.add("True");
        questions.add("A directed edge in a graph is also known as an arc.");
        answers.add("True");

    }

    public static void main(String[] args) {
        new Discrete_TF(name).setVisible(true);
    }

}
