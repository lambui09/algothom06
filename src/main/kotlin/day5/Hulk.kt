
import java.util.*
var n : Int = 0
fun main() {
    val read = Scanner(System.`in`)
    n = read.nextInt()
    printMessage(1)
}

fun printMessage(number: Int) {
    if (number % 2 == 1) {
        print("I hate ")
    } else {
        print("I love ")
    }
    if (number == n) {
        print(" it")
        return
    }
    print("that ")
    printMessage(number + 1)
}