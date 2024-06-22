package functions.infixNotations

// Use infix keyword for making notation.
infix fun String.shouldBeEqualTo(value:String) = this == value
infix fun Int.shouldBeEqualTo(value:Int) = this == value
infix fun User.shouldFirstNameStartWithSelectedCapital(value:String) = this.firstName.startsWith(value)

fun main(args: Array<String>) {
    "Hello".shouldBeEqualTo("Hello")
    3.shouldBeEqualTo(3)
    val user = User(
        firstName = "Ahmet",
        lastName = "Ata"
    )

    println(user.shouldFirstNameStartWithSelectedCapital("A"))
    println(user.shouldFirstNameStartWithSelectedCapital("B"))

    // Infix function
    val output = "Hello"
    output shouldBeEqualTo "Hello"
    println(user shouldFirstNameStartWithSelectedCapital "A")


}

data class User(
    val firstName: String,
    val lastName: String
)