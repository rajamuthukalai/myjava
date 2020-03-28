package com.sannu;

public class Main {
  static int a = 1111;
  static {
    a = a-- - --a;
  }
  {
    a = a++ + ++a;
  }
  public static void main(String[] args) {
    System.out.println(a);
  }
}
