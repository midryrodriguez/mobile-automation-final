package utils;

import models.User;

import java.util.UUID;

public class UserDataGenerator {

    private UserDataGenerator() {
    }

    public static User createRandomUser() {
        String uniqueId = UUID.randomUUID().toString().replace("-", "").substring(0, 8);
        String username = "user" + uniqueId;
        String email = "test_" + uniqueId + "@mail.com";
        String password = "Test1234!";

        return new User(email, password, username);
    }
}