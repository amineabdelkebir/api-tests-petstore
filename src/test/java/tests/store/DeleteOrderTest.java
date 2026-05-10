package tests.store;

import base.BaseTest;
import io.qameta.allure.*;
import models.Order;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.builders.OrderBuilder;

@Epic("PetStore API")
@Feature("Store - Order Management")
public class DeleteOrderTest extends BaseTest {

    @Test
    @Story("Delete an existing order")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Create an order, delete it, then verify it is removed")
    public void shouldDeleteOrderSuccessfully() {


        Order order = OrderBuilder.defaultOrder();
        storeService.createOrder(order);

        var deleteResponse = storeService.deleteOrder(1);

        Assert.assertEquals(deleteResponse.statusCode(), 200);


        var getResponse = storeService.getOrder(1);
        Assert.assertEquals(getResponse.statusCode(), 404);
    }
}