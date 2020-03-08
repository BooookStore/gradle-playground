package org.gradle.sample.services;

import org.gradle.sample.api.Person;

public class PersonService {

    public String hello() {
        return "Hello, I'm PersonService in personService\n"
                + "-" + new Person().hello();
    }

}
