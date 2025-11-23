package com.jshop.apitests;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class ProductControllerTest extends AppTest {

    @Test(groups = {"regression","api"})
    public void saveProduct_mappedTest() {
        String payload = "{\"productName\":\"sample_product\",\"price\":100.0,\"description\":\"sample_desc\"}";
        given()
            .contentType(ContentType.JSON)
            .body(payload)
        .when()
            .post("/product/saveProduct")
        .then()
            .statusCode(anyOf(is(200), is(201)));
    }

    @Test(groups = {"regression","api"})
    public void updateProduct_mappedTest() {
        String payload = "{\"id\":1,\"productName\":\"updated\",\"price\":120.0}";
        given()
            .contentType(ContentType.JSON)
            .body(payload)
        .when()
            .put("/product/updateProduct")
        .then()
            .statusCode(anyOf(is(200), is(204)));
    }

    @Test(groups = {"regression","api"})
    public void deleteProduct_mappedTest() {
        given()
        .when()
            .delete("/product/deleteProduct/1")
        .then()
            .statusCode(anyOf(is(200), is(204), is(404)));
    }
}
