fun main(){


var a = Pen()
 //   a.addTwoNumbers(2,3)
  /*  a.subTwoNumbers(7,3,object :ex{
        override fun execute(sum: Int) {
            println("from interface method and sum value is $sum")
        }

    })





var lambda : (Int)->Unit = { sum:Int->

     var lambda2 :() -> Unit ={
      println("from inside the lambda function")
                }
    lambda2()
    println("sum from the lambda expression $sum")

}
//    val lambda =  {sum:Int -> println("......$sum")} //other ways
 // lambda = { print("new lamda") }

    a.addTwoNumbers(2,3,lambda)


    a.multiplyTwoNumbers(2,3) { x, y -> x*y}

    var result :Int=0
    a.divideTwoNumbers(2,3){x,y -> result = x/y}

    println("result printing from after updating from the divide method $result")
*/

    a.reverseAString("Gaurav") { it.reversed()}  //it is a single parameter in lambda expression
    // it is used in replacement of s->s.reversed()

    var pen = Pen()

    with(pen){
        name = "rotmac"
        color = "black"
    }

    println(pen.name)
//cant call methods in this case

    pen.apply {
        name ="Trimax"
        color = "blue"


    }.reverseAString("Hello") {it.reversed()}


}



class Pen{

    var color :String =""
    var name: String =""


    fun addTwoNumbers(x:Int,y:Int){
        var sum = x+y
        println(sum)

    }
    fun subTwoNumbers(x:Int,y:Int,action: ex){
        var sum = x-y
        action.execute(sum)
        println(sum)
    }
    fun addTwoNumbers(x:Int,y:Int,myfun: (Int) -> Unit ){
      var sum = x+y
        myfun(sum)
    }
    fun multiplyTwoNumbers(x: Int,y: Int,myfun: (Int, Int) -> Int){
        println(  " from the multiply..  ${myfun(x,y)}")
    }

   fun divideTwoNumbers(x:Int,y:Int,myFun:(Int,Int)->Unit){
       myFun(x,y)
   }

    fun reverseAString(str:String,action:(String)->String){
     var a =   action(str)
     println(a)

    }





}

interface ex{
    fun execute(sum:Int)
}