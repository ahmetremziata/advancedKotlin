package delagation.extensionProperties

val String.hasAmpersand: Boolean
    get() = this.contains("&")

fun main(args: Array<String>) {
    println("Hello".hasAmpersand)
    println("Hello&Bye".hasAmpersand)
}