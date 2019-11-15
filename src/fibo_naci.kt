import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.*
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

   fun main(){
       TestDriveFlow()
   }

fun egFiboBySqeuence() = runBlocking {

    var fibo = sequence {

        var cur = 1
        var next = 1
        while (true) {
            yield(cur)
            val temp = cur + next
            cur = next
            next = temp
        }

    }

    val arr = fibo.iterator()
    var i = 0
    while (arr.hasNext()) {
        kotlinx.coroutines.delay(1000L)
        if (i == 10)
            break

        println("${arr.next()} i= $i")
        i++
    }


}


fun foo():Flow<Int> = flow {

    for (i in 1..4) {
        kotlinx.coroutines.delay(100)
        emit(i)
    }

    }


fun TestDriveFlow() = runBlocking<Unit> {

    launch {
        for (i in 1..4){

            println("value from testDriveFlow $i")
            kotlinx.coroutines.delay(1000L)
        }
    }
   foo().collect{ value -> println(value) }


}

