package ru.testing.api.services;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.specification.RequestSpecification;

import static controllers.PropertyLoader.loadPropertyOrDefault;

public class Service {
    protected static final String BASE_URL = loadPropertyOrDefault("backUrl",
            "https://s1.casino.softswiss.com");

    RequestSpecification requestSpec = new RequestSpecBuilder()
            .setBaseUri(BASE_URL)
            .setContentType("application/json;charset=UTF-8")
            .addFilter(new RequestLoggingFilter())
            .addFilter(new ResponseLoggingFilter())
            .build();
}


