package com.sannu.datastructures.graph;

import java.util.LinkedList;

public class Node {
  private String value;
  private LinkedList<Node> adjacentNodes;
  private boolean visited;

  public Node(String value) {
    this.value = value;
    this.adjacentNodes = new LinkedList<>();
    this.visited = false;
  }

  public String getValue() {
    return value;
  }

  public LinkedList<Node> getAdjacentNodes() {
    return adjacentNodes;
  }

  public boolean isVisited() {
    return visited;
  }

  public void visit() {
    visited = true;
  }

  public void unvisit() {
    visited = false;
  }

  /*public void addEdge(Node destination) {
    if (!adjacentNodes.contains(destination)) adjacentNodes.add(destination);
  }*/
}
