package exercise_5_1

fun <T> cons(set: T, list: List<T>) = listOf(set) + list
fun <T> List<T>.cons(set: T) = listOf(set) + this
fun <T> MutableList<T>.cons(set: T) = this.add(0, set)

fun run() {
    val l = listOf(1, 2, 3)
    println(cons(0, l))

    val l2 = listOf(1, 2, 3)
    println(l2.cons(0))

    val l3 = mutableListOf(1, 2, 3)
    l3.cons(0)
    println(l3)
}

