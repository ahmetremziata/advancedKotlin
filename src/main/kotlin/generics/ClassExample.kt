package generics

class Box<T>(var content: T)

fun main() {
    val intBox = Box(1)  // Box containing an Int
    val stringBox = Box("Hello")  // Box containing a String

    println(intBox.content)  // Output: 1
    println(stringBox.content)  // Output: Hello
}