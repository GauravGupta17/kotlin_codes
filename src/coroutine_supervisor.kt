import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.*
import java.lang.AssertionError

fun main() = runBlocking {
    val supervisor = SupervisorJob()
    with(CoroutineScope(coroutineContext + supervisor))
    {
        val firstChild = launch(CoroutineExceptionHandler { _, _ -> }) {
            println("first child")
            throw AssertionError("first child cancelled")
        }

        var child = launch {
            firstChild.join()

            println("first child is cancelled : ${firstChild.isCancelled}  second child is alive   ")

            try {
                kotlinx.coroutines.delay(Long.MAX_VALUE)
            } finally {
                println("second child is cancelled because supervisor is cancelled")
            }


        }

        firstChild.join()
        println("Cancelling supervisor")
        supervisor.cancel()
        child.join()


    }

}