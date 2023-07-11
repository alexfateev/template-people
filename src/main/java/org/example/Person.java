package org.example;

public class Person {
    protected final String firstName;
    protected final String lastName;
    private int age;
    private String address;

    public Person(String firstName, String lastName, int age, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }

    public void happyBirthday() {
        age++;
    }

    public boolean hasAge() {
        return age != -1 ? true : false;
    }

    public void setAddress(String city) {
        address = city;
    }

    public boolean hasAddress() {
        return address != "" ? true : false;
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

    public String getAddress() {
        return address;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder().setAddress(address).setAge(0).setLastName(lastName);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

}
