

interface Base {
    fun printMessage()
    fun printMessageLine()
}

class BaseImpl(val x: Int) : Base {
    override fun printMessage() { print(x) }
    override fun printMessageLine() { println(x) }
}

class Derived(b: Base) : Base by b {
    override fun printMessage() { print("abc") }
}

fun main() {

    val p = ga("Square",isCamera = true,isNetwork = true)

var arr = intArrayOf(1,2,3,4,5)





}


fun multiInput(vararg input:Int){
 var sum =0
    for(item in input){
        sum += item
    }

    print(sum)
}



typealias  ga = com.Inhertance.GenericPhone


