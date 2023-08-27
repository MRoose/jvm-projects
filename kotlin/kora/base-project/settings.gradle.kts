import org.gradle.api.initialization.resolve.RepositoriesMode

rootProject.name = "base-project"

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)

    dependencyResolutionManagement {
        repositories {
            mavenCentral()
        }
    }
}