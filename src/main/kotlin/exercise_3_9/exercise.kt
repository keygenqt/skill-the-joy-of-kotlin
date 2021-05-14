package exercise_3_9

fun <A, B, C, D> func(a: A, b: B, c: C, d: D): String = "$a, $b, $c, $d"

fun <A, B, C, D> func(): (A) -> (B) -> (C) -> (D) -> String = { a -> { b -> { c -> { d -> "$a, $b, $c, $d" } } } }

fun run() {
    println(func(1, 2, 3, 4.0))
    println(func<Int, Int, Int, Double>()(1)(2)(3)(4.0))
}

