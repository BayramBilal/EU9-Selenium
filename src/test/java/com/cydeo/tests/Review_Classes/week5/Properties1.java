package com.cydeo.tests.Review_Classes.week5;

import org.testng.annotations.*;

import java.io.*;
import java.util.*;

public class Properties1 {

    @Test
    public void test1() throws IOException {

        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("java.compiler"));

        Properties properties = new Properties();
        FileInputStream file = new FileInputStream("configuration.properties");
        properties.load(file);
        System.out.println(properties.getProperty("browser"));
        System.out.println(properties.getProperty("searchValue"));

    }
}