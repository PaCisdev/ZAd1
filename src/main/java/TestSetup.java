import io.restassured.RestAssured;
import org.junit.Before;
import org.junit.After;

public class TestSetup {

    @Before
    public void setUp() {
        // Konfiguracja RestAssured
        RestAssured.baseURI = "http://www.24mx.ie/INTERSHOP/rest/WFS/Pierce-24mx-Site/24mx-ie/";
    }

    @After
    public void cleanup() {
        // Czyszczenie po teście, jeśli to konieczne
    }
}
