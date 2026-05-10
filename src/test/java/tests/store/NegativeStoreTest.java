package tests.store;

import base.BaseTest;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

@Epic("PetStore API")
@Feature("Store - Order Management")
public class NegativeStoreTest extends BaseTest {

    @Test
    @Story("Get non-existing order")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that requesting an invalid order ID returns 404")
    public void shouldReturn404ForInvalidOrder() {

        // Act
        var response = storeService.getOrder(999999);

        // Assert
        Assert.assertEquals(response.statusCode(), 404);
    }
}