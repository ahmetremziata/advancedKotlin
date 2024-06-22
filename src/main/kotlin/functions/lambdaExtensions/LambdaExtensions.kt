package functions.lambdaExtensions

class Request(val method: String, val query: String, val contentType: String)
class Response(var contents: String, var status: Status) {
    fun status(status: Status.() -> Unit) {}
}

class Status(var code: Int, var description: String)

fun response(response: Response.() -> Unit) {}

class RouteHandler(val request: Request, val response: Response) {
    var executeNext = false
    fun next() {
        executeNext = true
    }
}

// Takes extension function
fun routeHandler(path: String, f: RouteHandler.() -> Unit): RouteHandler.() -> Unit = f

fun main(args: Array<String>) {

    // access the request and response. Because they are properties of RouteHandler
    // make dsl like route handler
    routeHandler("index.html") {
        if (request.query.isNotEmpty()) {
            //process
        }
        // make this dsl.
        response {
            status {
                code = 404
                description = "NotFound"
            }
        }
    }
}


