import com.rnett.action.generateAutoBuildWorkflow
import com.rnett.action.githubAction

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.kotlin.github.action)
}

kotlin {
    jvmToolchain(17)
    js(IR) {
        githubAction()
    }
    sourceSets {
        val jsMain by getting {
            dependencies {
                implementation(libs.kotlin.github.action)
            }
        }
    }
}

generateAutoBuildWorkflow(javaVersion = "17")

//tasks.matching { it.name.matches("jsNode\\w*Run".toRegex()) }
//    .configureEach {
//        dependsOn(tasks.matching { it.name == "jsDevelopmentExecutableCompileSync" })
//        dependsOn(tasks.matching { it.name == "jsProductionExecutableCompileSync" })
//    }
