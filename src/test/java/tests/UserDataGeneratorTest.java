package tests;

import models.User;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.UserDataGenerator;

public class UserDataGeneratorTest {

    @Test
    public void shouldCreateRandomUserWithValidData() {
        User user = UserDataGenerator.createRandomUser();

        Assert.assertNotNull(user);
        Assert.assertNotNull(user.getUsername());
        Assert.assertNotNull(user.getEmail());
        Assert.assertNotNull(user.getPassword());

        Assert.assertFalse(user.getUsername().isBlank(), "Username should not be blank");
        Assert.assertFalse(user.getEmail().isBlank(), "Email should not be blank");
        Assert.assertFalse(user.getPassword().isBlank(), "Password should not be blank");

        Assert.assertTrue(user.getEmail().contains("@"), "Email should contain @");
        Assert.assertEquals(user.getPassword(), "Test1234!", "Password should match expected test password");
    }
}