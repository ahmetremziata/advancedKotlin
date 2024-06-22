package metaprogramming

fun <T> printList(list: List<T>) {
    if (list is List<*>) {
        println("This is a list")
    }
}

/*
fun <T> printList(list: List<T>) {
    when(list) {
        is List<Int> -> println("This is an int")
        is List<String> -> println("This is a string")
    }
} */

fun <T> printList(obj: T) {
    when(obj) {
        is Int -> println("This is an int")
        is String -> println("This is a string")
    }
}


fun main(args: Array<String>) {
    val listStrings = listOf("One", "Two", "Three")
    val listInts = listOf(1, 2, 3)
    printList(listInts)
    printList(listStrings)
}
