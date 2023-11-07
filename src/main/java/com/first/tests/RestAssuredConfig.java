import io.restassured.RestAssured;

public class RestAssuredConfig {

    public static void setupRestAssured() {
        // Ustaw podstawowy URL API sklepu internetowego jako baseURL
        RestAssured.baseURI = "http://www.24mx.ie/INTERSHOP/rest/WFS/Pierce-24mx-Site/24mx-ie/";
    }
}
