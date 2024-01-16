package com.bestbuy.testbase;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

public class TestBase {
//    @BeforeClass
//    public void inIt(){
//        RestAssured.baseURI = PropertyReader.getInstance().getProperty("baseUrl");
//        RestAssured.port = Integer.parseInt(PropertyReader.getInstance().getProperty("port"));
//    }

    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 8080;
        RestAssured.basePath = "/student";
    }
}
