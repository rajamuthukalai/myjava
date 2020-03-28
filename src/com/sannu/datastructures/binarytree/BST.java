package com.sannu.datastructures.binarytree;

class Node {
  int data;
  Node leftChild;
  Node rightChild;

  Node(int data) {
    this.data = data;
  }
}

public class BST {
  private int count;
  private Node root;

  public void add(int data) {
    Node newNode = new Node(data);
    if (root == null) {
      root = newNode;
      count++;
      return;
    }
    insertNode(root, newNode);
  }

  void insertNode(Node root, Node newNode) {
    if (newNode.data < root.data) {
      if (root.leftChild == null) {
        root.leftChild = newNode;
        count++;
      } else {
        insertNode(root.leftChild, newNode);
      }
    } else if (newNode.data > root.data) {
      if (root.rightChild == null) {
        root.rightChild = newNode;
        count++;
      } else {
        insertNode(root.rightChild, newNode);
      }
    } else {
      new UnsupportedOperationException("duplicate node");
    }
  }

  public int size() {
    return count;
  }
}
