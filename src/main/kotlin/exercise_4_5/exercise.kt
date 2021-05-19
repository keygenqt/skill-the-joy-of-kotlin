package exercise_4_5

fun <T, U> foldLeft(list: List<T>, f: U, o: (U, T) -> U): U {
    tailrec fun go(l: List<T>, v: U): U {
        return if (l.isEmpty()) v else go(l.subList(1, l.size), o(v, l.first()))
    }
    if (list.isEmpty()) {
        return f
    }
    return go(list.subList(1, list.size), o(f, list.first()))
}

fun run() {
    println(foldLeft(listOf("1", "2", "3", "4"), "START") { a, b -> "$a + $b" })
    println(listOf("1", "2", "3", "4").fold("START") { a, b -> "$a + $b" })
}

