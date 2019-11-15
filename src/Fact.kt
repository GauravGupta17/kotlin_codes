fun main(){


    print(fac(3))



}

fun fac(x:Int):Int{
    var i:Int=1;
    var sum :Int=1
    while (i<=x){
        sum *= i
        i++
    }

    return sum



}