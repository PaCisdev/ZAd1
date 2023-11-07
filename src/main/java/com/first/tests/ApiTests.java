import io.restassured.RestAssured;
import org.junit.Before;
import org.junit.Test;

public class FirstApiTests {

    @Before
    public void setUp() {
        // Wywołaj konfigurację RestAssured
        RestAssuredConfig.setupRestAssured();
    }

    @Test
    public void testGetProductList() {
        // Testy API będą korzystać z ustawionego wcześniej baseURL
        // Tutaj możesz pisać kod swojego testu, na przykład test pobierania listy produktów.
    }

    // Dodaj więcej testów automatycznych
}
