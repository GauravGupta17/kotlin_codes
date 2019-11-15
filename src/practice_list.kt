fun main(){
 /*
    val numbers = (0..13).toList()
    println(numbers.subList(3, 6))
    val a = mapOf<Int,String>(1 to "one",2 to "two",3 to "three")
    println(a[1])
    println(a.get(5))

    println()
    println(a.getValue(3))

    println(a.getOrDefault(5,"index Not mathced"))
*/

    val cat = Cat("oiujm,",2,"persion")

    //val a= cat.name
    //val b= cat.age

      // println("$a $b")

    val (a1,b1,c1) = cat
       println("$a1 $b1 $c1")



}


 data class Cat(var name:String ,var age:Int,var breed:String)
{

}
