package academy.learnprogramming.challenge7

fun main() {

    val joe = Person("Joe", "Jones", 45)
    val jane = Person("Jane", "Smith", 12)
    val mary = Person("Mary", "Wilson", 70)
    val john = Person("John", "Adams", 32)
    val jean = Person("Jean", "Smithson", 66)

    val (fName, lName, age) = joe
    println("fName = $fName, lName = $lName, age = $age")

    val personsMap = listOf(joe, jane, mary, john, jean).associateBy { it.lastName }
    println(personsMap)

    println("Number of people with last name beginning with S is: ${personsMap.count { it.key.startsWith('S') }}")

    val namePairsList = personsMap.map { it.value.firstName to it.value.lastName }
    println(namePairsList)

    personsMap.values.forEach { it.also { println("${it.firstName} is ${it.age} years old") } }

    val list1 = listOf(1, 4, 9, 15, 33)
    val list2 = listOf(4, 55, -83, 15, 22, 101)
    val list3 = list1.intersect(list2).toList()
    println(list3)

    val regularPaper = Box<Regular>()
    var paper = Box<Paper>()
    paper = regularPaper
}


data class Person(val firstName: String, val lastName: String, val age: Int)


class Box<out T>

open class Paper

class Regular : Paper()

class Premium : Paper()