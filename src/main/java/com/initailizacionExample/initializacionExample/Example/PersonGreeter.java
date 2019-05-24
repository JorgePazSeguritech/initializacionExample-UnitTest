package com.initailizacionExample.initializacionExample.Example;

public class PersonGreeter {
    private  Person person;
    public PersonGreeter(Person person){
        this.person = person;
    }
    public  String sayHello(){return "Hello " + person.getFirstName()+ " " +person.getLastName();}

}
