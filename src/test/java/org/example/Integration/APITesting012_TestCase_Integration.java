package org.example.Integration;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class APITesting012_TestCase_Integration {

    //  Create a Token
    // Create a Booking
    //  Perform  a PUT request
    //  Verify that PUT is success by GET Request
    // Delete the ID
    // Verify it doesn't exist GET Request

    RequestSpecification requestSpecification;
    Response response;
    ValidatableResponse validatableResponse;

    String token ;
    String bookingid;

    public String GET_token()
    {
        String payload = "{\n" +
                "                    \"username\" : \"admin\",\n" +
                "                    \"password\" : \"password123\"\n" +
                "                }";

        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("/auth");
        requestSpecification.contentType(ContentType.JSON).log().all();
        requestSpecification.body(payload);

        // When -     Response
        Response response = requestSpecification.when().post();

        // Then - Validatable Response
        ValidatableResponse validatableResponse = response.then();
        validatableResponse.statusCode(200);

        // Extract the token
        //token = response.jsonPath().getString("here we need to give the path");
        token = response.jsonPath().getString("token");
        System.out.println(token);
        return token;

    }

    public String Getbookingid()
    {
        return null;
    }

    public void test_update_request_put()
    {
    }

    public void test_update_request_get()
    {


    }

    public void test_delete_booking()
    {

    }

    public void test_after_delete_request_get()
    {

    }

}
