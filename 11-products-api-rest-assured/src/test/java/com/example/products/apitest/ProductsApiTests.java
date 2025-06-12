package com.example.products.apitest;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.greaterThan;
public class ProductsApiTests {

    @Test
    void testGetAllProducts(){
        RestAssured.baseURI = "http://localhost:8080";
        given().when().get("/products").then().statusCode(200).body("$.size()", greaterThan(0));
    }
}
