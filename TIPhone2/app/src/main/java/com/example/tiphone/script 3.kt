package com.example.tiphone

fun main() {
    /* A1
    var myCar = Car()
    myCar.stop()
    */

    var c = Car("Maluch")
    c.pokarzCoMaszWSrodku()
}

/* A1
open class Vehicle {
    open fun stop() {
        println("Pojazd się zatrzymuje")
    }

    fun start() {
        println("Pojazd się startuje")
    }
}*/

abstract class Vehicle {
    abstract var type: String
    var price: Double = 100.00
    abstract fun maxPredkosc()

    fun pokarzCoMaszWSrodku() {
        println("Bardzo słaby silnik 2001r.")
    }
}

class Car(override var type:String) : Vehicle() {
    /* A1
    var price: Double = 0.0

    override fun stop() {
        super.stop()
        super.start()
        println("SAMOCHÓD się zatrzymuje")
    }*/

    override fun maxPredkosc() {
        println("Prędkość maksymalna 230km/h")
    }
}

