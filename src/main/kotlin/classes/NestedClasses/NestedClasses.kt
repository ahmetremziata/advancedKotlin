package classes.NestedClasses

class DirectoryExplorer(val user: String) {

    // can access inner class from outer class
    inner class PermissionCheck {
        fun validatePermission() {
            if (user == "Ahmet") {

            }
        }
    }

    fun listFolder(folder: String, user: String) {
        val permissionCheck = PermissionCheck()
        permissionCheck.validatePermission()
    }
}

fun main(args: Array<String>) {
    val de = DirectoryExplorer("Ahmet")

    val dr = DirectoryExplorer("Ahmet").PermissionCheck()
}

