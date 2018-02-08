package com.web.template.controller;

import com.web.template.TestService;
import org.easymock.EasyMock;
import org.easymock.IMocksControl;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.easymock.EasyMock.expect;
import static org.testng.Assert.assertEquals;

/**
 * Unit test for {@link WebController}.
 */
public class WebControllerTest {

    private static final String EXPECTED_WELCOME_MESSAGE = "Welcome to RestTemplate Example.";
    private static final String EXPECTED_ROOT_MESSAGE = "Hello World from TestService";

    private IMocksControl control;
    private WebController underTest;
    private TestService testService;

    @BeforeClass
    public void beforeClass() {
        control = EasyMock.createStrictControl();
        testService = control.createMock(TestService.class);
        underTest = new WebController(testService);
    }

    @BeforeMethod
    public void beforeMethod() {
        control.reset();
    }

    @Test
    public void testWelcomeShouldReturnWithProperStringWhenCalled() {
        // GIVEN
        control.replay();
        // WHEN
        String actual = underTest.welcome();
        // THEN
        control.verify();
        assertEquals(actual, EXPECTED_WELCOME_MESSAGE);
    }

    @Test
    public void testRootShouldReturnWithProperStringWhenCalled() {
        // GIVEN
        expect(testService.getHelloWorld()).andReturn(EXPECTED_ROOT_MESSAGE);
        control.replay();
        // WHEN
        String actual = underTest.root();
        // THEN
        control.verify();
        assertEquals(actual, EXPECTED_ROOT_MESSAGE);
    }
}