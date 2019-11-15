import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.*

fun main(){

    channel()
}

fun channel()= runBlocking{
    var ch = Channel<Int>()

    launch {
        for (i in 1..4)
            ch.send(i)

        ch.close()

    }
     /*   repeat(4){
        println(ch.receive())

    }
*/    print("done")



    for (i in ch)
        println(i)



}


