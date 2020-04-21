package com.sannu.interview;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayProblemsTest {

  @Test(expected = IllegalArgumentException.class)
  public void containsDuplicatesUsingHashSet_Throw_Exception_When_Input_Array_Is_Null() {
    ArrayProblems.containsDuplicatesUsingHashSet(null);
  }

  @Test(expected = IllegalArgumentException.class)
  public void containsDuplicatesUsingHashSet_Throw_Exception_When_Input_Array_Is_Empty() {
    ArrayProblems.containsDuplicatesUsingHashSet(new int[] {});
  }

  @Test
  public void containsDuplicatesUsingHashSet_1() {
    assertFalse(ArrayProblems.containsDuplicatesUsingHashSet(new int[] {1}));
  }

  @Test
  public void containsDuplicatesUsingHashSet() {
    assertTrue(ArrayProblems.containsDuplicatesUsingHashSet(new int[] {1, 3, 5, 2, 5}));
  }

  @Test(expected = IllegalArgumentException.class)
  public void secondHighestNumber_Throw_Exception_When_Input_Array_Is_Null() {
    ArrayProblems.secondHighestNumber(null);
  }

  @Test(expected = IllegalArgumentException.class)
  public void secondHighestNumber_Throw_Exception_When_Input_Array_Is_Empty() {
    ArrayProblems.secondHighestNumber(new int[] {});
  }

  @Test(expected = IllegalArgumentException.class)
  public void secondHighestNumber_1() {
    ArrayProblems.secondHighestNumber(new int[] {1});
  }

  @Test
  public void secondHighestNumber_2() {
    assertEquals(2, ArrayProblems.secondHighestNumber(new int[] {5, 2}));
  }

  @Test
  public void secondHighestNumber() {
    assertEquals(4, ArrayProblems.secondHighestNumber(new int[] {5, 4, 3, 2, 1}));
  }

  @Test(expected = IllegalArgumentException.class)
  public void findDuplicates_Throws_Exception_When_Input_Array_Is_Null() {
    ArrayProblems.findDuplicates(null);
  }

  @Test(expected = IllegalArgumentException.class)
  public void findDuplicates_Throws_Exception_When_Input_Array_Is_Empty() {
    ArrayProblems.findDuplicates(new int[] {});
  }

  @Test
  public void findDuplicates_1() {
    assertArrayEquals(new Integer[] {}, ArrayProblems.findDuplicates(new int[] {1}));
  }

  @Test
  public void findDuplicates() {
    assertArrayEquals(
        new Integer[] {5, 3}, ArrayProblems.findDuplicates(new int[] {1, 3, 5, 2, 5, 4, 3}));
  }
}
