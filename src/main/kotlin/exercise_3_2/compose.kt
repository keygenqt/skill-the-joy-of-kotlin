package exercise_3_2

fun square(n: Int) = n * n

fun triple(n: Int) = n * 3

fun <T, M, K> compose(sq: (M) -> K, tr: (T) -> M): (T) -> K = { sq(tr(it)) }

fun runExercise32() {
    println(compose(::square, ::triple)(2))
}