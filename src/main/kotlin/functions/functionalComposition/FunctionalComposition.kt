package functions.functionalComposition


// Define two functions
val add2: (Int) -> Int = { it + 2 }
val multiplyBy3: (Int) -> Int = { it * 3 }

val add2AndMultiplyBy3 = multiplyBy3.compose(add2) // Equivalent to multiplyBy3(add2(x))
val multiplyBy3AndAdd2 = multiplyBy3.andThen(add2) // Equivalent to add2(multiplyBy3(x))


infix fun <P1, IP, R> ((P1) -> IP).andThen(f: (IP) -> R): (P1) -> R = forwardCompose(f)

infix fun <IP, R> (() -> IP).andThen(f: (IP) -> R): () -> R = forwardCompose(f)

infix fun <P1, IP, R> ((P1) -> IP).forwardCompose(f: (IP) -> R): (P1) -> R {
    return { p1: P1 -> f(this(p1)) }
}

infix fun <IP, R> (() -> IP).forwardCompose(f: (IP) -> R): () -> R {
    return { f(this()) }
}

infix fun <IP, R, P1> ((IP) -> R).compose(f: (P1) -> IP): (P1) -> R {
    return { p1: P1 -> this(f(p1)) }
}


fun main(args: Array<String>) {
    // Usage
    println(add2AndMultiplyBy3(3)) // Output: 15
    println(multiplyBy3AndAdd2(3)) // Output: 11

    val add5 = { i: Int -> i + 5 }
    val multiplyBy2 = { i: Int -> i * 2 }

    val addSandMultiplyBy2 = add5 andThen multiplyBy2
    println( addSandMultiplyBy2(2)) // Output: 11
}