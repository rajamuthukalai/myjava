package com.sannu.datastructures.stack;

import org.junit.jupiter.api.Test;

class MyStackTest {

  @Test
  public void testPushIntegerWithDefaultStackSize() {
    MyStack<Integer> integerMyStack = new MyStack<>();
    integerMyStack.push(1);
    integerMyStack.push(2);
    integerMyStack.push(3);
    integerMyStack.push(4);
    integerMyStack.push(5);
    integerMyStack.push(6);
    integerMyStack.push(7);
    integerMyStack.push(8);
    integerMyStack.push(9);
    integerMyStack.push(10);
    System.out.println(integerMyStack.toString());
    System.out.println(String.format("Size: %d", integerMyStack.getSize()));
  }

  @Test
  public void testPushDoubleWithDefaultStackSize() {
    MyStack<Double> doubleMyStack = new MyStack<>();
    doubleMyStack.push(1.0);
    doubleMyStack.push(2.0);
    doubleMyStack.push(3.0);
    doubleMyStack.push(4.0);
    doubleMyStack.push(5.0);
    doubleMyStack.push(6.0);
    doubleMyStack.push(7.0);
    doubleMyStack.push(8.0);
    doubleMyStack.push(9.0);
    doubleMyStack.push(10.0);
    System.out.println(doubleMyStack.toString());
    System.out.println(String.format("Size: %d", doubleMyStack.getSize()));
  }

  @Test
  public void testPushIntegerWithCustomStackSize() {
    MyStack<Integer> integerMyStack = new MyStack<>(5);
    integerMyStack.push(1);
    integerMyStack.push(2);
    integerMyStack.push(3);
    integerMyStack.push(4);
    integerMyStack.push(5);
    System.out.println(integerMyStack.toString());
    System.out.println(String.format("Size: %d", integerMyStack.getSize()));
  }

  @Test
  public void testPushDoubleWithCustomStackSize() {
    MyStack<Double> doubleMyStack = new MyStack<>(5);
    doubleMyStack.push(1.0);
    doubleMyStack.push(2.0);
    doubleMyStack.push(3.0);
    doubleMyStack.push(4.0);
    doubleMyStack.push(5.0);
    doubleMyStack.push(6.0); // exceeds size 5
    System.out.println(doubleMyStack.toString());
    System.out.println(String.format("Size: %d", doubleMyStack.getSize()));
  }

  @Test
  public void testCustomStackSize() {
    MyStack<Double> doubleMyStack = new MyStack<>(5);
    System.out.println(doubleMyStack.toString());
    System.out.println(String.format("Size: %d", doubleMyStack.getSize()));
  }
}
