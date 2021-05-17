package exercise_4_2

// version 1
val factorial: (Int) -> Int = {
    fun r(n: Int): Int {
        return if (n == 0) 1 else n * r(n - 1)
    }
    r(it)
}

// version 2
object Factorial {
    lateinit var factorial: (Int) -> Int

    init {
        factorial = { n -> if (n == 0) 1 else n * factorial(n - 1) }
    }
}

// version 3
val factorial3: (Int) -> Int by lazy { { n -> if (n == 0) 1 else n * factorial3(n - 1) } }

fun run() {
    println(factorial(5))
    println(Factorial.factorial(5))
    println(factorial3(5))
}

