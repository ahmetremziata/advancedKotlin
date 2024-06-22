package delagation.builtIn

import kotlin.properties.Delegates

data class Employee (val name: String, val email: String) {
    var department: String by Delegates.observable("", {property, oldValue, newValue ->
        println("Property: ${property.name} has changed from $oldValue to $newValue")
    })
    fun printName(string: String) {

    }
}

fun main(args: Array<String>) {
    val employee = Employee("Ahmet", "info@gmail.com")
    employee.printName("a")

    employee.department = "IT"
}