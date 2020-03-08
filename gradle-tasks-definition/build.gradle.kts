// name definition
tasks.register("hello") {
    doLast {
        println("hello")
    }
}

// tasks container
tasks {
    register("hello1") {
        doLast {
            println("hello")
        }
    }
}

// kotlin delegated properties
val hello2 by tasks.registering {
    doLast {
        println("hello")
    }
}