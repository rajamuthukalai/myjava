package com.sannu.util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiplicationTable {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean isValidInput = false;
    int number = 0;
    do {
      try {
        System.out.println("Please enter a number: ");
        number = scanner.nextInt();
        isValidInput = true;
      } catch (InputMismatchException e) {
        System.out.println("Invalid number!!! Please try again!!!");
        scanner.nextLine();
      }
    } while (!isValidInput);
    if (isValidInput) {
      for (int i = 1; i <= 10; i++) {
        System.out.println(String.format(i + " * " + number + " = " + i * number));
      }
    }
    scanner.close();
  }
}
