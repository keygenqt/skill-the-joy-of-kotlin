package exercise_4_13

fun <T> myUnfold(seed: T, f: (T) -> T, p: (T) -> Boolean): List<T> {
    return mutableListOf(seed).apply {
        while (p.invoke(first())) add(0, f.invoke(first()))
    }
}

fun run() {
    println(myUnfold(1, { p -> p + 1 }, { p -> p < 10 }))
}

