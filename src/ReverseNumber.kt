
fun main(){
 var number:Int=2012
    var reverse:Int=0
    println(number)
    while (number!=0){
        reverse *= 10
        reverse += number % 10
        number /= 10


    }

    print(reverse)

}