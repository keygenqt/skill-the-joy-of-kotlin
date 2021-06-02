package exercise_4_17

fun <T, U> List<T>.map(f: (T) -> U): List<U> {
    val list = mutableListOf<U>()
    this.forEach { list.add(f(it)) }
    return list
}

fun <T, U> List<T>.map2(f: (T) -> U): List<U> {
    tailrec
    fun go(list1: List<T>, list2: List<U>): List<U> {
        return if (list1.isEmpty()) {
            list2
        } else {
            go(list1.subList(1, list1.size), list2 + f(list1.first()))
        }
    }
    return go(this, listOf())
}

fun run() {
    println(listOf(0, 1, 2, 3, 4).map { it + 1 })
    println(listOf(0, 1, 2, 3, 4).map2 { it + 1 })
}

