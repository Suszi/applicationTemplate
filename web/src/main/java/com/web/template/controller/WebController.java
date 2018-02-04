package com.web.template.controller;

import com.web.template.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    private TestService testService;

    public WebController(final TestService testService) {
        this.testService = testService;
    }

    @RequestMapping("/")
    String home() {
        return testService.getHome();
    }
}
