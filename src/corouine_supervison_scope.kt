import kotlinx.coroutines.*
fun main()= runBlocking{
    try {

        supervisorScope{
            var child = launch {
                try {
                   println("child is sleeping")
                    kotlinx.coroutines.delay(Long.MAX_VALUE)
                }
                finally {
                   println("child is cancelled")
                }

            }

            yield()
            println("throwing an exception")
            throw  AssertionError()



        }
    }
catch (e:AssertionError){
    println("$e found!! cancelling the supervisor" )

}

}