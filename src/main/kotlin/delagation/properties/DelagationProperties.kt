package delagation.properties

import kotlin.reflect.KProperty

class Service {
    var someProperty: String by ExternalFunctionality()
}

// When we want to delegate property, we have to implement getValue and setValue methods
class ExternalFunctionality {
    var backingField = "Default"
    operator fun getValue(service: Service, property: KProperty<*>): String {
        println("getValue called with params \n" +
                "services: $service\n" +
                "property: ${property.name}")
        return backingField
    }

    operator fun setValue(service: Service, property: KProperty<*>, value: String) {
       backingField = value
    }
}

fun main(args: Array<String>) {
    val service = Service()
    println(service.someProperty)
    service.someProperty = "New Value"
    println(service.someProperty)
}