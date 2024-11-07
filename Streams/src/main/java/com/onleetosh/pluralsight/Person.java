package com.onleetosh.pluralsight;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    /**
     * Constructor
     * @param firstName
     * @param lastName
     * @param age
     */
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    /**
     * Getters
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    /**
     * Setters
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override

    public String toString(){
        return "Name: " + this.firstName + " " + this.lastName + " Age: " + this.age;
    }



}
