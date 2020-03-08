tasks.register("hello") {
    doLast {
        println("Hello, World!")
    }
}

tasks.register("intro") {
    dependsOn("hello")
    doLast {
        println("I'm Gradle")
    }
}

tasks.register("upper") {
    doLast {
        val someString = "mY_nAmE"
        println("Original: $someString")
        println("Upper case: ${someString.toUpperCase()}")
    }
}

tasks.register("count") {
    doLast {
        repeat(4) { print("$it ") }
    }
}

repeat(4) { counter -> 
    tasks.register("task$counter") {
        doLast {
            println("I'm task number $counter")
        }
    }
}
tasks.named("task0") { dependsOn("task2", "task3") }

val hello_planet by tasks.registering {
    doLast {
        println("Hello Earth")
    }
}
hello_planet {
    doFirst {
        println("Hello Venus")
    }
}
hello_planet {
    doLast {
        println("Hello Mars")
    }
}
hello_planet {
    doLast {
        println("Hello Jupiter")
    }
}

tasks.register("withProperty") {
    extra["name"] = "BookStore"
}

tasks.register("printTaskProperties") {
    doLast {
        println(tasks["withProperty"].extra["name"])
    }
}