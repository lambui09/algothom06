import java.util.*

fun main(args: Array<String>) {
    //
    val read  = Scanner(System.`in`)
    val n = read.nextInt()
    val arr = Array(n){
        i -> read.nextInt()
    }
    // add a array
    if (n == 1) {
        if (arr[0] == 1) {
            println("YES")
        } else {
            println("NO")
        }
        return
    }
    var count = 0
    for (i in 0..arr.size -1) {
        if (arr[i] == 0) {
            count++
        }
    }
    if (count == 1) {
        println("YES")
    } else {
        println("NO")
    }
}
