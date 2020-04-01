package com.sannu.datastructures;

import java.util.NoSuchElementException;

public class MySinglyLinkedList {

  private Node head;

  public MySinglyLinkedList() {}

  public void add(int value) {
    if (head == null) {
      addFirst(value);
      return;
    }
    Node temp = head;
    while (temp.next != null) {
      temp = temp.next;
    }
    temp.next = new Node(value);
  }

  public void addFirst(int value) {
    if (head == null) {
      head = new Node(value);
      return;
    }
    Node newNode = new Node(value);
    newNode.next = head;
    head = newNode;
  }

  public void addLast(int value) {
    add(value);
  }

  public void addAfter(int afterValue, int value) {
    if (head == null) {
      throw new NoSuchElementException(String.valueOf(afterValue));
    }
    Node temp = head;
    while (temp.next != null && !(temp.value == afterValue)) {
      temp = temp.next;
    }
    if (temp == null) {
      throw new NoSuchElementException(String.valueOf(afterValue));
    }
    Node newNode = new Node(value);
    newNode.next = temp.next;
    temp.next = newNode;
  }

  public void addBefore(int beforeValue, int value) {
    if (head == null) {
      throw new NoSuchElementException(String.valueOf(beforeValue));
    }
    Node temp = head;
    Node prev = head;
    while (temp.next != null && !(temp.value == beforeValue)) {
      prev = temp;
      temp = temp.next;
    }
    if (temp == null) {
      throw new NoSuchElementException(String.valueOf(beforeValue));
    }
    Node newNode = new Node(value);
    prev.next = newNode;
    newNode.next = temp;
  }

  public void print() {
    Node temp = head;
    while (temp != null) {
      System.out.println(temp.value);
      temp = temp.next;
    }
  }

  public boolean containsLoop() {
    Node slow, fast;
    slow = fast = head;
    while (fast != null) {
      fast = fast.next;
      if (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next;
      }
    }
    if (slow == fast) {
      return true;
    }
    return false;
  }

  public void printMiddleElement() {
    Node slow, fast;
    slow = fast = head;
    while (fast != null) {
      fast = fast.next;
      if (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next;
      }
    }
    if (slow != null) {
      System.out.println(slow.value);
    }
  }

  public MySinglyLinkedList reverse() {
    Node temp = head;
    MySinglyLinkedList newLinkedList = new MySinglyLinkedList();
    while (temp != null) {
      newLinkedList.addFirst(temp.value);
      temp = temp.next;
    }
    return newLinkedList;
  }

  private class Node {
    private int value;
    private Node next;

    public Node(int value) {
      this.value = value;
    }

    private Node(Node copy) {
      this.value = copy.value;
      this.next = copy.next;
    }
  }
}
