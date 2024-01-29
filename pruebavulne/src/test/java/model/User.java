package model;

import com.github.javafaker.Faker;

public class User {

    private final String username;

    public User() {
        var faker = new Faker();
        username = faker.name().name();
    }

    public String getUsername() {
        return username;
    }

}
