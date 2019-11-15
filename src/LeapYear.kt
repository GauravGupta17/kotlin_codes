fun main(){
    var year =20_10
    println("Is $year is leap year?")

    if (year%400==0)
        println("$year is leap year")
    else if (year%100==0)
        println("$year is not a leap year")
    else if (year%4==0)
        println("$year is a leap year")
    else
        println("$year is not a leap year")
    
}