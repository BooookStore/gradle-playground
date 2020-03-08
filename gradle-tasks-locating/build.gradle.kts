task("hello")
task<Copy>("copy")

val hello by tasks.getting
println(hello.name)

val copy by tasks.getting(Copy::class)
println(copy.destinationDir)

tasks.register("hello1")
println(tasks["hello1"].name)
println(tasks.named("hello1").get().name)
println(tasks.getByName("hello1").name)