package com.ymmihw.java.lang;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrintClassLoaderUnitTest {
  @Test
  public void givenAppClassLoader_whenParentClassLoader_thenClassNotFoundException()
      throws Exception {
    Assertions.assertThrows(
        ClassNotFoundException.class,
        () -> {
          PrintClassLoader sampleClassLoader =
              (PrintClassLoader) Class.forName(PrintClassLoader.class.getName()).newInstance();
          sampleClassLoader.printClassLoaders();
          Class.forName(
              PrintClassLoader.class.getName(),
              true,
              PrintClassLoader.class.getClassLoader().getParent());
        });
  }
}
