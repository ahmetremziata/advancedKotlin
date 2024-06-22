package delagation.memberFunction

import classes.GetterSetterFields.Customer
import classes.LateInit.Repository

interface Repository {
    fun getById(id: Int): Customer
    fun getAll(): List<Customer>
}

interface  Logger {
    fun logAll()
}

// Delegating this function using by keyword
class Controller(repository: Repository, logger: Logger): Repository by repository, Logger by logger {
    fun index(): String {
        getAll()
        logAll()

        return ""
    }
}