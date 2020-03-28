package com.sannu.datastructures.stack;

import java.util.Arrays;

public class IntStack {

  private int[] stack;
  private int size;
  private int top;

  public IntStack() {
    top = -1;
    size = 0;
    stack = new int[10];
  }

  public IntStack(int size) {
    top = -1;
    this.size = size;
    stack = new int[this.size];
  }

  public boolean push(int item) {
    if (!isFull()) {
      top++;
      stack[top] = item;
      return true;
    } else {
      return false;
    }
  }

  public int pop() {
    if (!isEmpty()) {
      return stack[top--];
    } else {
      return -1;
    }
  }

  public int getSize() {
    return size;
  }

  private boolean isFull() {
    return top == size - 1;
  }

  private boolean isEmpty() {
    return top == -1;
  }

  @Override
  public String toString() {
    return "IntStack{" +
            "stack=" + Arrays.toString(stack) +
            '}';
  }
}
