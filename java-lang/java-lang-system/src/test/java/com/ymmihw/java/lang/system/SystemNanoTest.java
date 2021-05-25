package com.ymmihw.java.lang.system;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SystemNanoTest {

  @Test
  public void givenSystem_whenCalledNanoTime_thenGivesTimeinResult() {
    long startTime = System.nanoTime();
    // do something that takes time
    long endTime = System.nanoTime();

    assertTrue(endTime - startTime < 10000);
  }
}
