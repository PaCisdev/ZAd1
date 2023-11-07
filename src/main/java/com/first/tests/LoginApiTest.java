package com.first.tests;


import org.junit.jupiter.api.Test;

public class LoginApiTest {

    @Test
    public void testRegisterUser() {
        // Inicjalizuj obiekt Faker
        Faker faker = new Faker();

        // Wygeneruj losowe dane testowe
        String username = faker.name().username();
        String email = faker.internet().emailAddress();
        String password = faker.internet().password();

        // Przygotuj dane żądania
        String requestBody = "username=" + username + "&email=" + email + "&password=" + password;

        // Wywołaj zapytanie POST na ścieżkę rejestracji
        Response response = RestAssured.given()
                .contentType(ContentType.URLENC)
                .body(requestBody)
                .when()
                .post("/register");

        // Sprawdź status odpowiedzi
        int statusCode = response.getStatusCode();
        System.out.println("Status Code: " + statusCode);

        // Sprawdź zawartość odpowiedzi
        String responseBody = response.getBody().asString();
        System.out.println("Response Body: " + responseBody);

        // Możesz dodać asercje, aby zweryfikować oczekiwane dane w odpowiedzi
        // Przykład: Sprawdź, czy status HTTP to 200 (OK) lub 201 (Created) w zależności od warunków rejestracji
        assert statusCode == 200 || statusCode == 201 : "Błąd: Niepowodzenie rejestracji.";
    }
}