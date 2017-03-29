package com.selenium.test.exceptions;

/**
 * Created by RSen on 27/03/2017.
 */
public class TestsConfigurationException extends RuntimeException {

    public TestsConfigurationException(String message) {
        super(message);
    }

    public TestsConfigurationException(String message, Throwable cause) {
        super(message, cause);
    }
}
