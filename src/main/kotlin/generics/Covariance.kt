// Define a covariant interface
interface Producer<out T> {
    fun produce(): T
}

// Base class Fruit and subclass Apple
open class Fruit {
    override fun toString() = "Fruit"
}

class Apple : Fruit() {
    override fun toString() = "Apple"
}

// Implementations of Producer
class FruitProducer : Producer<Fruit> {
    override fun produce(): Fruit {
        println("Producing a fruit")
        return Fruit()
    }
}

class AppleProducer : Producer<Apple> {
    override fun produce(): Apple {
        println("Producing an apple")
        return Apple()
    }
}

// This function accepts any Producer<Fruit>. Thanks to covariance, it can also accept a Producer<Apple> since Apple is a subtype of Fruit.
fun getFruit(producer: Producer<Fruit>) {
    val fruit: Fruit = producer.produce()
    println("Got a fruit: $fruit")
}

fun main() {
    val fruitProducer: Producer<Fruit> = FruitProducer()
    val appleProducer: Producer<Apple> = AppleProducer()

    // Using covariant types
    getFruit(fruitProducer)  // Works fine
    getFruit(appleProducer)  // Works fine due to covariance
}