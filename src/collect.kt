fun main(){

    //Arrays
  /*var myArray = Array<Int>(4){0}
    var myArray1 = Array<String>(5){"Hello"}
    var myArray2 = Array<Boolean> (5){true}
*/


    //Immutable List
    //var list = listOf<String>("Helllo","World","sdsds","dsssd")

    //Mutable List
/*    var list = mutableListOf<String>("Motorola","Nokia","Blackberry")
    list.add("mi")
    list.clear()
    print(list)
    list = mutableListOf("helllo","kjfkj","fdfd")
*/

/*    var list :ArrayList<String> = arrayListOf<String>("Motorola","Nokia","Blackberry")
    list.add("mi")
    list.clear()
    print(list)
    list = arrayListOf("helllo","kjfkj","fdfd")

*/

    //immutable map
  //  val myMap = mapOf<Int,String>(1 to "yogi",2 to "manmohan",3 to "modi")

var myMap = mutableMapOf<Int,String>()
    myMap.put(1,"Hello")
    myMap.put(2,"India")
    myMap.put(3,"hii")
    myMap.remove(1)




    for (key in myMap.keys){
        println("element at key :$key = ${myMap[key]}")
    }






}