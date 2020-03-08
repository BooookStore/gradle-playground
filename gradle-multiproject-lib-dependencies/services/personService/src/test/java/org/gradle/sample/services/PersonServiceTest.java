package org.gradle.sample.services;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonServiceTest {

    @Test
    public void personServiceTest() {
        String hello = new PersonService().hello();
        assertEquals(hello, "Hello, I'm PersonService in personService\n" +
                "-Hello, I'm Person in api\n" +
                "-Hello, I'm Helper in shared");
    }

}