package tests.store.smoke;

import base.BaseTest;
import models.Order;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.builders.OrderBuilder;

public class SmokeStoreTest extends BaseTest {

    @Test
    public void shouldValidateCoreStoreFlow() {

        // 1. Create Order
        Order order = OrderBuilder.defaultOrder();
        var createResponse = storeService.createOrder(order);
        Assert.assertEquals(createResponse.statusCode(), 200);

        int orderId = createResponse.jsonPath().getInt("id");

        // 2. Get Order
        var getResponse = storeService.getOrder(orderId);
        Assert.assertEquals(getResponse.statusCode(), 200);
        Assert.assertEquals(getResponse.jsonPath().getInt("id"), orderId);

        // 3. Inventory check
        var inventoryResponse = storeService.getInventory();
        Assert.assertEquals(inventoryResponse.statusCode(), 200);
    }
}