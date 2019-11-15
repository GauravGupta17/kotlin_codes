import java.lang.Exception

fun main(){




    var a  = 1
    var b:Int?=10
  b=null



try {


    var c = b!!.add(a) ?: println("null is there")
}
catch (e:Exception){
  println(e)

}




      b?.let {
        print("from let "+b.add(a))
         }

    fun Int.add(a:Int):Int{
        return this+a
    }



}
