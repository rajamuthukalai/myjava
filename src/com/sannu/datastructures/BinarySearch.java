package com.sannu.datastructures;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter number of array of elements:");
    int n = scanner.nextInt();
    System.out.println(String.format("Please enter %d numbers only", n));
    int[] numbers = new int[n];
    for (int i = 0; i < n; i++) {
      numbers[i] = scanner.nextInt();
    }
    System.out.println("Enter number to be searched:");
    int f = scanner.nextInt();
    scanner.close();
    System.out.println("testing");
    find(numbers, f);
  }

  public static void find(int[] numbers, int f) {
    if (numbers != null && numbers.length == 0) return;
    Arrays.sort(numbers);
    int len = numbers.length;
    int first = 0;
    int last = len - 1;
    int mid = (first + last) / 2;

    while (first <= last) {
      if (numbers[mid] == f) {
        System.out.println(String.format("Found %d at index %d", f, mid));
        break;
      } else if (numbers[mid] < f) {
        first = mid + 1;
      } else {
        last = mid - 1;
      }
      mid = (first + last) / 2;
    }
    if (first > last) {
      System.out.println(String.format("%d not found", f));
    }
  }
}
