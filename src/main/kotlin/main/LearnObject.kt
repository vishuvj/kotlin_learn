package org.example.main

//class LearnObject {
//}

// object Declaration
/**
fun main(){
SharingWidget.incrementTwitterLikes()
SharingWidget.incrementTwitterLikes()
SharingWidget.incrementTwitterLikes()
SharingWidget.incrementFBLikes()
SharingWidget.display()
}
object SharingWidget{
private var twitterLikes=0
private var fbLikes=0

fun incrementTwitterLikes()= twitterLikes++
fun incrementFBLikes()= fbLikes++
fun display()=println("Facebook: $fbLikes , Twitter: $twitterLikes")
}
 **/

// object expression
//fun main(){
//    var testObj=object {
//        val x:Int=10
//        fun method(){
//            print("I am object expression")
//        }
//    }
//    println(testObj.method())
//}
//fun main(){
//    // anonymous object to implement interface
//    var obj=object : Cloneable{
//        override fun clone() {
//            println("I am Clone")
//        }
//    }
//obj.clone()
//}
//
//interface Cloneable{
//    fun clone()
//}

fun main() {
    var obj = object : Person("Vishal Jadon") {
        override fun fullName() {
            super.fullName()
            println("Anonymous : $name")
        }
    }
    obj.fullName()
}

open class Person(val name: String) {
    open fun fullName() = println("Full Name: $name")
}