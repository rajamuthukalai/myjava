package com.sannu.interview;

import java.util.*;

public class ArrayProblems {

  public static boolean containsDuplicatesUsingHashSet(int[] numbers) {
    if (numbers == null || numbers.length == 0) throw new IllegalArgumentException("invalid input");
    if (numbers.length == 1) return false;
    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < numbers.length; i++) {
      if (set.contains(numbers[i])) return true;
      set.add(numbers[i]);
    }
    return false;
  }

  public static int secondHighestNumber(int[] input) {
    if (input == null || input.length <= 1) throw new IllegalArgumentException("invalid input");
    Arrays.sort(input);
    return input[input.length - 2];
  }

  public static Integer[] findDuplicates(int[] input) {
    if (input == null || input.length == 0) throw new IllegalArgumentException("invalid input");
    if (input.length == 1) {
      return new Integer[] {};
    }
    List<Integer> duplicates = new ArrayList<>();
    for (int i = 0; i < input.length; i++) {
      int index = Math.abs(input[i]) - 1;
      if (input[index] < 0) duplicates.add(index + 1);
      input[index] = -input[index];
    }
    Integer[] result = new Integer[duplicates.size()];
    return duplicates.toArray(result);
  }
}
