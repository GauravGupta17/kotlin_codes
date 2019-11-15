import kotlinx.coroutines.*
import java.lang.AssertionError

fun main() = runBlocking{

    val handler = CoroutineExceptionHandler{_,exception -> println("caught $exception") }


    supervisorScope{
        var child = launch(handler) {
            println("child throws an exception")
            throw AssertionError()
        }
        println("scope is competing")




    }

    println("scope completed")


}

