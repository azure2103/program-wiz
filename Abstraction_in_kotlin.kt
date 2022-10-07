package Kotlin_practice.Kotlin_basic.Kotlin_OOps.Abstractions


 abstract  class Animal (open  var name :String, open var age : Int) {

     abstract var color : String

     abstract fun playing ()
 }

  class dog (override var name : String , override var age: Int) : Animal(name , age){

      override var color = "brown"

      override fun playing() {

          println("$name is playing")
      }
  }
 fun main () {

     val obj = dog("Bull dog", 4)

     obj.color = "white"
     println ("${obj.name}, ${obj.age},${obj.color}")
     obj.playing()
 }