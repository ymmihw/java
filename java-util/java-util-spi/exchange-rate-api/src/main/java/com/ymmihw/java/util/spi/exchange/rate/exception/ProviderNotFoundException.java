package com.ymmihw.java.util.spi.exchange.rate.exception;

public class ProviderNotFoundException extends RuntimeException {
  private static final long serialVersionUID = 1L;

  public ProviderNotFoundException() {
    super();
  }

  public ProviderNotFoundException(String message) {
    super(message);
  }

}
