import kotlinx.coroutines.*

fun main() = runBlocking {

    val handler = CoroutineExceptionHandler { _, exception -> println("caught $exception") }

    val job = GlobalScope.launch(handler) {

        launch {

            try {
                kotlinx.coroutines.delay(Long.MAX_VALUE)
            } finally {
                withContext(NonCancellable) {

                    println("all childs are not cancelled")
                    kotlinx.coroutines.delay(1000)
                    println("all child are cancelled")
                }
            }


        }

        launch {
            println("second child")
            kotlinx.coroutines.delay(2000L)
            throw ArithmeticException()
        }


    }

job.join()
}