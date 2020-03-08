import com.mysql.cj.jdbc.Driver
import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException

buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        "classpath"(group = "mysql", name = "mysql-connector-java", version = "8.0.18")
    }
}

tasks.register("driver") {
    doLast {
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance()
    }
}