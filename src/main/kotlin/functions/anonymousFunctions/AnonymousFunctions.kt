package functions.anonymousFunctions

// Higher order function
fun op(x: Int, op: (Int) -> Int): Int {
    return op(x)
}

fun main() {
    // lambda function
    val a = op(3) { it / it }
    println(a)

    // use anonymous function without function name. We use fun keyword.
    println(op(2, fun(x):Int {
        // with anonymous function we can return multiple cases, in lambda it cannot be done.
        if (x > 10) {
            return 0
        }
        return x * x
    }))
}