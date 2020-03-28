package com.sannu.datastructures.stack;

import org.junit.jupiter.api.Test;

class IntStackTest {

  @Test
  public void testPushItemWithDefaultStackSize() {
    IntStack intStack = new IntStack();
    intStack.push(1);
    intStack.push(2);
    intStack.push(3);
    intStack.push(4);
    intStack.push(5);
    intStack.push(6);
    intStack.push(7);
    intStack.push(8);
    intStack.push(9);
    intStack.push(10);
    System.out.println(intStack.toString());
  }

  @Test
  public void testPushItemWithCustomStackSize() {
    IntStack intStack = new IntStack(5);
    intStack.push(1);
    intStack.push(2);
    intStack.push(3);
    intStack.push(4);
    intStack.push(5);
    System.out.println(intStack.toString());
  }
}
