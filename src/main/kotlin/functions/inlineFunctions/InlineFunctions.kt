package functions.inlineFunctions

inline fun operation(op: () -> Unit) {
    println("Before calling op()")
    op()
    println("After calling op()")
}

fun main(args: Array<String>) {
    operation { println("This is the actual op function") }
}
