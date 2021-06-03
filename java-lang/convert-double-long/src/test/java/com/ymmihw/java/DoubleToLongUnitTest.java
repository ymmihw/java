package com.ymmihw.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoubleToLongUnitTest {

  static final double VALUE = 9999.999;

  @Test
  public void givenDoubleValue_whenLongValueCalled_thenLongValueReturned() {
    assertEquals(9999L, Double.valueOf(VALUE).longValue());
  }

  @Test
  public void givenDoubleValue_whenMathRoundUsed_thenRoundUp() {
    assertEquals(10000L, Math.round(VALUE));
  }

  @Test
  public void givenDoubleValue_whenMathRoundUsed_thenRoundDown() {
    assertEquals(9999L, Math.round(9999.444));
  }

  @Test
  public void givenDoubleValue_whenMathRoundUsed_thenSameValueReturned() {
    assertEquals(9999L, Math.round(9999.0));
  }

  @Test
  public void givenDoubleValue_whenMathCeilUsed_thenLongValueReturned() {
    assertEquals(10000L, Math.ceil(VALUE), 0);
  }

  @Test
  public void givenDoubleValue_whenMathCeilUsed_thenSameValueReturned() {
    assertEquals(9999L, Math.ceil(9999.0), 0);
  }

  @Test
  public void givenDoubleValue_whenMathCeilUsed_thenDifferentThanRound() {
    assertEquals(10000L, Math.ceil(9999.444), 0);
  }

  @Test
  public void givenDoubleValue_whenMathFloorUsed_thenLongValueReturned() {
    assertEquals(9999L, Math.floor(VALUE), 0);
  }

  @Test
  public void givenDoubleValue_whenMathFloorUsed_thenSameValueReturned() {
    assertEquals(9999L, Math.floor(9999.0), 0);
  }

  @Test
  public void givenDoubleValue_whenMathFloorUsed_thenDifferentThanCeil() {
    assertEquals(9999L, Math.floor(9999.444), 0);
  }

  @Test
  public void givenDoubleValue_whenTypeCasted_thenLongValueReturned() {
    assertEquals(9999L, (long) VALUE);
  }
}
