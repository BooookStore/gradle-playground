package org.gradle.sample.api;

import org.gradle.sample.shared.Helper;

public class Person {

    public String hello() {
        return "Hello, I'm Person in api\n"
                + "-" + new Helper().hello();
    }

}
