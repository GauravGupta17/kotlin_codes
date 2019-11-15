package com.learning

import java.awt.Color

open class Dog(name:String/* this is not a property*/ , var breed:String, var color: String) :Animal(name) {

    fun bark(){
        println("barking")
    }

}