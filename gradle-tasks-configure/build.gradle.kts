// 冗長な書き方
tasks.register<Copy>("myCopy")
val myCopy = tasks.named<Copy>("myCopy")
myCopy {
    from("resources")
    into("target")
    include("**/*.txt", "**/*.xml", "**/*.properties")
}

// シンプルで読みやすい
val myCopy2 by tasks.existing(Copy::class) {
    from("resources")
    into("target")
}
myCopy2 { include("**/*.txt", "**/*.xml", "**/*.properties") }