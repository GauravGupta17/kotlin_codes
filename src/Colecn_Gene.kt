import java.lang.reflect.Type

val pi by lazy {
    3.14f
}


fun main() {
/*
    var list = listOf<Int>(1,2,3,4,5,6)
    var list1 = list.filter { it<3 }.map { it*it }
*/
    var list =
        listOf<Dog>(Dog("Tommmy", "white"), Dog("Shera", "Redddish Brown"), Dog("Rani", "Black"), Dog("Gpsy", "Brown"))

    var names = list.filter { it.name.startsWith("S") }.map { it.name }

    var colors = list.map { it.color }


    val check: Boolean
    // check = list.all { it.name.endsWith("S") }

    //   check = list.any {it.name.endsWith("y")}

    //print(check)
/*
    val totalCount:Int = list.count{it.name.startsWith("T")}
    println(totalCount)

    var ele :Dog?  = list.find { it.name.startsWith("Sh") }


    ele?.let {
        println(ele.name)
    }
*/
    //for (i in names)
    // println(i)

    var ai = Dog("Brwony", "Red")
    ai.breed = "german"
    print(ai.breed)


}

class Dog(var name: String, var color: String) {
    lateinit var breed: String

}