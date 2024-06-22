package metaprogramming

import java.lang.reflect.Type

class Transaction(val id: Int, val amount: Double, var description: String = "Default value") {
    fun validate() {
        if (amount > 10000) {
            println("transaction is to long!")
        }
    }
}

fun introspectInstance(obj: Any) {
    println("Class ${obj.javaClass.simpleName}\n")
    println("Properties")
    obj.javaClass.declaredFields.forEach {
        println("${it.name} of type ${it.type}")
    }
    println("Functions")
    obj.javaClass.declaredMethods.forEach {
        println(it.name)
    }

    getType(Transaction::class.java)
}

fun getType(obj: Type) {
    println(obj.typeName)
}

fun main(args: Array<String>) {
    introspectInstance(Transaction(
        id = 1,
        amount = 12.13,
        description = "lorem ipsum"
    ))
}