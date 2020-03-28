package com.sannu.interview;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicatesInArray {
  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<Integer>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(1); // duplicate
    numbers.add(4);
    numbers.add(5);
    System.out.println("source: " + numbers);
    System.out.println(numbers.stream().distinct().collect(Collectors.toList()));
    System.out.println(numbers.stream().sorted(Comparator.reverseOrder()).distinct().limit(2).collect(Collectors.toList()));
  }
}
