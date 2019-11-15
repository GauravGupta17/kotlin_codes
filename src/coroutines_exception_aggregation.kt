import kotlinx.coroutines.*
import java.io.IOException
import java.lang.ArithmeticException

fun main() = runBlocking {

    val handler = CoroutineExceptionHandler{
        _,exception -> print("caught $exception , supperesed with ${exception.suppressed.contentToString()}")
    }
    val job = GlobalScope.launch(handler) {
        launch {
            try {
                delay(Long.MAX_VALUE)
            } finally {
                        throw ArithmeticException()
            }

        }

        launch {
            kotlinx.coroutines.delay(10L)
            throw IOException()
        }
        kotlinx.coroutines.delay(Long.MAX_VALUE)


    }



    job.join()
}