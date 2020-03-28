package com.sannu;

import com.sannu.datastructures.binarytree.BST;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class MainTest {
  @Test
  public void testAddNode() {
    BST bst = new BST();
    bst.add(1);
    bst.add(2);
    bst.add(3);
    bst.add(4);
    bst.add(5);
    assertEquals(5, bst.size());
  }
}
