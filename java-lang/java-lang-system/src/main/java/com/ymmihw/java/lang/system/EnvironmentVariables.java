package com.ymmihw.java.lang.system;

public class EnvironmentVariables {
  public String getPath() {
    return System.getenv("PATH");
  }
}
