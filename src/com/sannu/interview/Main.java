package com.sannu.interview;

public class Main {
  static int a = 1111;

  static {
    a = a-- - --a; // 1111 - 1109 = 2
  }

  {
    a = a++ + ++a; // never called as no constructor is called
  }

  public static void main(String[] args) {
    System.out.println(a);
  }
}
