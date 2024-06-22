package functions.returnAndLocalReturns

fun containingFunction() {
    val numbers = 1..100
    /*numbers.forEach {
        if (it % 5 == 0) {
            return@forEach
        }
    } */

    /*numbers.forEach mylabel@ {
        if (it % 5 == 0) {
            return@mylabel
        }
    } */

    // use anonymous function
    numbers.forEach(fun(element) {
        if (element % 5 == 0) {
            return
        }
    })

    println("Hello")

}

fun main(args: Array<String>) {
    containingFunction()
}