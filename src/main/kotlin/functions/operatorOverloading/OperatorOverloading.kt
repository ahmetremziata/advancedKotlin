package functions.operatorOverloading

data class Time(val hours:Int, val mins: Int) {
    operator fun plus(time: Time): Time {

        val minutes = this.mins + time.mins
        val hoursInMinutes = minutes / 60
        val remainingMinutes = minutes % 60
        val hours = this.hours + time.hours + hoursInMinutes
        return Time(hours, remainingMinutes)
    }
}

operator fun StringBuilder.plus(stringBuilder: StringBuilder) {
    stringBuilder.forEach { this.append(it) }
}

fun main(args: Array<String>) {
    // use plus function
    val newTime = Time(10, 40).plus(Time(3, 49))
    val newTime2 = Time(10, 40) + Time(3, 49)
    println(newTime)
    println(newTime2)

    val sb = StringBuilder()
    for (str in sb) {
        str + "Value"
    }
}