package exercise_4_3

import java.math.BigInteger

fun fibonacci(n: Int): Int {
    return if (n == 0 || n == 1) {
        1
    } else {
        fibonacci(n - 1) + fibonacci(n - 2)
    }
}

fun fib(n: Int): BigInteger {
    tailrec
    fun go(val1: BigInteger, val2: BigInteger, x: BigInteger): BigInteger =
        when (x) {
            BigInteger.ZERO -> BigInteger.ONE
            BigInteger.ONE -> val1 + val2
            else -> go(val2, val1 + val2, x - BigInteger.ONE)
        }
    return go(BigInteger.ZERO, BigInteger.ONE, n.toBigInteger())
}

fun run() {
    (0..9).forEach { print("${fibonacci(it)} ") }
    println()
    (0..9).forEach { print("${fib(it)} ") }
}

