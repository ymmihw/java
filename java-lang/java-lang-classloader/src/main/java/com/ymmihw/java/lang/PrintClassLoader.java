package com.ymmihw.java.lang;

import java.util.ArrayList;
import java.util.logging.Logger;

public class PrintClassLoader {

  public void printClassLoaders() throws ClassNotFoundException {

    System.out.println("Classloader of this class:" + PrintClassLoader.class.getClassLoader());
    System.out.println("Classloader of Logging:" + Logger.class.getClassLoader());
    System.out.println("Classloader of ArrayList:" + ArrayList.class.getClassLoader());

  }
}
