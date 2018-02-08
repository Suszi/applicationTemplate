package com.web.template;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestServiceTest {
    private static final String HELLO_WORLD_FROM_TEST_SERVICE = "Hello World from TestService";

    private TestService underTest;

    @BeforeClass
    public void beforeClass() {
        underTest = new TestService();
    }

    @Test
    public void testGetHelloWorldShouldReturnWithProperStringWhenCalled() {
        // GIVEN
        // WHEN
        String actual = underTest.getHelloWorld();
        // THEN
        assertEquals(actual, HELLO_WORLD_FROM_TEST_SERVICE);
    }
}