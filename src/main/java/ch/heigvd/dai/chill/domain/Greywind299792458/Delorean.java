package ch.heigvd.dai.chill.domain.Greywind299792458;

import ch.heigvd.dai.chill.domain.IProduct;

import java.math.BigDecimal;

public class Delorean implements IProduct {

  public final static String NAME = "Delorean";
  public final static BigDecimal PRICE = new BigDecimal(3.5);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
