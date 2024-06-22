package classes.SealedClasses


sealed class PageResult

class Success(val content: String): PageResult()
class Error(val code: Int, val errorMessage: String): PageResult()

fun getURLPage(url: String): PageResult {
    //
    val wasValidCall = false
    if (wasValidCall) {
        return Success("The content")
    } else {
        return Error(404, "Not Found")
    }
}



fun main(args: Array<String>) {
    val pageResult = getURLPage("/")

    when (pageResult) {
        is Success -> println(pageResult.content)
        is Error -> println(pageResult.errorMessage)
    }
}