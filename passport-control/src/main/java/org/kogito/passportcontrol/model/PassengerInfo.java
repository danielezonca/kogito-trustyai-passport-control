package org.kogito.passportcontrol.model;

public class PassengerInfo {

    private final String firstName;
    private final String lastName;
    private final int age;
    private final String country;
    private final String passportId;

    public PassengerInfo(String firstName, String lastName, int age, String country, String passportId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.country = country;
        this.passportId = passportId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    public String getPassportId() {
        return passportId;
    }

}