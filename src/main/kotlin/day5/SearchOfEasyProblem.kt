import java.util.*

fun main() {
    val read  = Scanner(System.`in`)
    val n = read.nextInt()
    val arr = Array(n){
            i -> read.nextInt()
    }
    var countHard = 0
    for (i in arr.indices){
        if (arr[i] == 1){
            countHard++
        }
    }
    if (countHard >= 1){
        print("HARD")
    }else{
        print("EASY")
    }
}