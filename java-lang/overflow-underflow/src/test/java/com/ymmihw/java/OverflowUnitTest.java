package com.ymmihw.java;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.math.BigInteger;
import org.junit.Test;

public class OverflowUnitTest {

  @Test
  public void positive_and_negative_zero_are_not_always_equal() {

    double a = +0f;
    double b = -0f;

    assertTrue(a == b);

    assertTrue(1 / a == Double.POSITIVE_INFINITY);
    assertTrue(1 / b == Double.NEGATIVE_INFINITY);

    assertTrue(1 / a != 1 / b);
  }

  @Test
  public void showIntegerOverflow() {
    int value = Integer.MAX_VALUE - 1;

    for (int i = 0; i < 4; i++, value++) {
      System.out.println(value);
    }
  }

  @Test
  public void noOverflowWithBigInteger() {

    BigInteger largeValue = new BigInteger(Integer.MAX_VALUE + "");
    for (int i = 0; i < 4; i++) {
      System.out.println(largeValue);
      largeValue = largeValue.add(BigInteger.ONE);
    }
  }

  @Test(expected = ArithmeticException.class)
  public void exceptionWithAddExact() {

    int value = Integer.MAX_VALUE - 1;
    for (int i = 0; i < 4; i++) {
      System.out.println(value);
      value = Math.addExact(value, 1);
    }
  }

  @Test
  public void demonstrateUnderflow() {
    for (int i = 1073; i <= 1076; i++) {
      System.out.println("2^" + i + " = " + Math.pow(2, -i));
    }
  }


  @Test
  public void doubleTest() {
    assertEquals(Double.MAX_VALUE + 1, Double.MAX_VALUE);
    assertEquals(Double.MAX_VALUE * 2, Double.POSITIVE_INFINITY);
    assertEquals(Double.MAX_VALUE * -2, Double.NEGATIVE_INFINITY);
  }

}


