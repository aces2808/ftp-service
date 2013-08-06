package com.sudocode.dateutil.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import java.util.Date;

/**
 * Sudocode
 * Author: Jomer Pangilinan
 * Date: 8/6/13
 * Time: 5:05 PM
 */
public class TestUtilityClasses {

    private static final Logger logger = LoggerFactory.getLogger(TestUtilityClasses.class);

    @Test
    public void testUtilityDate() {
        logger.debug("Current date:: " + new Date());
    }
}
