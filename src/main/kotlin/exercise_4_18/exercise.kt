package exercise_4_18

import exercise_4_16.iterate
import exercise_4_17.map2
import exercise_4_4.makeString
import java.math.BigInteger

fun fib(number: Int): String {
    val seed = Pair(BigInteger.ZERO, BigInteger.ONE)
    val listOfPair = iterate(seed, number + 1) { x: Pair<BigInteger, BigInteger> -> Pair(x.second, x.first + x.second) }
    val list = listOfPair.map2 { p -> p.first }
    return makeString(list, ", ")
}

fun run() {
    println(fib(9))
}

