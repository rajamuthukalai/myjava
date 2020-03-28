package com.sannu.datastructures.graph;

import java.util.HashMap;
import java.util.LinkedList;

public class AdjacencyListGraph {
  private HashMap<Node, LinkedList<Node>> adjacencyMap;
  private boolean directed;

  public AdjacencyListGraph(boolean directed) {
    this.directed = directed;
    adjacencyMap = new HashMap<>();
  }

  public void addEdgeHelper(Node a, Node b) {
    LinkedList<Node> tmp = adjacencyMap.get(a);
    // remove edge if already exists
    if (tmp.contains(b)) {
      tmp.remove(b);
    }
    tmp.add(b);
    adjacencyMap.put(a, tmp);
  }

  public void addEdge(Node source, Node destination) {
    if (!adjacencyMap.keySet().contains(source)) {
      adjacencyMap.put(source, source.getAdjacentNodes());
    }
    if (!adjacencyMap.keySet().contains(destination)) {
      adjacencyMap.put(destination, destination.getAdjacentNodes());
    }
    addEdgeHelper(source, destination);
    if (!directed) {
      addEdgeHelper(destination, source);
    }
  }

  public void printEdges() {
    for (Node node : adjacencyMap.keySet()) {
      System.out.print("The " + node.getValue() + " has an edge towards: ");
      for (Node neighbor : adjacencyMap.get(node)) {
        System.out.print(neighbor.getValue() + " ");
      }
      System.out.println();
    }
  }

  public boolean hasEdge(Node source, Node destination) {
    return adjacencyMap.containsKey(source) && adjacencyMap.get(source).contains(destination);
  }

  public void depthFirstSearch(Node node) {
    node.visit();
    System.out.println(node.getValue() + "-->");
    LinkedList<Node> adjacentNodes = adjacencyMap.get(node);
    if (adjacentNodes == null || adjacentNodes.isEmpty()) {
      return;
    }
    for (Node adjacentNode : adjacentNodes) {
      if (!adjacentNode.isVisited()) {
        depthFirstSearch(adjacentNode);
      }
    }
  }
}
