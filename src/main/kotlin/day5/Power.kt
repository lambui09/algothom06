package day5

import java.util.*

fun main() {
    val read = Scanner(System.`in`)
    val n = read.nextInt()
    print(power(n))
}

fun power(number: Int): Int {
    if (number == 0) {
        return 1
    }
    return 2 * power(number - 1)
}