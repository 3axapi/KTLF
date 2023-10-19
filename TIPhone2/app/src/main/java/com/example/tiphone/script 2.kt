package com.example.tiphone

fun main() {
    var u = Uczen("PROGRAMOWANIE", "9");
    u.imie = "Zakhar"
    u.getName()

    /* A1
    var u1 = Uczen1("", 1)*/

    var u2 = Uczen2();
    u2.imie = "Janek";
    println(u2.wiek)
}

class Uczen constructor (hobby:String, szkola:String) {
    var imie: String? = null;
    var hobby: String? = hobby;
    var szkola: String? = szkola;

    fun getName() {
        println(this.imie)
    }
}

/* A1
class Uczen1 constructor (imie: String, wiek: Int?) {
    lateinit var majatek: String;

    init {
        this.majatek = "Bardzo duży"
    }
}*/

class Uczen2() {
    var imie: String = ""
        /*get() = field
        set(value) {
            field = value
        }*/

        get() {
            return field.lowercase()
        };
    var wiek: Int = 260
        get() {
            return field - 100
        }

}