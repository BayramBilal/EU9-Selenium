package com.cydeo.tests.day7_webtables_utilities_javafaker;


import org.testng.annotations.Test;



public class T4_Practice_getProperty {



    @Test
    public void java_properties_reading_test(){
        System.out.println("System.clearProperty(\"os.name\") = " + System.clearProperty("os.name"));
        System.out.println(System.getProperty("user.name"));
        System.out.println("System.getProperty(\"password.name\") = " + System.getProperty("password.name"));


    }


    }
