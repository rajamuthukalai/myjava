package com.sannu.interview;

import java.util.Scanner;

public class Q2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter number of inputs");
    int noOfInputs = scanner.nextInt();
    for (int i = 1; i <= noOfInputs; i++) {
      String line = scanner.nextLine();
      System.out.println(i + " " + line);
    }
  }
}