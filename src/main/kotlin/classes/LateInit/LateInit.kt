package classes.LateInit

import classes.GetterSetterFields.Customer

interface Repository {
    fun getAll(): List<Customer>
}

class CustomerController() {
    // Don't worry, it is going to be initialized when called!
    private lateinit var repository: Repository

    fun index(): String {
        return repository.getAll().toString()
    }
}

fun main(args: Array<String>) {
    val customerController = CustomerController()
    customerController.index()
}