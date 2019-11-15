import kotlinx.coroutines.*
import java.util.concurrent.Executor
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors


fun main() {

  exampleAsyncLazy()
}


fun printExample() = runBlocking {
    println("One")
    printDelayed("Two")
    println("Three")

}

suspend fun printDelayed(message: String) {

    delay(1000)
    println(message)
}

fun exampleDispatcherExample() {
    runBlocking(Dispatchers.Default) {

        println("one from thread  ${Thread.currentThread().name}")
        printDelayed("two from thread  ${Thread.currentThread().name}")


    }
    println("Three from Thread  ${Thread.currentThread().name}   ")

}

fun exampleGlobalLaunch() = runBlocking {
    println("one from thread  ${Thread.currentThread().name}")

    GlobalScope.launch {
        printDelayed("two from thread  ${Thread.currentThread().name}")
    }

    println("Three from Thread  ${Thread.currentThread().name}   ")


}

fun exampleGlobalLaunchWaiting() = runBlocking {
    println("one from thread  ${Thread.currentThread().name}")

    val job = GlobalScope.launch {
        printDelayed("two from thread  ${Thread.currentThread().name}")
    }

    println("Three from Thread  ${Thread.currentThread().name}   ")

    job.join()

}

fun exampleGlobalLaunchScope() = runBlocking {
    println("one from thread  ${Thread.currentThread().name}")

    launch {
        printDelayed("two from thread  ${Thread.currentThread().name}")
    }

    println("Three from Thread  ${Thread.currentThread().name}   ")


}

suspend fun calculateNumbers(a: Int, b: Int): Int {
    delay(1000)
    println("sum: ${a + b}")
    return (a + b)
}

fun printNumbers() = runBlocking {
    val job = GlobalScope.launch {

        for (i in 1..5) {
            println(i)
            kotlinx.coroutines.delay(1000)
        }

    }
    job.join()
}

fun printNumbersLaunchScope() = runBlocking {
    launch {

        for (i in 1..5) {
            println(i)
            kotlinx.coroutines.delay(1000)
        }

    }

}

fun printNumbersCustomDispatcher() = runBlocking {

    val customDispatcher = Executors.newFixedThreadPool(2).asCoroutineDispatcher()

    launch {

        for (i in 1..5) {
            println(i)
            kotlinx.coroutines.delay(1000)
        }

    }

    (customDispatcher.executor as ExecutorService).shutdown()
}

fun exampleAsync() = runBlocking {

    val startTime = System.currentTimeMillis()

    val num1 = async { calculateNumbers(1, 2) }
    val num2 = async { calculateNumbers(45, 67) }
    val num3 = async { calculateNumbers(55, 66) }

    val sum = num1.await() + num2.await() + num3.await()

    println("Total Sum: "+sum)

    val endTime =System.currentTimeMillis()

    println(endTime - startTime)
}

fun exampleWithContext() = runBlocking {

    val startTime = System.currentTimeMillis()

    val num1 = withContext(Dispatchers.Default) { calculateNumbers(1, 2) }
    val num2 = withContext(Dispatchers.Default) { calculateNumbers(45, 67) }
    val num3 = withContext(Dispatchers.Default) { calculateNumbers(55, 66) }

    val sum = num1 + num2+ num3

    println("Total Sum: "+sum)

    val endTime =System.currentTimeMillis()

    println(endTime - startTime)
}

fun exampleAsyncLazy() = runBlocking {

    val startTime = System.currentTimeMillis()

    val num1 = async(start = CoroutineStart.LAZY) { calculateNumbers(1, 2) }
    val num2 = async(start = CoroutineStart.LAZY) { calculateNumbers(45, 67) }
    val num3 = async(start = CoroutineStart.LAZY) { calculateNumbers(55, 66) }

    num1.start()
    num2.start()
    num3.start()

    val sum = num1.await() + num2.await() + num3.await()

    println("Total Sum: "+sum)

    val endTime =System.currentTimeMillis()

    println(endTime - startTime)
}




