package generics

fun <T> printContent(content: T) {
    println(content)
}

fun main() {
    printContent(123)  // Output: 123
    printContent("Hello, World!")  // Output: Hello, World!
}