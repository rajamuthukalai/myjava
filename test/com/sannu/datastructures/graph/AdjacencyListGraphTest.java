package com.sannu.datastructures.graph;

class AdjacencyListGraphTest {

  public static void main(String[] args) {

    // create a visited graph
    AdjacencyListGraph graph = new AdjacencyListGraph(true);

    // create nodes
    Node chennai = new Node("Chennai");
    Node bangalore = new Node("Bangalore");
    Node hyderabad = new Node("Hyderabad");
    Node mumbai = new Node("Mumbai");

    // add edges in the graph
    graph.addEdge(chennai, bangalore);
    graph.addEdge(chennai, mumbai);
    graph.addEdge(chennai, hyderabad);
    graph.addEdge(bangalore, mumbai);
    graph.addEdge(bangalore, hyderabad);
    graph.addEdge(mumbai, chennai);
    graph.addEdge(hyderabad, chennai);

    // print edges
    graph.printEdges();

    // search edges for bangalore
    graph.depthFirstSearch(mumbai);
  }
}
