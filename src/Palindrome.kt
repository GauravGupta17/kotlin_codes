fun main(){
    var number =101
     var reverse:Int=0
    var temp:Int = number

    while (number!=0){
        reverse *= 10
        reverse += number%10
        number /= 10


    }

    if (temp == reverse){
        print("number is palindrome")
    }



}