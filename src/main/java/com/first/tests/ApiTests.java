import com.github.javafaker.Faker;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Before;
import org.junit.Test;

public class CheckProductsApiTests {

    @Before
    public void setUp() {
        // Importowanie i wywołanie metody z pliku TestSetup
        new TestSetup().setUp();
    }

    @Test
    public void testGetProducts() {
        // Wywołaj zapytanie GET, które pobiera produkty
        Response response = RestAssured.given()
                .when()
                .get("/products");

        // Sprawdź status odpowiedzi
        int statusCode = response.getStatusCode();
        System.out.println("Status Code: " + statusCode);

        // Sprawdź zawartość odpowiedzi
        String responseBody = response.getBody().asString();
        System.out.println("Response Body: " + responseBody);

        // Możesz dodać asercje, aby sprawdzić oczekiwane dane w odpowiedzi
        // Przykład: Sprawdź, czy status HTTP to 200 (OK)
        assert statusCode == 200 : "Błąd: Oczekiwany status HTTP 200, ale otrzymano " + statusCode;
    }
}