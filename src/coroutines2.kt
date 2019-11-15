import kotlinx.coroutines.*

fun main() {

    egDispatcher()
}


fun exampleCoRoutineScope() = runBlocking {

    launch {
        kotlinx.coroutines.delay(2000)
        println("Hello everyone")

    }

    coroutineScope {

        launch {
            kotlinx.coroutines.delay(3000)
            println("Inside the launch of coroutine Scope")
        }

        kotlinx.coroutines.delay(2000)
        println("Outside of Launch of CoRoutine Scope")

    }

    print("At the end of function")

}

fun exampleMultipleCoRoutine() = runBlocking {
    repeat(123) {
        launch {
            kotlinx.coroutines.delay(1000)
            println(".")
        }
    }
}

fun exampleCancellation() = runBlocking {
    val job = launch {
        repeat(10) { i ->
            println("job: I'm sleeping $i ...")
            delay(500L)
        }
    }

    delay(1300L) // delay a bit
    println("main: I'm tired of waiting!")
    // cancels the job


    job.cancel()
    job.join() // waits for job's completion

    println("main: Now I can quit.")
}

fun egFinally() = runBlocking {
    var a = launch {
        try {


            repeat(1230) { i ->
                println("Iterating $i times")
                delay(1000)

            }

        } finally {
            println("How will it close the resource")
        }


    }

    delay(1300)
    println("before cancelation")
    a.cancelAndJoin()
    println("Finally Closed")


}

fun egTimeOut() = runBlocking {
    withTimeout(1000) {
        repeat(12000) {
            print("hello")
            kotlinx.coroutines.delay(1200)
        }
    }

}

fun egDispatcher() = runBlocking {

    launch {
        println("I am working in the main thread")
    }

    launch(Dispatchers.IO) {
        println(" in Dispatchers.IO ${Thread.currentThread().name}")
    }
    launch(Dispatchers.Default) {
        println(" in Dispatchers.DEFAULT ${Thread.currentThread().name}")
    }

    launch(Dispatchers.Default) {
        println(" in Dispatchers.DEFAULT 2 ${Thread.currentThread().name}")
    }


    launch(Dispatchers.Unconfined) {
        println(" in Dispatchers.DEFAULT ${Thread.currentThread().name}")
    }

    launch(newSingleThreadContext("new Thread")) {
        println(" in Dispatchers new Single Thread Context ${Thread.currentThread().name}")
    }


}


