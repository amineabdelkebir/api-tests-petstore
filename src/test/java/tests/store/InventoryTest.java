package tests.store;

import base.BaseTest;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

@Epic("PetStore API")
@Feature("Store - Inventory Management")
public class InventoryTest extends BaseTest {

    @Story("Get Store Inventory")
    @Severity(SeverityLevel.NORMAL)
    @Description("Retrieve inventory status from PetStore API and validate response")

    @Test
    public void shouldGetInventorySuccessfully() {


        var response = storeService.getInventory();


        Assert.assertEquals(response.statusCode(), 200);
        Assert.assertNotNull(response.asString());


        String body = response.asString();

        Assert.assertTrue(
                body.contains("available") ||
                        body.contains("pending") ||
                        body.contains("sold"),
                "Inventory response does not contain expected keys"
        );
    }
}