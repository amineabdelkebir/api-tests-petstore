package tests;

import models.Order;
import org.testng.Assert;
import org.testng.annotations.Test;
import services.StoreService;
public class StoreTests {

    StoreService storeService = new StoreService();

    @Test
    public void createOrderTest() {

        Order order = new Order(1, 101, 2, "placed");

        var response = storeService.createOrder(order);

        Assert.assertEquals(response.statusCode(), 200);
    }
}