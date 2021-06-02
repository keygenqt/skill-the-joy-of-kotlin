package exercise_4_4

tailrec fun <T> makeString(list: List<T>, string: String = "", save: String = ""): String {
    return if (list.isEmpty()) {
        save.replaceFirst(string, "")
    } else {
        makeString(list.subList(1, list.size), string, "$save$string${list.first()}")
    }
}

fun run() {
    println(makeString(listOf(1, 2, 3, 4, 5)))
    println(makeString(listOf("1", "2", "3", "4", "5"), ", "))
}

