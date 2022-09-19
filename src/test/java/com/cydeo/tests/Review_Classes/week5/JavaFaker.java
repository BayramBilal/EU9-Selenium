package com.cydeo.tests.Review_Classes.week5;

import com.github.javafaker.*;
import org.testng.annotations.*;


public class JavaFaker {


    @Test
    public void test1(){
        Faker faker = new Faker();

        System.out.println(faker.address().city());

        System.out.println(faker.animal().name());
    }

    @Test
    public void informationForm(){

        Faker faker = new Faker();

        String name = faker.name().firstName();
        String lastName = faker.name().lastName();
        String birthDate = faker.date().birthday().toString();
        String phoneNumber = faker.phoneNumber().phoneNumber();

        System.out.println("name = " + name);
        System.out.println("lastName = " + lastName);
        System.out.println("birthDate = " + birthDate);
        System.out.println("phoneNumber = " + phoneNumber);


    }


}