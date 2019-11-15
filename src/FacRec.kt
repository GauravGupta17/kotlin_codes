fun main(){
    println(fact(5))


}

fun fact(f:Int):Int{
    var x=f
    if(x==0)
        return 1
    else if (x==1)
        return 1
    else
        return (x*fact(x-1))


}