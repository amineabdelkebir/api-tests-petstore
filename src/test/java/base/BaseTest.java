package base;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import services.StoreService;
import utils.ConfigManager;

public class BaseTest {

    protected StoreService storeService;

    @BeforeClass
    public void setup() {
        RestAssured.baseURI = ConfigManager.get("base.url");
        storeService = new StoreService();
    }
}