package exercise_3_8

val taxUSA = { rate: Double -> { price: Double -> /* complicated calculations here */ price * rate + price } }
val taxAR = { rate: Double -> { price: Double -> /* complicated calculations here */ price * rate + price } }
val taxHK = { rate: Double -> { price: Double -> /* complicated calculations here */ price * rate + price } }

fun <A> A.rateAndThen(vararg f: (A) -> (A) -> A): (A) -> A = {
    var price = it
    if (f.isNotEmpty()) {
        price = this.rateAndThen(*f.toMutableList().subList(1, f.size).toTypedArray())(f.first()(this)(price))
    }
    price
}

fun run() {
    val fixTax = 0.01
    val price = 10.00

    // from USA
    val productFly = mutableListOf(taxUSA)
    // go to AR
    productFly.add(taxAR)
    // go to HK
    productFly.add(taxHK)

    println(fixTax.rateAndThen(*productFly.toTypedArray()).invoke(price))

    exercise38()
}

fun <A, B, C> partialB(b: B, f: (A) -> (B) -> C): (A) -> C =
    { a: A ->
        f(a)(b)
    }

fun exercise38() {
    println(partialB(10.00, taxUSA).invoke(0.5))
}



