package com.sannu.datastructures;

import org.junit.jupiter.api.Test;

class MySinglyLinkedListTest {

  @Test
  public void printEmptyList() {
    MySinglyLinkedList linkedList = new MySinglyLinkedList();
    linkedList.print();
  }

  @Test
  public void printListWithOneElement() {
    MySinglyLinkedList linkedList = new MySinglyLinkedList();
    linkedList.add(1);
    linkedList.print();
  }

  @Test
  public void printListWithTwoElements() {
    MySinglyLinkedList linkedList = new MySinglyLinkedList();
    linkedList.add(1);
    linkedList.add(2);
    linkedList.print();
  }

  @Test
  public void printMiddleElement() {
    MySinglyLinkedList linkedList = new MySinglyLinkedList();
    linkedList.add(1);
    linkedList.printMiddleElement();
  }

  @Test
  public void printMiddleElementOdd() {
    MySinglyLinkedList linkedList = new MySinglyLinkedList();
    linkedList.add(1);
    linkedList.add(2);
    linkedList.add(3);
    linkedList.add(4);
    linkedList.printMiddleElement();
  }

  @Test
  public void printMiddleElementEven() {
    MySinglyLinkedList linkedList = new MySinglyLinkedList();
    linkedList.add(1);
    linkedList.add(2);
    linkedList.add(3);
    linkedList.add(4);
    linkedList.add(5);
    linkedList.printMiddleElement();
  }

  @Test
  public void reverseLinkedList() {
    MySinglyLinkedList linkedList = new MySinglyLinkedList();
    linkedList.add(1);
    linkedList.add(2);
    linkedList.add(3);
    linkedList.add(4);
    linkedList.add(5);
    linkedList.print();
    linkedList.reverse().print();
  }

  @Test
  public void containsLoop() {
    MySinglyLinkedList linkedList = new MySinglyLinkedList();
    linkedList.add(1);
    linkedList.add(2);
    linkedList.add(3);
    linkedList.add(4);
    linkedList.add(5);
    linkedList.print();
    System.out.println(linkedList.containsLoop());
  }

  @Test
  public void testAddBefore() {
    MySinglyLinkedList linkedList = new MySinglyLinkedList();
    linkedList.add(1);
    linkedList.add(2);
    linkedList.add(3);
    linkedList.addBefore(3, 4);
    linkedList.add(5);
    linkedList.print();
  }
}
