package com.web.template;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestService {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestService.class);
    private static final String HELLO_WORLD_FROM_TEST_SERVICE = "Hello World from TestService";
    private static final String CONSTRUCTOR_LOG = "TestService constructor";

    TestService() {
        LOGGER.info(CONSTRUCTOR_LOG);
    }

    public String getHelloWorld() {
        return HELLO_WORLD_FROM_TEST_SERVICE;
    }
}
