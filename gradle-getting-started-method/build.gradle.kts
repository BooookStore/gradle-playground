tasks.register("files") {
    doLast {
        fileList("./").forEach { file -> 
            println(file)
        }
    }
}

fun fileList(dir: String): List<File> = file(dir).listFiles { file: File -> file.isFile }.sorted()