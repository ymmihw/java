package com.ymmihw.java;

public class Overflow {

  public static int addExact(int x, int y) {

    int r = x + y;
    if (((x ^ r) & (y ^ r)) < 0) {
      throw new ArithmeticException("int overflow");
    }
    return r;
  }


  public static double powExact(double base, double exponent) {
    if (base == 0.0) {
      return 0.0;
    }

    double result = Math.pow(base, exponent);

    if (result == Double.POSITIVE_INFINITY) {
      throw new ArithmeticException("Double overflow resulting in POSITIVE_INFINITY");
    } else if (result == Double.NEGATIVE_INFINITY) {
      throw new ArithmeticException("Double overflow resulting in NEGATIVE_INFINITY");
    } else if (Double.compare(-0.0f, result) == 0) {
      throw new ArithmeticException("Double overflow resulting in negative zero");
    } else if (Double.compare(+0.0f, result) == 0) {
      throw new ArithmeticException("Double overflow resulting in positive zero");
    }

    return result;
  }
}
