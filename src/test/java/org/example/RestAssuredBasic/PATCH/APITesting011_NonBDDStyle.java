package org.example.RestAssuredBasic.PATCH;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting011_NonBDDStyle {
    RequestSpecification requestSpecification;

    @Description("Verify the Patch Request for the Restful Booker APIs")
    @Test

    public void test_put_non_bdd(){

        String token = "d5a836d125d2965";
        String bookingid = "4019";


        String payloadPUT= "{\n" +
                "    \"firstname\" : \"Jao\",\n" +
                "    \"lastname\" : \"Sharma\",\n" +
                                "}";

        RequestSpecification requestSpecification = RestAssured.given();

        requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
        requestSpecification.basePath("/booking/"+bookingid);
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.cookie("token",token);
        //requestSpecification.auth().preemptive().basic("admin","password123");
        requestSpecification.body(payloadPUT).log().all();
        Response response = requestSpecification.when().patch();
        ValidatableResponse validatableResponse = response.then().log().all();
        validatableResponse.statusCode(200);


    }

}
