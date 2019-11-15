fun main(){


    Computer.a =20
   // println(Computer.add(1,2))
    //println(Computer.sub(3,1))




}

object Computer{
    init {
        println("from init")
    }

    var a :Int =0

      var name:String = "Gaurav"

         var adress:String ="Khalilabad"


    fun add(x:Int,y:Int):Int{

        return x+y
    }

    fun sub(x:Int,y:Int):Int{

        return x-y
    }




}

