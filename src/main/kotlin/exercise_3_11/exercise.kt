package exercise_3_11

fun funcTo(n: Int): (Int) -> Double = { b: Int -> n + b / 100.toDouble() }

fun <A, B, C> funcFrom(f: (A) -> (B) -> C): (B) -> (A) -> C = { b -> { a -> f(a)(b) } }

fun run() {
    println(funcTo(1)(2))
    println(funcFrom(::funcTo)(1)(2))
}

