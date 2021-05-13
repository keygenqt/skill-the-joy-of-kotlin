package exercise_3_6

fun square(n: Int) = n * n

fun triple(n: Int) = (n * 3)

// andThen is like compose, but calls the first function and then the second, g(f(x))
fun <A, B, C> andThen(): ((A) -> B) -> ((B) -> C) -> (A) -> C =
    { f: (A) -> B ->
        { g: (B) -> C ->
            { x: A -> g(f(x)) }
        }
    }

// compose makes a new function that composes other functions f(g(x))
fun <A, B, C> compose(): ((A) -> C) -> ((B) -> A) -> (B) -> C =
    { f: (A) -> C ->
        { g: (B) -> A ->
            { x: B -> f(g(x)) }
        }
    }

fun run() {
    println("andThen: " + andThen<Int, Int, Int>()(::triple)(::square)(2))
    println("compose: " + compose<Int, Int, Int>()(::triple)(::square)(2))
}