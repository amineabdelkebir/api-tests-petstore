package tests.store;

import base.BaseTest;
import io.qameta.allure.*;
import models.Order;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.builders.OrderBuilder;


@Epic("Store API")
@Feature("Order Management")

public class CreateOrderTest  extends BaseTest {

      @Test
      @Story("Create new order")
      @Severity(SeverityLevel.CRITICAL)
      @Description("Create an order and verify it is stored correctly")
    public void shouldCreateOrderSuccessfully() {

        Order order = OrderBuilder.defaultOrder();
        var response = storeService.createOrder(order); // ✅ correct

        Assert.assertEquals(response.statusCode(), 200);
        Assert.assertEquals(response.jsonPath().getInt("id"), 1);
    }
}