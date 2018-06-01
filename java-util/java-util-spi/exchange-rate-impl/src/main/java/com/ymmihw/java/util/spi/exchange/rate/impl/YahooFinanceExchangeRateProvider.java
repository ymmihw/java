package com.ymmihw.java.util.spi.exchange.rate.impl;

import com.ymmihw.java.util.spi.exchange.rate.api.QuoteManager;
import com.ymmihw.java.util.spi.exchange.rate.spi.ExchangeRateProvider;

public class YahooFinanceExchangeRateProvider implements ExchangeRateProvider {

  @Override
  public QuoteManager create() {
    return new YahooQuoteManagerImpl();
  }

}
