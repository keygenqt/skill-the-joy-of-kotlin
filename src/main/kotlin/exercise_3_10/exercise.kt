package exercise_3_10

fun <A, B, C> func(f: (A, B) -> C): (A, B) -> C = f

fun <A, B, C> func2(f: (A, B) -> C): (A) -> (B) -> C = { a -> { b -> f(a, b) } }

fun run() {
    println(func<Int, Int, Double> { a, b -> a + b.toDouble() }(12, 12))
    println(func2<Int, Int, Double> { a, b -> a + b.toDouble() }(12)(12))
}

