package com.cydeo.tests.extra_tasks;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.AssertJUnit.assertTrue;

public class hardAssert_SoftAssert {

    @Test
    public void hardAsser(){
        Assert.assertEquals("apple","app" );
        System.out.println("after assertion failed");

        assertTrue("orange", equals("oranger"));
        System.out.println("after assertion failed");

    }



    @Test
    public void softAsser(){

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("apple", "app");
        System.out.println("after assertion failed");
        softAssert.assertTrue("orange".equals("oranger"));
        System.out.println("after assertion failed");


    }
}