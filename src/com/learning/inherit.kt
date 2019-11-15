package com.learning

import com.learning.Animal
import com.learning.Dog
import com.learning.Puppies

fun main(){
        val dog = Dog("Shera ",breed = "German Shepherdf ",color = "reddish brown "  )


dog.whatsYourName()



}

fun Dog.whatsYourName() = print(this.name+this.breed +this.color)