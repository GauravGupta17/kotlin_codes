
fun  main(){

    var a = mapOf<String,Int>("a" to 1,"b" to 2)

    for ((key,value)in a)
        println("$key $value")


    var b = listOf(1 to "one",2 to "two")
   // println("unzipping ${b.unzip()}")

   // println(a.mapKeys {it.key.toUpperCase()  })

 //   println(a.mapValues { it.value + 5})


    val colors = listOf("red", "brown", "grey")
    val animals = listOf("fox", "bear", "wolf")
    val pair = colors zip animals

    val twoAnimals = listOf("fox1", "bear2")
    //println(colors zip twoAnimals )


    val numbers = listOf("one", "two", "three", "four")

    println(numbers.associateBy { it.first().toUpperCase() })
    println(numbers.associateBy(keySelector = { it.first().toUpperCase() }, valueTransform = { it.length }))

}