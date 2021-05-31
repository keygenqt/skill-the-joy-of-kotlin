package exercise_4_14

fun <T> unfold(seed: T, f: (T) -> T, p: (T) -> Boolean): List<T> {
    tailrec fun go(seed: T, list: MutableList<T>): List<T> {
        val s = f(seed)
        if (!p.invoke(s)) {
            return list
        }
        return go(s, list.apply { add(s) })
    }
    return go(seed, mutableListOf(seed))
}

fun run() {
    println(unfold(1, { p -> p + 1 }, { p -> p < 10 }))
}

