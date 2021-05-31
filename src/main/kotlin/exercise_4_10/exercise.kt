package exercise_4_10

fun <T> myUnfold(seed: T, f: (T) -> T, p: (T) -> Boolean): List<T> {
    return mutableListOf(seed).apply {
        while (p.invoke(last())) add(f.invoke(last()))
    }
}

fun run() {
    println(myUnfold(1, { p -> p + 1 }, { p -> p < 10 }))
}

