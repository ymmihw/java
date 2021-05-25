package com.ymmihw.java.lang.system;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DateTimeServiceTest {

  @Test
  public void givenClass_whenCalledMethods_thenNotNullInResult() {
    DateTimeService dateTimeService = new DateTimeService();

    assertNotNull(dateTimeService.nowPlusOneHour());
    assertNotNull(dateTimeService.nowPrettyPrinted());
  }
}
