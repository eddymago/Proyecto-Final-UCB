package model;

import com.github.javafaker.Faker;

public class Addre {
    private final String address;
    public Addre() {
        var faker = new Faker();

        address = faker.internet().emailAddress();

    }

    public String getAddress() {
        return address;
    }
}


