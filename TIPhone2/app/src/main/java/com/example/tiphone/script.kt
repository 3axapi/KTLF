package com.example.tiphone

//fun main() {
//   var ocena = 5

   /*when (ocena) {
      1 -> println("Wolaj rodziców")
      2 -> println("Może być")
      3 -> println("Szłu nie ma")
      4 -> println("Możesz być z siebie zadowolony")
      5 -> {
         println("Jest bardzo dobrze")
         println("Jest dobrze bardzo")
      }
      6 -> println("Jesteś henialny")
      else -> println("To nie jest ocena")
   }*/

   /*when (ocena) {
      !is String -> println("To jest String")
      is Int -> println("To jest Int")
      is Double -> println("To jest Double")
      else -> println("Nie znam tego typu danych")
   }*/

   /*for (num in 11 until  19 step 3) { // downTo, until
      print("$num ")
   }*/

   /* A1
   var zakhar = Uczen()
   zakhar.imie = "3axap"
   zakhar.wiek = 17

   var adam = Uczen("Adam", 18)
   println(adam.imie)
   println(adam.wiek)*/

   /* A2
   var adam = Uczen("Adam", 16)
   var zakhar = Uczen("3axap", 17)
   println("${zakhar.imie}, ${zakhar.wiek}")*/

   /* A3
   var kolko = Kolo(14)
   println(kolko.pole)*/

   /*var u = Uczen() // !
   println(u.imie)
   println(u.wiek)
   u.imie = "Jestem na imię"
   println(u.imie)
   //u.wiek = 18*/

   /* A3
   var U = Uczen("Jasiek", 15)
   println(U.imie)
   println(U.wiek)*/
//}

/* A1
class  Uczen {
   var imie: String? = null;
   var wiek: Int? = null;

   constructor() {}

   constructor(imie: String, wiek: Int) {
      this.imie = imie
      this.wiek = wiek
   }
}*/

/* A2
class Uczen constructor(var imie: String, var wiek: Int) {
   init {
       println("To jest init klasy Uczen")
   }
}*/

/* A3
class Kolo constructor(var r: Int, var pi: Float = 3.14f) {
   var pole: Float? = null;

   init {
      this.pole = pi * r * r;
   }
}

class Uczen constructor(imie: String, wiek: Int) {
   var imie: String? = imie;
   var wiek: Int? = wiek
      private set
      get
}*/