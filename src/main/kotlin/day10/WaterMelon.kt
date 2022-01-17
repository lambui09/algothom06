import java.util.*

fun main() {
    val read  = Scanner(System.`in`)
    val n = read.nextInt()
    if (n % 2 == 0 && n > 2){
        print("YES")
    }else{
        print("NO")
    }
}