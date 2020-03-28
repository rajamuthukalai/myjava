package com.sannu.datastructures.graph;

class AdjacencyMatrixGraphTest {
  public static void main(String[] args) {
    AdjacencyMatrixGraph graph = new AdjacencyMatrixGraph(5, false, true);
    graph.addEdge(0, 2, 19);
    graph.addEdge(0, 3, -2);
    graph.addEdge(1, 2, 3);
    graph.addEdge(1, 3); // The default weight is 0 if weighted == true
    graph.addEdge(1, 4);
    graph.addEdge(2, 3);
    graph.addEdge(3, 4);
    graph.printMatrix();
    System.out.println();
    graph.printEdges();
  }
}
