package org.example;

public class PersonBuilder {
    private String firstName = "";
    private String lastName = "";
    private int age = -1;
    private String address = "";

    public PersonBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public PersonBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Неверно указан возраст. Возраст должен быть больше 0");
        }
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (firstName.equals("")) {
            throw new IllegalArgumentException("Не заполнено поле Имя");
        } else if (lastName.equals("")) {
            throw new IllegalArgumentException("Не заполнено поле Фамилия");
        }
        return new Person(firstName, lastName, age, address);
    }
}
