package exercise_4_12

import exercise_4_10.myUnfold
import exercise_4_9.plus

fun run() {
    println(myUnfold(1, plus) { p -> p < 10 })
}

