package com.ymmihw.java.util.spi.exchange.rate.spi;

import com.ymmihw.java.util.spi.exchange.rate.api.QuoteManager;

public interface ExchangeRateProvider {
  QuoteManager create();
}
