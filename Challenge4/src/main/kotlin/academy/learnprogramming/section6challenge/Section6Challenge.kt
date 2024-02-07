package academy.learnprogramming.section6challenge


fun main(args: Array<String>) {

    // using a range, print 5, 10, 15, 20, 25... 5000, each number
    // on a separate line
    (5..5000).step(5).forEach { println(it) }

    // using a range, -500..0, each number on a separate line
    (-500..0).forEach { println(it) }

    // using a range, print the first 15 numbers in the
    // Fibonacci sequence, each
    // number on a separate line
    // Hint: you'll have to print the first one or two numbers
    // outside the range
    // 0, 1, 1, 2, 3, 5, 8...
    var f1 = 0
    var f2 = 1
    print("$f1, $f2")
    for (num in 3..15) {
        val f3 = f1 + f2
        print(", $f3")
        f1 = f2
        f2 = f3
    }
    println()

    // Modify the following code so that it prints the following,
    // each number on a separate line
    // 1, 11, 100, 99, 98, 2
    i@ for (i in 1..5) {
        println(i)
        if (i == 2) break
        for (j in 11..20) {
            println(j)
            for (k in 100 downTo 90) {
                println(k)
                if (k == 98) continue@i
            }
        }
    }


    // Declare a variable called num (int) and assign it whatever you want
    val num = 42

    // Declare a variable called dnum (double) and assign it as follows:
    // if num > 100, assign dnum -234.567
    // if num < 100, assign dnum 4444.555
    // if num == 100, assign dnum 0.0
    // do all of the above (declaring dnum and assigning
    // it) in one statement/expression
    val dnum = when {
        num > 100 -> -234.567
        num < 100 -> 4444.555
        else -> 0.0
    }

    // Then print the value of dnum - separate statement
    println(dnum)
}