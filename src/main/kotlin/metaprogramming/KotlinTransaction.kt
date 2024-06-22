package metaprogramming

import kotlin.reflect.KClass
import kotlin.reflect.full.memberProperties

fun getKotlinType(obj: KClass<*>) {
    println(obj.qualifiedName)
}

fun main(args: Array<String>) {
    // It is KClass --> Kotlin Class In Kotlin, KClass represents a class reference.
    // It is part of Kotlin's reflection API and is used to handle class objects.
    // Essentially, KClass is Kotlin's equivalent to Java's Class.
    /*println(Transaction::class)

    val classInfo = Transaction::class
    classInfo.members.forEach {
        println("Property ${it.name} of type ${it.returnType}")
    }

    classInfo.constructors.forEach {
        println("Constructor ${it.name} - ${it.parameters}")
    }

    getKotlinType(Transaction::class) */


    // reference
    val constructor = ::Transaction
    println(constructor)

    val idParam = constructor.parameters.first { it.name == "id"}
    val amountParam = constructor.parameters.first { it.name == "amount"}
    val transaction = constructor.callBy(mapOf(idParam to 1, amountParam to 200))
    val validateFunc = Transaction::validate

    val trans = Transaction(1, 20.0, "New Value")

    val nameProperty = Transaction::class.memberProperties.find { it.name == "description" }
    println(nameProperty?.get(trans))

    println(transaction.description)
}