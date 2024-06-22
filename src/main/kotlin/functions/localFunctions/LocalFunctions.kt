package functions.localFunctions

fun foo(fooParam: String) {
    val outerFunction = "Value"
    // we can declare a function inside a function.
    fun bar(barParam: String) {
        println(barParam)
        println(fooParam)
        println(outerFunction)
    }

    // we can use this function inside our master function.
    bar("aaa")
}

// cannot access local functions bar() as it is only used in its function.
fun main(args: Array<String>) {
    foo("foo")
}
