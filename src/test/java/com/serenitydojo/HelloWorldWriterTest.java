package com.serenitydojo;

import org.junit.Test;

import java.util.Locale;

public class HelloWorldWriterTest {

    @Test
    public void shouldWriteHelloWorldToTheConsole() {
        HelloWorldWriter writer = new HelloWorldWriter();
        writer.writeHelloWorld();
    }


    @Test
    public void declalingNumericalVariables() {

        final int ageThisYear = 42;

        int ageNextYear = ageThisYear + 1;

        long starsInTheGalaxy = 10000000000000L;

        double weight = 15.5;

        System.out.println("age = " + ageNextYear);

    }

    @Test
    public void workingWithStrings() {

        String firstName =" Sarah-Jane ";

        String upperCaseFirstName = firstName.toLowerCase();



        System.out.println(upperCaseFirstName);
    }

}