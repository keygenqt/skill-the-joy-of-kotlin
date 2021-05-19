package exercise_4_6

fun <T, U> foldRight(list: List<T>, f: U, o: (T, U) -> U): U {
    tailrec fun go(l: List<T>, v: U): U {
        return if (l.isEmpty()) v else go(l.subList(0, l.size - 1), o(l.last(), v))
    }
    if (list.isEmpty()) {
        return f
    }
    return go(list.subList(0, list.size - 1), o(list.last(), f))
}

fun run() {
    println(foldRight(listOf("1", "2", "3", "4"), "END") { a, b -> "$a + $b" })
    println(listOf("1", "2", "3", "4").foldRight("END") { a, b -> "$a + $b" })
}

