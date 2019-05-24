package com.initailizacionExample.initializacionExample.Example;

public class Person {

    private String firstName;
    private String LastName;

    public Person(String firstName, String LastName){
        this.firstName = firstName;
        this.LastName = LastName;
    }

    public String getFirstName(){return firstName;}

    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return LastName; }

    public void setLastName(String lastName) { this.LastName = lastName; }
}