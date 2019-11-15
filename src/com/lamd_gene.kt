import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

fun main(){




    //val yourName: (String)->Unit ={ name:String -> print("my name is $name")}
    //yourName("Gaurav")



    /*val palindrome : (Int) -> Boolean ={num:Int ->
        var temp =num
        var sum:Int =0
        while (temp!=0){
            sum *= 10
            sum += temp % 10
            temp /= 10

        }

        sum==num


    }
      print(palindrome(121))
*/

   /* val test : (String,String) -> Unit ={
        name,address -> print("$name : $address")
    }


    test("Gaurav","Khalilabad")
*/



    fun <T> na(ite:T):T{

        return ite
    }

    println(na("hajshjh"))
    println(na(123))
    println(na(2.2f))
    println(na(true))




}


