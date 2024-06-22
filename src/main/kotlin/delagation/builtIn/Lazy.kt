package delagation.builtIn

class LazyExample {
    val lazyValue: String by lazy {
        println("Computed!")
        "Hello"
    }
}

fun main() {
    val example = LazyExample()
    println(example.lazyValue)  // Output: Computed! \n Hello
    println(example.lazyValue)  // Output: Hello
}