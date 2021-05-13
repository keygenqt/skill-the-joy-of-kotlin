package exercise_3_4

fun square(n: Int) = n * n

fun triple(n: Int) = n * 3

val compose: ((Int) -> Int, (Int) -> Int) -> (Int) -> Int = { s, t -> { s(t(it)) } }

val compose2: ((Int) -> Int) -> ((Int) -> Int) -> (Int) -> Int = { s -> { t -> { s(t(it)) } } }

fun run() {
    println(compose(::square, ::triple)(2))
    println(compose2(::square)(::triple)(2))
}

