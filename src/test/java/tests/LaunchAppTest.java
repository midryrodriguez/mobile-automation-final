package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LaunchAppTest extends BaseTest {

    @Test
    public void shouldOpenTheAppSuccessfully() {
        Assert.assertNotNull(driver, "Driver should be initialized");
        Assert.assertNotNull(driver.getSessionId(), "Session should be created successfully");
    }
}