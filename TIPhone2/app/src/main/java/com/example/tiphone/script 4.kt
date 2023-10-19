package com.example.tiphone

fun main() {
    var car = Car2()
    car.go()
    car.stop()
}

interface CanGo {
    fun go()
}

interface toStop {
    fun stop()
}

class Car2: CanGo, toStop {
    override fun go() {
        println("Mój samochód jedzie")
    }

    override fun stop() {
        println("Mój samochód nie jedzie")
    }
}