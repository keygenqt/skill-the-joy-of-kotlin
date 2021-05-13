package exercise_3_5

fun square(n: Int) = n * n

fun triple(n: Float) = (n * 3).toInt()

fun <A, B, C> compose(it3: (A) -> C): ((B) -> A) -> (B) -> C = { it2 -> { it1 -> it3(it2(it1)) } }

fun <A, B, C> compose2(it3: (A) -> C, it2: (B) -> A): (B) -> C = { it1 -> it3(it2(it1)) }

fun run() {
    println(compose<Int, Float, Int>(::square)(::triple)(2F))
    println(compose2(::square, ::triple)(2F))
}

