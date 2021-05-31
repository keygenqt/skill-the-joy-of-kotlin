package exercise_4_11

import exercise_4_10.myUnfold

fun run() {
    println(myUnfold("a", { p -> p.plus(p.last() + 1) }, { p -> p.last() != 'z' }))
}

