data class StringContainer(val values: List<String>)

fun main() {
    val containers = listOf(
        StringContainer(listOf("one", "two", "three")),
        StringContainer(listOf("four", "five", "six")),
        StringContainer(listOf("seven", "eight"))
    )
    println(containers.flatMap { it.values })

    val numbers = (1..100).toList()
    println(numbers.joinToString(limit = 10, truncated = "<...>"))

    val a = listOf<String>("String", "is","good")
     val b = a.slice(setOf(1,2))
    val c = a.slice(1..2)
    println(b)

    val an = listOf<String>("one","two","three")
    println(an.drop(1))
    println(an.take(3))






}