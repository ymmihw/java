package com.ymmihw.java.util.spi.exchange.rate.impl;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import com.ymmihw.java.util.spi.exchange.rate.api.Quote;
import com.ymmihw.java.util.spi.exchange.rate.api.QuoteManager;

public class YahooQuoteManagerImpl implements QuoteManager {

  @Override
  public List<Quote> getQuotes(String baseCurrency, LocalDate date) {
    List<Quote> list = new ArrayList<>();
    for (int i = 0; i < 3; i++) {
      Quote e = new Quote();
      e.setAsk(new BigDecimal(RandomUtils.nextDouble()));
      e.setBid(new BigDecimal(RandomUtils.nextDouble()));
      e.setCurrency(RandomStringUtils.randomAlphabetic(10));
      e.setDate(LocalDate.now());
      list.add(e);
    }
    return list;
  }
}
