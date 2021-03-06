package just_live

import java.lang.RuntimeException
import kotlin.random.Random

fun die(): Nothing {
    throw RuntimeException("I died")
}

fun canYou(age: Int): Boolean {
    return Random.nextInt(age) < 30
}

fun eat(): (Int) -> Boolean {
    println("eat")
    return ::canYou
}

fun work(): (Int) -> Boolean {
    println("work")
    return ::canYou
}

fun study(): (Int) -> Boolean {
    println("study")
    return ::canYou
}

fun sleep(): (Int) -> Boolean {
    println("sleep")
    return ::canYou
}

tailrec
fun live(age: Int, vararg events: (() -> (Int) -> Boolean)) {
    println("---> Age: $age")
    try {
        events.forEach { event -> if (!event()(age)) die() }
    } catch (ex: RuntimeException) {
        println("No time to rest")
    }
    live(age + 1, *events)
}

fun run() {
    live(age = 20, ::eat, ::work, ::study, ::sleep)
}

