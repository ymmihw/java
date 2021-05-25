package com.ymmihw.java.lang.system;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Disabled
public class WhenDetectingOSTest {

  private DetectOS os = new DetectOS();

  @Test
  public void whenUsingSystemProperty_shouldReturnOS() {
    String expected = "Windows 10";
    String actual = os.getOperatingSystem();
    assertEquals(expected, actual);
  }

  @Test
  public void whenUsingSystemUtils_shouldReturnOS() {
    String expected = "Windows 10";
    String actual = os.getOperatingSystemSystemUtils();
    assertEquals(expected, actual);
  }
}
