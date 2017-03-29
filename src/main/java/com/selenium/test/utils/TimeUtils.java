package com.selenium.test.utils;

/**
 * Created by RSen on 27/03/2017.
 * Operations with time
 */
public class TimeUtils {

    /**
     * waiting for seconds
     * @param timeoutInSeconds timeout in seconds for wait
     */
    public static void waitForSeconds(int timeoutInSeconds) {
        try {
            Thread.sleep(timeoutInSeconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
