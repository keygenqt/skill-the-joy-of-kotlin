package exercise_3_3

fun Int.myPlus(n: Int): Int = this + n

fun myPlus2(n: Int): (Int) -> (Int) -> Int = { a -> { it + a + n } }

val myPlus3: (Int) -> (Int) -> (Int) -> Int = { a -> { b -> { c -> a + b + c } } }

infix fun Int.plus(n: Int): Int = this + n

fun runExercise33() {
    println("variant 1")
    println(3.myPlus(3).myPlus(3))

    println("variant 2")
    println(myPlus2(3)(3)(3))

    println("variant 3")
    println(myPlus3(3)(3)(3))

    println("variant 4")
    println(3 plus 3 plus 3)

    println("variant 5")
    println(3 + 3 + 3)
}

