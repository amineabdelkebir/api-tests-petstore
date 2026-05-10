package tests.store;

import base.BaseTest;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

@Epic("PetStore API")
@Feature("Store - Order Management")
public class GetOrderTest extends BaseTest {

    @Story("Get Order by ID - Valid Order")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Retrieve an existing order and validate its data")

    @Test
    public void shouldGetOrderById() {


        var response = storeService.getOrder(1);


        Assert.assertEquals(response.statusCode(), 200);
        Assert.assertEquals(response.jsonPath().getInt("id"), 1);
    }
}