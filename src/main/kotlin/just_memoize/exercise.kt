package just_memoize

import java.util.concurrent.ConcurrentHashMap

class Memoizer<T, U> private constructor() {
    private val cache = ConcurrentHashMap<T, U>()
    private fun doMemoize(function: (T) -> U): (T) -> U = { input ->
        cache.computeIfAbsent(input) {
            function(it)
        }
    }

    companion object {
        fun <T, U> memoize(function: (T) -> U): (T) -> U = Memoizer<T, U>().doMemoize(function)
    }
}

fun test(x: Int, y: Int): String {
    Thread.sleep(2000)
    return "x: $x, y: $y"
}

fun run() {

    val m = Memoizer.memoize { x: Int ->
        Memoizer.memoize { y: Int ->
            test(x, y)
        }
    }

    println("-> x: 20, y: 10")
    println(m(20)(10))
    println(m(20)(10))
    println("-> x: 20, y: 20")
    println(m(20)(20))
    println(m(20)(20))

    println("-> Function1<T, U>")
    val second = m(30)
    println("-> x: 30, y: 30")
    println(second(30))
    println(second(30))
    println(second(30))
}

