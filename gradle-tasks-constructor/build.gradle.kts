open class CustomTask @javax.inject.Inject constructor(
    private val message: String,
    private val number: Int
) : DefaultTask()

tasks.register<CustomTask>("myTask", "hello", 42)