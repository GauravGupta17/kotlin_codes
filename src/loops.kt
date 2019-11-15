fun main(){

    myloop@for(i in 1..3){
        for(j in 1..3){
        println("$i $j")
            println("loop 2 running ")
         if (i==1 && j ==1)
             break@myloop

        }
        println("Loop one running")
    }


}