fun main(){
    var a =34
    var n= 2
    if (a==0) {
        println("Nor Prime nor Composite")
        return
    }
    if (a==2) {
        println("Prime")
    return
    }
    var eet:Boolean=false

    while (n != (a/2))
    {
       if (a%n == 0)
       {
           eet = false
           
       }

        else
           eet = true

           n++
    }

    if(eet)
        print("prime")
    else
        print("not prime")





}