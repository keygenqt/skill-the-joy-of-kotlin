package exercise_4_8

import exercise_4_5.foldLeft

fun <T> prepend(list: List<T>, element: T): List<T> = foldLeft(list, listOf(element)) { lst, elm -> lst + elm }

fun <T> reverse(list: List<T>): List<T> = foldLeft(list, listOf(), ::prepend)

fun run() {
    println(reverse(listOf(1, 2, 3, 4, 5)))
}

