package academy.learnprogramming.challenge1

fun main() {
    val hello1 = "Hello"
    val hello2 = "Hello"
    println("hello1===hello2: ${hello1 === hello2}")
    println("hello1==hello2: ${hello1 == hello2}")

    var number = 2988

    val any: Any = "The Any type is the root of the Kotlin class hierarchy"
    if (any is String) {
        println(any.uppercase())
    }

    println("   1\n  11\n 111\n1111")
    println("""1   1
        1  11
        1 111
        11111
    """.trimMargin("1"))
}