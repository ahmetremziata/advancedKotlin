package classes.GetterSetterFields

class Customer {
    private var myCustomField = 10
    var lastPurchaseAmount: Double = 0.0
        get() = field
        set(value) {
            if (value > 100) {
                field = value
            }
        }
}

fun main(args: Array<String>) {
    val customer = Customer()

    println(customer.lastPurchaseAmount)
    customer.lastPurchaseAmount = 200.0
    println(customer.lastPurchaseAmount)
    customer.lastPurchaseAmount = 50.0
    println(customer.lastPurchaseAmount)
}