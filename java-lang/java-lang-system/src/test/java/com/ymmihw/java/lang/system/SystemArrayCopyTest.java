package com.ymmihw.java.lang.system;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SystemArrayCopyTest {

  @Test
  public void givenTwoArraysAB_whenUseArrayCopy_thenArrayCopiedFromAToBInResult() {
    int[] a = {34, 22, 44, 2, 55, 3};
    int[] b = new int[a.length];

    // copy all elements from a to b
    System.arraycopy(a, 0, b, 0, a.length);
    assertArrayEquals(a, b);
  }

  @Test
  public void givenTwoArraysAB_whenUseArrayCopyPosition_thenArrayCopiedFromAToBInResult() {
    int[] a = {34, 22, 44, 2, 55, 3};
    int[] b = new int[a.length];

    // copy 2 elements from a, starting at a[1] to b, starting at b[3]
    System.arraycopy(a, 1, b, 3, 2);
    assertArrayEquals(new int[] {0, 0, 0, 22, 44, 0}, b);
  }
}
