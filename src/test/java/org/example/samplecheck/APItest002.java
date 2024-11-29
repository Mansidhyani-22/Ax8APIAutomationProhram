package org.example.samplecheck;

import io.restassured.RestAssured;

public class APItest002 {
    public static void main(String[] args) {
        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/booking/2")
                .when()
                .get()
                .then().log().all()
                .statusCode(200);

    }

}
