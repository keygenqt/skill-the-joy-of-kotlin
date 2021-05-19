package exercise_4_7

import exercise_4_5.foldLeft

fun <T> reverse1(list: List<T>): List<T> = fby lazyoldLeft(list, listOf()) { l, e -> listOf(e) + l }

fun <T> reverse2(list: List<T>): List<T> = foldLeft(list, listOf()) { l, e -> mutableListOf(e).apply { addAll(l) } }

fun run() {
    println(reverse1(listOf(1, 2, 3, 4, 5)))
    println(reverse2(listOf(1, 2, 3, 4, 5)))
    println(listOf(1, 2, 3, 4, 5).reversed()) // the best way
}

