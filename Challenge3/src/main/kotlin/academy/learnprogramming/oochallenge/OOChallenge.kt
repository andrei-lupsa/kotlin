package academy.learnprogramming.oochallenge

fun main() {
    var bicycle = KotlinBicycle(90, 20, 2)
    var mountainBike = KotlinMountainBike(1, 90, 30, 1)
    var roadBike = KotlinRoadBike(90, 40, 1, 30)

    bicycle.printDescription()
    mountainBike.printDescription()
    roadBike.printDescription()

    bicycle = KotlinBicycle(90, 20)
    mountainBike = KotlinMountainBike(1, 90, 30)
    roadBike = KotlinRoadBike(90, 40, tireWidth = 30)

    bicycle.printDescription()
    mountainBike.printDescription()
    roadBike.printDescription()

    mountainBike = KotlinMountainBike(1, 90, 30, color = "Red")
    mountainBike.printDescription()

    println("Available colors:")
    for (color in KotlinMountainBike.availableColors) {
        println(color)
    }

}

open class KotlinBicycle(var cadence: Int, var speed: Int, var gear: Int = 10) {

    fun applyBrake(decrement: Int) {
        speed -= decrement
    }

    fun speedUp(increment: Int) {
        speed += increment
    }

    open fun printDescription() {
        println("Bike is in gear $gear with a cadence of $cadence travelling at a speed of $speed.")
    }
}

class KotlinMountainBike(var seatHeight: Int, cadence: Int, speed: Int, gear: Int = 10) :
    KotlinBicycle(cadence, speed, gear) {

    constructor(seatHeight: Int, cadence: Int, speed: Int, gear: Int = 10, color: String) :
            this(seatHeight, cadence, speed, gear) {
        println("Bike color is $color.")
    }

    companion object {
        val availableColors = listOf("blue", "red", "white", "black", "green", "brown")
    }

    override fun printDescription() {
        super.printDescription()
        println("The mountain bike has a seat height of $seatHeight inches.")
    }
}

class KotlinRoadBike(cadence: Int, speed: Int, gear: Int = 10, val tireWidth: Int) :
    KotlinBicycle(cadence, speed, gear) {

    override fun printDescription() {
        super.printDescription()
        println("The road bike has a tire width of $tireWidth MM.")
    }
}
