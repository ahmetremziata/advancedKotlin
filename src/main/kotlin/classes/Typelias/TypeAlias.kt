package classes.Typelias

import kotlin.properties.Delegates

typealias Name = String
typealias Email = String
data class Employee (val name: Name, val email: Email) {
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