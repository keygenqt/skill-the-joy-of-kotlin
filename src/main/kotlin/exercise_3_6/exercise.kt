package exercise_3_6

fun square(n: Int) = n * n

fun triple(n: Int) = (n * 3)

// book
fun <A, B, C> higherAndThen(): ((A) -> B) -> ((B) -> C) -> (A) -> C =
    { f: (A) -> B ->
        { g: (B) -> C ->
            { x: A -> g(f(x)) }
        }
    }

// my
// Either I don't understand something or there is a bug in the book
fun <A, B, C> higherAndThen2(): ((A) -> C) -> ((B) -> A) -> (B) -> C =
    { f: (A) -> C ->
        { g: (B) -> A ->
            { x: B -> f(g(x)) }
        }
    }

fun run() {
    println("Book: " + higherAndThen<Int, Int, Int>()(::triple)(::square)(2))
    println("My: " + higherAndThen2<Int, Int, Int>()(::triple)(::square)(2))
}