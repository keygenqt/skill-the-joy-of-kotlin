package exercise_4_15

import java.math.BigInteger

fun fib(n: Int): String {
    tailrec fun go(val1: BigInteger, val2: BigInteger, x: BigInteger): BigInteger =
        when (x) {
            BigInteger.ZERO -> BigInteger.ONE
            BigInteger.ONE -> val1 + val2
            else -> go(val2, val1 + val2, x - BigInteger.ONE)
        }

    tailrec fun go2(x: Int, value: String = ""): String =
        if (x <= n) {
            go2(x + 1, value + go(BigInteger.ZERO, BigInteger.ONE, x.toBigInteger()) + if (x + 1 <= n) ", " else "")
        } else {
            value
        }
    return go2(0)
}

fun run() {
    println(fib(9))
}

