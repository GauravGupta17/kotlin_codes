import java.util.*
import kotlin.collections.HashSet

fun main() {

    var a = listOf(1, 23, 212, 121)
    var b = listOf(2, 34, 5, 3)
    //println("both sets are equal:${a == b}")

    var f = mutableMapOf<Int, String>(1 to "one", 2 to "two", 3 to "three", 4 to "four")
    //println(f.keys)

    //   for (keys in f.keys)
    //println(f.get(keys))

    val empty = emptyArray<Int>()

    val doubled = List(3) { it + 1 }  // or MutableList if you want to change its content later
     //println(doubled)

    val linkedlist = LinkedList<Int>(listOf(1,2,3,34))
    //print("printing linked list ->$linkedlist")
    linkedlist.remove(34)

    val hashSet1 = HashSet<Int>(34)

    val list = listOf<Int>(1,2,3,4,5,6,6,6,7,7)
    val copylist = list.toMutableSet()
    //copylist.add(1221)

    //print(copylist)
   /* val list_iterator = copylist.iterator()
    while (list_iterator.hasNext()){
        println(list_iterator.next())
    }
   */

    copylist.forEach{
        println(it)
    }




 }