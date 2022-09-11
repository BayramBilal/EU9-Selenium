package com.cydeo.tests.Review_Classes.week4;

import org.testng.*;
import org.testng.annotations.*;

public class TestNg {

    @BeforeClass
    public void beforeClass(){
        System.out.println("This is BEFORE CLASS");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("This is AFTER CLASS");
    }

    @BeforeMethod
    public void before(){
        System.out.println("This is running before every test");
    }

    @AfterMethod
    public void after(){
        System.out.println("This is running after every test");
    }

    @Test
    public void test1(){
        System.out.println("test 1 is running");
    }

    @Test
    public void test2(){
        System.out.println("test 2 is running");
    }


}