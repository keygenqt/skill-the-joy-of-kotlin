package exercise_4_9

fun plus(): (Int) -> Int = { x -> x + 1 }

fun myRange(start: Int, end: Int): List<Int> {
    return mutableListOf(start).apply {
        while (last() < end-1) add(plus().invoke(last()))
    }
}

fun bookRange(start: Int, end: Int): List<Int> {
    val result = mutableListOf<Int>()
    var index = start
    while (index < end) {
        result.add(index)
        index++
    }
    return result
}

fun run() {
    println(myRange(1, 10))
    println(bookRange(1, 10))
}

