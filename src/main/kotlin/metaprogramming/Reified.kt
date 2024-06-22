package metaprogramming

inline fun <reified T> isOfType(value: Any): Boolean {
    return value is T
}

fun main() {
    println(isOfType<String>("Hello")) // true
    println(isOfType<Int>("Hello"))    // false
}