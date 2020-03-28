package com.sannu.datastructures.graph;

public class AdjacencyMatrixGraph {
  private int vertices;
  private boolean directed;
  private boolean weighted;
  private int[][] matrix;
  private boolean[][] booleanMatrix;

  public AdjacencyMatrixGraph(int numberOfVertices, boolean directed, boolean weighted) {
    this.vertices = numberOfVertices;
    this.weighted = weighted;
    this.directed = directed;
    matrix = new int[this.vertices][this.vertices];
    booleanMatrix = new boolean[this.vertices][this.vertices];
  }

  public int getVertices() {
    return vertices;
  }

  public boolean isWeighted() {
    return weighted;
  }

  public boolean isDirected() {
    return directed;
  }

  /*
   Since matrices for undirected graphs are symmetrical, we have to add
   [destination][source] at the same time as [source][destination]
  */
  public void addEdge(int source, int destination) {
    int valueToAdd = isWeighted() ? 0 : 1;
    matrix[source][destination] = valueToAdd;
    booleanMatrix[source][destination] = true;
    if (!isDirected()) { // undirected graph
      matrix[destination][source] = valueToAdd;
      booleanMatrix[destination][source] = true;
    }
  }

  public void addEdge(int source, int destination, int weight) {
    int valueToAdd = isWeighted() ? weight : 1;
    matrix[source][destination] = valueToAdd;
    booleanMatrix[source][destination] = true;
    if (!isDirected()) { // undirected graph
      matrix[destination][source] = valueToAdd;
      booleanMatrix[destination][source] = true;
    }
  }

  public boolean hasEdge(int source, int destination) {
    return booleanMatrix[source][destination];
  }

  public Integer getEdgeValue(int source, int destination) {
    if (!weighted || !booleanMatrix[source][destination]) return null;
    return matrix[source][destination];
  }

  public void printMatrix() {
    for (int i = 0; i < vertices; i++) {
      for (int j = 0; j < vertices; j++) {
        if (booleanMatrix[i][j]) {
          System.out.format("%8s", String.valueOf(matrix[i][j]));
        } else {
          System.out.format("%8s", "/");
        }
      }
      System.out.println();
    }
  }

  public void printEdges() {
    for (int i = 0; i < vertices; i++) {
      System.out.print("Vertex " + i + " is connected to: ");
      for (int j = 0; j < vertices; j++) {
        if (booleanMatrix[i][j]) {
          System.out.print(j + " ");
        }
      }
      System.out.println();
    }
  }
}
