package ru.testing.api.services;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static controllers.PropertyLoader.loadPropertyOrDefault;

public class Service {
    protected static final String BASE_URL = loadPropertyOrDefault("backUrl",
            "https://s1.casino.softswiss.com");
    protected static final Logger logger = LogManager.getLogger(Service.class);

    RequestSpecification requestSpec = new RequestSpecBuilder()
            .setBaseUri(BASE_URL)
            .setContentType("application/json;charset=UTF-8")
            .build();
}


