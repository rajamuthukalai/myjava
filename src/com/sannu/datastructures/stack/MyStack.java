package com.sannu.datastructures.stack;

import java.util.Arrays;

public class MyStack<T> {

  private T[] stack;
  private int size;
  private int top;

  public MyStack() {
    top = -1;
    size = 10;
    stack = (T[]) new Object[size];
  }

  public MyStack(int size) {
    top = -1;
    this.size = size;
    stack = (T[]) new Object[this.size];
  }

  public boolean push(T item) {
    if (!isFull()) {
      top++;
      stack[top] = item;
      return true;
    } else {
      return false;
    }
  }

  public T pop() {
    if (!isEmpty()) {
      return stack[top--];
    } else {
      return null;
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
    return "MyStack{" +
            "stack=" + Arrays.toString(stack) +
            '}';
  }
}
