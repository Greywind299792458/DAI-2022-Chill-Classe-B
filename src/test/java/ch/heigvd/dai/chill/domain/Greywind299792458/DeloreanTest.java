package ch.heigvd.dai.chill.domain.Greywind299792458;

import ch.heigvd.dai.chill.domain.Bartender;
import ch.heigvd.dai.chill.protocol.OrderRequest;
import ch.heigvd.dai.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DeloreanTest {

  @Test
  void thePriceAndNameForDeloreanShouldBeCorrect() {
    Delorean beer = new Delorean();
    assertEquals(beer.getName(), Delorean.NAME);
    assertEquals(beer.getPrice(), Delorean.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForDelorean() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.dai.chill.domain.Greywind299792458.Delorean";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Delorean.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
