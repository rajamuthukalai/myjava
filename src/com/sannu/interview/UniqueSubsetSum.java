package com.sannu.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniqueSubsetSum {
  public static void main(String... args) {
    int[] inputArray = {6, 2, 7, 8, 2, 4, 1, 3, 7, 5};
    Arrays.sort(inputArray);
    System.out.println(Arrays.toString(inputArray));
    int sum = 8;
    List<Integer> combinationList = new ArrayList<>();
    uniqueSubset(inputArray, sum, 0, 0, combinationList);
  }

  private static void uniqueSubset(
      int[] inputArray, int sum, int currentSum, int start, List<Integer> combinationList) {
    if (currentSum == sum) {
      System.out.println(combinationList);
      return;
    }
    int previousElement = -1;
    for (int i = start; i < inputArray.length; i++) {
      if (previousElement != inputArray[i]) {
        if (currentSum + inputArray[i] > sum) {
          break;
        }
        combinationList.add(inputArray[i]);
        uniqueSubset(inputArray, sum, currentSum + inputArray[i], i + 1, combinationList);
        combinationList.remove(combinationList.size() - 1);
        previousElement = inputArray[i];
      }
    }
  }
}
