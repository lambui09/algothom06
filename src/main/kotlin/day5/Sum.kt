package day5

import java.util.*

fun main() {
    val read = Scanner(System.`in`)
    val n = read.nextInt()
    print(sum(n))
}

fun sum(number: Int): Int {
    if (number <= 1) {
        return number
    }
    return number + sum(number - 1)
}