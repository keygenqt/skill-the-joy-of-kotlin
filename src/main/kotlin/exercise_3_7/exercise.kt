package exercise_3_7

class TaxCounter(private val rate: Double) {
    fun calculate(price: Double): Double = price * rate + price
}

val taxCounter: (Double) -> (Double) -> Double = { rate -> { price -> price * rate + price } }

val taxCounterLazy: (Double) -> (Double) -> () -> Double = { rate -> { price -> { price * rate + price } } }

fun run() {
    val counter1 = TaxCounter(0.05)
    val counter2 = taxCounter(0.05)
    val counter3 = taxCounterLazy(0.05)

    println(counter1.calculate(100.00))
    println(counter2(100.00))
    println(counter3(100.00).invoke())
}



