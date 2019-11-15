import kotlinx.coroutines.*
import java.lang.ArithmeticException
import java.lang.AssertionError

fun main() = runBlocking{
    val handler = CoroutineExceptionHandler{
        _,exception-> println("caught $exception")
    }

    val job = GlobalScope.launch(handler) {
        throw  AssertionError()

    }

    val deferrred = GlobalScope.async {
        throw  ArithmeticException()
    }

    joinAll(job,deferrred)

}