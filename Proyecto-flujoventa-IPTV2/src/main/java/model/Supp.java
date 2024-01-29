package model;

import com.github.javafaker.Faker;

public class Supp {
    public String subject;
    public String message;
    public Supp() {
        var faker = new Faker();
        subject =faker.book().title();
        message =faker.book().publisher();


    }

    public String getSubject() {
        return subject;
    }
    public String getMessages() {
        return message;
    }
}
