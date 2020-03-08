open class GreetingTask : DefaultTask() {

    @get:Input
    var greeting = "hello from GreetingTask"

    @TaskAction
    fun greet() {
        println(greeting)
    }

}

tasks.register<GreetingTask>("hello")
tasks.register<GreetingTask>("greeting") {
    greeting = "greetings from GreetingTask"
}