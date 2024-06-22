package classes.CompanionObjects

// Hiding constructor
class Log private constructor()
{
    constructor(fileName: String): this() {
    }

    companion object Factory {
        // By jvm static keyword, java can access by Log.createFileLog
        @JvmStatic fun createFileLog(fileName: String): Log {
            return Log(fileName)
        }
    }
}

fun main(args: Array<String>) {
    val fileLog = Log.createFileLog("file.txt")
    // val myLog = Log()
}