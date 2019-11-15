package com.learning

class Puppies(name:String,breed:String,color:String) : Dog(name,breed,color) {
 var cuteness :Int =0
 var age      :Int =0

    fun roll(){
        println("Rolling")
    }

    override fun eat(){
        super<Dog>.eat()
        println("eating fastly")

    }



}