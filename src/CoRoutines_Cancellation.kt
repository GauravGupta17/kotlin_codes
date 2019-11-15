import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.yield

fun main() = runBlocking {

    val job = launch {
        val child = launch {
            try {
                kotlinx.coroutines.delay(Long.MAX_VALUE)
            } finally {
                println("child is cancelled in finally")
            }

        }

       yield()
        println("Cancelling the child ")
        child.cancel()
        child.join()
        yield()
        println("Parent is not cancelled ")


    }



    job.join()
}