pluginManagement {
    repositories {
        maven {
            url = uri(System.getProperty("publicPluginsRepositoryUrl"))
        }
    }
}

rootProject.name = "utka-gateway"