package exercise_3_1

fun square(n: Int) = n * n

fun triple(n: Int) = n * 3

fun compose(sq: (Int) -> Int, tr: (Int) -> Int): (Int) -> Int = { sq(tr(it)) }

fun runExercise31() {
    println(compose(::square, ::triple)(2))
}