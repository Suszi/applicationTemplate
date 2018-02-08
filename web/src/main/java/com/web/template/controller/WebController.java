package com.web.template.controller;

import com.web.template.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    private static final Logger LOGGER = LoggerFactory.getLogger(WebController.class);
    private static final String ROOT_PATH = "/";
    private static final String ACCEPT = "Accept=";
    private static final String APPLICATION_JSON = "application/json";

    private TestService testService;

    WebController(final TestService testService) {
        this.testService = testService;
    }

    @RequestMapping(path = ROOT_PATH)
    @ResponseBody
    String welcome() {
        LOGGER.info("Welcome called!");
        return "Welcome to RestTemplate Example.";
    }

    @RequestMapping(path = ROOT_PATH + "test", method = RequestMethod.GET)
    @ResponseBody
    String root() {
        LOGGER.info("Root called");
        return testService.getHelloWorld();
    }
}
