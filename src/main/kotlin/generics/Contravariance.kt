// Base class Event and subclass SpecificEvent
open class Event
class SpecificEvent : Event()

// Define a contravariant interface
interface EventHandler<in T> {
    fun handle(event: T)
}

// Implementations of EventHandler
class GeneralEventHandler : EventHandler<Event> {
    override fun handle(event: Event) {
        println("Handling general event")
    }
}

class SpecificEventHandler : EventHandler<SpecificEvent> {
    override fun handle(event: SpecificEvent) {
        println("Handling specific event")
    }
}

// This function accepts any EventHandler<SpecificEvent>.
// Thanks to contravariance, it can also accept an EventHandler<Event> since Event is a supertype of SpecificEvent.
fun triggerEvent(handler: EventHandler<SpecificEvent>, event: SpecificEvent) {
    handler.handle(event)
}

fun main() {
    val generalHandler: EventHandler<Event> = GeneralEventHandler()
    val specificHandler: EventHandler<SpecificEvent> = SpecificEventHandler()

    val specificEvent = SpecificEvent()

    // Using contravariant types
    triggerEvent(specificHandler, specificEvent)  // Works fine
    triggerEvent(generalHandler, specificEvent)  // Works fine due to contravariance
}