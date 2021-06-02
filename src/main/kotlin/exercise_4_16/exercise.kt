package exercise_4_16

fun <T> iterate(seed: T, to: Int, f: (T) -> T): List<T> {
    tailrec fun go(seed: T, list: MutableList<T>, index: Int): List<T> {
        val s = f(seed)
        if (index <= 0) {
            return list
        }
        return go(s, list.apply { add(s) }, index - 1)
    }
    return go(seed, mutableListOf(seed), to)
}

fun run() {
    println(iterate(1, 10) { p -> p + 1 })
}