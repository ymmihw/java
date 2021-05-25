package com.ymmihw.java.lang.system;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class EnvironmentVariablesTest {

  @Test
  public void givenEnvVars_whenReadPath_thenGetValueinResult() {
    EnvironmentVariables environmentVariables = new EnvironmentVariables();

    assertNotNull(environmentVariables.getPath());
  }
}
