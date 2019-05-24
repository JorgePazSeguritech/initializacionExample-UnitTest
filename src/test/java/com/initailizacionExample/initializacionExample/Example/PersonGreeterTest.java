package com.initailizacionExample.initializacionExample.Example;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonGreeterTest {
    @Test
    public  void  sayHello_personWhitFirsNameAndLastName_shouldReturnPersonGreetering(){
        //Setup
        Person person = new Person("Octavio","Paz");
        PersonGreeter personGreeter = new PersonGreeter(person);

        //test
        String result = personGreeter.sayHello();

        //Verify
        assertNotNull("Greeting should not be null", result);
        assertEquals("Greting with unexpected value","Hello Octavio Paz",result);
    }

}