package com.sannu.datastructures;

public class MyLinkedList {
  private static class Node<AnyType> {
    private AnyType data;
    private Node<AnyType> next;

    public Node(AnyType data, Node<AnyType> next) {
      this.data = data;
      this.next = next;
    }
  }
}
