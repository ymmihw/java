package com.ymmihw.java.lang.system;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Properties;

import static org.junit.jupiter.api.Assertions.*;

public class SystemPropertiesTest {

  @Test
  public void givenSystem_whenCalledGetProperty_thenReturnPropertyinResult() {
    assertNotNull(System.getProperty("java.vm.vendor"));
  }

  @Test
  public void givenSystem_whenCalledSetProperty_thenSetPropertyasResult() {

    // set a particular property
    System.setProperty("abckey", "abcvaluefoo");
    assertEquals("abcvaluefoo", System.getProperty("abckey"));
  }

  @Test
  public void givenSystem_whenCalledClearProperty_thenDeletePropertyasResult() {

    // Delete a property
    System.clearProperty("abckey");
    assertNull(System.getProperty("abckey"));
  }

  @Test
  public void givenSystem_whenCalledGetPropertyDefaultValue_thenReturnPropertyinResult() {

    System.clearProperty("dbHost");
    String myKey = System.getProperty("dbHost", "db.host.com");
    assertEquals("db.host.com", myKey);
  }

  @Test
  public void givenSystem_whenCalledGetProperties_thenReturnPropertiesinResult() {
    Properties properties = System.getProperties();

    assertNotNull(properties);
  }

  @Test
  @Disabled
  public void givenSystem_whenCalledClearProperties_thenDeleteAllPropertiesasResult() {

    // Clears all system properties. Use with care!
    System.getProperties().clear();

    assertTrue(System.getProperties().isEmpty());
  }
}
